package com;

import java.util.Scanner;

public class TerinaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int firstnumber = sc.nextInt();
		System.out.println("enter the second number");
		int secondnumber = sc.nextInt();
		System.out.println("enter the third number");
		int thirdnumber = sc.nextInt();

		// Ternary operator means we don't use if conditions repeatedetly,
		// instead we using terinary operator
		// syntax= ((booleanexpressionfirstone>secondone))?firstone:secondone; this for
		// two numbers

		int highestnumber = (firstnumber > secondnumber) ? firstnumber : secondnumber;

		int theHighestnumber = (highestnumber > thirdnumber) ? highestnumber : thirdnumber; // this is for three numbers

		System.out.println(theHighestnumber + " is big");

		// This is another logic for three numbers

		System.out.println("--------------------------------");

		int res = (firstnumber > secondnumber && firstnumber > thirdnumber) ? firstnumber
				: (secondnumber > thirdnumber) ? secondnumber : thirdnumber;

		System.out.println(res + " is big");
		sc.close();
	}

}
