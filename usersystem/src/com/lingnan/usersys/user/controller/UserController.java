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
	 * @return 用户信息
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
	 * @return 用户信息
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
	 * @return 全部的用户信息
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
	
	/**
	 * 用户信息的增添
	 * @param user1
	 * @return flag值
	 */
	public boolean addUser(UserDto user1) {
		
		boolean flag =false;
		try {
			//调用用户service接口中的login方法，进行用户登录操作
			flag= userMgrService.addUser(user1);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("用户登录的时候出现错误"+e.getMessage());
		}
		return flag;
		
	}
	
	/**
	 * 输入userid,进而更新其他数据
	 * @param userid
	 * @param user1
	 * @return flag值
	 */
	public boolean updateAll(int userid, UserDto user1) {
		boolean flag = false;
		try {
			//调用用户service接口中的login方法，进行用户登录操作
			flag= userMgrService.updateAll(userid, user1);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("用户登录的时候出现错误"+e.getMessage());
		}
		return flag;
	}
	/**
	 * 根据userid删除用户信息
	 * @param userid
	 * @return flag 值
	 */
	public boolean deleteUser(int userid) {
		boolean flag = false;
		try {
			//调用用户service接口中的deleteUser方法，进行用户登录操作
			flag= userMgrService.deleteUser(userid);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("用户登录的时候出现错误"+e.getMessage());
		}
		return flag;
	}
	
	/**
	 * 分页查询
	 * @param page 代表页数
	 * @param row  代表行数
	 * @return
	 */
	public UserDto selectpage(int page, int row) {
		UserDto user = null;
		try {
			//调用用户service接口中的selectAll方法，进行用户登录操作
			user = userMgrService.selectpage(page, row);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("查找全部数据的时候出现错误"+e.getMessage());
		}
		return user;
	}
	
	/**
	 * 输入userid,修改密码
	 * @param userid 
	 * @param password
	 * @return flag 值
	 */
	public boolean updatepassword(int userid, String password){
		boolean flag = false;
		try {
			//调用用户service接口中的login方法，进行用户登录操作
			flag= userMgrService.updatepassword(userid, password);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("用户登录的时候出现错误"+e.getMessage());
		}
		return flag;
    }
	
	/**
	 * 输入userid,修改性别
	 * @param userid
	 * @param sex
	 * @return flag值
	 */
	public boolean updatesex(int userid, String sex) {
		boolean flag = false;
		try {
			//调用用户service接口中的login方法，进行用户登录操作
			flag= userMgrService.updatesex(userid, sex);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("用户登录的时候出现错误"+e.getMessage());
		}
		return flag;
    }
	
	/**
	 * 输入userid,修改邮箱
	 * @param userid
	 * @param email
	 * @return flag值
	 */
	public boolean updateemail(int userid, String email) {
		boolean flag = false;
		try {
			//调用用户service接口中的login方法，进行用户登录操作
			flag= userMgrService.updateemail(userid, email);
		} catch (Exception e) {
			//显示异常信息
			System.out.println("用户登录的时候出现错误"+e.getMessage());
		}
		return flag;
    }
	
	

}
