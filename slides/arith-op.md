---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 算數運算子

---

# 算數運算子 (Arithmetic Operators)

* 用來把`數值`運算元進行基本算數計算
  1. 四則運算: `+`,`-`,`*`,`/`
  2. 取餘數: `%`
  3. 遞增/遞減: `++`,`--`
* 計算的結果是 **數值**

---

# 四則運算

* 撰寫一程式，接收使用者輸入的 a, b 兩整數，分別印出兩數之和、差、積、商數

```java
System.out.println("請輸入a: ");
int a = sc.nextInt();
System.out.println("請輸入b: ");
int b = sc.nextInt();
System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("a / b = " + (a / b));
```

---

# 取餘數運算子 % (Modulus,mod)

```
System.out.println("請輸入a: ");
int a = sc.nextInt();
System.out.println("請輸入b: ");
int b = sc.nextInt();
System.out.println("a % b = " + (a % b));
```

---

# 小數作為％運算子

* 有定義，但是可能會超出你的預期

---

# 情境 & 思考

* 寫出一個程式，接受一正整數`n`，表示班上有`n`位同學
* 同學各自的座號是`1 ~ n`
* 請幫同學盡可能的平均分成 5 組，並印出每位同學的組別, 例如 `1 號同學在第 1 組`

---

# 利用 % 寫出分組程式

```java
Scanner sc = new Scanner(System.in);
System.out.println("請輸入班級人數n: ");
int n = sc.nextInt();

for (int i = 1; i <= n; i++) {
    System.out.println(i + "號同學在第" + ((i % 5)+1) + "組");
}

```

---

# 遞增/遞減運算子

* `++`,`--` 是一元運算子
* 用來把`整數值` 加一/減一

```java
int a = 3;
int b = a++;
System.out.println("a 目前是:" + a);
System.out.println("b 目前是:" + b);
```

```java
int a = 3;
int b = ++a;
System.out.println("a 目前是:" + a);
System.out.println("b 目前是:" + b);
```

---

# 以下兩行分別會印出什麼?

```java
int n = 10;
System.out.println((n++) + (n++));
System.out.println(n);
```

---

# 算數運算子如何處理跨型別結合?

```java
System.out.println("請輸入a: ");
int a = sc.nextInt();
System.out.println("請輸入b: ");
float b = sc.nextFloat();

int c1 = a + b; // <-- 為什麼錯了
```

---

# 結合時的轉型規則

1. `整數` 結合 `小數` 得到 `小數`
2. `高精確度` 結合 `低精確度` 得到 `高精確度`

> 大原則是避免結合後有資訊流失 

---



