(ns mongo.users
　(:require [monger.core :as mngr]
　　　　　　　[monger.collection :as m-col]
　　　　　　　[crypto.password.bcrypt :as pw]))

(let[db-name "users"
　　　doc-name "documents"
　　　conn (mngr/connect)
　　　db (mngr/get-db conn db-name) ]

　(defn add-user! [email pw]
　　(m-col/insert db doc-name
　　　{ :_id email
　　　　:pw (pw/encrypt pw)
　　　　:created-at (java.util.Date.) }))

  (defn get-users []
    (m-col/find-maps db doc-name))

  ;; 任意のフィールドを除いたデータを取得

　(defn del-field-from-users [param]
　　(let [users (m-col/find-maps db doc-name)]
　　　(map #(dissoc % param) users))))
