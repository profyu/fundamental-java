---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識多型


---

# 日常生活的類別繼承關係

```txt
生物類 (會繁殖)
    動物類 (會繁殖 + 會移動)
        鳥類 （會繁殖 + 會移動 + 有翅膀）
            鴨類 （會繁殖 + 會移動 + 有翅膀 + 會游泳）
```

---

# 情境 & 思考

* 你昨天去動物園看到了一隻黃小鴨，今天分別有`甲`、`乙`、`丙`、`丁`四位朋友都問你: `你昨天去動物園看了什麼?`
* 以下是你對每個人的回答:
  * 你回答甲: 我昨天看到了 `生物`
  * 你回答乙: 我昨天看到了 `動物`
  * 你回答丙: 我昨天看到了 `鳥`
  * 你回答丁: 我昨天看到了 `鴨`

---

# 你的回答都對，但是給四人的訊息量不一樣

* 甲覺得: 你看了`會繁殖`的東西
* 乙覺得: 你看了 `會繁殖 + 會移動`的東西
* 丙覺得: 你看了 `會繁殖 + 會移動 + 有翅膀`的東西
* 丁覺得: 你看了 `會繁殖 + 會移動 + 有翅膀 + 會游泳`的東西

---

# 答出四種答案

* `黃小鴨`透過`語言表達`時可以有`多種型式`的說法

> 黃小鴨的多型特性，存在你的語言表達裡

---

# IS-A 關係

* 黃小鴨 IS-A `鴨`
* 黃小鴨 IS-A `鳥`
* 黃小鴨 IS-A `動物`
* 黃小鴨 IS-A `生物`

> 只要滿足 IS-A 關係，都可以拿來變成回答甲乙丙丁的答案

---

# Warrior 繼承關係

```txt
java.lang.Object
    com.example.playground.Player
        com.example.playground.Warrior
```

---

# IS-A 關係

* playerA (實例)  IS-A `Warrior` (類)
* playerA (實例) IS-A `Player` (類)
* playerA (實例) IS-A `Object` (類)

```txt
java.lang.Object
    com.example.playground.Player
        com.example.playground.Warrior
```

---

# 多型 Polymorphism

* 同一個實例，在程式碼表達中，可以`以不同的型別`來表現
  * 宣告變數時: 只要給進去的值，滿足`IS-A關係`，都放得進去
  * 定義方法參數時: 只要傳進去的值，滿足 `IS-A關係`，都傳得進去

---

# 多型的核心精神

* 在於控管 `抽象程度`
* 對於一個實例，
  * 你知道的資訊太少: 程式難寫
  * 你知道的資訊太多: 變成負擔