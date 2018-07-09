---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# Java 集合: Set
# 認識 HashSet 類別

---

# Java 的集合 (Collection) 種類
## `List`, `Set`, `Map`, `Stack`, `Queue`

---

# 情境 & 思考

* 設計一個程式，用來記錄學生成績單。
* 當使用者輸入指令 `add John 90` , 代表要記錄 `John 考 90 分`
* 程式會不斷重複請使用者輸入`指令`
* 每一條指令做完後，都要印出成績單現況。

---

# 情境 & 思考

```
請輸入指令:
add John 90
[John -> 90]
請輸入指令:
add Mary 80
[John -> 90,Mary -> 80]
請輸入指令:
add Tim 70
[John -> 90,Mary -> 80,Tim -> 70]
```

---

# 情境 & 思考

* 查詢指令: `get John`
  * 表示要查詢 `John` 的成績並印出

---

# 情境 & 思考

```
...
[John -> 90,Mary -> 80,Tim -> 70]
請輸入指令:
get John
90
[John -> 90,Mary -> 80,Tim -> 70]
請輸入指令:
get Tim
70
[John -> 90,Mary -> 80,Tim -> 70]
```

---

# 以元素回推索引
## 顯然又是 ArrayList 的弱項

---

# Map 集合/資料結構

* 存放的每一個元素不是`1個值`而是`1組值`
  * 例如: `John -> 90`, `Mary -> 80`
  * 這組值又稱 `Key-Value Pair`, `Key-Value Entry`
* 不能以索引查元素，但能以 `Key` 查詢出 `Value`

---

# HashMap

* 適合用於:
  * 不在乎加入順序 (無序)
  * `Key` 不得重複
  * 對於`以 Key 找 Value` 要求高效率 
  * 對於辨識`Key的存在性`要求高效率
  * 對於`加入元素`要求高效率

---

# 情境 & 思考

* 刪除指令: `remove John`
  * 代表要刪除以 `John` 為 Key 的這組成績資料

---

# 情境 & 思考

```
...
[John -> 90,Tim -> 70,Mary -> 80]
請輸入指令:
remove John
[Tim -> 70,Mary -> 80]
```

---

# 情境 & 思考

* 檢驗存在性指令: `containsKey Tim`
  * 表示判斷 以`Tim`為Key的資料是否出現在集合中，印出 `true` 或 `false`

---

# 情境 & 思考

```
...
[John -> 90,Tim -> 70,Mary -> 80]
請輸入指令:
containsKey Tim
true
[John -> 90,Tim -> 70,Mary -> 80]
請輸入指令:
containsKey Trump
false
[John -> 90,Tim -> 70,Mary -> 80]
```
