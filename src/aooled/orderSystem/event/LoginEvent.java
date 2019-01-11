package aooled.orderSystem.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import aooled.orderSystem.controller.OrderController;
import aooled.orderSystem.view.LoginView;

public class LoginEvent implements ActionListener, KeyListener {

	private OrderController orderController;
	private LoginView loginView;
	
	
	/**
	 * @param loginView
	 */
	public LoginEvent(LoginView loginView, OrderController orderController) {
		super();
		this.loginView = loginView;
		this.orderController = orderController;
		loginView.getLoginButton().addActionListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String username = loginView.getUserNameField().getText();
		String password = new String(loginView.getPasswordField().getPassword());
		orderController.login(username, password);
	}



	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e);
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
