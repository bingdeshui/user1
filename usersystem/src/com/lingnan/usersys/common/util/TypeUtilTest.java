package com.lingnan.usersys.common.util;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;

public class TypeUtilTest {
	@Test
	public void teststrToDate() throws ParseException {
		Date s = TypeUtil.strToDate("19990912");
		System.out.println(s);
		
		
	}

	@Test
	public void testDateToStr() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCheckEmail() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCheckEmpty() {
		//fail("Not yet implemented");
	}

}
