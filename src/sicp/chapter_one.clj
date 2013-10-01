(ns sicp.chapter-one)

; Exercise 1.3.
; Define a procedure that takes three numbers as arguments and returns the sum of the squares of the two larger numbers.

(defn square [x] (* x x))


(defn sum-of-squares [x y]
  (+ (square x) (square y)))

(defn max-two-out-of-three [x y z]
  (cond
   (> x y z) (sum-of-squares x y)
   (> y x z) (sum-of-squares x y)
   (> y z x) (sum-of-squares y z)
   (> z y x) (sum-of-squares y z)
   (> z x y) (sum-of-squares z x)
   (> x z y) (sum-of-squares z x)))



(max-two-out-of-three 1 2 3)
(max-two-out-of-three 1 3 2)
(max-two-out-of-three 3 2 1)
(max-two-out-of-three 2 3 1)
(max-two-out-of-three 3 1 2)
(max-two-out-of-three 2 1 3)


; Exercise 1.3. Done.
