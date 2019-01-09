package aooled.orderSystem.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public class MD5Util {

	private static MessageDigest md5;
	
	static {
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String getMD5(String str) {
		try {
			byte[] bs = md5.digest(str.getBytes("UTF-8"));
			StringBuilder sb = new StringBuilder();
			for(byte b : bs) {
				if ((b & 0xff) >> 4 == 0) 
					sb.append("0").append(Integer.toHexString(b & 0xff));
				else
					sb.append(Integer.toHexString(b & 0xff));
			}
			return sb.toString();
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}
}
