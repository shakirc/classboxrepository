package jdbc;

import java.util.List;

import com.package3.EmployeeEx;
import com.package3.InterEmployeeDAO;

public class ExClientApp1 {
	
	public static void main (String[] args) {
	InterEmployeeDAO empDAO = new NewEmployeeDAO();
	List<EmployeeEx> employeeList = empDAO.getEmployees();
	for (EmployeeEx employee : employeeList) {
		System.out.println(employee.getEmpID() +"\t"+ employee.getName() +"\t"+ employee.getSalary() +"\t"+ employee.getPassword() +"\t"+ employee.getDebtID());
			}

	}
	
}
