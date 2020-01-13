package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {
	private static String URL = "jdbc:oracle:thin:@localhost:1521:admin";
	private static String USER = "orauser01";
	private static String PASS = "user01";
	
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection(URL, USER, PASS);
		
		return c;
	}
}
