package com.example.retalhelper;

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
		System.out.println("請輸入物件名稱(A or B or C):");
	}

	public static void printHouseNotFound() {
		System.out.println("很抱歉，物件不存在!");
	}

	public static void printInvalidData() {
		System.out.println("資料無效!");
	}

	public static String getHouseString(String id, float area, String type, int price, String owner, String address) {
		return id + "物件 - " + area + "坪 - " + type + " - 每月" + price + "元 - 屋主:" + owner + " - 地址:" + address;
	}

	public static void main(String[] args) {
		// A 租屋物件資料
		float areaA = 10f;
		String typeA = "套房";
		int priceA = 12000;
		String ownerA = "王先生";
		String addressA = "台北市文山區木柵路一段xx號";

		// B 租屋物件資料
		float areaB = 8f;
		String typeB = "套房";
		int priceB = 8000;
		String ownerB = "陳先生";
		String addressB = "新北市中和區中和路yy號";

		// C 租屋物件資料
		float areaC = 4f;
		String typeC = "雅房";
		int priceC = 6000;
		String ownerC = "林先生";
		String addressC = "新北市新店區中正路aa巷zz號";

		String infoA = getHouseString("A", areaA, typeA, priceA, ownerA, addressA);
		String infoB = getHouseString("B", areaB, typeB, priceB, ownerB, addressB);
		String infoC = getHouseString("C", areaC, typeC, priceC, ownerC, addressC);

		Scanner sc = new Scanner(System.in);

		mainLoop: while (true) {

			printGuide();

			if (sc.hasNextInt()) {
				int option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println(infoA);
					System.out.println(infoB);
					System.out.println(infoC);
					break;
				case 2: {
					printHouseQuery();
					String id = sc.next();

					switch (id) {
					case "A":
						System.out.println(infoA);
						break;
					case "B":
						System.out.println(infoB);
						break;
					case "C":
						System.out.println(infoC);
						break;

					default:
						App.printHouseNotFound();
						break;
					}

					break;
				}

				case 3: {
					// 租金試算程式碼:
					printHouseQuery();
					String id = sc.next();
					int monthlyPrice = 0;
					switch (id) {
					case "A":
						monthlyPrice = priceA;
						break;
					case "B":
						monthlyPrice = priceB;
						break;
					case "C":
						monthlyPrice = priceC;
						break;
					default:
						printHouseNotFound();
						continue;

					}

					// 接收合約租期
					System.out.println("請輸入合約租期(月):");
					int expectedMonths = sc.nextInt();
					if (expectedMonths < 0) {
						printInvalidData();
					} else {

						// 接收押金期數
						System.out.println("請輸入押金期數(月):");
						int depositMonths = sc.nextInt();
						if (depositMonths < 0) {
							printInvalidData();
						} else {

							// 接收實際租期
							System.out.println("請輸入實際租期(月):");
							int actualMonths = sc.nextInt();

							if (actualMonths > expectedMonths || actualMonths < 0) {
								printInvalidData();
							} else {
								// 進行租金試算
								int total = monthlyPrice * actualMonths
										+ ((actualMonths < expectedMonths) ? (depositMonths * monthlyPrice) : 0);
								float average = total / (float) actualMonths;

								System.out.println("租金總額: " + total + " 元");
								System.out.println("月平均租金: " + average + " 元");

							}

						}

					}

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
