---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 控制結構
## 迴圈結構: 透過 while 來控制程式執行

---

# 情境 & 思考

* 要怎麼連續印出3次Hello World?

```
System.out.println("Hello World");
System.out.println("Hello World");
System.out.println("Hello World");
```

> 程式碼一直重複!

---

# 情境 & 思考

1. 用Scanner 讀取使用者輸入的正整數 `n`
2. 接著印出`n`次 Hello World.

> 寫程式的當下根本不知道n是多少

---

# 迴圈的功用

1. 在不重複撰寫陳述的情況下，讓陳述得已被重複執行數次
2. 且重複的的次數可以是**動態**的 (數值在程式執行時才被決定)

---

# while 迴圈

<div style="height: 40rem;">
![while-struct](assets/while-struct.png)
</div>

---

# while 迴圈

```
int n = sc.nextInt();
int i = 0;
while(i < n)
{
    System.out.println("第"+i+"個Hello World");
    i++;
}
```

---

# while 的兩個極端可能

1. 當條件表達式不可能成立時：不執行
2. 當條件表達式恆成立時：永遠不斷重複(無限迴圈)

<!--無限迴圈舉例, 省略大括號-->




