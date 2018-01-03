

(let [x 3]


(def dalmatian-list ["Pongo" "Perdita" "Puppy 1" "Puppy 2"])
(let [dalmatians (take 2 dalmatian-list)]
  dalmatians)


(def x 0)
(let [x 1]
	x)


(def x 0)
(let [x (inc x)] 
	x)


(let [[pongo & dalmatians] dalmatian-list]
  [pongo dalmatians])