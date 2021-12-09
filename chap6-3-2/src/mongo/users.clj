(ns mongo.users
　(:require [monger.core :as mngr]
　　　　　　　[monger.collection :as m-col]
　　　　　　　[monger.operators :refer :all]
　　　　　　　[monger.result :as m-rslt]
　　　　　　　[crypto.password.bcrypt :as pw]))

(let[db-name "users"
　　　doc-name "documents"
　　　conn (mngr/connect)
　　　db (mngr/get-db conn db-name)]

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
　　　(map #(dissoc % param) users)))


  ;; 認証とパスワード変更

　(defn authentication [email pw]
　　(if-let [user (m-col/find-one-as-map db doc-name {:_id email})]
　　　(if (pw/check pw (:pw user))
        (dissoc user :pw))))

　(defn change-pw! [email old-pw new-pw]
　　(if-let [user (authentication email old-pw)]
　　　(m-rslt/updated-existing?
　　　　(m-col/update db doc-name
　　　　　{:_id (:_id user)}
　　　　　{$set { :pw (pw/encrypt new-pw)
　　　　　　　　　　:updated-at (java.util.Date.)}})))))
