package com.lingnan.usersys.common.util;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

public class TypeUtilTest {
	
	/**
	 * 测试”字符串转换为日期”的方法
	 * @throws ParseException
	 */
	public void teststrToDate() throws ParseException {
		Date s = TypeUtil.strToDate("19990912");
		System.out.println(s);
		
		
	}

	/**
	 * 测试“日期转换为邮箱”的方法
	 */
	public void testDateToStr() {
		//fail("Not yet implemented");
	}

	/**
	 * 测试“邮箱格式是否正确”的方法
	 */
	public void testCheckEmail() {
		//fail("Not yet implemented");
	}

	/**
	 * 测试“是否为空”的方法
	 */
	public void testCheckEmpty() {
		//fail("Not yet implemented");
	}

}
