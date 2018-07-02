---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 專題: 租屋小幫手
## 實作Comparator泛型介面以排序租屋資料

---

# 回顧: CSV 內容

```csv
坪數,房型,月租金,屋主,地址
10,套房,12000,王先生,台北市文山區木柵路一段xx號
8,套房,8000,陳先生,新北市中和區中和路yy號
4,雅房,6000,林先生,新北市新店區中正路aa巷zz號
```

---

# 單位面積月租金
## = 月租金 / 坪數

---

# 目標

* 當使用者選擇 `陳列所有出租房屋` 時
* 要以單位面積月租金來排序 (低到高)