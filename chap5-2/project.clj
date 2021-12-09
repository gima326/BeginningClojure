(defproject chap5-2 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
 　　　　　　　　;; chap5-2 に必要
                 [http-kit "2.5.3"]
                 [ring "1.9.4"]

                 ]
　:repl-options {:init-ns simple-web.core}
  ;; サーバーの実行には、
  ;; -main 関数のあるネームスペースの指定が必要
  :main simple-web.core)
