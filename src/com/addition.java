package com;

public class addition {
	
	int add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
		
		return sum;
		
	}
	public static void main(String[] args) {
		addition a= new addition();
		
		a.add(10, 20);
	}

}
