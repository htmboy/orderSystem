package aooled.orderSystem.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import aooled.orderSystem.event.OrderMainEvent;
import aooled.orderSystem.model.OrderTableModel;
import aooled.orderSystem.utils.DefaultStyle;
import aooled.orderSystem.utils.ScreenSize;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;

public class OrderMainView extends JFrame {

	private JButton personalButton;
	private JButton orderAddButton;
	
	
	
	public OrderMainView() {
		
		// 获取默认样式
//		new DefaultStyle();
		
		// 获得窗口尺寸
		Dimension mainSize = new ScreenSize().getMainSize();
		System.out.println(mainSize.getHeight() + ":" + mainSize.getWidth());
		setSize(mainSize);
		setMinimumSize(new Dimension(800, 400));
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		
		getContentPane().setLayout(new BorderLayout(0, 0));

		
		JPanel panel = new JPanel();
		panel.setSize(mainSize);
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setSize(mainSize.width, 72);
		panel.add(toolBar);
		toolBar.setFloatable(false);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\aooled-laptop\\eclipse-workspace\\OrderSystem\\resource\\logo.png"));
		toolBar.add(lblNewLabel);
		
		orderAddButton = new JButton("订单列表", new ImageIcon("C:\\Users\\aooled-laptop\\eclipse-workspace\\OrderSystem\\resource\\icon01.png"));
		orderAddButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		orderAddButton.setHorizontalTextPosition(SwingConstants.CENTER);
		orderAddButton.setFocusPainted(false);
		toolBar.add(orderAddButton);
		
		personalButton = new JButton("个人中心", new ImageIcon("C:\\Users\\aooled-laptop\\eclipse-workspace\\OrderSystem\\resource\\icon02.png"));
		personalButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		personalButton.setHorizontalTextPosition(SwingConstants.CENTER);
		toolBar.add(personalButton);
		
		setVisible(true);
		
	}

	public JButton getPersonalButton() {
		return personalButton;
	}

	public JButton getOrderAddButton() {
		return orderAddButton;
	}

}
