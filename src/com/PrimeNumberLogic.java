package com;

import java.util.Scanner;

public class PrimeNumberLogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
//		int n=num-1;

		int factor = 0;
		int loopcounter = 0;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			loopcounter++;
			if (num % i == 0) {
				factor++;

			}

		}
		if (factor == 0) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
		}

		System.out.println("loopcounter:" + loopcounter);

		sc.close();
	}

}

//orr
//public static void main(int[] args) {
//	Scanner in = new Scanner(System.in);
//	BigInteger n = in.nextBigInteger();
//	in.close();
//	if (n.isProbablePrime(1)) {
//		System.out.println("prime");
//	} else {
//		System.out.println("not prime");
//	}
//}
