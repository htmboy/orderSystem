package aooled.orderSystem.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aooled.orderSystem.model.User;
import aooled.orderSystem.utils.DBConnector;

public class UserDAO implements UserDAOImpl {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private ParameterMetaData pmd;
	private String addSql = "insert into order_user("
			+ "us_username, us_password, us_name, us_sex, action_list, valid, us_time, us_code, us_character, us_logtime"
			+ ") value(?,?,?,?,?,?,?,?,?,?)"; 
	private String delSql = "delete from order_user where us_id = ?";
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		User user = new User();
		// ≤‚ ‘addUser
//		user.setName("name");
//		user.setUsername("javva");
//		user.setPassword("1234565432");
//		user.setSex("1");
//		user.setAction("action");
//		user.setValid("1");
//		user.setTime(10984667);
//		user.setCode("E");
//		user.setCharacter("seller");
//		user.setLogtime(15399328);
//		System.out.println(dao.userAdd(user));
		// ≤‚ ‘delUser
		user.setId(21);
		System.out.println(dao.userDel(user));
		
	}
	
	public UserDAO() {
		conn = DBConnector.getConnection();
	}
	
	@Override
	public int userAdd(Object obj) {
		// TODO Auto-generated method stub
		int res = 0;
		try {
			ps = conn.prepareStatement(addSql);
			Class clazz = obj.getClass();
			
			ps.setString(1, (String) clazz.getMethod("getUsername", null).invoke(obj, null));
			ps.setString(2, (String) clazz.getMethod("getPassword", null).invoke(obj, null));
			ps.setString(3, (String) clazz.getMethod("getName", null).invoke(obj, null));
			ps.setString(4, (String) clazz.getMethod("getSex", null).invoke(obj, null));
			ps.setString(5, (String) clazz.getMethod("getAction", null).invoke(obj, null));
			ps.setString(6, (String) clazz.getMethod("getValid", null).invoke(obj, null));
			ps.setInt(7, (int) clazz.getMethod("getTime", null).invoke(obj, null));
			ps.setString(8, (String) clazz.getMethod("getCode", null).invoke(obj, null));
			ps.setString(9, (String) clazz.getMethod("getCharacter", null).invoke(obj, null));
			ps.setInt(10, (int) clazz.getMethod("getLogtime", null).invoke(obj, null));
			res = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int userDel(Object obj) {
		// TODO Auto-generated method stub
		int res = 0;
		try {
			ps = conn.prepareStatement(delSql);
			Class clazz = obj.getClass();
			ps.setInt(1, (int) clazz.getMethod("getId", null).invoke(obj, null));
			res = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public User userSelect(String sql, Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int userUpdate(String sql, Object obj) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
