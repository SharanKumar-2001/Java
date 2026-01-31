package com;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String A = sc.next();
		String a = "";
		
		for (int i = A.length() - 1; i >= 0; i--) {
			char ch = A.charAt(i);
			a = a + ch;

		}
		if (A.equals(a)) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}
		sc.close();

	}
	
	
}






    
//    public static boolean isPalindrome(String word)
//    {
//        boolean isPalindrome = true;
//        
//        for(int i = 0;i<(int)word.length()/2;i++)
//        {
//            if(word.charAt(i) != word.charAt(word.length()-1-i)){
//                isPalindrome = false;
//                break;
//                
//            }
//        }
//            
//        return isPalindrome;
//    }
//    public static void main(String[] args) {
//        
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();  
//        System.out.println(isPalindrome(A)?"Yes":"No");
//        
//    }
