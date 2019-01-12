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

import aooled.orderSystem.dao.OrderDAO;
import aooled.orderSystem.dao.UserDAO;
import aooled.orderSystem.event.LoginEvent;
import aooled.orderSystem.event.OrderMainEvent;
import aooled.orderSystem.event.OrdersEvent;
import aooled.orderSystem.event.PersonalEvent;
import aooled.orderSystem.model.Order;
import aooled.orderSystem.model.User;
import aooled.orderSystem.view.LoginView;
import aooled.orderSystem.view.OrderListView;
import aooled.orderSystem.view.OrderMainView;
import aooled.orderSystem.view.UserListView;

public class OrderController {
	private UserDAO userDao;
	private LoginView loginView;
	private UserListView userCenterView;
	private OrderMainView orderMainView;
	private OrderListView orderListView;
	
	public OrderController() {
		userDao = new UserDAO();
		loginView = new LoginView();
		new LoginEvent(loginView, this);
		
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
		orderMainView = new OrderMainView();
		new OrderMainEvent(orderMainView, this);

		userCenterView = new UserListView(orderMainView);
		orderListView = new OrderListView(orderMainView);
		orders();
	}
	
	public void removeView() {
		try {
			orderMainView.remove(orderListView);
			orderMainView.remove(userCenterView);
		}catch(Exception e){
			
		}
		
	}
	
	
	public void personal() {

		DefaultTableModel tableModel = (DefaultTableModel) userCenterView.getMainTableModel();
		tableModel.setRowCount(0);
		Map userMap = new UserDAO().userSelect();
		Iterator<Map> it = userMap.entrySet().iterator();
		Vector v;
		while(it.hasNext()) {
			Map.Entry<Object, User> entry = (Entry<Object, User>) it.next();
			User user = entry.getValue();
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
			tableModel.addRow(v);
		}
		removeView();
		orderMainView.add(userCenterView);
		orderMainView.revalidate();
		
	}
	
	public void orders() {

		DefaultTableModel tableModel = (DefaultTableModel) orderListView.getMainTableModel();
		tableModel.setRowCount(0);
		Map orderMap = new OrderDAO().orderSelect();
		Iterator<Map> it = orderMap.entrySet().iterator();
		Vector v;
		while(it.hasNext()) {
			Map.Entry<Object, Order> entry = (Entry<Object, Order>) it.next();
			Order order = entry.getValue();
			v = new Vector();
			v.add(order.getOrId());
			v.add(order.getUsId());
			v.add("1".equals(order.getDistribution()) ? "������" : "�Ǿ�����");
			v.add("1".equals(order.getOrAssurance()) ? "�ʱ���" : "���ʱ���");
			v.add("1".equals(order.getSpecialOffer()) ? "�����ؼ�" : "�������ؼ�");
			v.add(new SimpleDateFormat("yyyy-MM-dd").format(new Date(Long.valueOf(order.getFillDate()+"000"))));
			v.add(order.getOrderNumber());
			v.add("1".equals(order.getSimpleOrder()) ? "��Ʒ����" : "����Ʒ����");
			v.add(order.getContractNum());
			v.add(order.getOrderStatus());
			v.add("1".equals(order.getConstruction()) ? "ʩ����" : "��ʩ����");
			v.add("1".equals(order.getBorrowData()) ? "������" : "�ǽ�����");
			v.add("1".equals(order.getOrCancel()) ? "ȡ��" : "����");
			v.add(order.getGoodsNum());
			tableModel.addRow(v);
		}
		removeView();
		orderMainView.add(orderListView);
		orderMainView.revalidate();
		
	}
	
}
