package aooled.orderSystem.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import aooled.orderSystem.event.LoginEvent;

import javax.swing.BoxLayout;

public class LoginView extends JFrame {
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private int iconHeight;
	private int iconWidth;

	
	public JTextField getUserNameField() {
		return userNameField;
	}
	public JPasswordField getPasswordField() {
		return passwordField;
	}
	public JButton getLoginButton() {
		return loginButton;
	}
	public LoginView() {
		
		// ��ȡͼƬ�ߴ�
		ImageIcon imageicon = new ImageIcon("C:\\Users\\aooled-laptop\\eclipse-workspace\\OrderSystem\\resource\\logo.png");
		iconWidth = (int)(imageicon.getIconWidth() * 0.8);
		iconHeight = imageicon.getIconHeight();
		
		// ���ô��ڴ�С
		setTitle("Login");
		setSize(iconWidth * 2 + 14, iconHeight * 5);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		// ���ô��ھ�����ʾ
		int windowWidth = getWidth(); // ��ô��ڿ�   
		int windowHeight = getHeight(); // ��ô��ڸ�   
		Toolkit kit = Toolkit.getDefaultToolkit(); // ���幤�߰�   
		Dimension screenSize = kit.getScreenSize(); // ��ȡ��Ļ�ĳߴ�   
		int screenWidth = screenSize.width; // ��ȡ��Ļ�Ŀ�   
		int screenHeight = screenSize.height; // ��ȡ��Ļ�ĸ�   
		setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2 - windowHeight / 2);
		getContentPane().setLayout(null);
		
		
		// logo��
		JPanel panel_logo = new JPanel();
		FlowLayout fl_panel_logo = (FlowLayout) panel_logo.getLayout();
		panel_logo.setLocation(0, 0);
		panel_logo.setSize(iconWidth * 2, iconHeight + 10);
		JLabel lblNewLabel_2 = new JLabel("");
		panel_logo.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(imageicon);
		getContentPane().add(panel_logo);
		
		// ����
		JPanel panel_field = new JPanel();
		panel_field.setBounds(0, panel_logo.getHeight(), iconWidth * 2, iconHeight * 2);
		getContentPane().add(panel_field);
		panel_field.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel_field.add(panel);
		FlowLayout fl_panel = new FlowLayout(FlowLayout.CENTER, 5, 40);
		panel.setLayout(fl_panel);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		userNameField = new JTextField();
		panel.add(userNameField);
		userNameField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_field.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel(" \u5BC6 \u7801\uFF1A");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		panel_1.add(passwordField);
		passwordField.setSize(userNameField.getWidth(), userNameField.getHeight());
		
		// ��ť��
		JPanel panel_button = new JPanel();
		loginButton = new JButton("\u767B \u5F55");
		panel_button.setBounds(0, panel_logo.getHeight() + panel_field.getHeight(), iconWidth * 2, 40);
		getContentPane().add(panel_button);
		
		panel_button.add(loginButton);
		
	}
	public static void main(String[] args) {
		new LoginView().setVisible(true);
	}
}
