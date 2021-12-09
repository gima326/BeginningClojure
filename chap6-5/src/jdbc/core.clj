(ns jdbc.core
  (:require [clojure.java.jdbc :as j]))

(let [mysql-db {:subprotocol "mysql"
                :subname "//127.0.0.1:3306/test"
                :user "root"
                :password "password"}]

　(defn s [n]
　　(j/query
　　　mysql-db
　　　["select * from users where name=?" n]
　　　{:row-fn println}))

　(defn insert []
　　(j/insert!
　　　mysql-db :users
　　　{:name "gima326" :age 45 :email "gima326@aiueo.org"}))

　(defn update [n]
　　(j/update!
　　　mysql-db :users
　　　{:email "gima326@google.com"}
　　　["name=?" n])))
