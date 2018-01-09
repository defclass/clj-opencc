# clj-opencc

clj-opencc 是对 [OpenCC-Java](https://github.com/yichen0831/OpenCC-Java) 简单封装

OpenCC-Java is made by Java with the dictionary files of OpenCC which is developed by BYVoid(byvoid.kcp@gmail.com).

OpenCC-Java是用Java所寫, 使用由BYVoid(byvoid.kcp@gmail.com)所開發的OpenCC中的字典檔案.


## Usage

Add clj-opencc dependence:

`[defclass/clj-opencc "0.1.0-SNAPSHOT"]`

Examples:

```clojure

;; dict 支持 :s2tw :s2twp :tw2s :t2hk :s2hk :t2tw :t2s :s2t :hk2s :tw2sp

(def s2hk-dict (get-dict :s2hk))

(convert s2hk-dict "香烟（英语：Cigarette），为烟草制品的一种。鼠标是一种很常见及常用的电脑输入设备。")
=> "香菸（英語：Cigarette），爲菸草製品的一種。鼠標是一種很常見及常用的電腦輸入設備。"


```
