package com.shakir;

public abstract class NewBank implements InterBank{   //implements- how to take code from other interfaces
//abstract- partial implementation
	//because the mini statement is not within this code and is within a different class, it is partial
	public NewBank() { //parent class constrictor is called first, then the child constructor 
		System.out.println("a constructor within an abstract class");
	}

	@Override
	public int createAccount(String name, int id, String pan) {
		// TODO Auto-generated method stub
		System.out.println("The account is created");
		return 0;
	}

	@Override
	public boolean creditAmount(int accountName, double amount) {
		// TODO Auto-generated method stub
		System.out.println("The amount has been credited");
		return false;
	}

	@Override
	public boolean transferAmount(int fromAccount, int toAccount, double amount) {
		// TODO Auto-generated method stub
		System.out.println("The money has been transfered");
		return false;
	}

}
