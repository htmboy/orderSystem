package aooled.orderSystem.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aooled.orderSystem.controller.OrderController;
import aooled.orderSystem.view.OrderMainView;

public class PersonalEvent implements ActionListener {

	private OrderController orderController;
	private OrderMainView orderMain;
	
	/**
	 * @param orderController
	 */
	public PersonalEvent(OrderMainView orderMain, OrderController orderController) {
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
