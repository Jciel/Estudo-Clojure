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



(def carros [50000.0, 60000.0])

(reduce (fn [acc n] (+ acc n)) carros)

(->> carros
	(map (fn [x] (* x 2)))
	(map (fn [x] (* x 3)))
	(reduce (fn [acc n] (+ acc n))))
