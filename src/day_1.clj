(ns day-1)

(defn fuel-for-mass
  [mass]
  (- (quot mass 3) 2))

(defn read-file
  [filename]
  (with-open [rdr (clojure.java.io/reader (str "input/" filename))]
    (reduce conj [] (line-seq rdr))))

(defn -main []
  (print "The answer is"
         (reduce + 0 (map #(fuel-for-mass (Integer. %)) (read-file "day_1_input.txt")))))

