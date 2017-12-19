(ns clj-opencc.core-test
  (:require [clojure.test :refer :all]
            [clj-opencc.core :as cc]))

(deftest test-opencc
  (testing "hk2s"
    (let [hk2s (cc/get-dict :hk2s)
          converted (cc/convert hk2s "香煙（英語：Cigarette），為煙草製品的一種。滑鼠是一種很常見及常用的電腦輸入設備。")]
      (is (= "香烟（英语：Cigarette），为烟草制品的一种。滑鼠是一种很常见及常用的电脑输入设备。" converted))))

  (testing "s2hk"
    (let [s2hk (cc/get-dict :s2hk)
          converted (cc/convert s2hk "香烟（英语：Cigarette），为烟草制品的一种。滑鼠是一种很常见及常用的电脑输入设备。")]
      (is (= "香煙（英語：Cigarette），為煙草製品的一種。滑鼠是一種很常見及常用的電腦輸入設備。" converted)))))
