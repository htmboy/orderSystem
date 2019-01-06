package aooled.orderSystem.dao;

import aooled.orderSystem.model.User;

public interface UserDAOImpl {
	
	public int userAdd(Object obj);
	
	public int userDel(Object obj);
	
	public User userSel(Object obj);
	
	public int userUpd(String sql, Object obj);
	
}
