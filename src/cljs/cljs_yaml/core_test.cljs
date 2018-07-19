(ns cljs-yaml.core-test
  (:require [cljs-yaml.core :refer [deserialize]]
            [cljs.test :refer [deftest is]]))


(deftest deserialize-test
  (let [str "aaa: 3"]
    (is (= [:ok {:aaa 3}] (deserialize str)))))

