(ns fight4clojure.core-test
  (:require [clojure.test :refer :all]
            [fight4clojure.core :refer :all]))

;; (deftest a-test
;;   (testing "FIXME, I fail."
;;     (is (= 0 1))))

;; TODO: use tests check problems

(deftest test-problem-76
  (testing "problem-76"
    (is (= problem-76
           (letfn
               [(foo [x y] #(bar (conj x y) y))
                (bar [x y] (if (> (last x) 10)
                             x
                             #(foo x (+ 2 y))))]
             (trampoline foo [] 1))))))


(deftest a-test-problem-77
  (testing "problem-77"
    (is (= (problem-77 ["meat" "mat" "team" "mate" "eat"])
           #{#{"meat" "team" "mate"}}))
    (is (= (problem-77 ["veer" "lake" "item" "kale" "mite" "ever"])
           #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}))))


(deftest a-test-problem-78
  (testing "problem-78"
    (is (= (letfn [(triple [x] #(sub-two (* 3 x)))
                   (sub-two [x] #(stop?(- x 2)))
                   (stop? [x] (if (> x 50) x #(triple x)))]
             (problem-78 triple 2))
           82))
    (is (= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
                   (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
             (map (partial problem-78 my-even?) (range 6)))
           [true false true false true false]))))


(deftest a-test-problem-79
  (testing "problem-79"
    (is (= 7 (problem-79 '([1]
                           [2 4]
                           [5 1 4]
                           [2 3 4 5]))))
    (is (= 20 (problem-79 '([3]
                            [2 4]
                            [1 9 3]
                            [9 9 2 4]
                            [4 6 6 7 8]
                            [5 7 3 5 1 4]))))))
