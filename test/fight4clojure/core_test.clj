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


(deftest a-test-problem-80
  (testing "problem-80"
    (is (= (problem-80 6) true))
    (is (= (problem-80 7) false))
    (is (= (problem-80 496) true))
    (is (= (problem-80 500) false))
    (is (= (problem-80 8128) true))))


(deftest a-test-problem-81
  (testing "problem-81"
    (is (= (problem-81 #{0 1 2 3} #{2 3 4 5}) #{2 3}))
    (is (= (problem-81 #{0 1 2} #{3 4 5}) #{}))
    (is (= (problem-81 #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d}))))


(deftest a-test-problem-82
  (testing "problem-82"
    (is (= (problem-82 #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"}) true))
    (is (= (problem-82 #{"cot" "hot" "bat" "fat"}) false))
    (is (= (problem-82 #{"to" "top" "stop" "tops" "toss"}) false))
    (is (= (problem-82 #{"spout" "do" "pot" "pout" "spot" "dot"}) true))
    (is (= (problem-82 #{"share" "hares" "shares" "hare" "are"}) true))
    (is (= (problem-82 #{"share" "hares" "hare" "are"}) false))))


(deftest a-test-problem-83
  (testing "problem-83"
    (is (= (problem-83 false false) false))
    (is (= (problem-83 true false) true))
    (is (= (problem-83 true) false))
    (is (= (problem-83 false true false) true))
    (is (= (problem-83 true true true) false))
    (is (= (problem-83 true true true false)) false)))


(deftest a-test-problem-84
  (testing "problem-84"
    (is (let [divides #{[8 4] [9 3] [4 2] [27 9]}]
          (= (problem-84 divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]})))
    (is (let [more-legs
              #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}]
          (= (problem-84 more-legs)
             #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
               ["spider" "cat"] ["spider" "man"] ["spider" "snake"]})))
    (is (let [progeny
              #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}]
          (= (problem-84 progeny)
             #{["father" "son"] ["father" "grandson"]
               ["uncle" "cousin"] ["son" "grandson"]})))))

(deftest a-test-problem-85
  (testing "problem-85"
    (is (= (problem-85 #{1 :a}) #{#{1 :a} #{:a} #{} #{1}}))
    (is (= (problem-85 #{}) #{#{}}))
    (is (= (problem-85 #{1 2 3}) #{#{} #{1} #{2} #{3} #{1 2} #{1 3} #{2 3} #{1 2 3}}))
    (is (= (count (problem-85 (into #{} (range 10)))) 1024))))


(deftest a-test-problem-86
  (testing "problem-86"
    (is (= (problem-86 7) true))
    (is (= (problem-86 986543210) true))
    (is (= (problem-86 2) false))
    (is (= (problem-86 3) false))))


(deftest a-test-problem-88
  (testing "problem-88"
    (is (= (problem-88 #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7}))
    (is (= (problem-88 #{:a :b :c} #{}) #{:a :b :c}))
    (is (= (problem-88 #{} #{4 5 6}) #{4 5 6}))
    (is (= (problem-88 #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]}))))


(deftest a-test-problem-89
  (testing "problem-89"
    (is (= true
           (problem-89 [[:a :b]])))
    (is (= false
           (problem-89 [[:a :a] [:b :b]])))
    (is (= false
           (problem-89 [[:a :b] [:a :b] [:a :c] [:c :a]
                [:a :d] [:b :d] [:c :d]])))
    (is (= true
           (problem-89 [[1 2] [2 3] [3 4] [4 1]])))
    (is (= true
           (problem-89 [[:a :b] [:a :c] [:c :b] [:a :e]
                [:b :e] [:a :d] [:b :d] [:c :e]
                [:d :e] [:c :f] [:d :f]])))
    (is (= false
           (problem-89 [[1 2] [2 3] [2 4] [2 5]])))))



(deftest a-test-problem-90
  (testing "problem-90"
    (is (= (problem-90 #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
           #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
             ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
             ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}))
    (is (= (problem-90 #{1 2 3} #{4 5})
           #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}))
    (is (= 300 (count (problem-90 (into #{} (range 10))
                          (into #{} (range 30))))))))
