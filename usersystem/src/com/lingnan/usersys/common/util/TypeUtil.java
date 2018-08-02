package com.lingnan.usersys.common.util;




import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hamcrest.generator.qdox.parser.ParseException;

public class TypeUtil {
	
	/**
	 * 字符串转换为日期
	 * @param str
	 * @return
	 * @throws java.text.ParseException 
	 */
	
	public static Date strToDate(String str) throws java.text.ParseException {
		Date date=null;
		//设置要格式化的日期格式
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			//调用parse方法，将字符串解析成指定格式的日期类型
			date=sdf.parse(str);
		}catch(ParseException e) {
			System.out.println("字符串转换为日期出错");
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 日期转换为字符串
	 * @param da
	 * @return
	 */
    public static String dateToStr(Date da) {
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	String time = null;
    	try {
    		time = sdf.format(da);
    	} catch(ParseException e) {
    		System.out.println("日期转换为字符串出错");
			e.printStackTrace();
    	}
    	return time;
    }
    
    /**
     * 判断邮箱的格式是否正确
     * @param email 输入的邮箱
     * @return 
     */
    public static boolean checkEmail(String email) {
    	boolean flag = false;
        try{
              String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
              Pattern regex = Pattern.compile(check);
              Matcher matcher = regex.matcher(email);
              flag = matcher.matches();
            }catch(Exception e){
                flag = false;
            }
        return flag;
    }
	
    /**
     * 判断是否为空
     * @param word
     * @return
     */
    public static boolean checkEmpty(CharSequence word) {
    	
    		if(word == null || word.length() == 0)
    			return  true;
    		else
    			return  false;
    		
    	
    }
    
    /*
     * 
     * boolean flag = false;
        try{
              String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
              Pattern regex = Pattern.compile(check);
              Matcher matcher = regex.matcher(email);
              flag = matcher.matches();
            }catch(Exception e){
                flag = false;
            }
        return flag;

     * 
     * 
     */
     
	
}
