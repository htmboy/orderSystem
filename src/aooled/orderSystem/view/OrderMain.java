package aooled.orderSystem.view;

import java.awt.Dimension;
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

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
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

public class OrderMain extends JFrame {
	private int width;
	private int height;
	private JTable table;
	
	
	
	public OrderMain() {
		
		// 获取默认样式
		new DefaultStyle();
		
		// 获得窗口尺寸
		Dimension mainSize = getMainSize();
		setSize(mainSize);
		setMinimumSize(new Dimension(800, 400));
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		
		getContentPane().setLayout(null);
		
		this.addWindowListener(new OrderMainEvent(this));
		
		JPanel panel = new JPanel();
//		panel.setBounds(0, 0, 785, 370);
		panel.setSize(mainSize);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
//		toolBar.setBounds(680, 5, 175, 72);
		toolBar.setSize(mainSize.width, 72);
		panel.add(toolBar);
		toolBar.setFloatable(false);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\aooled-laptop\\eclipse-workspace\\OrderSystem\\resource\\logo.png"));
		toolBar.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("新增订单", new ImageIcon("C:\\Users\\aooled-laptop\\eclipse-workspace\\OrderSystem\\resource\\icon01.png"));
		btnNewButton_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setFocusPainted(false);
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("个人中心", new ImageIcon("C:\\Users\\aooled-laptop\\eclipse-workspace\\OrderSystem\\resource\\icon02.png"));
		btnNewButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		toolBar.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 72, mainSize.width, mainSize.height - 72);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "\u59D3\u540D", "\u6027\u522B", "\u6743\u9650", "\u6709\u6548", "\u65F6\u95F4", "\u4EE3\u53F7", "\u89D2\u8272", "\u767B\u5F55\u65F6\u95F4"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(6).setPreferredWidth(35);
		//		table.setModel(new OrderTableModel());
		table.setSize(mainSize.width, mainSize.height - 72);
		scrollPane.setViewportView(table);
		panel.add(scrollPane);
	}
	
	private Dimension getMainSize() {
		
		int w;
		int h;
		
		// 获取屏幕的尺寸   
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
		
		// 获取保存尺寸的记录
		Properties prop = new Properties();
		
		try {
			
			FileReader fr = new FileReader(new File("config.properties"));
			prop.load(fr);
			w = prop.getProperty("mainWidth") == null ? (int) screenSize.getWidth() : Integer.parseInt(prop.getProperty("mainWidth"));
			h = prop.getProperty("mainHeight") == null ? (int) screenSize.getHeight() : Integer.parseInt(prop.getProperty("mainHeight"));
			
		} catch (IOException e) {
			
			w = (int) screenSize.getWidth();
			h = (int) screenSize.getHeight();
			
		}
		
		return new Dimension(w, h);
	}
	
	public DefaultTableModel getMainTableModel() {
		return (DefaultTableModel) table.getModel();
	}
	
	public static void main(String[] args) {
		new OrderMain().setVisible(true);
	}
}
