package aooled.orderSystem.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import aooled.orderSystem.model.User;
import aooled.orderSystem.utils.DBConnector;
import aooled.orderSystem.utils.MD5Util;

public class UserDAO {
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	private ParameterMetaData pmd;
	private String addSql = "insert into order_user("
			+ "us_username, us_password, us_name, us_sex, action_list, valid, us_time, us_code, us_character, us_logtime"
			+ ") value(?,?,?,?,?,?,?,?,?,?)"; 
	private String delSql = "delete from order_user where us_id = ?";
	private String getAllUserSql = "select * from order_user";
	private String varifySql = "select * from order_user where us_username = ? and us_password = ?";
	
	public static void main(String[] args) {
		
	}
	
	public UserDAO() {
		conn = DBConnector.getConnection();
	}
	
	public int userInsert(Object obj) {
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

	public int userDelete(Object obj) {
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

	public Map userSelect() {
		// TODO Auto-generated method stub
		Map<Object, User> map = new HashMap<>();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(getAllUserSql);
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("us_id"));
				user.setUsername((String)rs.getObject("us_username"));
				user.setName((String)rs.getObject("us_name"));
				user.setSex((String)rs.getObject("us_sex"));
				user.setAction((String)rs.getObject("action_list"));
				
				user.setValid((String)rs.getObject("valid"));
				user.setTime(rs.getInt("us_time"));
				user.setCode((String)rs.getObject("us_code"));
				user.setCharacter((String)rs.getObject("us_character"));
				user.setLogtime(rs.getInt("us_logtime"));
				map.put(rs.getInt("us_id"), user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

	public int userUpdate(String sql, Object obj) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	public boolean userVerify(User user) {
		// TODO Auto-generated method stub
		
		try {
			
			ps = conn.prepareStatement(varifySql);
			ps.setString(1, user.getUsername());
			ps.setString(2, MD5Util.getMD5(user.getPassword()));
			//System.out.println(MD5Util.getMD5(user.getPassword()));
			ResultSet rs = ps.executeQuery();
			rs.next();
			if(rs.getRow() > 0)
				return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
