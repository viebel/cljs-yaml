(ns cljs-yaml.core
  (:require ["js-yaml" :as yaml]))

(defn deserialize [string] 
  (try
    [:ok (js->clj (yaml/load string) :keywordize-keys true)]
    (catch js/Object e
      [:error (js->clj e)])))

