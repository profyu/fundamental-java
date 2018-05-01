package com.example.flowrewrite;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("請輸入身高:");
			int height = sc.nextInt();

			if (height < 0) {
				System.out.println("身高不可是負數!");
			} else {
				
				System.out.println("你的身高是 " + height + " 公分");
				System.out.println("還要繼續嗎?(要,請輸入y)");
				String answer = sc.next();
				if (!answer.equals("y")) {
					break; // 強制跳出迴圈
				}
			}

		} while (true);
	}
}
