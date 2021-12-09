package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCDemo1 {
	
	public static void main(String[] args) {
		try { //try-catch for the exception that appears in the driver register line 
		//step 1. Register/load the driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		//step 2. Get the connection from the database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javaNov1", "root", "root");
		//step 3. Get the statement object which is used to send the  SQL queries to the database
		java.sql.Statement statement1 = connection.createStatement();
		//step 4. Execute the query
		ResultSet resultset1 = statement1.executeQuery("select EMPLOYEE_ID, EMPLOYEE_NAME, SALARY, PASSWORD, DEPT_ID FROM EMPLOYEE");
		while(resultset1.next()) {
			System.out.println(resultset1.getInt("EMPLOYEE_ID")+"\t"+resultset1.getString("EMPLOYEE_NAME")+"\t"+resultset1.getFloat("SALARY")+"\t"+resultset1.getString("PASSWORD")+"\t"+resultset1.getInt("DEPT_ID"));
		}
		//step 5. Close the connection
		connection.close();
		
		}catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
