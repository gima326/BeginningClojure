(ns shorter.models.links-db
  (:require [monger.core :as mngr]
　　　　　　　[monger.collection :as m-col]
　　　　　　　[monger.operators :as m-opr])
  (:import [org.bson.types ObjectId]))

(let[db-name "shorter"
　　　doc-name "links"
　　　conn (mngr/connect)
　　　db (mngr/get-db conn db-name)]

　(defn get-urls []
　　(m-col/find-maps db doc-name))

　(defn new-id []
　　(:value
　　　(m-col/find-and-modify db doc-name
　　　　{:_id "current-id"}
　　　　{m-opr/$inc {:value 1}}
　　　　{:upsert true :new true})))

　(defn add-link! [url]
　　(let [new-id (new-id)
　　　　　document (m-col/insert-and-return db doc-name {:url url})
　　　　　{id :_id} document]
　　　(str id ":" new-id)))

  (defn fetch-link [id]
    (if-let [ document (m-col/find-one-as-map db doc-name {:_id (ObjectId. id)}) ]
    　(:url document))))
