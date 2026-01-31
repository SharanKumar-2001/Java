package com;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		System.out.println(10>>2);
		practice p=new practice();
		p.pattern();
		System.out.println();
		System.out.println(Integer.MIN_VALUE);
		
		
//		int x=7;
//		x^=5;
//		System.out.println(x);
		
//		int x=2,y=5;
//		boolean res=(x>3)&&(y<10)||(x>1);
//		System.out.println(res);
		
//		int a=10;
//		int b=-a;
//		
//		boolean res = a==-b;
//		System.out.println(res);
		
//		int i=0;
//		i=i++ + i;
//		System.out.println(i);
		
//		int a=1,b=2,c=3;
//		
//		a|=4;
//		b>>=1;
//		c<<=1;
//		a^=c;
//		
//		System.out.println(a+""+b+""+c);
//		
//		
//		System.out.println(10+20+"hello"+10+20);
		
		
		
		
//		int x=10;
//		int y=5;
//		int c=x&y;
//		System.out.println(c);
		
		
		
		
		//System.out.println(10.0/0);
//		char c1='1';
//		char c2='2';
//		char c3=(char)(c1+c2);
//		System.out.println(c3);
//		
//		double a=9.5;
//		double b=3;
//		double c=a/b;
//		System.out.println(c);
		
//		short s=0;
//		int x=07;
//		int y=08;
//		int z=112345;
//		s+=z;
//		System.out.println("s:"+s);
		
//		byte a=127;
//		byte b=-30;
//		byte c=(byte)(a+b);
//		System.err.println(c);
//		
		
//		double d=100.04;
//		long l=(long)d;
//		int i=(int)l;
//		
//		System.out.println("Double value"+d);
//		System.out.println("Long value"+l);
//		System.out.println("Int value"+i);
//		
		
//		String s=new String("java");
//		System.out.println(s instanceof String);
//		float f1=3.5f;
//		float f2=2.5f;
//		System.out.println(f1==f2);
		
//		boolean flag1=true;
//		boolean flag2=false;
//		System.out.println(flag1 && flag2);
		
		
		
//		char ch='A';
//		ch++;
//		System.out.println(ch);
		
		
		
//	double num=9.7;
//	int x =(int)Math.ceil(num);
//	System.out.println(x);
		
//		long x=10;
//		int y=(int)(x*2);
//		System.out.println(y);
		
		
	}














	 static void pattern2() {
		int i,j;
		for(i=1;i<=5;i++) {
			System.out.println(i);
		
		for(j=1;j<=i;j++) {
			System.out.print(j);
		}
			}
	}
		













	void pattern() {
		int i,j;
		for(i=1;i<=5;i++) {
			System.out.print("\n");
		
		for(j=1;j<=5;j++) {
			System.out.print("*");
		}
		}
	}













	    void forloop() {
		int count=1;
		while(count<=10) {
			System.out.println("Good morning "+ count);
			
			
			count++;
		}
		 	System.out.println("--------------------");
		 	
		 	
		 	count=1;
		 	do {
		 		System.out.println("good morning " +count);
		 		count++;
		 	}while(count<=10);
		 	
		 	
		 	System.out.println("-----------------------------");
		 	count=1;
		 	for(int i=1;i<=10;i++) {
		 		System.out.println("good " + i);
		 				 		
		 	}
	}
	
	











	 void extractedto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("ur eligible to vote");
		}
		else {
		 	System.out.println("ur not eligible to vote");
		}
		sc.close();
	}

	void extractedme111() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int value1= sc.nextInt();
		System.out.println("enter the number");
		int value2= sc.nextInt();
		 
		int num1=value1+value2;
		System.out.println("add "+ num1);
		int num2=value1*value2;
		System.out.println("mul "+ num2);
		int num3=value1%value2;
		System.out.println("div "+ num3);
		int num4=value1/value2;
		System.out.println("modulo "+num4);
		
		sc.close();
	}

	void extracted() {
		String name= "sharan";
		char charposition =name.charAt(5);
		System.out.println(charposition);
	}
	
}
