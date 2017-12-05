(ns collatz-conjecture
  (:import (java.lang Exception)))

(defn collatz [n]
  (letfn [(collatz-helper [n accum]
            (cond
              (<= n 0) (throw (IllegalArgumentException. "Illegal argument."))
              (= n 1) accum
              (= (rem n 2) 0) (recur (quot n 2) (inc accum))
              :else (recur (inc (* n 3)) (inc accum))))]
    (collatz-helper n 0)))
