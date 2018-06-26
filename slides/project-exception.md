---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 專題: 租屋小幫手
## 程式例外處理

---

# 處理檔案不存在的例外

* 如果檔案不存在於預設的路徑上
* 則讓使用者有一次的機會，透過終端機輸入輸入正確路徑

---

```java
Scanner sc = new Scanner(System.in);
String defaultPath = "/Users/johnlin/Desktop/houses.csv";
House[] houses = null;
try {
    houses = readHouses(defaultPath);
} catch (FileNotFoundException e) {
    System.out.println("資料檔案不存在於: " + defaultPath);
    System.out.println("請自行輸入路徑:");
    String inputPath = sc.next();
    try {
        houses = readHouses(inputPath);
    } catch (FileNotFoundException e2) {
        System.out.println("資料檔案不存在於: " + inputPath);
        return;
    }

}
```