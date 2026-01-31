package com;
                  
//source a={1,2,3,4,5};
public class Identifythemissingnumberinarray {
	public static void main(String[] args) {
		
	
	int[] a= {1,2,3,4,5,0,7,8,9,10};
	int n=a.length;
	int sum=0;
	
	for(int i:a) {
		sum=sum+i;
 	}
	
	System.out.println("array sum is:"+sum);
	
	
	
	int finalsum=n*(n+1)/2;
	System.out.println("source sum is:"+finalsum);
	
	System.out.println("the missing number is:"+(finalsum-sum));
	
	

	}
	
	
		
}
	
	
			
	


