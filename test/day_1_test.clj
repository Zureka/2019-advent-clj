(ns day-1-test
  (:require [clojure.test :refer :all]
            [day-1 :refer :all]))

(deftest test-fuel-for-mass
  (is (= 2 (fuel-for-mass 12)))
  (is (= 2 (fuel-for-mass 14)))
  (is (= 654 (fuel-for-mass 1969)))
  (is (= 33583 (fuel-for-mass 100756))))

(deftest test-fuel-for-mass-of-fuel
  (is (= 2 (fuel-for-mass-of-fuel 14)))
  (is (= 966 (fuel-for-mass-of-fuel 1969)))
  (is (= 50346 (fuel-for-mass-of-fuel 100756))))

