(ns Functional-Programing)

(defn wisdom
  [words]
  (str words ", Daniel-san"))

(wisdom "Always bathe on Fridays")

(defn year-end-evaluation
  []
  (if (> (rand) 0.5)
    "You get a raise"
    "Better luck next year"))


(defn analyze-file
  [filename]
  (analysis (slurp filename)))


(defn analysis
  [text]
  (str "Character count: " (count text)))
