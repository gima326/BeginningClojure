(ns simple-web.core
  (:use org.httpkit.server
        clojure.pprint))

;;(defn app [req]
;;　{ :status 200
;;　　:headers {"Content-Type" "text/html"}
;;　　:body "Hello, ring!"} )

;; [ P73 ]
;; req : ブラウザからのリクエストがマップ型で渡される。

(defn app2 [req]
　;; レスポンス
  ;; :body に req を設定して、ブラウザに出力している。
  { :status 200
　　:headers {"Content-Type" "text/html"}
　　:body req })

;; [ P73 ]
;; req を整形し、ブラウザに出力

(defn app3 [req]
　(do
　　;; コンソール向けに req を出力している。
   (pprint req)
　　;; レスポンス
　　;; :body に "Hello, HTTP Kit!" を設定して、ブラウザに出力している。
   { :status 200
　　　:headers {"Content-Type" "text/html"}
　　　:body "Hello, HTTP Kit!" }))

;; [ P74 ]
;; req から特定の項目を取得し、ブラウザに出力している。

(defn app4 [request-map]
  { :status 200
　　:headers {"Content-Type" "text/html"}
　　:body (str
　　　　　　　"uri: [ " (:uri request-map) " ] <br>"
　　　　　　　"query-string: [ " (:query-string request-map) " ] <br>") })


(defn -main []
　(do
;;　　(run-server app {:port 8080})
　　(run-server app2 {:port 8081})
　　(run-server app3 {:port 8082})
　　(run-server app4 {:port 8083})))
