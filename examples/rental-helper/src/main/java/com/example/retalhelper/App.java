package com.example.retalhelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void printGuide() {
		System.out.println("歡迎使用租屋小幫手, 請選擇功能:");
		System.out.println("1. 陳列所有出租房屋");
		System.out.println("2. 房屋出租查詢");
		System.out.println("3. 租金試算");
		System.out.println("4. 離開");
	}

	public static void printHouseQuery() {
		System.out.println("請輸入物件索引:");
	}

	public static void printHouseNotFound() {
		System.out.println("很抱歉，物件不存在!");
	}

	public static void printInvalidData() {
		System.out.println("資料無效!");
	}

	public static String getHouseString(int id, House h) {
		return "索引" + id + "物件 - " + h.getString();
	}

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

	public static void main(String[] args) throws FileNotFoundException {

		House[] houses = readHouses("/Users/johnlin/Desktop/houses.csv");

		Scanner sc = new Scanner(System.in);

		mainLoop: while (true) {

			printGuide();

			if (sc.hasNextInt()) {
				int option = sc.nextInt();

				switch (option) {
				case 1:

					for (int i = 0; i < houses.length; i++) {
						System.out.println(getHouseString(i, houses[i]));
					}

					break;
				case 2: {
					printHouseQuery();
					int index = sc.nextInt();

					if (!(index >= 0 && index < houses.length)) {
						printHouseNotFound();
						continue;
					}

					System.out.println(getHouseString(index, houses[index]));

					break;
				}

				case 3: {
					// 租金試算程式碼:
					printHouseQuery();
					int index = sc.nextInt();
					if (!(index >= 0 && index < houses.length)) {
						printHouseNotFound();
						continue;
					}
					int monthlyPrice = houses[index].getPrice();

					// 接收合約租期
					System.out.println("請輸入合約租期(月):");
					int expectedMonths = sc.nextInt();

					if (expectedMonths < 0) {
						printInvalidData();
						continue;
					}

					// 接收押金期數
					System.out.println("請輸入押金期數(月):");
					int depositMonths = sc.nextInt();

					if (depositMonths < 0) {
						printInvalidData();
						continue;
					}

					// 接收實際租期
					System.out.println("請輸入實際租期(月):");
					int actualMonths = sc.nextInt();

					if (actualMonths > expectedMonths || actualMonths < 0) {
						printInvalidData();
						continue;
					}

					// 進行租金試算
					int total = monthlyPrice * actualMonths
							+ ((actualMonths < expectedMonths) ? (depositMonths * monthlyPrice) : 0);
					float average = total / (float) actualMonths;

					System.out.println("租金總額: " + total + " 元");
					System.out.println("月平均租金: " + average + " 元");

					break;
				}
				case 4:
					break mainLoop;

				default:

					break;
				}
			} else {

				sc.next();

			}

		}

	}
}
