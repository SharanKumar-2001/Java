package com;

public class Reversethegivennumber {
	public static void main(String[] args) {
		int num=527;
		int temp=0;
		
		
		while(num>0) {
			int result=num%10;
			temp=temp*10+result;
			num=num/10;
			
		}
		System.out.println(temp);
	}

}
