package com.shakir;

import java.util.Scanner;

public class CSAssignment {
	
	public static void main(String[] args) {
		
		Scanner inputScan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number =inputScan.nextInt();
		if(number >= 0 && number <= 50)
		{
			System.out.println("the electricity bill is less than $50");
		}
		else
		{
			
		}
		if(number >= 51 && number <= 100)
		{
			System.out.println("the electricity bill is between $51 and $100");
		}
		else
		{
			
		}
		if(number >= 101 && number <= 200)
		{
			System.out.println("the electricity bill is between $101 and $200");
		}
		else
		{
			
		}
		if(number >= 201 && number <= 400)
		{
			System.out.println("the electricity bill is between $201 and $400");
		}
		else
		{
			
		}
		if(number > 400) {
			System.out.println("the electricity bill is more than $400");
		}
		else
		{
			
		}
	}

	
}
