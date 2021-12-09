package com.package3;

import java.util.Scanner;

//exceptions are uncommon occurrences/abnormal
//exceptions must be fixed and will be seen throughout our projects
//throws - partially handles exceptions 
//child gains priority to the parent

class TooYoungException extends RuntimeException{
	public TooYoungException() {
		System.out.println("too young ma'am");
	}
}
class TooOldException extends RuntimeException{
	public TooOldException() {
		System.out.println("you're too old ma'am");
	}
}

public class Exceptions {
	
	static void ageCheck(int age) {
		if(age<18) {
			throw new TooYoungException();
		}else if(age>35) {
			throw new TooOldException();
		}else {
			System.out.println("yikes. . .ginkies");
		}
	}
	
	static int division(int num1,int num2) throws Exception {
		String name=null;
		name.charAt(0);
		return num1/num2;
	}
	static void operations1(int number3,int number4) throws Exception {
		System.out.println(division(number3, number4));
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.println("start");
/*		try { //this is a method to handle exceptions
		System.out.println(division(10,0));
		}catch (ArithmeticException e) {  //catch - catches the exception that is listed in the console
			//TODO: handle exception
			e.printStackTrace();
		} */
/*		try {
		operations1(100,0);
		}catch (NullPointerException e1) {
			e1.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("mandatory");
		}
		System.out.println("this is division"); */
		Scanner scan= new Scanner(System.in);
		System.out.println("What is your age?");
		int age=scan.nextInt();
		try {
		ageCheck(age);
		}catch (Exception e2) {
			e2.printStackTrace();
		}
		System.out.println("end");
		
	}


}
