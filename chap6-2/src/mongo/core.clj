(ns mongo.core
  (:require [monger.core :as mngr]
　　　　　　　[monger.collection :as m-col]
　　　　　　　[monger.operators :as m-opr]))

(let[db-name "test"
　　　doc-name "documents"
     conn (mngr/connect)
　　　db (mngr/get-db conn db-name) ]

  ;; ドキュメントの取得

  (defn get-colls []
    (m-col/find-maps db doc-name))

　(defn print-colls []
    (for [obj (m-col/find-maps db doc-name)]
  　　　(println obj)))

　(defn find-colls [cond]
　　(m-col/find-maps db doc-name cond))

　(defn find-one-as-map [cond]
　　(m-col/find-one-as-map db doc-name cond))

　(defn foo [cond key]
　　(get (first (m-col/find-maps db doc-name cond)) key))


  ;; ドキュメントの挿入

  (defn insert-col [data]
    (m-col/insert-and-return db doc-name data))


  ;; ドキュメントの更新

　(defn update-col [cond data]
　　(m-col/update db doc-name cond {m-opr/$set data}))

　(defn update-cols [cond & data]
　　(for [field data]
　   (update-col cond field)))


  ;; ドキュメントの削除

  (defn del-cols [cond]
　　(m-col/remove db doc-name cond)))
