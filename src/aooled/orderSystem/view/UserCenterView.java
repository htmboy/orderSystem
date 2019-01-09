package aooled.orderSystem.view;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserCenterView {

	private JScrollPane scrollPane;
	private OrderMain orderMain;
	private JTable table;
	
	/**
	 * 
	 */
	public UserCenterView(OrderMain orderMain) {
		super();
		this.orderMain = orderMain;
		// TODO Auto-generated constructor stub
		Dimension mainSize = orderMain.getMainSize();
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 72, mainSize.width, mainSize.height - 72);
		
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
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public DefaultTableModel getMainTableModel() {
		return (DefaultTableModel) table.getModel();
	}

	
	
}
