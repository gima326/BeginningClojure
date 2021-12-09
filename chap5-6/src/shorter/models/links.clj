;; フォルダ構成の変更対応 "src/chap5-6/" -> "src/shorter/models/"
;;(ns chap5-6.core)
(ns shorter.models.links)

(defn str-range [[start end]]
　(map
　　(comp str char)
　　　(range (int start) (inc (int end)))))

(defn gen-key-strings [char-ranges]
　(apply
　　concat
　　　(map str-range char-ranges)))

(defn idx->key [idx keys]
　(loop [i idx acc ""]
　　(if (zero? i)
　　　acc
　　　(recur
　　　　(quot i (count keys))
　　　　(str
　　　　　(nth keys (rem i (count keys)))
　　　　　acc)))))

(let [key-strings (gen-key-strings '[[\0 \9] [\a \z] [\A \Z]])
　　　links (ref {})
　　　idx (ref 0)]

  (defn add-link! [url]
    (dosync
　　　(let [key (idx->key (alter idx inc) key-strings)]
　　　　;; 短縮URLにあたる文字列をキーに、links に url を追加する。
　　　　(alter links assoc key url)
　　　　[key url])))

  (defn fetch-link [key]
　　(@links key)))
