
(def visitors (atom #{}))
(defn hello
	"Writes hello message to *out*. Calls you by username"
	[username]
	(swap! visitors conj username)
	(str "Hello, " username)) (require 'clojure.java.io)


(defn greeting
	"Returns a greeting of the form 'Helo, username.'"
	[username]
	(str "Hello, " username))


(defn greeting
	"Returns a greeting of the form 'Helo, username.'
	Default username is 'world'."
	([] (greeting "world"))
	([username] (str "Hello, " username)))


(defn date [person-1 person-2 & chaperones]
	(println person-1 "and" person-2 "went out with" (count chaperones) "chaperones"))


(defn date2 [person-1 person-2 & chaperones]
	(println chaperones))

(defn date3 [person-1 person-2 & chaperones]
	(println person-1 "and" person-2 "went out with" (nth chaperones 0) "chaperones"))




(defn indexable-word?
	[word]
	(> (count word) 2))

(require '[clojure.string :as str])
(filter indexable-word? (str/split "A fine day it is" #"\W+"))

(filter (fn [w] (> (count w) 2)) (str/split "A fine day" #"\W+"))

(filter #(> (count %) 2) (str/split "A fine day it is" #"\W+"))


(defn indexable-words
	[text]
	(let [indexable-word? (fn [w] (> (count w) 2))]
		(filter indexable-word? (str/split text #"\W+"))))




(defn make-greeter
	[greeting-prefix]
	(fn [username] (str greeting-prefix ", " username)))

(def hello-greeting (make-greeter "Hello"))

(def aloha-greeting (make-greeter "Aloha"))




(defn square-corners [bottom left size]
	(let [top (+ bottom size)
		right (+ left size)]
		[[bottom left] [top left] [top right] [bottom right]]))




(defn greet-author-1
	[author]
	(println "Hello, " (:first-name author)))

(defn greet-author-2
	[{fname :first-name}]
	(println "Hello, " fname))

(greet-author-1 {:last-name "Vinge" :first-name "Vernor"})
(greet-author-2 {:last-name "Vinge" :first-name "Vernor"})