(defproject chap4 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

;; Leiningen の clojure のバージョンに拠る
  :dependencies [[org.clojure/clojure "1.10.0"]]

;; フォルダ構成の変更対応 "src/chap4/" -> "src/shorter/models/links/"
;; :repl-options {:init-ns chap4.core})
  :repl-options {:init-ns shorter.models.links.core})