package com.shakir;

public class Properties { //class = a template/plan
	String hand; //the properties/value
	String eyes;
	
	Properties(){ //constructor-any block with the class name, this will be executed once the object is created(default constructor)
		System.out.println("object has been created");
	}
	Properties (int num1){ //parameterized constructor
		System.out.println(num1);
	}
	
	int addition(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
	
	void write() {  //the behavior/method
		System.out.println("writing with"+ hand);
	}
	
	void see() {
		System.out.println("seeing with"+eyes);
	}
	
	public static void main(String[] args) {
		Properties Shakir=new Properties(20+60); //a new object= instance(memory allocation) 
		Properties Campbell=new Properties();
		System.out.println(Shakir);
		System.out.println(Campbell);
		System.out.println(Shakir.addition(10, 20));
		Shakir.write();
		Shakir.see();
	}

}
