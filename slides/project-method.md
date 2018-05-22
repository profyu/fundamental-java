---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 專題: 租屋小幫手 - 方法改寫


---

# 方法改寫 1

* 把歡迎訊息的打印，封裝成 `App` 類別的靜態方法: `printGuide()`

```java
public static void printGuide() {
    System.out.println("歡迎使用租屋小幫手, 請選擇功能:");
    System.out.println("1. 陳列所有出租房屋");
    System.out.println("2. 房屋出租查詢");
    System.out.println("3. 租金試算");
    System.out.println("4. 離開");
}
```

---

# 方法改寫 2

* 把打印`請輸入物件名稱(A or B or C):`，封裝成 `App` 類別的靜態方法: `printHouseQuery()`

```java
public static void printHouseQuery() {
    System.out.println("請輸入物件名稱(A or B or C):");
}
```

---

# 方法改寫 3

* 把打印`很抱歉，物件不存在!`，封裝成 `App` 類別的靜態方法: `printHouseNotFound()`

```java
public static void printHouseNotFound() {
    System.out.println("很抱歉，物件不存在!");
}
```

---

# 方法改寫 4

* 把打印`資料無效`，封裝成 `App` 類別的靜態方法: `printInvalidData()`

```java
public static void printInvalidData() {
    System.out.println("資料無效");
}
```

---

# 方法改寫 5

* 給定一組房屋資料，回傳該房屋資訊字串

```java
public static String getHouseString(String id, float area, String type, int price, String owner, String address) {
    return id+"物件 - " + area + "坪 - " + type + " - 每月" + price + "元 - 屋主:" + owner + " - 地址:" + address;
}
```

---

# 呼叫靜態方法的簡化

* 呼叫自己類別的靜態方法，可不寫`類別名`