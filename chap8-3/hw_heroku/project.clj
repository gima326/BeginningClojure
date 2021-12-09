(defproject hw_heroku "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://hw_heroku.herokuapp.com"
  :license {:name "FIXME: choose"
            :url "http://example.com/FIXME"}
  :dependencies [



;;                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/clojure "1.10.0"]
;;                 [compojure "1.1.8"]
                 [compojure "1.6.1"]

                 [ring/ring-jetty-adapter "1.2.2"]
                 [ring/ring-devel "1.2.2"]
                 [ring-basic-authentication "1.0.5"]
                 [environ "0.5.0"]

;;                 [com.cemerick/drawbridge "0.0.6"]]
;; NG              [com.cemerick/drawbridge "0.0.7"]]
                 [nrepl/drawbridge "0.2.1"]]

  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]

;; コメントアウトしても影響ないみたい。
;;  :hooks [environ.leiningen.hooks]

  :uberjar-name "hw_heroku-standalone.jar"

  :profiles {
　　　　　　　　;; 以下、コメントアウトしても影響ないみたい。
             ;; :production {:env {:production true}}

             ;; 追記分
             ;; 末尾から２行目の「 :aot [hw_heroku.web] 」だと、膨大な数の class ファイルが
             ;; プロジェクト内に生成されてしまう（4.6MB）ので、必要がなければ、この方がスマートみたい(80kB)。
             :uberjar {:aot :all}
  }

;; 以下、追記分。

  ;; ローカル環境での repl 上での実行段階で必要。
  ;; 「No :main namespace specified in project.clj.」

  ;; ただし、以下のWarningが出るようになる。
  ;;「WARNING: update already refers to: #'clojure.core/update in namespace: clj-http.client, being replaced by: #'clj-http.client/update」
  :main hw_heroku.web

  ;; ワーニング消える。
  ;;「Warning: specified :main without including it in :aot.
  ;;　remote:        Implicit AOT of :main will be removed in Leiningen 3.0.0.
　;;　remote:        If you only need AOT for your uberjar, consider adding :aot :all into your
  ;;　remote:        :uberjar profile instead.」
  ;;:aot [hw_heroku.web]

  ;; この記述がなくても影響なし。
  ;;:repl-options {:init-ns hw_heroku.web}
  )
