(ns mytest.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (mytest.javatest/StringToLong "21000000")))

