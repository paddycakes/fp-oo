(ns fp-oo.chapter-one-test
  (:use clojure.test
        fp-oo.chapter-one))

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

;; Exercise 3

(deftest add-squares-test
  (testing "Test for add-squares function."
    (is (= 30 (add-squares 1 2 5)))))








