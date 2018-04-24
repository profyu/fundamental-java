package com.example.printname;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入你的名字:");
		
		String name = sc.next();
		
		System.out.println("你的名字是" + name);
		
	}
}