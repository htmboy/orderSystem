package aooled.orderSystem.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import aooled.orderSystem.controller.OrderController;
import aooled.orderSystem.view.OrderListView;
import aooled.orderSystem.view.UserListView;

public class TableMouseEvent extends MouseAdapter {

	private JTable table;
	private Method method;
	private Object obj;
	private OrderController orderController;
	/**
	 * @param component
	 */
	public TableMouseEvent(Object obj, OrderController orderController) {
		super();
		try {
			this.obj = obj;
			this.method = obj.getClass().getMethod("getTable");
			table = (JTable) method.invoke(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.orderController = orderController;
		table.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		super.mouseClicked(e);
		if(e.getClickCount() == 2) {
			if(obj instanceof OrderListView) {
				orderController.orderDetail((int) table.getValueAt(table.getSelectedRow(), 0));
				
			}
			if(obj instanceof UserListView) {
				orderController.userDetail((int) table.getValueAt(table.getSelectedRow(), 0));
				
			}
			
		}
	}

	
}
