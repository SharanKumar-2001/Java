package com;
//24import java.lang.;
import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String args[]) {
		// voting application
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to US Election");
		System.out.println("enter your age");
		int age= sc.nextInt();
		System.out.println("Please enter ur pincode");
		int pincode =sc.nextInt();
		// eligibility to vote
		boolean ageComparision=age>18;
		boolean areaMatch= pincode == 33;
		
		// And operator (&&); 
		// OR operator (||);
		// NOT operator (!)

		if(!(ageComparision || areaMatch)) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
		
		
		System.out.println("your age is " +age);
		System.out.println("your country is " +pincode);
		
		
		sc.close();
	}

}
