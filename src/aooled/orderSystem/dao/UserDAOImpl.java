package aooled.orderSystem.dao;

import aooled.orderSystem.model.User;

public interface UserDAOImpl {
	
	public int userAdd(Object obj);
	
	public int userDel(Object obj);
	
	public User userSelect(String sql, Object obj);
	
	public int userUpdate(String sql, Object obj);
	
}
