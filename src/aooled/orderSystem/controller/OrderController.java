package aooled.orderSystem.controller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import aooled.orderSystem.dao.UserDAO;
import aooled.orderSystem.event.LoginEvent;
import aooled.orderSystem.model.User;
import aooled.orderSystem.view.LoginView;
import aooled.orderSystem.view.OrderMain;

public class OrderController {
	private UserDAO userDao;
	private LoginView loginView;
	private OrderMain orderMain;

	public OrderController() {
		userDao = new UserDAO();
		LoginView loginView = new LoginView();
		loginView.setVisible(true);
		LoginEvent loginEvent = new LoginEvent(loginView, this);
		
	}
	
	public void login(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		if(userDao.userVerify(user))
		 {
			JOptionPane.showMessageDialog(loginView, "登录成功");
			loginView.dispose();
			orderMain();
		}else {
			JOptionPane.showMessageDialog(loginView, "用户名或密码错误！");
		}
		
	}
	
	public void orderMain() {
		OrderMain om = new OrderMain();
		DefaultTableModel tm = (DefaultTableModel) om.getMainTableModel();
		
		Map userMap = new UserDAO().userSelect();
		Iterator<Map> it = userMap.entrySet().iterator();
		Vector v;
		while(it.hasNext()) {
			Map.Entry<Object, User> entry = (Entry<Object, User>) it.next();
			User user = entry.getValue();
			Method[] methods = user.getClass().getMethods();
			v = new Vector();
			v.add(user.getId());
			v.add(user.getName());
			v.add("1".equals(user.getSex()) ? "男" : "女");
			v.add(user.getAction());
			v.add("1".equals(user.getValid()) ? "在职" : "已离职");
			v.add(new SimpleDateFormat("yyyy-MM-dd").format(new Date(Long.valueOf(user.getTime()+"000"))));
			v.add(user.getCode());
			v.add(user.getCharacter());
			v.add("0".equals(user.getLogtime()) ? "未登录" : new SimpleDateFormat("yyyy-MM-dd").format(new Date(Long.valueOf(user.getLogtime()+"000"))));
			tm.addRow(v);
		}
		om.setVisible(true);

		
	}
	
	public static void main(String[] args) {
		new OrderController().orderMain();
	}


}
