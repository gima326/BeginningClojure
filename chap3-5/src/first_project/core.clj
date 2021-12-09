(ns first-project.core
　(:gen-class))

(defn parse-int [str]
　(Integer. str))

(defn -main [& args]
　(println (str "Sum: " (apply + (map parse-int args)))))
