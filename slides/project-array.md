---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 專題: 租屋小幫手 - 陣列改寫


---

# 資料變數以一維陣列取代

```java
float[] areas =  ... ;
String[] types = ... ;
int[] prices = ... ;
String[] owners = ... ;
String[] addresses = ... ;
```

> 現在開始，只有索引，沒有A/B/C

---

# 修該方法參數

* 原本是: 

```java
public static String getHouseString(String id, float area, String type, int price, String owner, String address)`
```

* 把 `String id` 改為 `int id`


---

# 修改: 陳列所有出租房屋

* 原本是: 

```java
System.out.println(infoA);
System.out.println(infoB);
System.out.println(infoC);
```

* 改為用迴圈走訪陣列並印出

```java
for (int i = 0; i < areas.length; i++) {
    System.out.println(getHouseString(i, areas[i], types[i], prices[i], owners[i], addresses[i]));
}
```

---


# 修改: 房屋出租查詢

* 改為用索引查詢

```java
public static void printHouseQuery() {
    System.out.println("請輸入物件索引:");
}
```

```java
int index = sc.nextInt();
if(index >=0 && index < areas.length){
    System.out.println(getHouseString(index, areas[index], types[index], prices[index], owners[index], addresses[index]));
}
else{
    printHouseNotFound();
}		
```

---

# 改善控制流程

* 複雜而難讀

```java
if ( 規則不合法 ) {
    // 印出不合法之相關訊息
}
else {
    // 合法了，安心做主要的事情...
}
```

* 簡單而易讀

```java
if ( 規則不合法 ) {
    // 1. 印出不合法之相關訊息
    // 2. 透過 break, continue, return 等關鍵字及早跳開
}
// 合法了，安心做主要的事情...

```

---

# 改善控制流程

* 複雜而難讀

```java
if (規則A不合法){
    // 印出不合法之相關訊息A
}
else {
    if (規則B不合法){
        // 印出不合法之相關訊息B
    }
    else {
        // A.B都合法了，安心做主要的事情...
    }
}
```

---

# 改善控制流程

* 簡單而易讀

```java
if (規則A不合法){
    // 1. 印出不合法之相關訊息A
    // 2. 透過 break, continue, return 等關鍵字及早跳開
}

if (規則B不合法){
    // 1. 印出不合法之相關訊息B
    // 2. 透過 break, continue, return 等關鍵字及早跳開
}

// A.B都合法了，安心做主要的事情...

```