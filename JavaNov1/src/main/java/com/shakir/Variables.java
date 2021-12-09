package com.shakir;

public class Variables {  //each method is separated by the {}

	int num1=10; // instance variable(default variable) non-static
	//Any method declared outside the main method and inside the min method is instance/non static variables
	static int num2=20;  //static variable
	public static void main(String[] args) {    //Static method(main method)
		int num3=0;
		//TODO Auto-generated method stub
		Variables obj1=new Variables();  //How to create new objects
		obj1.num1=100;
		obj1.num2=200;
		System.out.println(obj1.num1); //100
		System.out.println("num2 value at obj1:"+obj1.num2); //200
		
		Variables obj2=new Variables(); //num1=10
	    System.out.println(obj2.num1);  //10
	    System.out.println("num2 value at obj2:"+obj2.num2);  //200
	    obj2.num2=2000;  //2000
	    
	    System.out.println("num2 value at obj1:"+obj1.num2); //2000
	    System.out.println("num2 value at obj2:"+obj2.num2); //2000
	    
	    obj2.method1(20.20,1000);  //This is how to use other methods within the main method
	    System.out.println(Variables.num2);   //able to access the static variable
	    System.out.println(num3);
	}
	
	void method1(double num5, long num6) { //This is a secondary method, so it will not run without being in the main method 
		int num4=40;
		num1=1000;
		System.out.println(num4+num5+num6);  //1000
		Variables.method2(); 
	}
	
	static void method2() {    //Static method is prioritized
		System.out.println("this is method 2");
		//Variables obj3=new Variables();
		//obj3.method1();
	}
	
	static {     //(Memory allocation)This block will be executed first, followed by the static main method, followed by the other methods.
		System.out.println("this is a static block");
		
	}
	
	static {
		System.out.println("this sucks, i dont understand");
	}
	
}
