(defproject chap5-4 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.6.2"]
                 [http-kit "2.5.3"]
                 [ring "1.9.4"]]

　:plugins [[lein-ring "0.12.6"]]
　:ring {:handler simple-web.core/app-routes}

　:repl-options {:init-ns simple-web.core})
