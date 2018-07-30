package com.lingnan.usersys.usermgr.view;

import com.lingnan.usersys.usermgr.domain.UserDto;

public class AdminFrame extends NormalFrame{

	/**
	 * 带参数的构造器，用于初始化user属性
	 * @param user
	 */
	public AdminFrame(UserDto user) {
		super(user);
	}
	
	public void loginSuccShow() {
		System.out.println("欢迎登录主窗口");
		
	}

}
