(ns mongo.core
  (:require [monger.core :as mngr]))

(defn foo []
  (mngr/connect))

(defn bar []
  (mngr/connect {:host "127.0.0.1"}))

(defn baz [dbname]
  (mngr/connect-via-uri (str "mongodb://localhost/" dbname)))
