package com.package3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;

public interface InterEmployeeDAO {
	List<EmployeeEx> getEmployees();
	int addEmployee(EmployeeEx emp);
	void addEmployees(List<EmployeeEx> emp);
	int addEmployeesWithQueue(Queue<EmployeeEx> emp);
	EmployeeEx findEmployeeById(int eid);
	int addEmployeesWithMap(int key, EmployeeEx emp); 
	
	EmployeeEx updateEmployeeSalaryWithMap(int eid, double salary);
	Properties getEmployeesWithProperties();
	

}
