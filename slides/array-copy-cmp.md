---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 關於陣列複製與相等性比較

---

# 陣列複製

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };
int[] copied = new int[arr.length];
for (int i = 0; i < copied.length; i++) {
    copied[i] = arr[i];
}
```

---

# 陣列複製

* 使用 `Arrays.copyOf(int[] original, int newLength)`

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };
int[] copied = Arrays.copyOf(arr, arr.length);
```

---

# `copyOf` 還能複製並調整長度

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };
int[] copied = Arrays.copyOf(arr, arr.length+2);
// copied: [11, 22, 33, 44, 55, 66, 0, 0]
```

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };
int[] copied = Arrays.copyOf(arr, arr.length-2);
// copied: [11, 22, 33, 44]
```

---

# 陣列複製

* 使用 `Arrays.copyOfRange(int[] original, int from, int to)`
  * 複製原陣列的其中一個`區間`(Subarray)出來成為一個新陣列
  * `from`: 區間的開始索引
  * `to`: 區間的結束索引(不含); 可超過原陣列索引範圍

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };
int[] copied = Arrays.copyOfRange(arr, 0, arr.length);
```

---

# 取回 Subarray

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };
int[] copied = Arrays.copyOfRange(arr, 2, 4);
// copy: [33, 44]
```

```java
int[] arr = new int[] { 11, 22, 33, 44, 55, 66 };
int[] copied = Arrays.copyOfRange(arr, 0, arr.length+2);
// copied: [11, 22, 33, 44, 55, 66, 0, 0]
```

---

# 比較兩陣列是否相等

```java
int[] arr1 = new int[] { 11, 22, 33, 44, 55, 66 };
int[] arr2 = new int[] { 11, 22, 33, 44, 55, 66 };
System.out.println(arr1 == arr2);  // 輸出: false
```

---

# 比較兩陣列是否相等

```java
int[] arr1 = new int[] { 11, 22, 33, 44, 55, 66 };
int[] arr2 = new int[] { 11, 22, 33, 44, 55, 66 };
System.out.println(Arrays.equals(arr1, arr2));
```