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
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class OrderDetailView extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	public OrderDetailView() {
		setSize(new Dimension(800, 400));
		JPanel panel_1 = new JPanel();
		getContentPane().setLayout(new BorderLayout(0, 0));
//		panel.setAutoscrolls(true);
//		JScrollPane scrollPane = new JScrollPane();
//		 scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//		 scrollPane.getHorizontalScrollBar().setAutoscrolls(false);
//		 scrollPane.setPreferredSize(new Dimension(800, 0));
//		getContentPane().add(scrollPane);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
				
		JPanel panel_2 = new JPanel();
		FlowLayout fl_panel_2 = new FlowLayout(FlowLayout.LEFT);
		
		panel_2.setLayout(fl_panel_2);
		
		panel_2.setBorder(new TitledBorder(null, "\u57FA\u672C\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_10 = new JPanel();
		panel_2.add(panel_10);
		
		JLabel lblNewLabel = new JLabel("\u7ECF\u9500\u5546\uFF1A");
		panel_10.add(lblNewLabel);
		
		textField = new JTextField();
		panel_10.add(textField);
		textField.setEditable(false);
		textField.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_2.add(panel_9);
		
		JLabel lblNewLabel_1 = new JLabel("\u501F\u8D44\u8D28\uFF1A");
		panel_9.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_9.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_2.add(panel_8);
		
		JLabel lblNewLabel_2 = new JLabel("\u8D28\u4FDD\u91D1\uFF1A");
		panel_8.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_8.add(textField_2);
		textField_2.setEnabled(true);
		textField_2.setEditable(false);
		textField_2.setText("");
		textField_2.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_2.add(panel_7);
		
		JLabel lblNewLabel_3 = new JLabel("\u662F\u5426\u65BD\u5DE5\uFF1A");
		panel_7.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel_7.add(textField_3);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		
		JLabel lblNewLabel_4 = new JLabel("\u7533\u8BF7\u7279\u4EF7\uFF1A");
		panel_6.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		panel_6.add(textField_4);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_2.add(panel_11);
		
		JLabel lblNewLabel_5 = new JLabel("\u586B\u5355\u65E5\u671F\uFF1A");
		panel_11.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		panel_11.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_2.add(panel_12);
		
		JLabel lblNewLabel_6 = new JLabel("\u5355\u53F7\uFF1A");
		panel_12.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		panel_12.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_2.add(panel_13);
		
		JLabel lblNewLabel_7 = new JLabel("\u6837\u54C1\u8BA2\u5355");
		panel_13.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		panel_13.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_2.add(panel_14);
		
		JLabel lblNewLabel_8 = new JLabel("\u5BF9\u5E94\u5408\u540C\u7F16\u53F7\uFF1A");
		panel_14.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		panel_14.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u53D1\u8D27\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_3.add(panel_15);
		
		JLabel label_1 = new JLabel("\u53D1\u8D27\u65B9\u5F0F\uFF1A");
		panel_15.add(label_1);
		
		textField_9 = new JTextField();
		panel_15.add(textField_9);
		textField_9.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		panel_3.add(panel_16);
		
		JLabel lblNewLabel_9 = new JLabel("\u4EF7\u683C\uFF1A");
		panel_16.add(lblNewLabel_9);
		
		textField_10 = new JTextField();
		panel_16.add(textField_10);
		textField_10.setColumns(10);
		
		JPanel panel_17 = new JPanel();
		panel_3.add(panel_17);
		
		JLabel label_2 = new JLabel("\u90AE\u652F\uFF1A");
		panel_17.add(label_2);
		
		textField_11 = new JTextField();
		panel_17.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		panel_3.add(panel_18);
		
		JLabel label_3 = new JLabel("\u5BA2\u53F8\uFF1A");
		panel_18.add(label_3);
		
		textField_12 = new JTextField();
		panel_18.add(textField_12);
		textField_12.setColumns(10);
		
		JPanel panel_19 = new JPanel();
		panel_3.add(panel_19);
		
		JLabel label_4 = new JLabel("\u6536\u8D27\u5730\u5740\uFF1A");
		panel_19.add(label_4);
		
		textField_13 = new JTextField();
		panel_19.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_20 = new JPanel();
		panel_3.add(panel_20);
		
		JLabel lblNewLabel_10 = new JLabel("\u8054\u7CFB\u4EBA\uFF1A");
		panel_20.add(lblNewLabel_10);
		
		textField_14 = new JTextField();
		panel_20.add(textField_14);
		textField_14.setColumns(10);
		
		JPanel panel_21 = new JPanel();
		panel_3.add(panel_21);
		
		JLabel label_5 = new JLabel("\u8054\u7CFB\u7535\u8BDD");
		panel_21.add(label_5);
		
		textField_15 = new JTextField();
		panel_21.add(textField_15);
		textField_15.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_4.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_4.setBorder(new TitledBorder(null, "\u6536\u6B3E\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_4, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("");
		panel_4.add(label);
		
		JPanel panel_22 = new JPanel();
		panel_4.add(panel_22);
		
		JLabel label_6 = new JLabel("\u8BA2\u5355\u6536\u6B3E\u94F6\u884C\uFF1A");
		panel_22.add(label_6);
		
		textField_16 = new JTextField();
		panel_22.add(textField_16);
		textField_16.setColumns(10);
		
		JPanel panel_23 = new JPanel();
		panel_4.add(panel_23);
		
		JLabel label_7 = new JLabel("\u662F\u5426\u542B\u7A0E\uFF1A");
		panel_23.add(label_7);
		
		textField_17 = new JTextField();
		panel_23.add(textField_17);
		textField_17.setColumns(10);
		
		JPanel panel_24 = new JPanel();
		panel_4.add(panel_24);
		
		JLabel label_8 = new JLabel("\u5408\u540C\u603B\u91D1\u989D\uFF1A");
		panel_24.add(label_8);
		
		textField_18 = new JTextField();
		panel_24.add(textField_18);
		textField_18.setColumns(10);
		
		JPanel panel_25 = new JPanel();
		panel_4.add(panel_25);
		
		JLabel label_9 = new JLabel("\u5DF2\u6536\u5B9A\u91D1\uFF1A");
		panel_25.add(label_9);
		
		textField_19 = new JTextField();
		panel_25.add(textField_19);
		textField_19.setColumns(10);
		
		JPanel panel_26 = new JPanel();
		panel_4.add(panel_26);
		
		JLabel label_10 = new JLabel("\u672A\u6536\u5C3E\u6B3E\uFF08\u65F6\u95F4\uFF09\uFF1A");
		panel_26.add(label_10);
		
		textField_20 = new JTextField();
		panel_26.add(textField_20);
		textField_20.setColumns(10);
		
		JPanel panel_27 = new JPanel();
		panel_4.add(panel_27);
		
		JLabel label_11 = new JLabel("\u8D28\u4FDD\u91D1\uFF1A");
		panel_27.add(label_11);
		
		textField_21 = new JTextField();
		panel_27.add(textField_21);
		textField_21.setColumns(10);
		
		JPanel panel_28 = new JPanel();
		panel_4.add(panel_28);
		
		JLabel label_12 = new JLabel("\u8D28\u4FDD\u91D1\u6536\u53D6\u65F6\u95F4\uFF1A");
		panel_28.add(label_12);
		
		textField_22 = new JTextField();
		panel_28.add(textField_22);
		textField_22.setColumns(10);
		
		JPanel panel_29 = new JPanel();
		panel_4.add(panel_29);
		
		JLabel label_13 = new JLabel("\u706F\u5177\u65BD\u5DE5\u6B3E\uFF1A");
		panel_29.add(label_13);
		
		textField_23 = new JTextField();
		panel_29.add(textField_23);
		textField_23.setColumns(10);
		
		JPanel panel_30 = new JPanel();
		panel_4.add(panel_30);
		
		JLabel label_14 = new JLabel("\u65BD\u5DE5\u6536\u6B3E\u8D26\u53F7\uFF1A");
		panel_30.add(label_14);
		
		textField_24 = new JTextField();
		panel_30.add(textField_24);
		textField_24.setColumns(10);
		
//		JPanel panel_5 = new JPanel();
//		getContentPane().add(panel_5, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new OrderDetailView();
	}

}
