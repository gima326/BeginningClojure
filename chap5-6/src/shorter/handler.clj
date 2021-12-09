(ns shorter.handler
  (:use [compojure.core]
        [ring.util.response :only [redirect]])
  (:require [shorter.models.links :as links]
　　　　　　　[compojure.handler :as hdlr]))

(defn top [req]
　(str "<html><body><form method='post' action='/'>"
      "<input type='text' name='url'><input type='submit' value='ok'>"
      "</form></body></html>"))

(defn add-link! [{{:keys [url]} :params :as req}]
　(let [[key url] (links/add-link! (:url (:params req)))]
;;　  (println "req: "(:params req))
;;　  (println "url: " (:url (:params req)))

    (str
　　　　"<html><body>"
　　　　"key: [ <a href='./" key "'>" key "</a> ]<br>"
　　　　"redirect to: [ " url " ]"
　　　　"</body></html>")))

(defn fetch-link [{{:keys [key1234]} :params :as req}]
　(let [url (links/fetch-link key1234)]
;;　　(println (str "handler key1234: " key1234))

　　(if (nil? url) "no pages." (redirect url))))

(defroutes app-routes
  (GET "/" [] top)
  (POST "/" [] add-link!)

　;; ブラウザから入力された url を、"key1234" という変数で取得する。
　(GET "/:key1234" [] fetch-link))

(def app
  (hdlr/site app-routes))
