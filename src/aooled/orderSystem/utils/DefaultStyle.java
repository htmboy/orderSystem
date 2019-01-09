package aooled.orderSystem.utils;

import java.awt.Font;

import javax.swing.UIManager;

public class DefaultStyle {

	public DefaultStyle() {
		try {
			
			// 设置当前系统默认样式
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			// 设置系统默认字体
			Font font = new Font("Dialog", Font.PLAIN, 12);
			java.util.Enumeration keys = UIManager.getDefaults().keys();
			while(keys.hasMoreElements()) {
				Object key = keys.nextElement();
				Object value = UIManager.get(key);
				if(value instanceof javax.swing.plaf.FontUIResource) {
					UIManager.put(key, font);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
