package com.example.stdio;

import java.util.Scanner;

public class StandardIO {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入身高:");
		
		int height = sc.nextInt();
		
		
		System.out.println("你的身高是" + height + "公分");
		
	}
}
