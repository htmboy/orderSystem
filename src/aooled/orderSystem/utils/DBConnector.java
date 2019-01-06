package aooled.orderSystem.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;


public class DBConnector {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String username = "htmboy";
	private static String password = "htmboy8@MSN.com";
	private static String url = "jdbc:mysql://139.199.77.144:3306/aooled_order";
	private static Connection conn;
	private static BasicDataSource bds;
	
	static
	{
		try {
			
			bds = new BasicDataSource();
			bds.setUrl(url);
			bds.setDriverClassName(driver);
			bds.setUsername(username);
			bds.setPassword(password);

		} catch(Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	
	public synchronized static Connection getConnection() {
		
		try {
			if(conn == null)
				conn = bds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	// ≤‚ ‘
//	public static void main(String[] args) throws SQLException {
//		Connection conn = DBConnector.getConnection();
//		String sql = "select * from order_user where us_id < 20";
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery(sql);
//		while(rs.next()) {
//			System.out.println(rs.getObject(1)+"\t" + rs.getObject(2) +"\t"+ rs.getObject(3) +"\t"+ rs.getObject(4));
//		}
//	}

}
