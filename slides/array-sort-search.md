---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 陣列元素的排序與搜尋

---

# 排序 (Sort)

* 排序前

```
[99, 100, 89, 87, 93, 72]
```

* 遞增排序後

```
[72, 87, 89, 93, 99, 100]
```

---

# 使用內建陣列排序演算法

```java
int[] arr = new int[] { 99, 100, 89, 87, 93, 72 };
Arrays.sort(arr);
for (int i = 0; i < arr.length; i++) {
    System.out.println("第"+i+"個元素是: "+ arr[i]);
}
```

---

# 搜尋 (Search)

* 給定一個 int 陣列

```
[99, 100, 89, 87, 93, 72]
```

* 寫程式找出 `93` 所在的索引值:

```
4
```

---

# 練習

* 給定一陣列: `[99, 100, 89, 87, 93, 72]`
* 讓使用者自己決定要搜尋哪個元素
* 搜尋並印出該陣列索引值

---

# 練習

```java
int[] arr = new int[] { 99, 100, 89, 87, 93, 72 };
System.out.println("請輸入要搜尋的數字: ");
int target = sc.nextInt();

int result = -1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        result = i;
        break;
    }
}
if (result == -1) {
    System.out.println("無此元素");
} else {
    System.err.println("搜尋結果:" + result);
}
```

---

# 使用內建陣列搜尋演算法

* `Arrays.binarySearch(...)` 使用二元搜尋演算法
* 使用前提: 陣列須已經`遞增排序後`的陣列

---

# 使用內建陣列搜尋演算法


```java
int[] arr = new int[] { 72, 87, 89, 93, 99, 100 };
System.out.println("請輸入要搜尋的數字: ");
int target = sc.nextInt();

int result = Arrays.binarySearch(arr, target);
if (result == -1) {
    System.out.println("無此元素");
} else {
    System.out.println("搜尋結果:" + result);
}
```