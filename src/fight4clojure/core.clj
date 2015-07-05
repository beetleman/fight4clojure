(ns fight4clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Run tests!"))


(def problem-1
  "https://www.4clojure.com/problem/1"
  true)


(def problem-2
  "https://www.4clojure.com/problem/2"
  4)


(def problem-3
  "https://www.4clojure.com/problem/3"
  "HELLO WORLD")


;; problem-4
;; "https://www.4clojure.com/oblem-4"
;; :a :b :c


(def problem-5
  "https://www.4clojure.com/problem/5"
  '(1 2 3 4))


;; problem-5
;; :a :b :c


(def problem-7
  "https://www.4clojure.com/problem/7"
  [1 2 3 4])


(def problem-8
  "https://www.4clojure.com/problem/8"
  #{:a :b :c :d})


(def problem-9
  "https://www.4clojure.com/problem/9"
  2)


(def problem-9
  "https://www.4clojure.com/problem/9"
  2)


(def problem-10
  "https://www.4clojure.com/problem/10"
  20)


(def problem-11
  "https://www.4clojure.com/problem/11"
  [:b 2])


(def problem-12
  "https://www.4clojure.com/problem/12"
  3)


(def problem-13
  "https://www.4clojure.com/problem/13"
  [20 30 40])


(def problem-14
  "https://www.4clojure.com/problem/14"
  8)


(def problem-15
  "https://www.4clojure.com/problem/15"
  #(* 2 %))


(def problem-16
  "https://www.4clojure.com/problem/16"
  #(str "Hello, " % "!"))


(def problem-17
  "https://www.4clojure.com/problem/17"
  '(6 7 8))


(def problem-18
  "https://www.4clojure.com/problem/18"
  '(6 7))


(def problem-19
  "https://www.4clojure.com/problem/19"
  #(first (reverse %)))


(def problem-20
  "https://www.4clojure.com/problem/20"
  (comp second reverse))


(def problem-21
  "https://www.4clojure.com/problem/21"
  #(first (drop %2 %1)))


(def problem-22
  "https://www.4clojure.com/problem/22"
  #(reduce (fn [p _] (+ p 1)) 0 %))


(def problem-23
  "https://www.4clojure.com/problem/23"
  (fn [old-list]
    (loop [old-list old-list
           new-list '()]
      (if (empty? old-list)
        new-list
        (recur
         (rest old-list)
         (conj new-list (first old-list)))))))


(def problem-24
  "https://www.4clojure.com/problem/24"
  #(apply + %))


(def problem-25
  "https://www.4clojure.com/problem/25"
  #(filter odd? %))


(def problem-26
  "https://www.4clojure.com/problem/26"
  (fn [n]
    (loop [n n
           fibs [1 1]]
      (if (<= n 1)
        (drop-last fibs)
        (recur
         (dec n)
         (conj fibs (apply + (take-last 2 fibs))))))))


(def problem-27
  "https://www.4clojure.com/problem/27"
  (fn [s]
    (= (into [] s) (reverse s))))


(def problem-28
  "https://www.4clojure.com/problem/28"
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
  "https://www.4clojure.com/problem/29"
  (fn [s] (apply str (filter #(Character/isUpperCase %) s))))


(def problem-30
  "https://www.4clojure.com/problem/30"
  (fn [s]
    (reduce (fn [reduced el]
              (if (= el (last reduced))
                reduced
                (conj reduced el))) [] s)))


(def problem-31
  "https://www.4clojure.com/problem/31"
  #(partition-by identity %))


(def problem-32
  "https://www.4clojure.com/problem/32"
  (fn [x] (mapcat #(list %1 %1) x)))


(def problem-33
  "https://www.4clojure.com/problem/33"
  (fn [x n] (mapcat #(repeat n %) x)))


(def problem-34
  "https://www.4clojure.com/problem/34"
  (fn [from to] (take (- to from) (iterate inc from))))


(def problem-35
  "https://www.4clojure.com/problem/35"
  7)


;; problem-36
;; "https://www.4clojure.com/oblem-3/"
;; [x 7
;;  y 3
;;  z 1]


(def problem-37
  "https://www.4clojure.com/problem/37"
  "ABC")


(def problem-38
  "https://www.4clojure.com/problem/38"
  (fn [f & r] (reduce #(if (> %1 %2) %1 %2) f r)))


(def problem-39
  "https://www.4clojure.com/problem/39"
  #(mapcat list %1 %2))


(def problem-40
  "https://www.4clojure.com/problem/40"
  (fn [sep xs] (drop-last (mapcat #(list % sep) xs))))


(def problem-41
  "https://www.4clojure.com/problem/41"
  (fn [xs n] 
    (mapcat (partial take (dec n)) 
            (partition-all n xs))))


(def problem-42
  "https://www.4clojure.com/problem/42"
  (fn [n] 
    (if (>= 1 n ) 
      n 
      (apply * (range 1 (inc n))))))


(def problem-43
  "https://www.4clojure.com/problem/43"
  #(apply map list (partition %2 %1)))


(def problem-44
  "https://www.4clojure.com/problem/44"
  (fn [step sx]
    (let [len (count sx)
          step (mod step len)
          sx (cycle sx)]
      (take len (drop step sx)))))


(def problem-45
  "https://www.4clojure.com/problem/45"
  [1 4 7 10 13])


(def problem-46
  "https://www.4clojure.com/problem/46"
  (fn [f]
    (fn [x y] (f y x))))


(def problem-47
  "https://www.4clojure.com/problem/47"
  4)


(def problem-48
  "https://www.4clojure.com/problem/48"
  6)


(def problem-49
  "https://www.4clojure.com/problem/49"
  (fn [n xs] (list (take n xs) (drop n xs))))


(def problem-50
  "https://www.4clojure.com/problem/50"
  (comp vals (partial group-by type)))


(def problem-51
  "https://www.4clojure.com/problem/51"
  [1 2 3 4 5])


;; problem-52
;; "https://www.4clojure.com/oblem-5/"
;; [c e]


(def problem-53
  "https://www.4clojure.com/problem/53"
  (fn [[x & xs]]
    (let [longest (-> (reduce (fn [[g & grests :as gs] cur]
                                (if (= (last g) (dec cur))
                                  (cons (conj g cur) grests)
                                  (cons [cur] gs)))
                              (list [x]) xs)
                      sort
                      last)]
      (if (= (count longest) 1)
        []
        longest))))


(def problem-54
  "https://www.4clojure.com/problem/54"
  (fn [n xs]
    (loop [n n
           xs xs
           partitioned []]
      (if (empty? xs)
        (filter #(= (count %) n) partitioned)
        (recur n (drop n xs) (conj partitioned (take n xs)))))))


(def problem-55
  "https://www.4clojure.com/problem/55"
  (fn [xs]
    (apply hash-map
           (mapcat
            (fn [[k v]] [k (count v)])
            (group-by identity xs)))))


(def problem-56
  "https://www.4clojure.com/problem/56"
  (fn [xs]
    (reduce
     (fn [reduced x]
       (if (some #(= % x) reduced)
         reduced
         (conj reduced x)))
     [] xs)))


(def problem-57
  "https://www.4clojure.com/problem/57"
  [5 4 3 2 1])


(def problem-58
  "https://www.4clojure.com/problem/58"
  (fn [f & fs]
    (reduce
     (fn [rf f] (fn [& x] (rf (apply f x ))))
     f fs)))


(def problem-59
  "https://www.4clojure.com/problem/59"
  (fn [& fs]
    (fn [& xs]
      (map (fn [f] (apply f xs)) fs))))


(def problem-60
  "https://www.4clojure.com/problem/60"
  (fn reductions*
    ([f xs] (reductions* f (first xs) (next xs)))
    ([f val xs]
     (let [to-take (iterate inc 0)]
       (map
        (fn [x y] (reduce f val (take x xs)))
        to-take (cons val xs))))))


(def problem-61
  "https://www.4clojure.com/problem/61"
  #(apply hash-map (mapcat list %1 %2)))


(def problem-62
  "https://www.4clojure.com/problem/62"
  (fn *iterate [f x]
    (cons x (lazy-seq (*iterate f (f x))))))


(def problem-63
  "https://www.4clojure.com/problem/63"
  (fn [f xs]
    (reduce (fn [vs x]
              (let [key (f x)]
                (assoc vs key (conj (vs key []) x))))
            {} xs)))


(def problem-64
  "https://www.4clojure.com/problem/64"
  +)


(def problem-65
  "https://www.4clojure.com/problem/65"
  (fn [x]
    (let [v [:key :value]]
      (cond
        (= :value (get (conj x v) :key))
        :map
        (= (conj x v) (conj x v v))
        :set
        (reversible? x)
        :vector
        :else
        :list))))


(def problem-66
  "https://www.4clojure.com/problem/66"
  (fn [x y]
    (let [[x y] (sort [x y])]
      (loop [x x
             y y
             acc x]
        (if (= 0 (mod y acc) (mod x acc))
          acc
          (recur x y (dec acc)))))))


(def problem-67
  "https://www.4clojure.com/problem/67"
  (fn *prime [n]
    (loop [acc []
           curr 2]
      (cond
        (= (count acc) n)
        acc
        (not-any? zero? (map #(mod curr %) acc))
        (recur (conj acc curr) (inc curr))
        :else
        (recur acc (inc curr))))))


(def problem-68
  "https://www.4clojure.com/problem/68"
  [7 6 5 4 3])


(def problem-69
  "https://www.4clojure.com/problem/69"
  (fn [f & maps]
    (loop [acc {}
           maps maps]
      (if (empty? maps)
        acc
        (recur
         (reduce
          (fn [acc [key val]]
            (if (contains? acc key)
              (assoc acc key (f (acc key) val))
              (assoc acc key val)))
          acc (first maps))
         (rest maps))))))


(def problem-70
  "https://www.4clojure.com/problem/70"
  (fn [s]
    (sort-by #(clojure.string/lower-case %)
             (clojure.string/split s #"\W"))))


(def problem-71
  "https://www.4clojure.com/problem/71"
  last)


;; problem-72
;; "https://www.4clojure.com/oblem-7/"
;; apply +


(def problem-73
  "https://www.4clojure.com/problem/73"
  (fn [board]
    (loop [table (concat
                  board
                  (apply map vector board)
                  [(map-indexed #(nth %2 %1) board)]
                  [(map-indexed #(nth (reverse %2) %1) board)])]
      (cond
        (empty? table)
        nil
        (= [:x :x :x] (first table))
        :x
        (= [:o :o :o] (first table))
        :o
        :else
        (recur (rest table))))))


(def problem-74
  "https://www.4clojure.com/problem/74"
  (fn [x]
    (clojure.string/join
     ","
     (filter (fn [x] (= 0.0 (mod (Math/sqrt x) 1)))
             (map #(Integer/parseInt %)
                  (clojure.string/split x #","))))))


(def problem-75
  "https://www.4clojure.com/problem/75"
  (fn [x]
    (letfn [(gcd [x y]
              (let [[x y] (sort [x y])]
                (loop [x x
                       y y
                       acc x]
                  (if (= 0 (mod y acc) (mod x acc))
                    acc
                    (recur x y (dec acc))))))]
      (if (= x 1)
        x
        (count (filter #(= 1 %) (map gcd (range 1 x) (repeat x))))))))


(def problem-76
  "https://www.4clojure.com/problem/76"
  [1 3 5 7 9 11])


(def problem-77
  "https://www.4clojure.com/problem/77"
  (fn [x]
    (set (filter #(< 1 (count %))
                 (map
                  (fn [[_ v]] (set v))
                  (group-by sort x))))))


(def problem-78
  "https://www.4clojure.com/problem/78"
  (fn [x & args]
    (loop [f (apply x args)]
      (if (fn? f)
        (recur (f))
        f))))
