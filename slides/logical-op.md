---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 邏輯運算子

---

# 情境 & 思考

* 設計一程式讓使用者輸入`英文`、`數學`、`歷史`三科成績，印出是否達到錄取資格。
  1. 若平均成績超過60分則錄取
  2. 但書: 若有一科零分則不予錄取



---

# 情境 & 思考

* 純粹用控制結構來實作

```java
float average = (englishScore + mathScore + historyScore) / 3f;

if (average >= 60) {
    if (englishScore > 0) {
        if (mathScore > 0) {
            System.out.println("錄取");
        } else {
            System.out.println("未錄取");
        }
    } else {
        System.out.println("未錄取");
    }
} else {
    System.out.println("未錄取");
}
```

---

# 情境 & 思考

* 條件表達式能不能有 `而且` 的語法?

```java
if (average >= 60 而且 englishScore > 0 而且 mathScore > 0 而且 historyScore > 0) {
    System.out.println("錄取");
}
else{
    System.out.println("未錄取");
}
```


---

# 邏輯運算子 (Logical Operators)

* 把`布林值`運算元進行邏輯運算
  1. `&&`: 邏輯 AND 運算子 (二元)
  2. `||`: 邏輯 OR 運算子 (二元)
  3. `!`: 邏輯 NOT 運算子 (一元)
  4. `^`: 邏輯 XOR 運算子 (二元)
* 計算的結果是 **布林值** (true/false)

---

# 邏輯 AND 運算子 (`&&`)

*  根據真值表，`A && B` 的結果是:

| A | B | A && B |
|:---:|:---:|:---:|
| F | F | F |
| F | T | F |
| T | F | F |
| T | T | T |

> 兩運算元同時為真結果才能是真

---

# 真值表應用例子

* 媽媽說`功課寫完`而且`外面天氣好`的話，就可以出去玩

| 功課寫完 | 天氣好 | 功課寫完 && 天氣好 |
|:---:|:---:|:---:|
| F | F | F |
| F | T | F |
| T | F | F |
| T | T | T |

---

# 連續邏輯運算

```java
if (average >= 60 && englishScore > 0 && mathScore > 0 && historyScore > 0) {
    System.out.println("錄取");
}
else{
    System.out.println("未錄取");
}
```

---

# 邏輯 OR 運算子 (`||`)

* 根據真值表，`A || B` 的結果是:

| A | B | A &#124;&#124; B |
|:---:|:---:|:---:|
| F | F | F |
| F | T | T |
| T | F | T |
| T | T | T |

> 兩運算元只要有一為真結果就是真

---

# 真值表應用例子

* 媽媽說`功課寫完`或者`外面天氣好`的話，就可以出去玩

| 功課寫完 | 天氣好 | 功課寫完 &#124;&#124; 天氣好 |
|:---:|:---:|:---:|
| F | F | F |
| F | T | T |
| T | F | T |
| T | T | T |

---

# 改寫錄取判斷程式

* 目標: 把程式改成完全只用`OR`

```java
if (average < 60 或者 englishScore <= 0 或者 mathScore <= 0 或者 historyScore <= 0) {
    System.out.println("未錄取");
}
else{
    System.out.println("錄取");
}
```

---

# 邏輯 NOT 運算子 (`!`)

* 是一元運算子

| A | !A |
|:---:|:---:|
| T | F |
| F | T |

> 否定/取相反

---

# 改寫錄取判斷程式

* 目標: 確定錄取後，進一步詢問`是否要報到?`
  1. 如使用者輸入`y`, 則印出`報到成功`。
  2. 否則就印出 `棄權`

```java
System.out.println("是否要報到? (要請輸入y)");
String awswer = sc.next();
if (!awswer.equals("y")) {
    System.out.println("棄權");
} else {
    System.out.println("報到成功");
}
```

---

# 邏輯 XOR 運算子 (`^`)

* 根據真值表，`A ^ B` 的結果是:

| A | B | A ^ B |
|:---:|:---:|:---:|
| F | F | F |
| F | T | T |
| T | F | T |
| T | T | F |

> 兩運算元相反就是真

---

# 真值表應用例子

* 戶政事務所有一份表格，上面有`配偶姓名`和`配偶電話`兩欄位要填寫。你是櫃檯人員，請判斷是否需提醒民眾他所填資料有誤?

| 有配偶姓名 | 有配偶電話 | 有配偶姓名 ^ 有配偶電話 |
|:---:|:---:|:---:|
| F | F | F |
| F | T | T |
| T | F | T |
| T | T | F |


---

# 短路求值策略 Short-circuit Evaluation

* 用來加速Java`表達式`中邏輯運算的效率
* 表達式僅有連續 `&&` 運算時，只要有一運算元為`false`，則後面不必再計算，總結果必`false`
* 表達式僅有連續 `||` 運算時，只要有一運算元為`true`，則後面不必再計算，總結果必`true`



