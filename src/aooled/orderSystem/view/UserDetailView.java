package aooled.orderSystem.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class UserDetailView extends JFrame {
	
	private JTextField usernameField;
	private JTextField nameField;
	private JTextField sexField;
	private JTextField actionListField;
	private JTextField validField;
	private JTextField timeField;
	private JTextField codeField;
	private JTextField characterField;
	private JTextField logTimeField;
	
	
	public UserDetailView() {

		setSize(new Dimension(800, 600));

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel_1 = new JPanel();
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JPanel panel_2 = new JPanel();
		
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u4E2A\u4EBA\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		
		JPanel panel_10 = new JPanel();
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		
		usernameField = new JTextField();
		usernameField.setEditable(false);
		usernameField.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D\uFF1A");
		panel_9.add(lblNewLabel_1);
		
		nameField = new JTextField();
		panel_9.add(nameField);
		nameField.setEditable(false);
		nameField.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		
		JLabel lblNewLabel_2 = new JLabel("\u6027\u522B\uFF1A");
		panel_8.add(lblNewLabel_2);
		
		sexField = new JTextField();
		panel_8.add(sexField);
		sexField.setEnabled(true);
		sexField.setEditable(false);
		sexField.setText("");
		sexField.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		
		JLabel lblNewLabel_3 = new JLabel("\u6743\u9650\uFF1A");
		panel_7.add(lblNewLabel_3);
		
		actionListField = new JTextField();
		panel_7.add(actionListField);
		actionListField.setEditable(false);
		actionListField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		
		JLabel lblNewLabel_4 = new JLabel("\u8D26\u53F7\u72B6\u6001\uFF1A");
		panel_6.add(lblNewLabel_4);
		
		validField = new JTextField();
		panel_6.add(validField);
		validField.setEditable(false);
		validField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		
		JLabel lblNewLabel_5 = new JLabel("\u8D26\u53F7\u521B\u5EFA\u65F6\u95F4\uFF1A");
		panel_4.add(lblNewLabel_5);
		
		timeField = new JTextField();
		timeField.setEditable(false);
		panel_4.add(timeField);
		timeField.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		
		JLabel lblNewLabel_6 = new JLabel("\u7528\u6237\u4EE3\u7801\uFF1A");
		panel_12.add(lblNewLabel_6);
		
		codeField = new JTextField();
		codeField.setEditable(false);
		panel_12.add(codeField);
		codeField.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		
		JLabel lblNewLabel_7 = new JLabel("\u804C\u4F4D\uFF1A");
		panel_13.add(lblNewLabel_7);
		
		characterField = new JTextField();
		characterField.setEditable(false);
		panel_13.add(characterField);
		characterField.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		
		JLabel lblNewLabel_8 = new JLabel("\u6700\u8FD1\u767B\u5F55\u65F6\u95F4\uFF1A");
		panel_14.add(lblNewLabel_8);
		
		logTimeField = new JTextField();
		logTimeField.setEditable(false);
		panel_14.add(logTimeField);
		logTimeField.setColumns(10);
		FlowLayout fl_panel_2 = new FlowLayout(FlowLayout.LEFT, 5, 5);
		fl_panel_2.setAlignOnBaseline(true);
		panel_2.setLayout(fl_panel_2);
		panel_2.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_10.add(lblNewLabel);
		panel_10.add(usernameField);
		panel_2.add(panel_9);
		panel_2.add(panel_8);
		panel_2.add(panel_7);
		panel_2.add(panel_6);
		panel_2.add(panel_4);
		panel_2.add(panel_12);
		panel_2.add(panel_13);
		panel_2.add(panel_14);
		
		JPanel panel_5 = new JPanel();
		getContentPane().add(panel_5, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\u786E \u5B9A");
		panel_5.add(btnNewButton);
		
		setVisible(true);
	}
	
	

	public JTextField getUsernameField() {
		return usernameField;
	}



	public JTextField getNameField() {
		return nameField;
	}



	public JTextField getSexField() {
		return sexField;
	}



	public JTextField getActionListField() {
		return actionListField;
	}



	public JTextField getValidField() {
		return validField;
	}



	public JTextField getTimeField() {
		return timeField;
	}



	public JTextField getCodeField() {
		return codeField;
	}



	public JTextField getCharacterField() {
		return characterField;
	}



	public JTextField getLogTimeField() {
		return logTimeField;
	}



	public void setUsernameField(JTextField usernameField) {
		this.usernameField = usernameField;
	}



	public void setNameField(JTextField nameField) {
		this.nameField = nameField;
	}



	public void setSexField(JTextField sexField) {
		this.sexField = sexField;
	}



	public void setActionListField(JTextField actionListField) {
		this.actionListField = actionListField;
	}



	public void setValidField(JTextField validField) {
		this.validField = validField;
	}



	public void setTimeField(JTextField timeField) {
		this.timeField = timeField;
	}



	public void setCodeField(JTextField codeField) {
		this.codeField = codeField;
	}



	public void setCharacterField(JTextField characterField) {
		this.characterField = characterField;
	}



	public void setLogTimeField(JTextField logTimeField) {
		this.logTimeField = logTimeField;
	}



}
