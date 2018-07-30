package com.lingnan.usersys.user.service;

import java.sql.Connection;

import com.lingnan.usersys.commom.exception.DaoException;
import com.lingnan.usersys.common.constant.EnumType;
import com.lingnan.usersys.common.dao.DaoFactory;
import com.lingnan.usersys.common.util.DBUtil;
import com.lingnan.usersys.user.dao.UserDao;
import com.lingnan.usersys.usermgr.domain.UserDto;

public class UserServiceImpl implements UserService{

	/**
	 * 用户service接口的实现类
	 * 
	 * 
	 */
	
	public static UserService userService = new UserServiceImpl();
	
	/**
	 * 构造方法
	 */
	public UserServiceImpl() {
		
	}
	
	public static UserService getInstance() {
		return userService;
		
	}
	
	public boolean addUser(UserDto user) {
		
		return false;
	}

	/**
	 * 用户登录
	 */
	public UserDto login(String name, String password) {
		// 声明数据库连接对象，用于保存数据库连接对象
		Connection conn = null;
		UserDto user = null;
		try {
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
			conn = DBUtil.getConnection();
			//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
			UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
			//
			user=userMgrDao.login(name, password);
		} catch (DaoException e) {
			//将自定义异常并抛出
			throw e;			
		} catch (Exception e) {
			//将异常封装成定义异常并抛出
			e.printStackTrace();
			
		}
		return user;
	
	}

	@Override
	public boolean deleteUser(int userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDto selectuerid(int userid) {
		// 声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;
				UserDto user = null;
				try {
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
					conn = DBUtil.getConnection();
					//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
					UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
					//
					user=userMgrDao.selectuerid(userid);
				} catch (DaoException e) {
					//将自定义异常并抛出
					throw e;			
				} catch (Exception e) {
					//将异常封装成定义异常并抛出
					e.printStackTrace();
					
				}
				return user;
	}

	@Override
	public UserDto selectusername(String username) {
		// 声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;
				UserDto user = null;
				try {
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
					conn = DBUtil.getConnection();
					//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
					UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
					//
					user=userMgrDao.selectusername(username);
				} catch (DaoException e) {
					//将自定义异常并抛出
					throw e;			
				} catch (Exception e) {
					//将异常封装成定义异常并抛出
					e.printStackTrace();
					
				}
				return user;
	}

	@Override
	public UserDto selectAll() {
		// 声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;
				UserDto user = null;
				try {
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
					conn = DBUtil.getConnection();
					//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
					UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
					//
					user=userMgrDao.selectAll();
				} catch (DaoException e) {
					//将自定义异常并抛出
					throw e;			
				} catch (Exception e) {
					//将异常封装成定义异常并抛出
					e.printStackTrace();
					
				}
				return user;
	}
	

}
