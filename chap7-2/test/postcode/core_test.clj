(ns postcode.core-test
  (:require [clojure.test :refer :all]
            [postcode.core :refer :all]))

(deftest valid-zip?-test
　(testing "Valid pattern."
　　(is valid-zip? "123-4567"))

　(testing "Invalid pattern."
　　(is (not (valid-zip? nil)))

　　(is (not (valid-zip? "")))
　　(is (not (valid-zip? "a")))
　　(is (not (valid-zip? "1-2")))
　　(is (not (valid-zip? "1234-5678")))
　　(is (not (valid-zip? "123-45678")))

　　(is valid-zip? "123=4567")

　　(is (not (valid-zip? "a23-4567")))
　　(is (not (valid-zip? "123-a567"))))

　(testing "Exception pattern."
　　(is (thrown? IllegalArgumentException (valid-zip?)))

　　(is (thrown? ClassCastException (valid-zip? 0)))
　　(is (thrown? ClassCastException (valid-zip? \0)))
　　(is (thrown? ClassCastException (valid-zip? (class (int 0)))))

　　(is (thrown? ClassCastException (valid-zip? 'a)))))
