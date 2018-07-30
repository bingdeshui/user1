package com.lingnan.usersys.user.dao;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Vector;

import org.junit.Test;

import com.lingnan.usersys.usermgr.domain.UserDto;

public class UserDaoImplTest {

	@Test
	public void testLogin() {
		UserDto v=new UserDto() ;
		//v.setUserid(10);
		UserDaoImpl s = new UserDaoImpl();
		boolean flag =s.deleteUser(11);
		System.out.println(flag);
	}

}
