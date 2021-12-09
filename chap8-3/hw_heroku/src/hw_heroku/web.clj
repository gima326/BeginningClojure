(ns hw_heroku.web
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [compojure.handler :refer [site]]
            [compojure.route :as route]
            [clojure.java.io :as io]
            [ring.middleware.stacktrace :as trace]
            [ring.middleware.session :as session]
            [ring.middleware.session.cookie :as cookie]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.basic-authentication :as basic]

;; 開発が止まったとおぼしきライブラリの代替を利用するために。
;;            [cemerick.drawbridge :as drawbridge]
            [drawbridge.core :as drawbridge]

            [environ.core :refer [env]])

  ;; project.clj の「 :aot [hw_heroku.web] 」と対の関係。
  ;; こっちは記述しなくても .jar は生成されるものの、以下のワーニングが出る。
  ;; 「Warning: The Main-Class specified does not exist within the jar. It may not be executable as expected. A gen-class directive may be missing in the namespace which contains the main method, or the namespace has not been AOT-compiled.」
  (:gen-class)
            )

(defn hw []
　(println "Hello, Heroku!"))

(defn- authenticated? [user pass]
  ;; TODO: heroku config:add REPL_USER=[...] REPL_PASSWORD=[...]
;;  (= [user pass] [(env :repl-user false) (env :repl-password false)])
;;  (= [user pass] [(env :repl-user) (env :repl-password)])
;;  (= [user pass] ["gima326" "aiueo"])
true
  )

(def ^:private drawbridge
  (-> (drawbridge/ring-handler)
      (session/wrap-session)
      (basic/wrap-basic-authentication authenticated?)))

(defroutes app
  (ANY "/repl" {:as req}
　　(do
　　　(println "IN REPL")
　　　(drawbridge req)))
  (GET "/" []
　　(do
　　　(println "ROOT DIR")
　　　{:status 200
        :headers {"Content-Type" "text/plain"}
        :body (pr-str ["Hello, Hello!" :from 'Heroku])}))
  (ANY "*" []
       (route/not-found (slurp (io/resource "404.html")))))

(defn wrap-error-page [handler]
  (fn [req]
    (try (handler req)
         (catch Exception e
           {:status 500
            :headers {"Content-Type" "text/html"}
            :body (slurp (io/resource "500.html"))}))))

(defn wrap-app [app]
  ;; TODO: heroku config:add SESSION_SECRET=$RANDOM_16_CHARS
  (let [store (cookie/cookie-store {:key (env :session-secret)})]
    (-> app
        ((if (env :production)
           wrap-error-page
           trace/wrap-stacktrace))
        (site {:session {:store store}}))))

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (jetty/run-jetty (wrap-app #'app) {:port port :join? false})))

;; For interactive development:
;; (.stop server)
;; (def server (-main))
