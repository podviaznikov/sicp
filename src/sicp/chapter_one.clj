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


; Exercise 1.8.
; Newton’s method for cube roots.

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x))

(defn cube [x] (* x x x))

(defn good-enough? [guess original]
  (< (abs (- (cube guess) original)) 0.001))



(defn new-guess [guess original]
  (/ (+ (/ original (square guess))
        (* 2 guess)
      3)))

(defn cubert-iteration [guess original]
  (if (good-enough? guess original)
    guess
    (cubert-iteration (new-guess guess original) original)))



(defn cubert [x]
  (cubert-iteration 3 x))


;(good-enough? 1 9)


;(cubert 2)



