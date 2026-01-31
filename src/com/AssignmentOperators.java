package com;
import java.util.Scanner;
public class AssignmentOperators {
	public static void main (String args[]){
		int a= 10;

		System.out.println(++a);
		System.out.println(--a);
		System.out.println(a--);
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(a);
		
		//using scanner in addition operator
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();

		System.out.println("enter the num2");
		int num2 = sc.nextInt();

		// System.out.println();
		int x = num1 + num2;
		System.out.println("X:" + x);

		int y = x + 2;
		System.out.println("Y:" + y);
		sc.close();
	}

}
