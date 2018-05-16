---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識方法的『多載』

---

# 情境 & 思考

* 請設計一個方法，用途是分別為`int`取絕對值:

```java
public static int abs(int value) {
    System.out.println("int 版本 abs 被呼叫");
    return (value >= 0) ? value : -value;
}
```

---

# 情境 & 思考

* 請設計另外三個方法，用途是分別為`long`, `float`, `double` 取絕對值:

```java
public static long abs(long value) {
    System.out.println("long 版本 abs 被呼叫");
    return (value >= 0) ? value : -value;
}

public static float abs(float value) {
    System.out.println("float 版本 abs 被呼叫");
    return (value >= 0) ? value : -value;
}

public static double abs(double value) {
    System.out.println("double 版本 abs 被呼叫");
    return (value >= 0) ? value : -value;
}
```

---


---

# 情境 & 思考

* 在同一個類別中，難道用途那麼相似的方法們，就不能叫同一個名字就好嗎?

---

# 多載 (Overloading)

* 當一個類別中，有多個`同名`卻接受不同`參數`方法時，則稱為`多載`

```java
myMethod(int value)
myMethod(long value)
myMethod(int value,int value)
myMethod(int value) // 錯誤! 不可再宣告
```

```java
myMethod(int)
myMethod(long)
myMethod(int,int)
myMethod(int) // 錯誤! 不可再宣告
```

> 注意，參數名稱不參與比較

---

