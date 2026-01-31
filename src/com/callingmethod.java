package com;

public class callingmethod {
	
		public static void main(String[] args) {
			
			int response=twonumbers(100,25);
			System.out.println(response);
			word("sharan");
			
			int res=threenumbers(10,20,30);
			System.out.println(res);
			w('k');
			int total=sumofnumbers(10,20,30,50,40,50);
			System.out.println(total);
			
			
		}
		static int twonumbers(int a,int b) {
			int result=a+b;
			return  result;
			
		}
		
		static int threenumbers(int a,int b,int c) {
			int result=a+b+c;
			return result;
		}
		
		
		static void word(String name ) {
			System.out.println("Good morning "+name);
		}
		
		 static void  w(char name) {
			System.out.println(name);
			
		}
		static int sumofnumbers(int... a) {
			 int sum=0;
			 for(int i:a) {
				 sum=sum+i;								 
			 }
			 return sum;
		 }

	}



