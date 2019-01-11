package aooled.orderSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import aooled.orderSystem.model.Order;
import aooled.orderSystem.utils.DBConnector;

public class OrderDAO {

	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	private String orderSelectSql = "select * from order_main";
	/**
	 * @param conn
	 */
	public OrderDAO() {
		super();
		this.conn = DBConnector.getConnection();
	}
	
	public Map orderSelect() {
		Map<Object, Order> map = new HashMap<>();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(orderSelectSql);
			while(rs.next()) {
				Order order = new Order();
				order.setOrId(rs.getInt("or_id"));
				order.setUsId(rs.getInt("us_id"));
				order.setDistribution(rs.getString("distribution"));
				order.setOrAssurance(rs.getString("or_assurance"));
				order.setSpecialOffer(rs.getString("special_offer"));
				
				order.setFillDate(rs.getInt("fill_date"));
				order.setOrderNumber(rs.getString("order_number"));
				order.setSimpleOrder(rs.getString("simple_order"));
				order.setContractNum(rs.getString("contract_num"));
				order.setOrderStatus(rs.getInt("order_status"));
				order.setConstruction(rs.getString("construction"));
				order.setBorrowData(rs.getString("borrow_data"));
				order.setOrCancel(rs.getString("or_cancel"));
				order.setGoodsNum(rs.getInt("goods_num"));
				map.put(rs.getInt("or_id"), order);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
	

}
