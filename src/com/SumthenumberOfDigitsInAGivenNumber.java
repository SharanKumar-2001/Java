package com;

import java.util.Scanner;

public class SumthenumberOfDigitsInAGivenNumber {
	public static void main(String[] args) {
		// int i=125;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int i = sc.nextInt();
		int temp = i;
		int sum = 0;

		while (i > 0) {
			sum = sum + i % 10;
			i = i / 10;
		}
		System.out.println("SumOfDigitsInAGivenNumber " + sum);

		System.out.println("---------------------------------");
		// int num =234;
		
		int sumofdigits = temp % 9 == 0 ? 9 : temp % 9;
		System.out.println(sumofdigits);

		sc.close();

	}

}
