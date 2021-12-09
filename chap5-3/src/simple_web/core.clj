(ns simple-web.core
  (:use org.httpkit.server
　　　　　clojure.pprint
        compojure.core)
  (:require [compojure.route :as route]))

(defn top [req]
  (do
    (pprint req)
    "top"))

(defn contacts [req]
　(do
　　(pprint req)
　　"contacts"))

;; URL ルーティング

(defroutes app-routes
　(GET "/" _ top)
　(GET "/contacts" [] contacts)

　(route/not-found "Not found"))

(defn -main []
  (run-server app-routes {:port 8080}))
