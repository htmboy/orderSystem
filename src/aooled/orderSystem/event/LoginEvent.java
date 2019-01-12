package aooled.orderSystem.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

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
		loginView.getUserNameField().addKeyListener(this);
		loginView.getPasswordField().addKeyListener(this);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		loginAction();
	}


	public void loginAction() {
		String username = loginView.getUserNameField().getText();
		String password = new String(loginView.getPasswordField().getPassword());
		if("".equals(username)) {
			JOptionPane.showMessageDialog(loginView, "请输入用户名", "登录提示", JOptionPane.WARNING_MESSAGE);
			loginView.getUserNameField().requestFocus();
			return;
		}
		if("".equals(password)) {
			JOptionPane.showMessageDialog(loginView, "请输入密码", "登录提示", JOptionPane.WARNING_MESSAGE);
			loginView.getPasswordField().requestFocus();
			return;
		}
		orderController.login(username, password);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		if(e.getKeyChar() == KeyEvent.VK_ENTER) {
			loginAction();
		}
		
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
