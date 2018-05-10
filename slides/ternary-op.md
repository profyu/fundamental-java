---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 三元運算子

---

# 三元運算子 (Ternary Operators)

* 表示一個運算子須給定`三個運算元`，才能結合出結果值
* Java 中只有一個三元運算子: `條件運算子`

---

# 條件運算子 (Conditional Operator)

* 又稱為 `ITE運算子`
* `條件表達式 ? 成立時結果值 : 不成立時結果值`

```java
int a = (4 > 3) ? 10 : 20;
```

> ITE = if-then-else

---

# 情境 & 思考

* 設計一程式，讓使用者輸入兩個整數`a`,`b`, 印出當中較大的數
* 假設`a`,`b` 不可能是同一整數

```java
System.out.println("請輸入a:");
int a = sc.nextInt();
System.out.println("請輸入b:");
int b = sc.nextInt();
if (a > b) {
    System.out.println("較大者:" + a);
} else {
    System.out.println("較大者:" + b);
}
```

---

# 情境 & 思考

* 用多一個變數來稍加改善

```java
int max = 0;
if (a > b) {
    max = a;
} else {
    max = b;
}
System.out.println("較大者: "+max);
```

---

# 情境 & 思考

* 用條件運算子改善

```java
int max = (a > b) ? a : b;
System.out.println("較大者: "+max);
```


