---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 比較運算子

---

# 比較運算子

* 又稱**關係運算子** (Relational Operators)
* 把`數值`運算元進行關係上的比較
* 計算的結果是 **布林值** (true/false)

---

# 比較運算子

```java
int height = sc.nextInt();
if (height < 0) {
    System.out.println("身高不可為負數");
}
```

---

# 比較運算子有哪些?

* 既然要做比較，比較運算子一定是 `二元運算子`
  1. `==` 比較左右兩運算元是否**相等**
  2. `!=`: 比較左右兩運算元是否**不相等**
  3. `<`: 比較`左`運算元是否**小於**`右`運算元
  4. `>`: 比較`左`運算元是否**大於**`右`運算元
  5. `<=`: 比較`左`運算元是否**小於或等於**`右`運算元
  6. `>=`: 比較`左`運算元是否**大於或等於**`右`運算元

---

# 比較運算子範例

```java
System.out.println("請輸入a: ");
int a = sc.nextInt();
System.out.println("請輸入b: ");
float b = sc.nextFloat();

System.out.println("a == b 是 " + (a == b));
System.out.println("a != b 是 " + (a != b));
System.out.println("a < b 是 " + (a < b));
System.out.println("a > b 是 " + (a > b));
System.out.println("a <= b 是 " + (a <= b));
System.out.println("a >= b 是 " + (a >= b));
```


---

# 如何比較兩字串是否相等

* 要避免犯下以下錯誤

```java
Scanner sc = new Scanner(System.in);
System.out.println("請輸入字串1:");
String str1 = sc.next();
System.out.println("請輸入字串2:");
String str2 = sc.next();

if (str1 == str2) { // <-- 試圖比較兩字串
    System.out.println("一樣");
} else {
    System.out.println("不一樣");
}
```