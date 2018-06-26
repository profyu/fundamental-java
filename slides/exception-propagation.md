---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

## 認識 Call Stack 與 Java 的例外傳遞機制

---

# Stack (堆疊) 資料結構

* 放資料進入堆疊： PUSH
* 從堆疊拿一筆資料： POP

![stack-push](assets/stack-push.png)

---

# Stack (堆疊) 資料結構

![stack-push](assets/stack-pop.png)

> 先進後出

---

# 程式範例

<div style="height: 30rem;">
![snippet](assets/snippet.png)
</div>

---

# Call Stack

* 用堆疊結構來紀錄`方法呼叫`的過程

> 程式執行的狀態

---

# Call Stack

![call-stack-1](assets/call-stack-1.png)

---

# Call Stack

![call-stack-2](assets/call-stack-2.png)

---

# Call Stack

![call-stack-3](assets/call-stack-3.png)

---

# Call Stack

![call-stack-4](assets/call-stack-4.png)

---

# Call Stack

![call-stack-5](assets/call-stack-5.png)

---

# Call Stack

![call-stack-6](assets/call-stack-6.png)

---

# Call Stack

![call-stack-7](assets/call-stack-7.png)

---

# Call Stack

![call-stack-8](assets/call-stack-8.png)

---

# Call Stack

![call-stack-9](assets/call-stack-9.png)

---

# Call Stack

![call-stack-10](assets/call-stack-10.png)

---

# Call Stack

![call-stack-11](assets/call-stack-11.png)

---

# Call Stack

![call-stack-12](assets/call-stack-12.png)

---

# 情境 & 思考

* 故意讓 `methodB` 執行 `1 / 0` 的任務

> 為什麼有例外程式就停了?

---

# 例外一旦擲出後
## 會沿著Call Stack 往回傳遞，直到:

1. 整條Call Stack 都沒方法要捕捉: 程式就停止
2. Call Stack上有某方法捕捉到: 就做`catch`區塊內的事


---

# 例外傳遞

![exception-propagation](assets/exception-propagation.png)

---

# 在 methodB 捕捉

---

# 在 methodA 捕捉

---

# 在 main 捕捉