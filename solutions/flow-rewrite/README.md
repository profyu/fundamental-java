# 作業: 程式改寫

## 題目

以下是我們在課堂中示範的身高詢問程式，目前當程式偵測到使用者輸入`負數`之後，會打印出`身高不可是負數!`的訊息，並用`continue`陳述給使用者另一次機會輸入身高。

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
        System.out.println("請輸入身高:");
        int height = sc.nextInt();

        if (height < 0) {
            System.out.println("身高不可是負數!");
            continue;
        }
        System.out.println("你的身高是 " + height + " 公分");
        System.out.println("還要繼續嗎?(要,請輸入y)");
        String answer = sc.next();
        if (!answer.equals("y")) {
            break;
        }
    } while (true);
}
```

現在，請你改寫這個程式，看看有沒有什麼寫法，可以讓程式碼**不出現** `continue`陳述。請注意改寫過後的程式行為必須保持一樣！

## 提示

可以透過 `if-else` 控制結構來幫忙。