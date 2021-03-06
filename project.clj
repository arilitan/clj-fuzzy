(defproject clj-fuzzy "0.1.8"
  :description "A handy collection of algorithms dealing with fuzzy strings and phonetics."
  :url "http://yomguithereal.github.io/clj-fuzzy/"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2202"]]
  :plugins [[lein-kibit "0.0.8"]
            [lein-cljsbuild "1.0.3"]]
  :cljsbuild
  {:crossovers [clj-fuzzy.caverphone
                clj-fuzzy.cologne
                clj-fuzzy.dice
                clj-fuzzy.double-metaphone
                clj-fuzzy.hamming
                clj-fuzzy.helpers
                clj-fuzzy.jaccard
                clj-fuzzy.jaro_winkler
                clj-fuzzy.levensthein
                clj-fuzzy.match_rating
                clj-fuzzy.metaphone
                clj-fuzzy.nysiis
                clj-fuzzy.porter
                clj-fuzzy.soundex
                clj-fuzzy.tversky],
   :builds
   [{:crossover-jar true,
     :source-paths ["src-cljs"],
     :crossover-path "src-cljs/clj_fuzzy",
     :compiler
     {:pretty-print false,
      :output-to "src-js/clj-fuzzy.temp.js",
      :optimizations :advanced}}]})
