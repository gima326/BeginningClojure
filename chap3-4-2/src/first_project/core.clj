(ns first-project.core)

(defn parse-int [str]
　(Integer. str))

(defn -main [& args]
　(println (str "Sum: " (apply + (map parse-int args)))))
