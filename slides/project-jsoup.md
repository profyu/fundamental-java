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

---

# 使 JVM 信任所有 SSL 憑證發行單位

1. 引用 `common net` 套件
2. 加入以下 import
```java
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.util.TrustManagerUtils;
```
3. 加入以下程式碼到 `main 方法`
```
SSLContext sc = SSLContext.getInstance("SSL");
sc.init(null, new TrustManager[] { TrustManagerUtils.getAcceptAllTrustManager() }, new SecureRandom());
HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
```

---

# 價格解析

1. 原始字串: `"13,000 元/月"`
2. 經過 split: `["13,000" , "元/月"]`
3. 只看第0個: `"13,000"`
4. 把逗號取代成空字(刪除逗號): `"13000"`
5. parseInt: `13000`

---

# 坪數解析

1. 原始字串: `"坪數 : 6坪"`
2. 抓取子字串: `"6"`
3. parseFloat: `6.0`

---

# 房屋型態解析

1. 原始字串: `"現況 : 獨立套房"`
2. 抓取子字串: `"獨立套房"`