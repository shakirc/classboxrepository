package com.package3;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Queue;

public class EmployeeDAOEx implements InterEmployeeDAO  {
	Queue<EmployeeEx> employeeQueue= new PriorityQueue<EmployeeEx>();
	Map<Integer,EmployeeEx> empMap1=new HashMap();
	
	public List<EmployeeEx> getEmployees() {
	
	EmployeeEx employee1=new EmployeeEx();
	employee1.setEmpID(28);
	employee1.setDebtID(20);
	employee1.setName("Shakir");
	employee1.setSalary(1000.90);
	
	EmployeeEx employee2=new EmployeeEx();
	employee2.setEmpID(10);
	employee2.setDebtID(30);
	employee2.setName("Tamiko");
	employee2.setSalary(1000.90);
	
	EmployeeEx employee3=new EmployeeEx();
	employee3.setEmpID(11);
	employee3.setDebtID(20);
	employee3.setName("Tony");
	employee3.setSalary(1000.90);
	
	List<EmployeeEx> empList=new LinkedList<EmployeeEx>();
	empList.add(employee1);
	empList.add(employee2);
	empList.add(employee3);
	
	return empList;	
}

	@Override
	public void addEmployee(EmployeeEx emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEmployees(List<EmployeeEx> emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addEmployeesWithQueue(Queue<EmployeeEx> emp) {
		// TODO Auto-generated method stub
		for(EmployeeEx employee : employeeQueue) { //extracting the employee from incoming queue
			employeeQueue.add(employee); //adding employee to the main queue
		}
		return employeeQueue.size();
	}

	@Override
	public EmployeeEx findEmployeeById(int eid) {
		// TODO Auto-generated method stub
		EmployeeEx emp2=new EmployeeEx();
		for (EmployeeEx employee : employeeQueue) {
			if (employee.getEmpID()==eid) {
				emp2.setEmpID(employee.getEmpID());
				emp2.setDebtID(employee.getDebtID());
				emp2.setName(employee.getName());
				emp2.setSalary(employee.getSalary());
			}
		}
		return emp2;
	}

	@Override
	public EmployeeEx updateEmployeeSalaryWithMap(int keyId, double salary) {
		// TODO Auto-generated method stub
		EmployeeEx employee = empMap1.get(keyId); //locating the employee object
		employee.setSalary(salary);          //updating the employee object
		System.out.println(keyId + "\tis updated");
		return employee;
	}

	@Override
	public int addEmployeesWithMap(int key, EmployeeEx emp) { //this adds the employees into the Map object
		// TODO Auto-generated method stub
		empMap1.put(key,  emp);
		System.out.println("emp"+key+"\tis added");
		return empMap1.size();
	}

	@Override
	public Properties getEmployeesWithProperties() {
		// TODO Auto-generated method stub
		Properties  empData= new Properties();
		
		try {
			empData.load(new FileReader("employee.properties"));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return empData;
	}

}

