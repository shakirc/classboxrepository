package com.package3;

public class PalindromeChecker {
	
	static boolean yesPalindrome(String str0) { //returns true if the value string is a palindrome
		int i=0,j=str0.length() - 1;
		while (i < j) { // 
			if(str0.charAt(i) != str0.charAt(j)) //if there is an issue, it returns false
				return false;
			i++; //use of increments 
			j--;
		}
		return true;
	}
	public static void main(String[] args) { //this is the method that acts out the true/false scenario
		String str1="shutdown"; //depending on if the value is a palindrome, specific messages will appear
		String str2="level";
		System.out.println("String 1 =");
		if(yesPalindrome(str1))
			System.out.println("Yes, it's an palindrome");
		else
			System.out.println("No, it's not a palindrome");
		System.out.println(); //space between the lines 
		System.out.println("String 2 =");
		if(yesPalindrome(str2))
			System.out.println("Yes, it's an palindrome");
		else
			System.out.println("No, it's not a palindrome");
	}

}
