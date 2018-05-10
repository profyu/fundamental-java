---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識運算子的結合順序

---

# 結合順序為什麼很重要?

```java
int x = 1 + 2 * 3; // 9 or 7
int y = 31  %  1+2; // 1 or 2
```

---

# 表達式當中的結合順序

1. 有括號者
2. 一元運算子: `!`, `++`, `--`
3. 乘除: `*`, `/`, `%`
4. 加減: `+`, `-`
5. 比大小: `>`, `>=`, `<`, `<=`
6. 相等性: `==`, `!=`
7. 邏輯AND: `&&`
8. 邏輯OR: `||`
9. 條件運算子: `:?`
10. 賦值運算子: `+=`, `-=`, `*=`, `/=`, `%=`

---

# 相同結合順序

1. 一元, 三元:
  * `右到左結合`
2. 二元:
  * 賦值運算子: `右到左結合`
  * 其餘: `左到右結合`



---

# 相同結合順序(一元)

* 右到左結合

```java
boolean b = !!true; 
// boolean b = (!(!true)); 

```

---

# 相同結合順序 (賦值運算子)

* 右到左結合

```java
int a = 3;
int b = 4;
int c = a += b += 5;
// int c = (a += (b += 5));
```

---

# 相同結合順序 (其餘二元)

* 左到右結合

```java
int a = 3;
int b = 4;
int c = a + b + 5;
// int c = ((a + b) + 5);
```

---

# 如何提升結合順序?

* 透過括號進行群組

```java
float x = (90f + 80f + 70f) / 3f;
int y = 31 % (1 + 2);
```

---


# 字串`+`結合順序

```
int a = 3;
int b = 4;
System.out.println("a + b = " + a + b);
```

```
System.out.println("a + b = " + (a + b));
```
