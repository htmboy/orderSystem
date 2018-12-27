package aooled.orderSystem.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
	private String driver;
	private String username;
	private String password;
	private String url;
	private static Connection conn;
	private static DBConnector instance = new DBConnector();
	
	private DBConnector(){
		try {
			InputStream is = DBConnector.class.getClassLoader().getResourceAsStream("config.properties");
			Properties prop = new Properties();
			prop.load(is);
			is.close();
			driver = prop.getProperty("sqlDriver");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			url = prop.getProperty("url");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	
	public static Connection getConnection() {
		return instance.conn;
	}
	
	public static void freeConnection(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ≤‚ ‘
	public static void main(String[] args) {
		System.out.println(DBConnector.getConnection());;
	}

}
