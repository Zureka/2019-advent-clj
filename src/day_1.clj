(ns day-1)

(defn fuel-for-mass
  [mass]
  (- (quot mass 3) 2))

(defn calc-mass
  [mass]
  (if (<= mass 0)
    0
    (+ mass (calc-mass (fuel-for-mass mass)))))

(defn fuel-for-mass-of-fuel
  [mass]
  (let [fuel-mass (fuel-for-mass mass)]
    (calc-mass fuel-mass)))

(defn read-file
  [filename]
  (with-open [rdr (clojure.java.io/reader (str "input/" filename))]
    (reduce conj [] (line-seq rdr))))

(defn sum-input
  [func]
  (reduce + 0 (map #(func (Integer. %)) (read-file "day_1_input.txt"))))

(defn -main []
  (do
    (println "The answer for part 1 is:" (sum-input fuel-for-mass))
    (println "The answer for part 2 is:" (sum-input fuel-for-mass-of-fuel))))

