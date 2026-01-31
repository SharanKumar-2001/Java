package com;

import java.util.Scanner;

public class Numberofdigitsinagivennumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur number");
		int num = sc.nextInt(); // or int num=1235266;

		int Numberofdigits = 0;

		// method 1
		while (num > 0) {
			num = num / 10;
			Numberofdigits++;
		}
		System.out.println("no of digits is: " + Numberofdigits);

		System.out.println("-------------------------");
		// method 2
		for (; num > 0; num = num / 10) {
			Numberofdigits++;
		}
		System.out.println("no of digits is: " + Numberofdigits);

		

	}

}
