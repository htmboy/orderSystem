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
	private String getOrder = "select * from order_main left join order_express on order_main.or_id = order_express.or_id left join order_reciept on order_reciept.or_id = order_main.or_id where order_main.or_id = ?";
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
			if(rs.next()) {
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
				
				order.setExId(rs.getInt("ex_id"));
				order.setMethod(rs.getString("ex_method"));
				order.setPrice(rs.getString("ex_price"));
				order.setPayer(rs.getString("ex_payer"));
				order.setConpany(rs.getString("customer_conpany"));
				order.setAlterReciept(rs.getString("alter_reciept"));
				order.setAlterAmount(rs.getString("alter_amount"));
				order.setNoticeDelivery(rs.getString("notice_delivery"));
				order.setSendTo(rs.getString("send_to"));
				order.setContact(rs.getString("contact"));
				order.setContactTel(rs.getString("contact_tel"));
				
				order.setRecId(rs.getInt("rec_id"));
				order.setRecieptBank(rs.getString("reciept_bank"));
				order.setTax(rs.getString("contain_tax"));
				order.setContractAmount(rs.getString("contract_amount"));
				order.setDeposit(rs.getFloat("deposit"));
				order.setAssurance(rs.getFloat("assurance"));
				order.setAssuranceDate(rs.getInt("assurance_date"));
				order.setConstructionAmount(rs.getFloat("construction_amount"));
				order.setContructionAccount(rs.getString("construction_account"));
				order.setTail(rs.getFloat("tail"));
				order.setTailDate(rs.getInt("tail_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}

}
