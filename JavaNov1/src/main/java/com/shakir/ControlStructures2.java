package com.shakir;

import java.util.Scanner;

public class ControlStructures2 {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//loops will continue until the condition is false 
		//For Loop practice- for (int i = 0, i< args.length; i++) {
	 	Scanner inputScan=new Scanner(System.in) ;
		System.out.println("enter the range") ;
		int number=inputScan.nextInt();
		inputScan.close();
		int sum=0;
		for (int i=0; i < number; i++) { //this is the loop
			System.out.println(i) ;  //for known ranges, minimize the code by using the loop
			sum=sum+i;
		}
		System.out.println("sum of the given numbers is:" +sum) ; //this line is important
		//this is how to get the sum for the given range
		
		//While Loop practice- while (condition) {
		//While loops are for unknown ranges
		int sc=0;
		while (sc < number) {    //condition
			System.out.println(sc);
			sc++;				 //incremental/descremental operator, must use this
		}
		//Do while practice- do {}while(condition);
		int num1=0;
		do {    
			System.out.println(num1); //this condition will be prioritized for the first time, then the 'while' loop takes over
			num1++;           //without the incremental/descemental operator, this loop would be infinite
		} while (num1<number);
		
		do {
			if("Create Account"=="n")  //how to break the loop when the condition is not satisfied
				break;
		}while(true); 
		
		//Foreach practice (arrays and collection/unknown range)
		int BasketballScores[]= {2,5,45,7,46,90,678,34,67,543,55,789};
		for (int i : BasketballScores) {
			System.out.println(i);
		}
	}

	
}
