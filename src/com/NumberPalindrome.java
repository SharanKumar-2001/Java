package com;


public class NumberPalindrome {
	public static void main(String[] args) {
		int i=535;
		int k=0;
		int temp;
		
	    while(i>0)
	    {
	    	
	    	k=k*i%10;
	    	i=i/10;
	    }
	    if(i==k) {
	    	System.out.println("it is palindrome");
	    	
	    }
	    else {
	    	System.out.println("it is not palindrome");
	    }
	    
	}

}
