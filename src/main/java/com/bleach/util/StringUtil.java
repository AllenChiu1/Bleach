package com.bleach.util;

public class StringUtil {
	
	/**
	 * 檢核字串是否為空字串或null
	 * 
	 * @param str
	 * @return boolean
	 * @throws 
	 * @author Allen Chiu   
	 * @version 
	 * v1.00, 2023/09/16, First Release 
	 */
	public static boolean isBlank(String str) {
		if("".equals(str) || str == null) {
			return true;
		}
		return false;
	}
}
