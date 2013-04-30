(ns fp-oo.chapter-01.week-01-test
  (:use clojure.test
        fp-oo.chapter-01.week-01))

;; Exercise 1

(deftest second-test
  (testing "Test for second function."
    (is (= 2 (second '(1 2 3 4 5))))
    (is (= nil (second [])))
    (is (= :b (second [:a :b :c])))))

;; Exercise 2

(deftest third-test
  (testing "Test for third function."
    (is (= 3 (third '(1 2 3 4 5))))
    (is (= nil (third [])))
    (is (= :c (third [:a :b :c])))))









