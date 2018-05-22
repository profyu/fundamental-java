---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 用迴圈結構走訪陣列成員

---

# 走訪 / 尋訪 / 拜訪 (Traversal)

* 透過某種機制，逐一的對集合內的元素進行操作
* 例如: 逐一讀取陣列中每一個元素值
* 例如: 逐一寫入(更新)陣列中每一個元素值

---

# 透過 for 迴圈走訪陣列

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };

for (int i = 0; i < arr.length; i++) {
    System.out.println("位置 " + i + "的元素為: " + arr[i]);
}
```

---

# 透過 for 迴圈走訪陣列

```java
int[] heights = new int[6];
for (int i = 0; i < 6; i++) {
    System.out.println("請輸入第" + (i + 1) + "位的身高: ");
    heights[i] = sc.nextInt();
}
```

---

# 透過 for 迴圈『倒著』走訪陣列

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };

for (int i = arr.length -1; i >= 0; i--) {
    System.out.println("位置 " + i + "的元素為: " + arr[i]);
}
```

---

# 透過 for-each 迴圈走訪陣列

* 適用於: 
  1. 想逐一讀取陣列中的元素
  2. 不在乎每回合的索引值是多少

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };

for (int element : arr) {
    // 注意此時無索引值變數 i 可利用
    System.out.println(element);
}
```

---


> 其實 for-each 不只可用於陣列走訪

 
<!--Iteratable 介面-->
