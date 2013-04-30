(ns fp-oo.chapter-01.week-01)


; Exercise 1
;; Given what you know now, can you define a function second that
;; returns the second element of a coll? 

(def second (fn [coll] (first (rest coll))))


;; Exercise 2
;; Give two implementations of third, which returns the third element of a list.

; It looks like nth would be a possible easy solution for this, but it
; it will cause an out-of-bounds exception if the list is shorter than
; three elements.
; (defn third ([list] (nth list 2)))

; However, there is a version of nth that takes a default value as an argument.
; nil is the default value to return rather than throwing an exception
; (defn third ([list] (nth list 2 nil)))

(defn third ([list] (second (rest list))))

(defn third ([list] (first (rest (rest list)))))



