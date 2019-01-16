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

public class OrderDetailView extends JFrame {
	
	private JTextField distributionField;
	private JTextField borrowDataField;
	private JTextField isAssuranceField;
	private JTextField constructionField;
	private JTextField specialOfferField;
	private JTextField fillDateField;
	private JTextField orderNumField;
	private JTextField simpleOrder;
	private JTextField contractNumField;
	private JTextField methodField;
	private JTextField priceField;
	private JTextField payerField;
	private JTextField conpanyField;
	private JTextField sendToField;
	private JTextField contactField;
	private JTextField contactTelField;
	private JTextField recieptBankField;
	private JTextField taxField;
	private JTextField contractAmountField;
	private JTextField depositField;
	private JTextField tailField;
	private JTextField assuranceField;
	private JTextField assuranceDateField;
	private JTextField constructionAmountField;
	private JTextField constructionAccountField;
	private JTextField orderStatusField;
	private JTextField isCancelField;
	private JTextField goodsNumField;
	private JTextField alterRecieptField;
	private JTextField alterAmountField;
	private JTextField noticeDeliveryField;
	private JTextField tailDateField;
	
	
	public OrderDetailView() {

		setSize(new Dimension(800, 600));

		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panel_1 = new JPanel();
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JPanel panel_2 = new JPanel();
		
		panel_2.setBorder(new TitledBorder(null, "\u57FA\u672C\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_2);
		
		JPanel panel_10 = new JPanel();
		
		JLabel lblNewLabel = new JLabel("\u7ECF\u9500\u5546\uFF1A");
		
		distributionField = new JTextField();
		distributionField.setEditable(false);
		distributionField.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("\u501F\u8D44\u8D28\uFF1A");
		panel_9.add(lblNewLabel_1);
		
		borrowDataField = new JTextField();
		panel_9.add(borrowDataField);
		borrowDataField.setEditable(false);
		borrowDataField.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		
		JLabel lblNewLabel_2 = new JLabel("\u8D28\u4FDD\u91D1\uFF1A");
		panel_8.add(lblNewLabel_2);
		
		isAssuranceField = new JTextField();
		panel_8.add(isAssuranceField);
		isAssuranceField.setEnabled(true);
		isAssuranceField.setEditable(false);
		isAssuranceField.setText("");
		isAssuranceField.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		
		JLabel lblNewLabel_3 = new JLabel("\u662F\u5426\u65BD\u5DE5\uFF1A");
		panel_7.add(lblNewLabel_3);
		
		constructionField = new JTextField();
		panel_7.add(constructionField);
		constructionField.setEditable(false);
		constructionField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		
		JLabel lblNewLabel_4 = new JLabel("\u7533\u8BF7\u7279\u4EF7\uFF1A");
		panel_6.add(lblNewLabel_4);
		
		specialOfferField = new JTextField();
		panel_6.add(specialOfferField);
		specialOfferField.setEditable(false);
		specialOfferField.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		
		JLabel lblNewLabel_5 = new JLabel("\u586B\u5355\u65E5\u671F\uFF1A");
		panel_11.add(lblNewLabel_5);
		
		fillDateField = new JTextField();
		fillDateField.setEnabled(false);
		panel_11.add(fillDateField);
		fillDateField.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		
		JLabel lblNewLabel_6 = new JLabel("\u5355\u53F7\uFF1A");
		panel_12.add(lblNewLabel_6);
		
		orderNumField = new JTextField();
		orderNumField.setEnabled(false);
		panel_12.add(orderNumField);
		orderNumField.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		
		JLabel lblNewLabel_7 = new JLabel("\u6837\u54C1\u8BA2\u5355");
		panel_13.add(lblNewLabel_7);
		
		simpleOrder = new JTextField();
		simpleOrder.setEnabled(false);
		panel_13.add(simpleOrder);
		simpleOrder.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		
		JLabel lblNewLabel_8 = new JLabel("\u5BF9\u5E94\u5408\u540C\u7F16\u53F7\uFF1A");
		panel_14.add(lblNewLabel_8);
		
		contractNumField = new JTextField();
		contractNumField.setEnabled(false);
		panel_14.add(contractNumField);
		contractNumField.setColumns(10);
		FlowLayout fl_panel_2 = new FlowLayout(FlowLayout.LEFT, 5, 5);
		fl_panel_2.setAlignOnBaseline(true);
		panel_2.setLayout(fl_panel_2);
		panel_2.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_10.add(lblNewLabel);
		panel_10.add(distributionField);
		panel_2.add(panel_9);
		panel_2.add(panel_8);
		panel_2.add(panel_7);
		panel_2.add(panel_6);
		panel_2.add(panel_11);
		panel_2.add(panel_12);
		panel_2.add(panel_13);
		panel_2.add(panel_14);
		
		JPanel panel_31 = new JPanel();
		panel_2.add(panel_31);
		
		JLabel label = new JLabel("\u8BA2\u5355\u6D41\u7A0B\uFF1A");
		panel_31.add(label);
		
		orderStatusField = new JTextField();
		orderStatusField.setEditable(false);
		panel_31.add(orderStatusField);
		orderStatusField.setColumns(10);
		
		JPanel panel_33 = new JPanel();
		panel_2.add(panel_33);
		
		JLabel label_16 = new JLabel("\u8BA2\u5355\u72B6\u6001\uFF1A");
		panel_33.add(label_16);
		
		isCancelField = new JTextField();
		isCancelField.setEditable(false);
		panel_33.add(isCancelField);
		isCancelField.setColumns(10);
		
		JPanel panel_34 = new JPanel();
		panel_2.add(panel_34);
		
		JLabel label_17 = new JLabel("\u8D27\u7269\u6570\u91CF\uFF1A");
		panel_34.add(label_17);
		
		goodsNumField = new JTextField();
		goodsNumField.setEditable(false);
		panel_34.add(goodsNumField);
		goodsNumField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "\u53D1\u8D27\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_3);
		// "\u53D1\u8D27\u4FE1\u606F"
		JPanel panel_15 = new JPanel();
		
		JLabel label_1 = new JLabel("\u53D1\u8D27\u65B9\u5F0F\uFF1A");
		panel_15.add(label_1);
		
		methodField = new JTextField();
		methodField.setEditable(false);
		panel_15.add(methodField);
		methodField.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		
		JLabel lblNewLabel_9 = new JLabel("\u4EF7\u683C\uFF1A");
		panel_16.add(lblNewLabel_9);
		
		priceField = new JTextField();
		priceField.setEditable(false);
		panel_16.add(priceField);
		priceField.setColumns(10);
		
		JPanel panel_17 = new JPanel();
		
		JLabel label_2 = new JLabel("\u90AE\u652F\uFF1A");
		panel_17.add(label_2);
		
		payerField = new JTextField();
		payerField.setEditable(false);
		panel_17.add(payerField);
		payerField.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		
		JLabel label_3 = new JLabel("\u5BA2\u53F8\uFF1A");
		panel_18.add(label_3);
		
		conpanyField = new JTextField();
		conpanyField.setEditable(false);
		panel_18.add(conpanyField);
		conpanyField.setColumns(10);
		
		JPanel panel_19 = new JPanel();
		
		JLabel label_4 = new JLabel("\u6536\u8D27\u5730\u5740\uFF1A");
		panel_19.add(label_4);
		
		sendToField = new JTextField();
		sendToField.setEditable(false);
		panel_19.add(sendToField);
		sendToField.setColumns(30);
		
		JPanel panel_20 = new JPanel();
		
		JLabel lblNewLabel_10 = new JLabel("\u8054\u7CFB\u4EBA\uFF1A");
		panel_20.add(lblNewLabel_10);
		
		contactField = new JTextField();
		contactField.setEditable(false);
		panel_20.add(contactField);
		contactField.setColumns(10);
		
		JPanel panel_21 = new JPanel();
		
		JLabel label_5 = new JLabel("\u8054\u7CFB\u7535\u8BDD");
		panel_21.add(label_5);
		
		contactTelField = new JTextField();
		contactTelField.setEditable(false);
		panel_21.add(contactTelField);
		contactTelField.setColumns(10);
		FlowLayout fl_panel_3 = new FlowLayout(FlowLayout.LEFT, 5, 5);
		fl_panel_3.setAlignOnBaseline(true);
		panel_3.setLayout(fl_panel_3);
		panel_3.add(panel_15);
		panel_3.add(panel_16);
		panel_3.add(panel_17);
		panel_3.add(panel_18);
		
		JPanel panel_35 = new JPanel();
		panel_3.add(panel_35);
		
		JLabel label_18 = new JLabel("\u662F\u5426\u4EE3\u6536\uFF1A");
		panel_35.add(label_18);
		
		alterRecieptField = new JTextField();
		alterRecieptField.setEditable(false);
		panel_35.add(alterRecieptField);
		alterRecieptField.setColumns(10);
		
		JPanel panel_36 = new JPanel();
		panel_3.add(panel_36);
		
		JLabel lblNewLabel_11 = new JLabel("\u4EE3\u6536\u91D1\u989D\uFF1A");
		panel_36.add(lblNewLabel_11);
		
		alterAmountField = new JTextField();
		alterAmountField.setEditable(false);
		panel_36.add(alterAmountField);
		alterAmountField.setColumns(10);
		
		JPanel panel_37 = new JPanel();
		panel_3.add(panel_37);
		
		JLabel label_19 = new JLabel("\u901A\u77E5\u53D1\u8D27\uFF1A");
		panel_37.add(label_19);
		
		noticeDeliveryField = new JTextField();
		noticeDeliveryField.setEditable(false);
		panel_37.add(noticeDeliveryField);
		noticeDeliveryField.setColumns(10);
		panel_3.add(panel_19);
		panel_3.add(panel_20);
		panel_3.add(panel_21);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\u6536\u6B3E\u4FE1\u606F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_4);
		FlowLayout fl_panel_4 = new FlowLayout(FlowLayout.LEFT, 5, 5);
		fl_panel_4.setAlignOnBaseline(true);
		panel_4.setLayout(fl_panel_4);
		
		JPanel panel_22 = new JPanel();
		panel_4.add(panel_22);
		
		JLabel label_6 = new JLabel("\u8BA2\u5355\u6536\u6B3E\u94F6\u884C\uFF1A");
		panel_22.add(label_6);
		
		recieptBankField = new JTextField();
		recieptBankField.setEditable(false);
		panel_22.add(recieptBankField);
		recieptBankField.setColumns(10);
		
		JPanel panel_23 = new JPanel();
		panel_4.add(panel_23);
		
		JLabel label_7 = new JLabel("\u662F\u5426\u542B\u7A0E\uFF1A");
		panel_23.add(label_7);
		
		taxField = new JTextField();
		taxField.setEditable(false);
		panel_23.add(taxField);
		taxField.setColumns(10);
		
		JPanel panel_24 = new JPanel();
		panel_4.add(panel_24);
		
		JLabel label_8 = new JLabel("\u5408\u540C\u603B\u91D1\u989D\uFF1A");
		panel_24.add(label_8);
		
		contractAmountField = new JTextField();
		contractAmountField.setEditable(false);
		panel_24.add(contractAmountField);
		contractAmountField.setColumns(10);
		
		JPanel panel_25 = new JPanel();
		panel_4.add(panel_25);
		
		JLabel label_9 = new JLabel("\u5DF2\u6536\u5B9A\u91D1\uFF1A");
		panel_25.add(label_9);
		
		depositField = new JTextField();
		depositField.setEditable(false);
		panel_25.add(depositField);
		depositField.setColumns(10);
		
		JPanel panel_26 = new JPanel();
		panel_4.add(panel_26);
		
		JLabel label_10 = new JLabel("\u672A\u6536\u5C3E\u6B3E\uFF1A");
		panel_26.add(label_10);
		
		tailField = new JTextField();
		tailField.setEditable(false);
		panel_26.add(tailField);
		tailField.setColumns(10);
		
		JPanel panel_38 = new JPanel();
		panel_4.add(panel_38);
		
		JLabel label_20 = new JLabel("\u5C3E\u6B3E\u6536\u53D6\u65F6\u95F4\uFF1A");
		panel_38.add(label_20);
		
		tailDateField = new JTextField();
		tailDateField.setEditable(false);
		panel_38.add(tailDateField);
		tailDateField.setColumns(10);
		
		JPanel panel_27 = new JPanel();
		panel_4.add(panel_27);
		
		JLabel label_11 = new JLabel("\u8D28\u4FDD\u91D1\uFF1A");
		panel_27.add(label_11);
		
		assuranceField = new JTextField();
		assuranceField.setEditable(false);
		panel_27.add(assuranceField);
		assuranceField.setColumns(10);
		
		JPanel panel_28 = new JPanel();
		panel_4.add(panel_28);
		
		JLabel label_12 = new JLabel("\u8D28\u4FDD\u91D1\u6536\u53D6\u65F6\u95F4\uFF1A");
		panel_28.add(label_12);
		
		assuranceDateField = new JTextField();
		assuranceDateField.setEditable(false);
		panel_28.add(assuranceDateField);
		assuranceDateField.setColumns(10);
		
		JPanel panel_29 = new JPanel();
		panel_4.add(panel_29);
		
		JLabel label_13 = new JLabel("\u706F\u5177\u65BD\u5DE5\u6B3E\uFF1A");
		panel_29.add(label_13);
		
		constructionAmountField = new JTextField();
		constructionAmountField.setEditable(false);
		panel_29.add(constructionAmountField);
		constructionAmountField.setColumns(10);
		
		JPanel panel_30 = new JPanel();
		panel_4.add(panel_30);
		
		JLabel label_14 = new JLabel("\u65BD\u5DE5\u6536\u6B3E\u8D26\u53F7\uFF1A");
		panel_30.add(label_14);
		
		constructionAccountField = new JTextField();
		constructionAccountField.setEditable(false);
		panel_30.add(constructionAccountField);
		constructionAccountField.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		getContentPane().add(panel_5, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("\u786E \u5B9A");
		panel_5.add(btnNewButton);
		
		setVisible(true);
	}
	
	

	public JTextField getDistributionField() {
		return distributionField;
	}



	public JTextField getBorrowDataField() {
		return borrowDataField;
	}



	public JTextField getIsAssuranceField() {
		return isAssuranceField;
	}



	public JTextField getConstructionField() {
		return constructionField;
	}



	public JTextField getSpecialOfferField() {
		return specialOfferField;
	}



	public JTextField getOrderStatusField() {
		return orderStatusField;
	}



	public JTextField getIsCancelField() {
		return isCancelField;
	}



	public JTextField getGoodsNumField() {
		return goodsNumField;
	}



	public JTextField getAlterRecieptField() {
		return alterRecieptField;
	}



	public JTextField getAlterAmountField() {
		return alterAmountField;
	}



	public JTextField getNoticeDeliveryField() {
		return noticeDeliveryField;
	}



	public JTextField getTailDateField() {
		return tailDateField;
	}



	public JTextField getFillDateField() {
		return fillDateField;
	}



	public JTextField getOrderNumField() {
		return orderNumField;
	}



	public JTextField getSimpleOrder() {
		return simpleOrder;
	}



	public JTextField getContractNumField() {
		return contractNumField;
	}



	public JTextField getMethodField() {
		return methodField;
	}



	public JTextField getPriceField() {
		return priceField;
	}



	public JTextField getPayerField() {
		return payerField;
	}



	public JTextField getConpanyField() {
		return conpanyField;
	}



	public JTextField getSendToField() {
		return sendToField;
	}



	public JTextField getContactField() {
		return contactField;
	}



	public JTextField getContactTelField() {
		return contactTelField;
	}



	public JTextField getRecieptBankField() {
		return recieptBankField;
	}



	public JTextField getTaxField() {
		return taxField;
	}



	public JTextField getContractAmountField() {
		return contractAmountField;
	}



	public JTextField getDepositField() {
		return depositField;
	}



	public JTextField getTailField() {
		return tailField;
	}



	public JTextField getAssuranceField() {
		return assuranceField;
	}



	public JTextField getAssuranceDateField() {
		return assuranceDateField;
	}



	public JTextField getConstructionAmountField() {
		return constructionAmountField;
	}



	public JTextField getConstructionAccountField() {
		return constructionAccountField;
	}

	public static void main(String[] args) {
		new OrderDetailView();
	}

}
