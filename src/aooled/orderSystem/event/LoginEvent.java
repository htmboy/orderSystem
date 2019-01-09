package aooled.orderSystem.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.swing.JButton;

import aooled.orderSystem.controller.OrderController;
import aooled.orderSystem.view.LoginView;

public class LoginEvent implements ActionListener {

	private OrderController orderController;
	private LoginView loginView;
	private boolean loginPassed = false;
	
	
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
	
	public boolean isLoginPassed() {
		return loginPassed;
	}

}
