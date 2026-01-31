package com;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="racecar";
		String s2=" c arrace";
		
		
		System.out.println(s2);
		
		if(AreAnagram(s1, s2)){
			 System.out.println("Is Anagram");
		}
		else {
			System.out.println("Is Not anagram");
		}
		
	}
	
	static boolean AreAnagram(String s1,String s2){
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		
	}
}
