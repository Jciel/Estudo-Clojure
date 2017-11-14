(ns forca.exercicios
  (:gen-class))


(defn le-do-teclado! []
	(read-line))

(defn read-and-convert []
	(def numero (le-do-teclado!))
	(* (Integer/parseInt numero) 7))

; (* 7 (Integer/parseInt (le-letra!)))



(defn soma[n]
    (loop [contador 1 soma 0]
        (if (> contador n) soma
        (recur (inc contador) (+ soma contador)))))