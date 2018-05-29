---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識private, public修飾子：控管類別成員的取用權限

---

# 修飾子 Modifier

* 用來修飾`成員`、`類別`、`區域變數`等定義的語法關鍵字
* 分為兩大類:
  1. 存取控制修飾子: `public`,`private`,`protected`
  2. 非存取控制修飾子: `static`, `final`, `abstract`, `synchronized`, `volitile`


---

# 修飾子 Modifier

```java
public class Player {

public static final int MAGIC_CONSUMPTION = 10;

public String name;
public int healthPoint;
public int magicPoint;
public int attackPoint;
public int defensePoint;

public Player(String name, int healthPoint, int magicPoint, int attackPoint, int defensePoint) {
    this.name = name;
    this.healthPoint = healthPoint;
    this.magicPoint = magicPoint;
    this.attackPoint = attackPoint;
    this.defensePoint = defensePoint;
}

public String getStatus() {
    return name + " 狀態 HP=" + healthPoint + " MP=" + magicPoint;
}
```

---

# 哪邊可以使用存取控制修飾子?

* 宣告`類別`
* 宣告`成員`
  * 實例變數 / 靜態變數
  * 實例方法 / 靜態方法

---

# public 修飾子

* 表示被修飾的東西，可以在`任何其他類別` 做存取

---

# private 修飾子

* 表示被修飾的東西，不能在`任何其他類別` 做存取
* 亦即，只能在宣告的類別內做使用

> 宣告類別時不能使用此修飾子

---

# 如果省略存取控制修飾子

* 表示被修飾的東西，可以在`同 package 的其他類別` 做存取