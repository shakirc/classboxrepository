package com.shakir;

import java.util.Scanner;

public class Practice {
//Control structure practice
	//it will save the code and is needed to run any functionality
	//T+T=T, T+F=F, F+F=F
	//it will check each condition. if one condition is not met, then it will move on to the next
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		// if-else
		Scanner inputScan=new Scanner(System.in) ;  //system.in-keyboard system.out-stream
		System.out.println("Please enter a number") ;
		int num1=inputScan.nextInt() ; //Scanner system makes it easy to place values
		//int num1=224; hardcoding-entering the value yourself/keyboard
		inputScan.close(); //closes the connection with the keyboard
		if(num1<100)  {  //expression - takes only the boolean value - this must be true, or it wont run
			if(num1<50) {
			}else {
			System.out.println("the number is greater than 50") ;
			}
			System.out.println("the number is less than 100");
			}else {      //Acts as its own block since its separated by the {}
				System.out.println("the number is bigger than 100");
				
				if(num1<150) { 
				}else if(num1>200 && num1<300) {
					System.out.println("the number is greater than 200") ;
				}
				System.out.println("the number is less than 300") ;
			}
		System.out.println("out of if") ; 
		
		
		//Practice with the Switch Value
		//used for small conditions
		Scanner inputScan1=new Scanner(System.in);
		System.out.println("Please enter a number") ;
		int week=inputScan1.nextInt();  //accepts int, byte, short, char, and String
		inputScan1.close();
		switch (week) {
		case 1:
			System.out.println("this is week 1") ;
			break;
		case 2:
			System.out.println("this is week 21") ;
			break;
		case 3:
			System.out.println("this is week 51") ;
			break;
		default:
			System.out.println("there is no week for a given number") ;
			break;
		}
	
	}
}
