---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識表達式、運算元、運算子的關係

---

## 什麼是表達式(Expression)

* `表達式`由一個或多個`運算元`和`運算子`構成，最終可以被計算為單一個**結果值**

> 運算元 = Operand / 運算子 = Operator

---

## 什麼是表達式(Expression)

```java
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = a + 2;
System.out.println("b 的值是 " + b);
```

---

# 哪邊會用到表達式

1. 陳述當中
  * 宣告陳述 (等號右邊)
  * 賦值陳述 (等號右邊)
  * 方法呼叫陳述 (參數/括號裡面)
  * 物件實作陳述 (參數/括號裡面)
2. 控制結構當中
  * `if`, `while`, `do-while`, `for` 的條件
  * `switch` 的受比對值

---

# 宣告陳述中的表達式

```java
int a = sc.nextInt();
int b = a + 2;
```

---

# 賦值陳述中的表達式

```java
int a = sc.nextInt();
int b = a + 2;
a = b + 3;
System.out.println("a 的值是 " + a);
System.out.println("b 的值是 " + b);
```

---

# 方法呼叫/物件實作陳述中的表達式

```java
int a = sc.nextInt();
int b = a + 2;
a = b + 3;
System.out.println("a 的值是 " + a);
System.out.println("b 的值是 " + b);
```

---

# 表達式可以只由一個運算元自己構成

```java
int c = 1;
int b = 3 + 2;
```

---

# 誰可以扮演運算元?

1. 字面常數(Literal)
2. 變數 / 常數
3. 呼叫方法後的結果值(回傳值)
4. 『另一個表達式』

---

# 字面常數扮演運算元

```java
int c = 1;
int b = 3 + 2;
```

---

# 變數扮演運算元

```java
int a = sc.nextInt();
int b = a + 2;
```

---

# 呼叫方法後的結果值扮演運算元

```java
int d = sc.nextInt() + 3;
```

---

# 『另一個表達式』扮演運算元

```java
int f = 2;
int g = (f + 3) * 6;
```

---

# 控制結構當中的表達式

* `if`, `else if` 的條件表達式

```java
int height = sc.nextInt();
if (height < 0) {
    System.out.println("身高不可為負數");
}
```

---

# 控制結構當中的表達式

* `while`, `do-while` 迴圈的條件表達式
```java
while (true) {
    // ...
}
```

---

# 控制結構當中的表達式

* `for` 迴圈的條件表達式

```java
for (int i = 2; i <= 9; i++) {
    // ...
}
```

---

# 控制結構當中的表達式

* `switch` 中受比對值

```java
int option = sc.nextInt();
switch (option) {
    // ...
}
```

---

# 回顧: 哪邊會用到表達式

1. 陳述當中
  * 宣告陳述 (等號右邊)
  * 賦值陳述 (等號右邊)
  * 方法呼叫陳述 (參數/括號裡面)
  * 物件實作陳述 (參數/括號裡面)
2. 控制結構當中
  * `if`, `while`, `do-while`, `for` 的條件
  * `switch` 的受比對值

<!--說明大部分的時候表達式不能自成一個陳述-->

---

# 『單獨一個方法』呼叫是例外

1. 可做為表達式
2. 可自成一個陳述

---

# 回顧: 以下各有幾個陳述?

* 一個
```java
int height = 0;
```

* 一個
```java
sc.nextInt();
```

* 一個?
```java
int height = sc.nextInt();
```

---

# 運算子有哪些?

