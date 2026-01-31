package com;


import java.util.Scanner;

public class array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.next();
		//System.out.println("my name is:"+name);
		
		// reverse the string
		char[] word =name.toCharArray();
		int start=0;
		int end=word.length-1;
		
		while(start<=end) {
			char temp=word[start];
			word[start]=word[end];
			word[end]=temp;
			start++;
			end--;
		}
		
		for(char c:word) {
			System.out.print(c);
		}
		
	
		sc.close();
		
		
		
	}







		void reversethearray1logic() {
		int[] a= {1,2,3,4};
		int lengthofarray=a.length;
		
		int start=0;
		int end=lengthofarray-1;		
		
		while(start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
		for(int temp:a) {
			System.out.println(temp);
		}
	}







	 void reversethenumberusingarray() {
		int[] a= {10,20,30,40,50};
		
		int[] b=new int[a.length];
		
		int j =a.length-1;

		for(int i=0;i<a.length;i++) {
			b[j]=a[i];
			j--;
			
		}
		System.out.println("--------------");
		for(int temp:b) {
			System.out.println(temp);
		}
	}







		void readthearrayinreverse() {
		int[] a= {10,20,30,40,50};
		
		for(int i=a.length-1;i<=a.length;i--) {
			System.out.println(a[i]);
			
		}
	}







		void evenorodd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		
		String[] name= {"even","odd"};
		 	System.out.println(name[x%2]);
			
		
		
	
		sc.close();
	}

	
	
	
	
	
	
		void foreachloop() {
		String[] name= {"sharan","kumar","parepalli"};
		
		
		for(String temp:name) {
			System.out.print( temp+" ");
			
		}
	}

	   void array2() {
		int tel = 22;
//		int hin = 25;
//		int eng = 24;
//		int mat = 25;
//		int sci = 22;
//		int soc = 24;

		System.out.println("Telugu marks:" + tel);

		System.out.println("----------------");

		int[] marks = { 22, 22, 24, 25, 22, 24 };
		System.out.println("telugu marks:" + marks[0]);

		int len = marks.length;

		System.out.println("Array len is:" + len);
	}

	void usingArray() {
		int[] a = { 1, 2, 3, 4 };

		int[] b = new int[a.length];

		int j = a.length - 1;
		
		for (int i = 1; i <= a.length; i++)

		{
			b[j] = a[i];
			j--;
		}

		for (int temp : b) {
			System.out.println(temp);
		}
	}

}
