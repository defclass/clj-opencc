(ns clj-opencc.core
  (:import [opencc OpenCC]))

(def ^:private dicts (atom {}))

(def ^:private conversions #{:s2tw :s2twp :tw2s :t2hk :s2hk :t2tw :t2s :s2t :hk2s :tw2sp})

(defn get-dict
  ([]
    (get-dict :s2t))
  ([conversion]
   {:pre [(keyword? conversion) (conversions conversion)]}
   (if-let [dict (conversion @dicts)]
     dict
     (let [new-dict (-> (name conversion)
                        (str)
                        (OpenCC.))]
       (swap! dicts assoc conversion new-dict)
       new-dict))))

(defn convert [dict to-convert]
  {:pre [(instance? opencc.OpenCC dict) (string? to-convert)]}
  (.convert dict to-convert))
