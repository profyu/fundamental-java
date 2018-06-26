---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 例外處理:
## throw 陳述與常見例外類別的使用

---

# 回顧

```java
Scanner sc = new Scanner(System.in);
try {
    int[] numbers = new int[] { 11, 13, 15 };
    
    System.out.println("請輸入索引: ");

    int index = sc.nextInt();

    int selected = numbers[index];
    System.out.println("位於索引 " + index + " 的數字是:" + selected);
} catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
    System.out.println("輸入錯誤");
    
} finally {
    System.out.println("執行 finally 區段");
    sc.close();
}
```

---

# 情境 & 思考

* 撰寫一個 Wallet 類別，用來存放餘額(`int amount`)
* Wallet 有實例方法:
    * `spent(int value)`: 用來減少餘額
    * `getAmount()`: 餘額的 getter

---

# 情境 & 思考

* 在 `main` 方法中，建構一個 Wallet 實例 `w`
* 用 Scanner 接受使用者想讓 `w` 花多少錢
* 最後，印出花完後的餘額。
* 如果使用者沒有輸入整數，則印出 `輸入錯誤`

---

# Wallet 類別

```java
public class Wallet {
	private int amount;

	public Wallet(int amount) {
		this.amount = amount;
	}

	public void spend(int expense) {
		amount -= expense;
	}

	public int getAmount() {
		return amount;
	}

}
```

---

# main 方法

```java
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try {
        Wallet w = new Wallet(100);
        
        System.out.println("請問要花多少錢?");
        int expense = sc.nextInt();
        w.spend(expense);
        System.out.println("餘額: " + w.getAmount());
    } catch (InputMismatchException e) {
        System.out.println("輸入錯誤");
    } finally {
        sc.close();
    }

}
```

---

# 情境 & 思考

* 如果使用者超支，或者輸入負數，都要印出 `花費無效`

---

# 方法一

```java
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try {
        Wallet w = new Wallet(100);

        System.out.println("請問要花多少錢?");
        int expense = sc.nextInt();
        if(expense <0 || expense > w.getAmount()){
            System.out.println("花費無效");
            return;
        }
        w.spend(expense);
        System.out.println("餘額: " + w.getAmount());
    } catch (InputMismatchException e) {
        System.out.println("輸入錯誤");
    } finally {
        sc.close();
    }

}
```

---

# 情境 & 思考

* 阻擋無效的花費，應該是:
 1. `spend` 方法的責任?
 2. `main` 方法的責任?

---

# 擲出例外

* `spend` 方法，可能因為呼叫時，外界傳入錯誤參數而運作異常。
* 讓 `spend` 方法，有機會擲出例外，好讓呼叫者可以捕獲並處理。

---

# 擲出例外

```java
public void spend(int expense) {
    if (expense < 0 || expense > getAmount()) {
        throw new IllegalArgumentException();
    }
    amount -= expense;
}
```

> throw 可以擲出 Throwable 的實例

---

# IllegalArgumentException

![illegal-arg-exception](assets/illegal-arg-exception.png)

---

# 捕獲例外

```java
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    try {
        Wallet w = new Wallet(100);

        System.out.println("請問要花多少錢?");
        int expense = sc.nextInt();
        
        w.spend(expense);
        System.out.println("餘額: " + w.getAmount());
    } catch (InputMismatchException e) {
        System.out.println("輸入錯誤");
    } catch (IllegalArgumentException e) {
        System.out.print("花費無效");
    }
    finally {
        sc.close();
    }

}
```

---

# NullPointerException

---

# ClassCastException

---

# IllegalStateException