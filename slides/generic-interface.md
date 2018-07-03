---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 宣告並實作泛型介面

---

# 泛型介面
## 介面的模板 = 公約的模板

---

# 介面的模板

```java
public interface MyIntferce<T> {
    public void myMethod(T a);
}
```

---

## 泛型介面
# 被某類別實作時
## 才實際決定型別參數內容

---

```java
public MyClass implements MyInterface<String> {
    @Override
    public void myMethod(String a) {
        // 實作 myMethod 方法於此...
    }
}
```

---

#  Comparator 泛型介面

* 如果 `o1` 比 `o2` 小，回傳 -1
* 如果 `o1` 比 `o2` 大，回傳 +1
* 如果 `o1` `o2` 一樣大，回傳 0

```java
public interface Comparator<T> {
    public int compare(T o1, T o2);
}
```

---

# 情境 & 思考

* 設計一個程式，可以讓使用者輸入4個字串
* 把4個字串放入一個陣列當中
* 請以`字串長度`為排序依據，從小大到印出這4字串

---

# 情境 & 思考

* 輸入: `I`, `have`, `an`, `apple`
* 印出: 
```
I
an
have
apple
```