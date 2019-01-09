package aooled.orderSystem.dao;

import aooled.orderSystem.model.User;

public interface UserDAOImpl {
	
	public int userInsert(Object obj);
	
	public int userDelete(Object obj);
	
	public User userSelect(Object obj);
	
	public int userUpdate(String sql, Object obj);
	
	public boolean userVerify(User user);
	
}
