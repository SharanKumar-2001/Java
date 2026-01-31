package com;

public class loopingstatements {
	public static void main(String[] args) {
		int i=0;
	
		
		while(i<10) {
			i++;
			if(i==7) {
				continue;
				
			}
			System.out.println("hello "+i);
			
		}
	}

	
	

	 static void looping1() {
		int i=1;
		while(i<=10) {
			System.out.println("hello "+i);
			i++;
			
		}
		
		System.out.println("------------------------");
		 i=0;
		do{
			i++;
			System.out.println("hello "+i);
		}while(i<10);
		
		System.out.println("________________________");
		
		i=1;
		for(;i<=10;i++) {
			System.out.println("hello "+i);
		}
	}

}
