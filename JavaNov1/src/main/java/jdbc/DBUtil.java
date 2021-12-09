package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
//DB - database
	static Connection getDBConnection() {
		Connection connection = null;
		try { //try-catch for the exception that appears in the driver register line 
			//step 1. Register/load the driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step 2. Get the connection from the database
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javaNov1", "root", "root");
		}catch (SQLException e) {
			//TODO Auto-generated catch stack 
			e.printStackTrace();
		}
	
		return connection;
}
}