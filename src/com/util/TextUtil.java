package com.util;

public class TextUtil {
	/** 判断字符串为null,"",length=0 */
	public static boolean isEmpty(String str){
		boolean isNull = false;
		if(str==null || "".equals(str) || str.length()==0){
			isNull=true;
		}
		return isNull;
	}
	/**用0补齐字符串str至长度为len*/
	public static String completeString(String str,int len){
		if (isEmpty(str)){
			return "";
		}
		String temp=str;
		for(int i=str.length();i<len;i++){
			temp="0"+temp;
		}
		return temp;
	}
}
