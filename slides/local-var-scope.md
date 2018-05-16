---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識區域變數與變數視野

---

# Java 的變數種類

1. 區域變數 (Local Variable)
2. 靜態變數 (Static Variable)
3. 實例變數 (Instance Variable)

> 後兩者的關係，類似於`靜態方法`與`實例方法`之間的關係

---

# 區域變數 (Local Variable)

* 在方法當中才宣告出來的變數 (包含參數)，區域變數隸屬於`方法`

---

# 靜態變數  (Static Variable)

* 表示此變數隸屬於一個`類別`(Class)
* 讀取時，只需隨時 `類別名.變數名` 即可讀取
* 賦值時，只需隨時 `類別名.變數名 = 要更新的值;` 即可

---

# 實例變數 (Instance Variable)
 
* 表示此變數隸屬於一個`類別`所實作(new)出來的 `實例`(物件)
* 讀取時，要先確定某一物件對象: `物件變數.變數名` 或 `物件常數.變數名`
* 賦值時，要先確定某一物件對象: `物件變數.變數名 = 要更新的值;` 或 `物件常數.變數名 = 要更新的值;`

---

# 區域變數初次使用前一定至少要被初始化過

```java
public static void myMethod() {
    int b;
    System.out.println(b); // 錯誤
}
```

---

# 區域變數視野範圍 (Scope)

* 區域變數視野範圍始於區域變數被宣告的那行，終於所在區段(Block)的結尾
* 參數的視野範圍涵蓋整個方法區段
* 當程式執行陳述離開了某一變數的視野範圍，則該變數會被銷毀

---

# 練習: 以下各區域變數的視野範圍?

```java
public static void myMethod(int a) {

    System.out.println("a 目前是" + a);

}
```

---

# 練習: 以下各區域變數的視野範圍?

```java
public static void myMethod(int b) {
    if (b > 0) {
        int a = 3;
        System.out.println("a 目前是" + a);

    } else {
        int a = 4;
        System.out.println("a 目前是" + a);

    }

}
```

---

# 練習: 以下各區域變數的視野範圍

```java
public static void myMethod(int b) {
    while (b > 0) {
        b--;
        int a = 3;
        System.out.println("a 目前是" + a);
        System.out.println("b 目前是" + b);

    }

}
```

---

# 練習: 以下各區域變數的視野範圍

```java
public static void myMethod() {
    for (int i = 0; i < 10; i++) {
        int a = 3;
        System.out.println("a 目前是" + a);
    }
}
```