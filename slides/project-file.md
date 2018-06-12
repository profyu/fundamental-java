---
title:  
theme: profyu
---

<!-- .slide: data-background="assets/background.png" -->
<img style='border:none;background:none;box-shadow:none;' src='assets/logo.svg' width="250"/>

# 專題: 租屋小幫手
## 讀取文字檔中的租屋資訊

---

# 租屋CSV資料檔

* CSV: Comma-Separated Values

```csv
坪數,房型,月租金,屋主,地址
10,套房,12000,王先生,台北市文山區木柵路一段xx號
8,套房,8000,陳先生,新北市中和區中和路yy號
4,雅房,6000,林先生,新北市新店區中正路aa巷zz號
``` 

---

# 範例

```java
public static House[] readHouses(String path) throws FileNotFoundException {

    Scanner fileScanner = new Scanner(new File(path));

    House[] result = new House[1];

    int lineNo = 0;
    while (fileScanner.hasNextLine()) {
        lineNo++;
        String line = fileScanner.nextLine();

        if (lineNo == 1) {
            continue;
        }

        String[] values = line.split(",");

        float area = Float.parseFloat(values[0]);
        String type = values[1];
        int price = Integer.parseInt(values[2]);
        String owner = values[3];
        String address = values[4];

        if (lineNo - 2 == result.length) {
            // 延伸陣列
            result = Arrays.copyOf(result, result.length * 2);
        }
        result[lineNo - 2] = new House(area, type, price, owner, address);

    }

    // 縮小陣列到剛好的大小
    result = Arrays.copyOf(result, lineNo - 1);
    fileScanner.close();
    return result;

}
```