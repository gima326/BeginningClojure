(ns luminus-sample.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[luminus-sample started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[luminus-sample has shut down successfully]=-"))
   :middleware identity})
