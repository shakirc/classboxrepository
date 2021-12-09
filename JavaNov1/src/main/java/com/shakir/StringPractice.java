package com.shakir;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringPractice {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//Strings are groups of characters(char)
		//String is immutable-cannot be modified
		//str = string
		//2 methods to create string objects
		
		//method 1
	/*	String str1=new String("Welcome to String Practice"); //heap
		String str4=new String("Welcome to String Practice"); //heap
		System.out.println("1st Way:" +str1==str4);
		
		//method 2
		String str2="Second method to String options";   //literal method
		String str3="Second method to String options";
		String str5="Welcome to String Practice";
		System.out.println(str2==str3); //true as the == operator checks both the content and the address is true/false
		
		System.out.println(str1==str5); //false
		System.out.println(str1.equals(str5)); //true
		
		//many other methods
		System.out.println(str1.charAt(2)); //"We(l)come to String Practice" this selects one character from the statement
		System.out.println(str1+str2);
		System.out.println(str1); //Welcome to String Practice */
		
		//StringBuffer practice
		//StringBuffer is mutable
		//all the methods of StringBuffer are synchronized
		StringBuffer sbuffer1=new StringBuffer("Welcome to StringBuffer Practice");    //the ("") is the condition/statement
		sbuffer1.append(", try to understand the consept Shakir.");     //to append means to combine the conditions/statements
		System.out.println(sbuffer1);
		/*System.out.println(sbuffer1.reverse()); //reverse completely flips the statement around */
		String str1=sbuffer1.toString();
		System.out.println(str1.toUpperCase());  //makes the whole statement uppercase
		System.out.println(str1.toLowerCase());  //makes the whole statement lowercase
		System.out.println(sbuffer1.reverse()); //using a second reverse brings the statement back to normal
		
		
		StringBuffer sbuffer2=new StringBuffer("I am starting to understand");
		//StringBuilder practice
		//StringBuilder is mutable
		//no method is synchronized
		StringBuilder sbuilder1=new StringBuilder();
		sbuilder1.append(sbuffer2);
		System.out.println(sbuilder1);
		System.out.println(sbuilder1.substring(0,13));  //this is how to range between 2 values
		System.out.println(sbuilder1.insert(18,"(interuption)"));  //inserts the value where the numerical value is
		
		
		//StringTokenizer practice
		//uses the space separation to split the statement into tokens/columns 
		StringTokenizer stokenizer1=new StringTokenizer("Time to use the tokenizer");
		System.out.println(stokenizer1.countTokens());   //counts the number of tokens
		System.out.println(stokenizer1.hashCode());  //represents the hash value
		while(stokenizer1.hasMoreTokens()) {  //checks for the next token
			  System.out.println(stokenizer1.nextToken()); //this displays the tokens 
			  }
		  
		//StringJoiner practice
		StringJoiner sjoiner1=new StringJoiner("," , "[" , "]"); //separated by commas and within the double quotations
		sjoiner1.add("Wassup");
		sjoiner1.add("My");
		sjoiner1.add("Name");
		sjoiner1.add("is");
		sjoiner1.add("Shakir");
		System.out.println(sjoiner1);
		
		
		
		
		
	}
}
