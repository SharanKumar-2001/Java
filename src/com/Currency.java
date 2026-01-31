package com;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double payment=sc.nextDouble();
		
		
		Locale.setDefault(new Locale("en", "IN"));
		String india =NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.CHINA);
		String china =NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.US);
		String us =NumberFormat.getCurrencyInstance().format(payment);
		
		Locale.setDefault(Locale.CANADA);
		String canada =NumberFormat.getCurrencyInstance().format(payment);
		
		System.out.println("Indian currency format: "+india);
		System.out.println("US currency format: "+us);
		System.out.println("China currency format: "+china);
		System.out.println("Canada currency format: "+canada);
		
		sc.close();
	}

}
