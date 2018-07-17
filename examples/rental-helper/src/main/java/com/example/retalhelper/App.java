package com.example.retalhelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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

	public static List<House> readHouses(String path) throws FileNotFoundException {

		Scanner fileScanner = new Scanner(new File(path));

		List<House> result = new ArrayList<>();

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

			House house = new House(area, type, price, owner, address);
			result.add(house);

		}

		fileScanner.close();
		return result;

	}

	public static void main(String[] args) {

		
		
		String defaultPath = "/Users/johnlin/Desktop/houses.csv";
		List<House> houses = null;
		Scanner sc = new Scanner(System.in);

		// 讀取CSV 內的租屋資料
		try {
			houses = readHouses(defaultPath);
		} catch (FileNotFoundException e) {
			System.out.println("檔案不存在於預設路徑: " + defaultPath);
			System.out.println("請輸入CSV檔路徑: ");
			String inputPath = sc.nextLine();
			try {
				houses = readHouses(inputPath);
			} catch (FileNotFoundException e2) {
				System.out.println("檔案不存在於路徑: " + inputPath);
				return;
			}

		}

		Collections.sort(houses, new HouseComparator());

		mainLoop: while (true) {

			printGuide();

			if (sc.hasNextInt()) {
				int option = sc.nextInt();

				switch (option) {
				case 1:

					for (int i = 0; i < houses.size(); i++) {
						System.out.println(getHouseString(i, houses.get(i)));
					}

					break;
				case 2: {
					printHouseQuery();
					int index = sc.nextInt();

					if (!(index >= 0 && index < houses.size())) {
						printHouseNotFound();
						continue;
					}

					System.out.println(getHouseString(index, houses.get(index)));

					break;
				}

				case 3: {
					// 租金試算程式碼:
					printHouseQuery();
					int index = sc.nextInt();
					if (!(index >= 0 && index < houses.size())) {
						printHouseNotFound();
						continue;
					}
					int monthlyPrice = houses.get(index).getPrice();

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
