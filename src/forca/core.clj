(ns forca.core
  (:gen-class))

(defn perdeu []
  (println "Você perdeu!"))

(defn ganhou []
  (println "Você ganhou!"))

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (contains? acertos (str letra))) palavra))

(defn acertou-a-palavra-toda? [palavra acertos]
  (empty? (letras-faltantes palavra acertos)))

(defn le-letra! []
  (read-line))

(defn acertou? [chute palavra]
  (contains? palavra chute))
  ; (.contains palavra chute)) dessa forma esse contains é da bibliote do java,
  ;                            usando a interoperabilidade do Clojure com o java

(def total-de-vidas 6)

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
    (perdeu)
    (if (acertou-a-palavra-toda? palavra acertos)
      (ganhou)
      (avalia-chute (le-letra!) vidas palavra acertos))))

(defn avalia-chute [chute vidas palavra acertos]
  (if (acertou? chute palavra)
    (jogo vidas palavra (conj acertos chute))
    (jogo (dec vidas) palavra acertos)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


