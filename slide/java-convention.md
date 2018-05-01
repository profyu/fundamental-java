---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## Java 撰寫慣例與風格

---

# 為什麼遵守慣例很重要？

* 我們花絕大多數時間在 **維護** 程式
* 很少有程式`初起撰寫`與`後續維護`只透過 **一個人**

---

# 為什麼我們這麼早談『慣例』這件事？

---

# 命名法

1. 駝峰式 Camal-Case
```
createdTime
main
```

2. 帕斯卡式 Pascal-Case
```
CreatedTime
Main
```

---

# 命名採用Pascal-Case

* 原始碼檔名
* Class

---

# 命名採用 Camal-Case

* 變數
* 函數、方法

---

# 常數

* 字母大寫
* 字段用`_`分隔

---

# Maven 專案名稱

* 字母小寫
* 字段用`-`分隔

```
hello-world
my-java-project
```

---

# Package

* 開頭是網域的顛倒
```
com.sun.eng
```

* 小節內如果全部小寫字母、數字
```
com.apple.quicktime.v2
```

---

# 註解

```java
/*
 * Classname
 * 
 * Version information
 *
 * Date
 * 
 * Copyright notice
 */
```

```java
// 我是註解
```

---

# 區段(Block)與縮排

```java
public class Playground {
	public static void main(String[] args) {

		String str1 = "ABCDEFG";
		System.out.println("Length: "+str1.length());
	}
}
```

---

# 等號、運算符號兩邊各一空白

```java
String str1 = "ABCDEFG";
System.out.println("Length: " + str1.length());
```

---

# 善用 IDE 的 Formatter



