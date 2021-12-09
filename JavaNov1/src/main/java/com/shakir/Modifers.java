package com.shakir;


public class Modifers {
	//modifiers are key words that can modify the scope/visibility of java members
	//modifiers - public,private,default,abstract,final,protected,static,transient,synchronized,
	//import - importing from different packages
	//if there is not modifier, default will be used and can be accessed within the same package
	//public - can be accessed within all packages
	//protected - can access within the same package(child classes in other packages can access)
	//final - cannot reassign a value to a final variable/acts as a constant(cannot be inherited/extend)but can create objects
	//static - only one copy is maintained/static blocks are executed before the main modifier 
	//volatile - frequently changes the value
	//transient - stops the instance variables from participating in the serialization process(moves the state of the object into the streams)
	//synchronized - (applied before the method)sequential access/stops a deadlock
	//classes start with uppercase, keywords/objects start with lowercase, identifiers should be specific(no shortcuts)
	public int num1=20;
	public static void main(String[] args) {
		
		
		
	}

}
