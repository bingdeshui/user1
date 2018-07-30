package com.lingnan.usersys.user.controller;

import com.lingnan.usersys.user.service.UserService;
import com.lingnan.usersys.user.service.UserServiceImpl;
import com.lingnan.usersys.usermgr.domain.UserDto;

public class UserController {
	//声明用户service接口对象，用于业务处理
	UserService userMgrService = UserServiceImpl.getInstance();
	
	/**
	 * 用户登录
	 * @param name 用户名
	 * @param password 密码
	 * @return 用户信息
	 */
	public UserDto doLogin(String name, String password) {
		UserDto user = null;
		try {
			//调用用户service接口中的login方法，进行用户登录操作
			user = userMgrService.login(name, password);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("用户登录的时候出现错误"+e.getMessage());
		}
		return user;
	}
	
	/**
	 * 按userid查找数据
	 * @param userid
	 * @return
	 */
	public UserDto selectuerid( int userid) {
		UserDto user = null;
		try {
			//调用用户service接口中的login方法，进行用户登录操作
			user = userMgrService.selectuerid(userid);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("按用户id号查找的时候出现错误"+e.getMessage());
		}
		return user;
	}
	
	/**
	 * 按用户名查找
	 * @param username
	 * @return
	 */
	public UserDto selectusername(String  username){
		UserDto user = null;
		try {
			//调用用户service接口中的selectusername方法，进行用户登录操作
			user = userMgrService.selectusername(username);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("按用户名查找的时候出现错误"+e.getMessage());
		}
		return user;
	}
	
	/**
	 * 查找全部数据
	 * @return
	 */
	public UserDto selectAll(){
		UserDto user = null;
		try {
			//调用用户service接口中的selectAll方法，进行用户登录操作
			user = userMgrService.selectAll();
		} catch (Exception e) {
			//显示异常信息
			System.out.println("查找全部数据的时候出现错误"+e.getMessage());
		}
		return user;
	}
	
	
	public boolean addUser(UserDto user1) {
		
		
		return false;
		
	}
	
	

}
