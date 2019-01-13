package aooled.orderSystem.view;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import aooled.orderSystem.utils.ScreenSize;

public class OrderListView extends JScrollPane{
	
	private OrderMainView orderMainView;
	private JTable table;
	/**
	 * 
	 */
	public OrderListView(OrderMainView orderMainView) {
		super();
		this.orderMainView = orderMainView;
		// TODO Auto-generated constructor stub
		Dimension mainSize = new ScreenSize().getMainSize();
		// scrollPane = new JScrollPane();
		setBounds(0, 72, orderMainView.getSize().width, orderMainView.getSize().height - 72);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
                
			new Object[][] {
			},
			new String[] {
				"id", "姓名id", "经销商", "质保金" , "申请特价", "填单日期", "订单号", "样品单", "合同编号", "流程状态", "施工单", "借资质", "订单状态", "货物数量"
			}
		) {
			public boolean isCellEditable(int row, int column) {
				return false;
				}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(31);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.getColumnModel().getColumn(6).setPreferredWidth(35);
		//		table.setModel(new OrderTableModel());
//		table.setSize(mainSize.width, mainSize.height - 72);
		setViewportView(table);
	}

	public DefaultTableModel getMainTableModel() {
		return (DefaultTableModel) table.getModel();
	}
	
	public JTable getTable() {
		return table;
	}

}
