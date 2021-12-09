package com.shakir;

//interfaces are a service specification/class provides the implementation
//interfaces hold the coding while classes provide the execution of the code that is being implemented
//very important for projects
//able to control everything from the interface
//interfaces and abstract classes can not be instantiated(cannot create an object) - "classname" "objectname"=new "classname"

public interface InterBank {
	double rateOgInterest=11.99; //public static final
	int createAccount(String name,int id, String pan);  //public / abstract method
	boolean creditAmount(int accountName, double amount);
	boolean transferAmount(int fromAccount, int toAccount, double amount);
	String [] miniStatement(int accountNum);
	
	static void educationLoan() {  
		System.out.println("this is an education loan");
	}
	
	public static void main(String[] args) { //this is the beginning to the execution of the actual code
		InterBank nb1=new NewBankChild();   //the execution of the code/constructor
		nb1.createAccount("Shakir", 28, "28pan");
		nb1.creditAmount(28, 100);
		nb1.transferAmount(100, 28, 1000);
		nb1.miniStatement(3281998);
		InterBank.educationLoan();
		
		
	}
	 
}
