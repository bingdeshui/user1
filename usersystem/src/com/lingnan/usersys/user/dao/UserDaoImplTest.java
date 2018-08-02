package com.lingnan.usersys.user.dao;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Vector;

import org.junit.Test;

import com.lingnan.usersys.usermgr.domain.UserDto;

public class UserDaoImplTest {

	/**
	 * 测试登录的方法
	 */
	public void testLogin() {
		UserDto v=new UserDto() ;
		//v.setUserid(10);
		UserDaoImpl s = new UserDaoImpl();
		s. selectpage(1,2);
		
		System.out.println("---------");
		s. selectpage(2,2);
		//System.out.println(flag);
	}

}
