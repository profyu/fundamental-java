---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 專題: 租屋小幫手
## 透過 jsoup 套件爬回網路上租屋資料

---

# 我們看到的網頁怎麼來的?

![server-side-rendered](assets/server-side-rendered.png)

---

# 爬蟲程式 Crawler

<div style="height: 40rem;">
![crawler](assets/crawler.png)
</div>


---

# 瀏覽器 Inspect 工具

---

# 爬蟲程式 Crawler

* 一支 `看得懂` HTML文檔的程式
* 把我們需要的部分，抓取出來

---

# Jsoup HTML Parser

* 把一張 HTML文檔轉成 `結構化物件`
* 透過`查詢語言`查出我們需要的部分

---

## 透過 Maven
# 引用 Jsoup 套件

---

# 清理 App 類別原先流程

---

![house-crawler-phase](assets/house-crawler-phase.png)