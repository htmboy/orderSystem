package aooled.orderSystem.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ScreenSize {

	int w;
	int h;
	/**
	 * 
	 */
	public ScreenSize() {
		super();
		// ��ȡ��Ļ�ĳߴ�   
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
		
		// ��ȡ����ߴ�ļ�¼
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
	}
	
	public Dimension getMainSize() {
		return new Dimension(w, h);
	}
	
}
