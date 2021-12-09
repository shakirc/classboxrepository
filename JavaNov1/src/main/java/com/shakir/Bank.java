package com.shakir;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner inputScan=new Scanner(System.in);
	    int option;
		
		do {
		System.out.println("1. Create Account");
		System.out.println("2. Credit Money");
		System.out.println("3. Debit Money");
		System.out.println("4. Transfer Money");
		System.out.println();
		System.out.println("Enter option [1-4]: ");
		
		option = inputScan.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Create an Account");
				String y = inputScan.next();
				if("Create an Account"=="n")
					break;
			System.out.println("Would you like to continue?");
				String n = inputScan.next();
				if("Would you like to continue?"=="n")
					break;
		case 2:
			System.out.println("Credit your Money");
				String yes = inputScan.next();
				if("Credit your Money"=="n")
					break;
			System.out.println("Would you like to continue?");
				String no = inputScan.next();
				if("Would you like to continue"=="n")
					break;
		case 3:
			System.out.println("Debit Money");
				String ys = inputScan.next();
				if("Debit Money" == "n")
					break;
			System.out.println("Would you like to continue?");
				String ns = inputScan.next();
				if("Would you like to continue"=="n")
					break;
		case 4:
			System.out.println("Transfer Money");
				String yess = inputScan.next();
				if("Transfer Money"=="n")
					break;
			System.out.println("Would you like to continue?");
				String noo = inputScan.next();
				if("Would you like to continue?"=="n")
					break;
				
		} 
			
			
		}while(true);
		
		
		}
	}	
	
	

