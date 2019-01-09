package aooled.orderSystem.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aooled.orderSystem.controller.OrderController;
import aooled.orderSystem.view.OrderMain;

public class PersonalEvent implements ActionListener {

	private OrderController orderController;
	private OrderMain orderMain;
	
	/**
	 * @param orderController
	 */
	public PersonalEvent(OrderMain orderMain, OrderController orderController) {
		super();
		this.orderMain = orderMain;
		this.orderController = orderController;
		orderMain.getPersonalButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		orderController.personal();
	}

}
