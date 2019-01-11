package aooled.orderSystem.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aooled.orderSystem.controller.OrderController;
import aooled.orderSystem.view.OrderListView;
import aooled.orderSystem.view.OrderMainView;

public class OrdersEvent implements ActionListener {

	private OrderController orderController;
	private OrderMainView orderMain;
	
	
	/**
	 * @param orderController
	 */
	public OrdersEvent(OrderMainView orderMain, OrderController orderController) {
		super();
		this.orderMain = orderMain;
		this.orderController = orderController;
		orderMain.getOrderAddButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		orderController.orders();
	}

}
