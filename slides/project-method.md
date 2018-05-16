---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 專題: 租屋小幫手 - 方法改寫

---



---

# 歡迎訊息

1. 把歡迎訊息的打印，封裝成 `App` 類別的靜態方法: `printGuide`

```java
public static void printGuide() {
    // ...
}
```

---

# 宣告 getHouseString 方法

* 給定一組房屋資訊，回傳他的資訊字串
* `A物件 - 10.0坪 - 套房 - 每月12000元 - 屋主:王先生 - 地址:台北市文山區木柵路一段xx號`

```java
public static String getHouseString() (String id, float area, String type, int price, String owner, String address) {
    //...
}
```

# 宣告 getTotalPrice 方法

* 給定 `月租金`,`合約租期`,`押金期數`,`租金試算`
* 回傳 `租金總額`