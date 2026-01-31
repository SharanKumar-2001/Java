package com;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is Odd");
		}
		sc.close();
		
	}
	}


