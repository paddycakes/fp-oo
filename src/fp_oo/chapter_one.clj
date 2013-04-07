(ns fp-oo.chapter-one)

;; Exercise 1
;; Given what you know now, can you define a function second that
;; returns the second element of a coll? 

(def second (fn [list] (first (rest list))))


