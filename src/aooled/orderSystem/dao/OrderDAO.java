package aooled.orderSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	private String getOrder = "select * from order_main left order_express join order_main.or_id = order_express.or_id left order_reciept join order_reciept.or_id = order_main.or_id where order_main.or_id = ?";
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
			
			e.printStackTrace();
		}
		return map;
	}
	
	public Order getOrder(int id) {
		Order order = new Order();
		try {
			ps = conn.prepareStatement(getOrder);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			rs.next();
			order.setUsId(rs.getInt("order_main.us_id"));
			order.setDistribution(rs.getString("order_main.distribution"));
			order.setOrAssurance(rs.getString("order_mian.or_assurance"));
			order.setSpecialOffer(rs.getString("order_main.special_offer"));
			order.setFillDate(rs.getInt("order_main.fill_date"));
			order.setOrderNumber(rs.getString("order_main.order_number"));
			order.setSimpleOrder(rs.getString("order_main.simple_order"));
			order.setContractNum(rs.getString("order_main.contract_num"));
			order.setOrderStatus(rs.getInt("order_main.order_status"));
			order.setConstruction(rs.getString("order_main.construction"));
			order.setBorrowData(rs.getString("order_main.borrow_data"));
			order.setOrCancel(rs.getString("order_main.or_cancel"));
			order.setGoodsNum(rs.getInt("order_main.goods_num"));
			
			order.setExId(rs.getInt("order_express.ex_id"));
			order.setMethod(rs.getString("order_express.ex_method"));
			order.setPrice(rs.getString("order_express.ex_price"));
			order.setPayer(rs.getString("order_express.ex_payer"));
			order.setConpany(rs.getString("order_express.customer_conpany"));
			order.setAlterReciept(rs.getString("order_express.alter_reciept"));
			order.setAlterAmount(rs.getString("order_express.alter_amount"));
			order.setNoticeDelivery(rs.getString("order_express.notice_delivery"));
			order.setSendTo(rs.getString("order_express.send_to"));
			order.setContact(rs.getString("order_express.contact"));
			order.setContactTel(rs.getString("order_express.contact_tel"));
			
			order.setRecId(rs.getInt("order_reciept.rec_id"));
			order.setRecieptBank(rs.getString("order_reciept.reciept_bank"));
			order.setTax(rs.getString("order_reciept.reciept_tax"));
			order.setContractAmount(rs.getString("order_reciept.contract_amount"));
			order.setDeposit(rs.getFloat("order_reciept.deposit"));
			order.setAssurance(rs.);
			order.setContructionAccount(rs.getString("order_reciept.construction_account"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}

}
