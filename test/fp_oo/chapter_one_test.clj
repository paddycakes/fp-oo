(ns fp-oo.chapter-one-test
  (:use clojure.test
        fp-oo.chapter-one))

(deftest a-test
  (testing "Test for second function."
    (is (= 2 (second '(1 2 3 4 5))))))

(deftest b-test
  (testing "Test for second function."
    (is (= nil (second [])))))

(deftest c-test
  (testing "Test for second function."
    (is (= :b (second [:a :b :c])))))







