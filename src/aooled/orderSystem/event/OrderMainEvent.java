package aooled.orderSystem.event;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Properties;

import javax.swing.JOptionPane;

import aooled.orderSystem.view.OrderMain;

public class OrderMainEvent extends WindowAdapter {

	private OrderMain orderMain;
	
	
	
	/**
	 * @param orderMain
	 */
	public OrderMainEvent(OrderMain orderMain) {
		super();
		this.orderMain = orderMain;
	}



	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		int result = JOptionPane.showConfirmDialog(null, "确认登出系统吗？");
		if(result == 0) {
			int width = orderMain.getWidth();
			int height = orderMain.getHeight();
			File file = new File("config.properties");
			if(!file.exists())
				try {
					file.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			try {
				PrintWriter pw = new PrintWriter(file);
				Properties prop = new Properties();
				prop.setProperty("mainWidth", String.valueOf(width));
				prop.setProperty("mainHeight", String.valueOf(height));
				prop.list(pw);
				pw.flush();
				pw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.exit(0);
		}
	}

}
