---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 專題: 租屋小幫手
## 使用 Maven 將程式打包成單一可執行之JAR檔

---

# 要怎麼擺脫 IDE 
## 用終端機來執行我寫的 Java 程式?

---

# 回顧: 土法煉鋼版 Hello World

```
# 編譯原始碼
$ javac HelloWorld.java

# 執行編譯好的 Java Bytecode
$ java HelloWorld
```

---

# 但租屋小幫手
## 想這樣直接指定 Bytecode 來執行
# 很繁瑣！

---

# 因為

1. 多了很多 Java 原始碼檔案了
2. 多了很多第三方 Library 要引用


---

# 執行指令就會變成...

```
java -classpath /Users/johnlin/Documents/Profyu/eclipse-workspace/rental-helper-final/target/classes:/Users/johnlin/.m2/repository/org/jsoup/jsoup/1.11.3/jsoup-1.11.3.jar:/Users/johnlin/.m2/repository/commons-net/commons-net/3.6/commons-net-3.6.jar:/Users/johnlin/.m2/repository/org/mongodb/morphia/morphia/1.3.2/morphia-1.3.2.jar:/Users/johnlin/.m2/repository/org/mongodb/mongo-java-driver/3.4.0/mongo-java-driver-3.4.0.jar:/Users/johnlin/.m2/repository/cglib/cglib-nodep/2.2.2/cglib-nodep-2.2.2.jar:/Users/johnlin/.m2/repository/com/thoughtworks/proxytoys/proxytoys/1.0/proxytoys-1.0.jar com.example.retalhelper.App
```

---

# 利用 Maven 編譯並打包成單一可執行JAR檔

> 又稱為 Fat Jar / Uber Jar

---

# 終端機執行指令就能簡化成

```
$ java -jar xxxxxxx.jar
```

---

# 打包前，先在IDE...

1. 確認全部都存檔了
2. Organize Import
3. 確認整個專案沒有編譯錯誤


