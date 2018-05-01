---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 控制結構
## 選擇結構: 透過 if 來控制程式執行

---

# 控制結構

讓執行的『陳述』轉彎

```java
// 第一步
Scanner sc = new Scanner(System.in);
// 第二步
System.out.println("請輸入身高:");
// 第三步
int height = sc.nextInt();
```

* 第四步(如果身高 >= 0的話)

```java
System.out.println("你的身高是" + height + "公分");
```

* 第四步(如果身高 < 0的話)

```java
System.out.println("身高不可為負數");
```

---

# 控制結構

1. 選擇結構 (`if`, `switch`)
2. 迴圈結構 (`for`, `while`, `do while` )

---

# if 選擇結構

```java
if (height > 0) {
    System.out.println("你的身高是" + height + "公分");
}
```

---

# if...else... 選擇結構

* 加入 else

```java
if (height > 0) {
    System.out.println("你的身高是" + height + "公分");
} else {
    System.out.println("身高不可為負數");
}
```

---

# 分支可以有很多個

1. 如果身高是負數就印出 `"身高不可為負數"`
2. 如果身高少於 54 就印出 `"身高矮度 xxx公分 破金氏世界紀錄了"`
3. 如果身高高於 246 就印出 `"身高高度 xxx公分 破金氏世界紀錄了"`
4. 其餘的情況，印出 `"你的身高是是 xxx 公分"`

---

# 巢狀 if 選擇結構

* 透過剛剛學到的 `if...else...`結構來幫忙

```java
if (height < 0) {
    System.out.println("身高不可為負數");
} else {
    if (height < 54) {
        System.out.print("身高矮度 " + height + "公分 破金氏世界紀錄了");
    } else {
        if (height > 246) {
            System.out.println("身高高度 " + height + "公分 破金氏世界紀錄了");
        } else {
            System.out.println("你的身高是" + height + "公分");
        }
    }
}
```


---

# if...else if...else... 選擇結構

* 透過 `if ...else if...else ...` 來解決過度複雜的巢狀
* 請注意一組 `if...else if...else...` 只會執行第一個條件成立區段

```java
if (height < 0) {
    System.out.println("身高不可為負數");
} else if (height < 54) {
    System.out.print("身高矮度 " + height + "公分 破金氏世界紀錄了");
} else if (height > 246) {
    System.out.println("身高高度 " + height + "公分 破金氏世界紀錄了");
} else {
    System.out.println("你的身高是" + height + "公分");
}
```

---

# 有時候 if 的區段大括號可以省略

1. 當區段內只有1個陳述時
2. 當區段內只有1個控制結構時


