---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 賦值運算子： 用來簡化賦值寫法

---

# 情境 & 思考

* 我們常需要用`賦值陳述`來更新變數
* 往往更新的表達式只和`該變數自己`有關

```java
int a = 3;
a = a + 3;

int b = 4;
b = b - 2;

int c = 5
c = c * 3;
```

---

# 情境 & 思考

* 簡化

```java
int a = 3;
a += 3;

int b = 4;
b -= 2;

int c = 5
c *= 3;
```

---

# 賦值運算子

* 簡化`更新+賦值`的語法

```java
a += 3;  // a = a + 3;
a -= 3;  // a = a - 3;
a *= 3;  // a = a * 3;
a /= 3;  // a = a / 3;
a %= 3;  // a = a % 3;
```

---

# 賦值運算子

* 所構成的`表達式`，可自行成為一個`陳述`

> 而這陳述，就是賦值陳述

---

# 賦值運算子的計算結果是?

* 比如算術運算子`1 + 3` 結合後結果值是`4`
* 但 賦值運子 `a += 3` 會有結果值嗎？

```java
int a = 3;
int b = (a+=3);

System.out.println("a 是 "+ a);
System.out.println("b 是 "+ b);
```  

<!--往往只想更新變數，比較不在意結合後的結果-->