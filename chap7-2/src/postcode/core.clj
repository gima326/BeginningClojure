(ns postcode.core)

(defn valid-zip? [zip]
  (if zip
　　(re-find #"^\d{3}-\d{4}$" zip)))
