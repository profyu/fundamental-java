---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識參考型別轉型與 instance of 關鍵字

---

# 多型 Polymorphism

* 同一個實例，在程式碼表達中，可以用不同的型別來`表達`


---

# 參考型別轉型

* 在程式碼表達中，臨時轉換某一實例的`型態`表達
* 又分為:
  * 向上轉型 (Upcasting)
  * 向下轉型 (Downcasting)

---

# 向上轉型

```java
Player playerA = new Warrior("玩家A", 100, 200, 80, 30, 0.5f);
```

---

# 向上轉型

```txt
java.lang.Object
    com.example.playground.Player
        com.example.playground.Warrior
```

> 向上轉型，編譯器直接容許

---

# 向下轉型(強制轉型)

* 雖然表達上不滿足 `IS-A關係`，但還是想把變數值放進去
* 強制轉型有風險，需要自己確定能轉得過去才行，否則程式跑的時候會出錯

---

```txt
生物類 (會繁殖)
    動物類 (會繁殖 + 會移動)
        鳥類 （會繁殖 + 會移動 + 有翅膀）
            鴨類 （會繁殖 + 會移動 + 有翅膀 + 會游泳）
```

---

# instance of 關鍵字

* 可視為一種二元運算子: `實例 instanceof 類別名`
* 用來判斷是否滿足 `IS-A關係`
* 此運算子結合後結果值會是 `布林值`


