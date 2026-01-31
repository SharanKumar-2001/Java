package com;

import java.util.Scanner;

public class tablelogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur number");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + "*" + i + "=" + num * i);

		}
		sc.close();

	}

}
