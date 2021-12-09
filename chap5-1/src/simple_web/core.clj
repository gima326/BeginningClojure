(ns simple-web.core
  (:use org.httpkit.server))

(defn app [req]
　(let [msg "Hello, ring!"]
　　(println msg)
　　{ :status 200
　　　:headers {"Content-Type" "text/html"}
　　　:body msg }))

(defn -main []
　(run-server app {:port 8080}))
