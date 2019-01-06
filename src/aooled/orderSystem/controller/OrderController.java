package aooled.orderSystem.controller;

import javax.swing.JFrame;

import aooled.orderSystem.view.LoginView;

public class OrderController {

	public OrderController() {
		JFrame login = new LoginView();
		login.setVisible(true);
	}


}
