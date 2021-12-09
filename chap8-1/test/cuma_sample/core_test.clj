(ns cuma-sample.core-test
  (:require [clojure.test :refer :all]
            [cuma-sample.core :refer :all]))

(deftest a-test
　(testing "Valid pattern."
    (is (= "Hello, gima!" (r {:name "gima"})))

　　(is (= "Hello, WORLD!" (r2 {:name "world"})))

    (is (= "&lt;html&gt;&lt;body&gt;hoge&lt;/body&gt;&lt;/html&gt;" (html {:html "<html><body>hoge</body></html>"})))

　　(is (= "<html><body>hoge</body></html>" (raw-html {:html "<html><body>hoge</body></html>"})))

    ;; if
    (is (= " <div>hello, if</div> " (cuma-if {:msg "hello, if"})))

    (is (= "" (cuma-if {:msg nil})))

    (is (= "" (cuma-if {:msg2 "hello, if"})))

    ;; for
    (is (= " <a href=\"/contents/A\">A</a><br>  <a href=\"/contents/B\">B</a><br> "
　　　(cuma-for {:contents [{:title "A"} {:title "B"}]})))
    )
  
  (testing "FIXME, I fail."
    (is (not (= 0 1))))
  )
