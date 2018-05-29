---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識 Getter & Setter 方法的使用

---

# 什麼是 `Getter` 和 `Setter` 方法?

---

# 差別在哪裡?

```java
public class Player {
	public String name;
    // ...
}

public class Playground {
    public static void main(String[] args) {
        // ...
        if (playerA.isAlive()) {
			System.out.println(playerA.name + "獲勝!");
		} else {
			System.out.println(playerB.name + "獲勝!");
		}
    }
}
```

---

# 好處 1

* 用 getter, setter 可以做出`唯讀`變數的效果

---

# 好處 2

* 可以在 setter 內做資料檢核，阻擋不合格的資料被寫入

---

# 可是大部分的時候...

* 我們 getter 和 setter 都是公開
* 而且 setter 也沒有做任何資料檢核

---

# 用 IDE 快速生成 getter setter

---

# 布林值的 getter setter 命名

```java
public class Door {
    private boolean isOpened;

    public boolean isOpened() {
        return isOpened;
    }
    public void setOpened(boolean isOpened){
        this.isOpened = isOpened;
    }
}
```

