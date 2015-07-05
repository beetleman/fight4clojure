(ns fight4clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Run tests!"))


(def problem-1
  true)


(def problem-2
  4)


(def problem-3
  "HELLO WORLD")


;; problem-4
;; :a :b :c


(def problem-5
  '(1 2 3 4))


;; problem-5
;; :a :b :c


(def problem-7
  [1 2 3 4])


(def problem-8
  #{:a :b :c :d})


(def problem-9
  2)


(def problem-9
  2)


(def problem-10
  20)


(def problem-11
  [:b 2])


(def problem-12
  3)


(def problem-13
  [20 30 40])


(def problem-14
  8)


(def problem-15
  #(* 2 %))


(def problem-16
  #(str "Hello, " % "!"))


(def problem-17
  '(6 7 8))


(def problem-18
  '(6 7))


(def problem-19
  #(first (reverse %)))


(def problem-20
  (comp second reverse))


(def problem-21
  #(first (drop %2 %1)))


(def problem-22
  #(reduce (fn [p _] (+ p 1)) 0 %))


(def problem-23
  (fn [old-list]
    (loop [old-list old-list
           new-list '()]
      (if (empty? old-list)
        new-list
        (recur
         (rest old-list)
         (conj new-list (first old-list)))))))


(def problem-24
  #(apply + %))


(def problem-25
  #(filter odd? %))


(def problem-26
  (fn [n]
    (loop [n n
           fibs [1 1]]
      (if (<= n 1)
        (drop-last fibs)
        (recur
         (dec n)
         (conj fibs (apply + (take-last 2 fibs))))))))


(def problem-27
  (fn [s]
    (= (into [] s) (reverse s))))


(def problem-28
  (fn flatten* [to-flatten]
    (loop [old-seq (rest to-flatten)
           now (first to-flatten)
           new-seq '()] 
      (if (nil? now)
        new-seq
        (recur (rest old-seq)
               (first old-seq)
               (if (coll? now)
                 (concat new-seq (flatten* now))
                 (conj (vec new-seq) now)))))))


(def problem-29
  (fn [s] (apply str (filter #(Character/isUpperCase %) s))))


(def problem-30
  (fn [s]
    (reduce (fn [reduced el]
              (if (= el (last reduced))
                reduced
                (conj reduced el))) [] s)))


(def problem-31
  #(partition-by identity %))


(def problem-32
  (fn [x] (mapcat #(list %1 %1) x)))


(def problem-33
  (fn [x n] (mapcat #(repeat n %) x)))


(def problem-34
  (fn [from to] (take (- to from) (iterate inc from))))


(def problem-35
  7)


;; problem-36
;; [x 7
;;  y 3
;;  z 1]


(def problem-37
  "ABC")


(def problem-38
  (fn [f & r] (reduce #(if (>%1 %2) %1 %2) f r)))


(def problem-39
  #(mapcat list %1 %2))


(def problem-40
  (fn [sep xs] (drop-last (mapcat #(list % sep) xs))))
