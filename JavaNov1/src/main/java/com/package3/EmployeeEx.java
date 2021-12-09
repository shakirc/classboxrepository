package com.package3;
//Javavbean = reusable component
//very important
public class EmployeeEx {
	private int empID; 
	private String name;
	private float salary;
	private String password;
	private int debtID;
	
	public EmployeeEx() {
		//TODO Auto-generated method stub
	}
	public EmployeeEx(int empID, String name, float salary, int debtID) {
		this.empID=empID;
		this.name=name;
		this.salary=salary;
		this.debtID=debtID;
		//TODO Auto-generated method stub
	}
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getDebtID() {
		return debtID;
	}
	public void setDebtID(int debtID) {
		this.debtID = debtID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}



