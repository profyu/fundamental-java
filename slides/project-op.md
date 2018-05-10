---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 專題: 租屋小幫手
## 租金試算

---

# 程式修改

* 歡迎訊息改成:

```
歡迎使用租屋小幫手，請選擇功能：
1. 陳列所有出租房屋
2. 房屋出租查詢
3. 租金試算
4. 離開
```

---

# 租金試算: 接收使用者輸入的`物件名稱`

* 印出:

```
請輸入物件名稱(A or B or C)
```

> 若輸入之物件不存在，則比照之前情況辦理

---

# 租金試算: 接收使用者輸入的`合約租期`

* 印出:

```
請輸入合約租期(月)
```

> 若合約租期為負數，則印出"資料無效"後回到歡迎訊息

---

# 租金試算: 接收使用者輸入的`押金期數`

* 印出:

```
請輸入押金期數(月)
```

> 若押金期數為負數，則印出"資料無效"後回到歡迎訊息

---

# 租金試算: 接收使用者輸入的`實際租期`

* 印出:

```
請輸入實際租期(月)
```

---

# 租金試算

* 接收使用者輸入的`實際租期`後，
  * 若 `實際租期 > 合約租期`，則印出`資料無效`
  * 若 `實際租期 < 0`，則印出`資料無效`
  * 若 `實際租期 <= 合約租期`，則印出使用者實際需付出的`租金總額`與`月平均租金`
    ```
    租金總額: xxxx 元
    月平均租金: yyyy 元
    ```

* 請注意，若實際租期小於合約租期，是要賠償房東押金的，賠償費用要算到租金總額當中

---

# 程式碼重構(Refactor)