---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 控制結構
## 選擇結構: 透過 switch 來控制程式執行

---

# 情境 & 思考

* 設計一個程式，詢問使用者要喝什麼飲料
  1. 若輸入 0 : 印出`你點了咖啡`
  2. 若輸入 1 : 印出`你點了可樂`
  3. 若輸入 2 : 印出`你點了果汁`
  4. 若輸入其他數字: 印出`沒有賣喔`

---

# 情境 & 思考

* 對於『同一變數比對』的判斷，用 `if` 要重複好多雷同的地方

```java
Scanner sc = new Scanner(System.in);
System.out.println("請問要喝什麼？ (0.咖啡, 1.可樂, 2.果汁):");
int drink = sc.nextInt();

if (drink == 0) {
    System.out.println("你點了咖啡");
} else if (drink == 1) {
    System.out.println("你點了可樂");
} else if (drink == 3) {
    System.out.println("你點了果汁");
} else {
    System.out.print("沒有賣喔");
}
```

---

# switch 選擇結構

* 對於都是『同一變數比對』的選擇結構，就請 `switch` 來幫忙

```java
switch (drink) {
case 0:
    System.out.println("你點了咖啡");
    break;
case 1:
    System.out.println("你點了可樂");
    break;
case 2:
    System.out.println("你點了果汁");
    break;
default:
    System.out.print("沒有賣喔");
    break;
}
```

---

# 任何變數都能用switch比對嗎?

* 不!! 只限以下:
  1. 整數型態(int, long, short, byte, char)
  2. 字串 (String)
  3. 列舉

---

# case 之後不寫 break 會怎樣?

* 會自動繼續往下執行到下一個 `break`
* 按此規則，`default` 寫不寫 `break` 都無妨

---

# 善加利用case 後沒有 break 的特性

```java
String drink = sc.next();	
switch (drink) {
case "咖啡":
    System.out.println("苦");
    break;
case "可樂":
case "果汁":
    System.out.println("甜");
    break;
default:
    System.out.println("沒有賣喔");
}
```