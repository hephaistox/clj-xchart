(ns build
  (:require [badigeon.javac :as j]))

(defn javac
  []
  (println "Compiling Java")
  (j/javac "src/java"
           {:compile-path "classes",
            ;; Additional options used by the javac command
            :compiler-options ["-cp" "src:classes" "-target" "1.8" "-source"
                               "1.8" "-Xlint:-options:unchecked"]})
  (println "Compilation Completed"))

(defn -main [& _args] (javac))
