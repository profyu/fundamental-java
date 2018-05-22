---
title:
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 直播專題
## 打造小型程式工具 - 簡易漫畫下載器

---

# 用程式解決生活雜事

* 手動做重複的事情超過三次? 用程式解決吧!



---

# 看看良好典範吧

[連結](https://github.com/NARKOZ/hacker-scripts/tree/master/java)


---

# 但我覺得他的方法有點問題

* 萬一我有很多`老闆` or `女友` 怎麼辦？

---

# 我需要跟程式互動

* 透過互動讓使用者輸入值，進而改變程式行為:

  1. 圖形化使用者介面 (GUI)
  2. 標準輸入/輸出介面 (Interactive Shell)
  3. 指令行介面 (CLI) 

---

# Command-Line Interface (CLI)

* 執行前，就先組織好`一行字` (指令)
* 執行時，一次送入程式

> EX. echo, ping , java, javac

<div style="height: 20rem;">
![fake-cli](http://4everstatic.com/images/dessins/digital-art/green-code,-matrix-156759.jpg)
</div>


---

# 利用 main 函數的 args

```java
public static void main(String[] args) {
    // 透過 args 接收指令行傳來的參數值
    
}
```

---

# 直接利用 args 的問題

* 正確指令: 
```
java -jar target/playground-0.0.1-SNAPSHOT.jar XXX 0987654321
```
* 錯誤指令: 
```
java -jar target/playground-0.0.1-SNAPSHOT.jar 0987654321
```

---

# 專業水準 CLI 

1. 有提供使用方法說明
2. 方便記憶使用方法
3. 方便後續延伸參數

> EX. ping

---

# 簡易漫畫下載器

* 用 Java 設計一個程式，自動下載某一卷漫畫的`全部圖片`回到電腦

---

# 要滿足的條件
  
1. 透過 CLI 讓使用者決定下載`哪一部漫畫`,`哪一卷`, `放到哪個資料夾`
2. 要有專業CLI的樣子
  * 用 flag 來讓使用者送參數
  * 可以印出漂亮的使用說明
  * 使用者送錯command 參數時，要進行引導



---

# appassembler-maven-plugin

```xml
<plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>appassembler-maven-plugin</artifactId>
    <version>1.10</version>
    <configuration>
        <programs>
            <program>
                <mainClass>com.example.comicloader.App</mainClass>
                <id>cldr</id>
            </program>
        </programs>
    </configuration>
</plugin>

```

```
$ mvn package appassembler:assemble
```
