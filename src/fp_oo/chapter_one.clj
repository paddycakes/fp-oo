(ns fp-oo.chapter-one)


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


;; Exercise 3
;; Implement add-squares.

;; user=> (add-squares 1 2 5)
;; 30




;; Exercise 4
;; The range function produces a sequence of numbers:

;; user=> (range 1 5)
;; (1 2 3 4)

;; Using it and apply, implement a bizarre version of factorial that uses 
;; neither iteration nor recursion. Hint: The factorial of 5 is 1*2*3*4*5.



;; Exercise 5
;; Below, I give a list of functions that work on lists or vectors. For each
;; one, think of a problem it could solve, and solve it. For example, we’ve 
;; already solved two problems:




;; Exercise 6
;; Implement this function:
;;    (prefix-of? candidate sequence)
;; Both arguments are sequences. Returns true if the elements in the candidate 
;; are the first elements in the sequence:

;; user> (prefix-of? [1 2] [1 2 3 4])
;; true
;; user> (prefix-of? '(2 3) [1 2 3 4])
;; false
;; user> (prefix-of? '(1 2) [1 2 3 4])
;; true



;; Exercise 7
;; Implement this function:
;;    (tails sequence)
;; Returns a sequence of successively smaller subsequences of the argument.

;; user> (tails '(1 2 3 4))
;; ((1 2 3 4) (2 3 4) (3 4) (4) ())

;; To implement tails, use range, which produces a sequence of integers. 
;; For example, (range 4) is (0 1 2 3).
;; This one is tricky. My solution is very much in the functional style, in that it 
;; depends on sequences being easy to create and work with. So I’ll provide some hints. 
;; Here and hereafter, I encourage you to try to finish without using the hints, but 
;; not to the point where you get frustrated. Programming is supposed to be fun.

;; Hint: What is the result of evaluating this?

;; [(drop 0 [1 2 3])
;;  (drop 1 [1 2 3])
;;  (drop 2 [1 2 3])
;;  (drop 3 [1 2 3])]

;; Hint: map can take more than one sequence. If you give it two sequences, it passes 
;; the first of each to its function, then the second of each, and so on.



;; Exercise 8
;; In the first exercise in the chapter, I asked you to complete this function:
;;   (def second (fn [list] ____))

;; Notice that list is a parameter to the function. We also know that list is (globally), 
;; a function in its own right. That raises an interesting question. What is the result 
;; of using the following function?

;;  user=> (def puzzle (fn [list] (list list))) 
;;  user=> (puzzle '(1 2 3))
;;  ????

;; Why does that happen?
;; Hint: Use the substitution rule for functions.






