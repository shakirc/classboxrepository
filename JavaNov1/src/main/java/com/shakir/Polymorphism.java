package com.shakir;

class Operation{
	int addition(int num1,int num2) {
		return num1+num2;
	}
	double addition(double num1,double num2) {
		return num1+num2;
	}
}

class ArithmaticOperation extends Operation{
	int addition(int num1, int num2) {   //overrides the parent class 
		return num1+num2+10;
	}
	double addition(double num1, double num2) {
		return num1+num2+100;
	}
	String addition(String num1, String num2) {
		return num1+num2;
	}
}

class AdditionOperation extends ArithmaticOperation{
	int addition(int num1,int num2) {
		return num1+num2+20;
	}
	double addition(double num1,double num2) {
		return num1+num2+200;
	}
}

public class Polymorphism {  //many forms of methods,objects
	
	//first type- static poly/compile-time poly/early binding/overloading
	public static void main(String[] args) {
		Operation ao=new AdditionOperation();  //changing this line changes which class is selected(Operation,AdditionOperation,ArithmaticOperation)
		System.out.println(ao.addition(10,35)); //based on what value is put in the (), it will choose between the options
		
		
	}
	
}
