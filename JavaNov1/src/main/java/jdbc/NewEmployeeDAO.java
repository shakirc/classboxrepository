package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Queue;

import com.package3.EmployeeEx;
import com.package3.InterEmployeeDAO;

//12/02/2021 class
public class NewEmployeeDAO implements InterEmployeeDAO{

	@Override
	public List<EmployeeEx> getEmployees() {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getDBConnection();
		List<EmployeeEx> empList=null;
		try {
		//step 3. Get the statement object which is used to send the  SQL queries to the database
				Statement statement1 = connection.createStatement();
				//step 4. Execute the query
				ResultSet resultset1 = statement1.executeQuery("select EMPLOYEE_ID, EMPLOYEE_NAME, SALARY, PASSWORD, DEPT_ID FROM EMPLOYEE");
				empList = new ArrayList<EmployeeEx>();
				while(resultset1.next()) {
					EmployeeEx emp = new EmployeeEx();
					emp.setEmpID(resultset1.getInt("EMPLOYEE_ID"));
					emp.setName(resultset1.getString("EMPLOYEE_NAME"));
					emp.setSalary(resultset1.getFloat("SALARY"));
					emp.setPassword(resultset1.getString("PASSWORD"));
					emp.setDebtID(resultset1.getInt("DEPT_ID"));
					empList.add(emp);
				}
				connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public int addEmployee(EmployeeEx emp) {
		// TODO Auto-generated method stub
		Connection connection = DBUtil.getDBConnection();
		int recordPlaced = 0;
		try {
			//step 3. Get the statement object which is used to send the  SQL queries to the database
					Statement statement1 = connection.createStatement();
					recordPlaced = statement1.executeUpdate("insert into EMPLOYEE(EMPLOYEE_ID, EMPLOYEE_NAME, SALARY, PASSOWRD, DEPT_ID)values("+emp.getEmpID()+",'"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getPassword()+"',"+emp.getDebtID()+")");
					connection.close();
		}catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordPlaced;
		
	}

	@Override
	public void addEmployees(List<EmployeeEx> emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addEmployeesWithQueue(Queue<EmployeeEx> emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeEx findEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addEmployeesWithMap(int key, EmployeeEx emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeEx updateEmployeeSalaryWithMap(int eid, double salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getEmployeesWithProperties() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
