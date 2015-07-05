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
