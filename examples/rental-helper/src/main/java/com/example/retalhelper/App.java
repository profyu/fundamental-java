package com.example.retalhelper;

import java.util.Scanner;

public class App {
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

		String infoA = "A物件 - " + areaA + "坪 - " + typeA + " - 每月" + priceA + "元 - 屋主:" + ownerA + " - 地址:" + addressA;
		String infoB = "B物件 - " + areaB + "坪 - " + typeB + " - 每月" + priceB + "元 - 屋主:" + ownerB + " - 地址:" + addressB;
		String infoC = "C物件 - " + areaC + "坪 - " + typeC + " - 每月" + priceC + "元 - 屋主:" + ownerC + " - 地址:" + addressC;

		Scanner sc = new Scanner(System.in);

		mainLoop: while (true) {
			System.out.println("歡迎使用租屋小幫手, 請選擇功能:");
			System.out.println("1. 陳列所有出租房屋");
			System.out.println("2. 房屋出租查詢");
			System.out.println("3. 離開");

			if (sc.hasNextInt()) {
				int option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println(infoA);
					System.out.println(infoB);
					System.out.println(infoC);
					break;
				case 2:
					System.out.println("請輸入物件名稱(A or B or C):");
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
						System.out.println("很抱歉，物件不存在!");
						break;
					}

					break;
				case 3:
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
