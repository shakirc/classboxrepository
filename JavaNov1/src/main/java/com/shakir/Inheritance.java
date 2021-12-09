package com.shakir;
//this() constructor and super() constructor
class Parent { //single inheritance=one parent and one child
	
	Parent(){ //this is a constructor Parent constructor gains priority over the child constructor 
		super();
		System.out.println("Parent 0-param constructor");
	}
	Parent(String name){
		super();
		System.out.println("Parent string-param constructor");
	}
	Parent(int num){
		super();
		System.out.println("Parent int-param constructor");
	}
	
	int num1=10;
	int	addition(int num1, int num2) {
		return num1+num2+200;
	}
}
class Child extends Parent {
	
	Child(){  //this is an constructor
		//this() is used to access constructors from other constructors 
		System.out.println("Child 0-param constructor");
	}
	Child(int number){
		super("yes");
		System.out.println("Child int-param constructor");
	}
	Child(double number){
		this();
		System.out.println("Child double-param constructor");
	}
	
	int num1=100; //instance variables
	int num2=500;
	int addition(int num1, int num2) {
		return num1+num2+10;
	}
	void division(int num1) {
		this.num1=num1; //local variable
	    int num2=50;
		System.out.println(this.num1); //this - keyword to differenciate instance variables (this value would be 1000)
		System.out.println(super.num1);	// 10 - the super keyword differenciates the parent class instance variable
		System.out.println(num1); // 1050
		System.out.println(num2); //50
		System.out.println(this.num2); //500
		System.out.println(super.addition(10, 30));
		
	}

}
		
//multi=multiple,multilevel
/*
  class A{
  
  }
  class B{
  
  }
  class C extents A,B{
  
  } 
                     */
//multilevel inheritance
/*class A{}
class B extends A{}
class C extends B{}*/

	public class Inheritance{
		
		public static void main(String[] args) {
		//TODO Auto-generated method stub
		Child  child1=new Child(20);
	/*	System.out.println(child1.num1); //this gets priority
		child1.division(1050); */
		
		
	}

	}	
	


