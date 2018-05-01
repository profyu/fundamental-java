---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識程式原始碼執行的最小步驟：『陳述』

---

# 陳述 Statement

1. 宣告陳述
2. 賦值陳述
3. 方法呼叫陳述
4. 物件實作陳述
5. 遞增遞減陳述

---

# 宣告陳述

```
double myDouble = 246.234;
```

---

# 賦值陳述

```
myDouble = 123.34;
```

---

# 方法呼叫陳述

```
System.out.println("myDouble = "+ myDouble);
```

---

# 物件實作陳述

```
Scanner sc = new Scanner(System.in);
```

---

# 遞增、遞減陳述

```
int a = 0;
a++;
a--;
```

---

# 陳述結尾

```
double myDouble = 246.234;
myDouble = 123.34;
System.out.println("myDouble = "+ myDouble);
Scanner sc = new Scanner(System.in);
```

---

# 以下各有幾個陳述?

* 一個
```java
int height = 0;
```

* 一個
```java
sc.nextInt();
```

* 一個?
```
int height = sc.nextInt();
```

---

# 可以用自然語言理解原因

1. 往台北的自強號八點發車。
2. 我得到資訊是往台北的自強號八點發車。

---

# 結論：陳述是『原始碼』的執行最小步驟

* 原始碼是給 **人** 看的
* 『最小步驟』一說是站在人理解程式運行過程的角度而言

```java
// 第一步
Scanner sc = new Scanner(System.in);
// 第二步
System.out.println("請輸入身高:");
// 第三步
int height = sc.nextInt();
// 第四步
System.out.println("你的身高是" + height + "公分");
```

