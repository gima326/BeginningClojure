(ns cuma-sample.core
  (:require [cuma.core :refer [render]]))

;; (r {:name "gima"})

(defn r
  [map_data]
  (render "Hello, $(name)!" map_data))


;; cuma-sample.core=> (r2 {:name "world"})
;; "Hello, WORLD!"

(defn r2
  [map_data]
  (render
　　"Hello, $(uc name)!"
　　(conj
　　　{:uc (fn [data str] (.toUpperCase str))}
　　　map_data)))


;; cuma-sample.core=> (html {:html "<html><body>hoge</body></html>"})
;; "&lt;html&gt;&lt;body&gt;hoge&lt;/body&gt;&lt;/html&gt;"

;; cuma-sample.core=> (raw-html {:html "<html><body>hoge</body></html>"})
;; "<html><body>hoge</body></html>"

(defn html [map_data]
  (render "$(html)" map_data))

(defn raw-html [map_data]
  (render "$(raw html)" map_data))


;; cuma-sample.core=> (cuma-if {:msg "hello, if"})
;; " <div>hello, if</div> "

;; cuma-sample.core=> (cuma-if {:msg nil})
;; ""

;; cuma-sample.core=> (cuma-if {:msg2 "hello, if"})
;; ""

(defn cuma-if [map_data]
  (render
    "@(if msg) <div>$(msg)</div> @(end)"
  　map_data))

(defn cuma-for [map_data]
  (render
　　"@(for contents) <a href=\"/contents/$(title)\">$(title)</a><br> @(end)"
　　map_data))
