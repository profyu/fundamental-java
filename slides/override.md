---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 覆寫父類別的方法

---

# 情境 & 思考

* 讓 `Warrior` 在攻擊的時候，有一定的機會可以對敵人造成兩倍傷害
* 造成兩倍傷害的機率，就是`comboRate`

---

# 覆寫 / 覆載 (Override)

* 即子類別 **改寫** 了原先繼承自父類別的`實例方法`的`陳述`
* 手段: 
  * 在子類別內重新宣告一個和父類別`名稱一樣`、`回傳型別一樣`、`參數型別一樣`的實例方法


---

# 覆寫 attack 方法

```java
@Override
public void attack(Player other) {

    if (!canAttack()) {
        System.out.println(name + "法力耗盡，無法攻擊");
        return;
    }

    magicPoint -= Player.MAGIC_CONSUMPTION;
    int harm = attackPoint - other.defensePoint;
    other.healthPoint -= harm;
    System.out.println(name + "造成" + other.name + "傷害: " + harm);

    if(Math.random() <= comboRate){
        other.healthPoint -= harm;
        System.out.println("COMBO! "+name + "造成" + other.name + "傷害: " + harm);
    }
    
}
```

---

# 呼叫父類別版本的實例方法

* 雖說`父類別`的方法被`子類別`覆寫掉了
* 但在定義 `子類別`的時候，還是有機會來呼叫父類別版本的方法

---

# 呼叫父類別版本的實例方法

```java
@Override
public void attack(Player other) {
    super.attack(other);    
    if(Math.random() <= comboRate){
        int harm = attackPoint - other.defensePoint;
        other.healthPoint -= harm;
        System.out.println("COMBO! "+name + "造成" + other.name + "傷害: " + harm);
    }
}
```