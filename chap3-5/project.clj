(defproject chap3-5 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

;; Leiningen の clojure のバージョンに拠る
  :dependencies [[org.clojure/clojure "1.10.0"]]

;; 実行時の -main の記載されているクラス
  :main first-project.core

;; 追記パターン　その１
  :aot [first-project.core]

;; 追記パターン　その２
;;　:uberjar-name "chap3-5-2-0.1.0-standalone.jar"
;;  :profiles {:uberjar {:aot :all}}
  )
