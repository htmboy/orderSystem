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
import aooled.orderSystem.event.OrderAddEvent;
import aooled.orderSystem.event.PersonalEvent;
import aooled.orderSystem.model.User;
import aooled.orderSystem.view.LoginView;
import aooled.orderSystem.view.OrderMain;
import aooled.orderSystem.view.UserCenterView;

public class OrderController {
	private UserDAO userDao;
	private LoginView loginView;
	private UserCenterView userCenterView;
	private OrderMain om;
	
	public OrderController() {
		userDao = new UserDAO();
		loginView = new LoginView();
		loginView.setVisible(true);
		LoginEvent loginEvent = new LoginEvent(loginView, this);
		
	}
	
	public void login(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		if(userDao.userVerify(user))
		 {
			JOptionPane.showMessageDialog(loginView, "��¼�ɹ�");
			loginView.dispose();
			orderMain();
		}else {
			JOptionPane.showMessageDialog(loginView, "�û������������");
		}
		
	}
	
	public void orderMain() {
		om = new OrderMain();
		new OrderAddEvent(om, this);
		new PersonalEvent(om, this);
		om.setVisible(true);

		
	}
	
	public void removeView() {
		try {
			
			om.remove(userCenterView.getScrollPane());
		}catch(Exception e){
			
		}
		
	}
	
	
	public void personal() {

		userCenterView = new UserCenterView(om);
		
		
		DefaultTableModel tm = (DefaultTableModel) userCenterView.getMainTableModel();
		
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
			v.add("1".equals(user.getSex()) ? "��" : "Ů");
			v.add(user.getAction());
			v.add("1".equals(user.getValid()) ? "��ְ" : "����ְ");
			v.add(new SimpleDateFormat("yyyy-MM-dd").format(new Date(Long.valueOf(user.getTime()+"000"))));
			v.add(user.getCode());
			v.add(user.getCharacter());
			v.add("0".equals(user.getLogtime()) ? "δ��¼" : new SimpleDateFormat("yyyy-MM-dd").format(new Date(Long.valueOf(user.getLogtime()+"000"))));
			tm.addRow(v);
		}
		removeView();
		om.add(userCenterView.getScrollPane());
		userCenterView.getScrollPane().repaint();
		om.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new OrderController().orderMain();
	}


}
