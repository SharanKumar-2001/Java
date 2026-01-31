package com;

public class Sim {
	int votercard;
	
	String pancard;
	
	int aadharcard;
	public static void main(String[] args) {
		Sim s=new Sim(100000,"LJOPK2001",700859567);
		System.out.println(s.votercard);
		System.out.println(s.pancard);
		System.out.println(s.aadharcard);
		
	}
	Sim(int uservotercard,String userpancard, int useraadharcard){
		this.votercard=uservotercard;
		this.pancard=userpancard;
		this.aadharcard=useraadharcard;
		
	}

}
