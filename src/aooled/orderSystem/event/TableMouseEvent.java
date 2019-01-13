package aooled.orderSystem.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import aooled.orderSystem.controller.OrderController;

public class TableMouseEvent extends MouseAdapter {

	private JTable table;
	private OrderController orderController;
	/**
	 * @param component
	 */
	public TableMouseEvent(JTable table, OrderController orderController) {
		super();
		this.table = table;
		this.orderController = orderController;
		table.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		super.mouseClicked(e);
		if(e.getClickCount() == 2) {
			System.out.println(table.getValueAt(table.getSelectedRow(), 0));
			
		}
	}

	
}
