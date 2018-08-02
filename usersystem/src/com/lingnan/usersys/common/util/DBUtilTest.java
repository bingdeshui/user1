package com.lingnan.usersys.common.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class DBUtilTest {

	/**
	 * 测试连接
	 */
	public void testGetConnection() {
		Connection conn= DBUtil.getConnection();
		System.out.println(conn);
		System.out.println(conn);
		
	}

}
