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
	 * 无参数构造方法
	 */
	public UserServiceImpl() {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public static UserService getInstance() {
		return userService;
		
	}
	/**
	 * 用户注册
	 */
	public boolean addUser(UserDto user) {
		// 声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;
				boolean flag = false;
				try {
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
					conn = DBUtil.getConnection();
					//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
					UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
					//
					flag=userMgrDao.addUser(user);
				} catch (DaoException e) {
					//将自定义异常并抛出
					throw e;			
				} catch (Exception e) {
					//将异常封装成定义异常并抛出
					e.printStackTrace();
					
				}
				return flag;
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

	/**
	 * 删除用户信息
	 */
	public boolean deleteUser(int userid) {
		// 声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;
				boolean flag =false;
				try {
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
					conn = DBUtil.getConnection();
					//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
					UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
					//
					flag=userMgrDao.deleteUser(userid);
				} catch (DaoException e) {
					//将自定义异常并抛出
					throw e;			
				} catch (Exception e) {
					//将异常封装成定义异常并抛出
					e.printStackTrace();
					
				}
				return flag;
	}

	/**
	 * 按userid查找用户
	 */
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

	/**
	 * 按用户名查找用户
	 */
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

	/**
	 * 查找全部用户
	 */
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

	/**
	 * 更新用户信息
	 */
	public boolean updateAll(int userid, UserDto user1) {
		// 声明数据库连接对象，用于保存数据库连接对象
				Connection conn = null;	
				boolean flag = false;
				try {
					//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
					conn = DBUtil.getConnection();
					//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
					UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
					//
					flag=userMgrDao.updateAll(userid, user1);
				} catch (DaoException e) {
					//将自定义异常并抛出
					throw e;			
				} catch (Exception e) {
					//将异常封装成定义异常并抛出
					e.printStackTrace();
					
				}
				return flag;
	}

	/**
	 * 分页查询
	 */
	public UserDto selectpage(int page, int row) {
		// 声明数据库连接对象，用于保存数据库连接对象
		Connection conn = null;
		UserDto user = null;
		try {
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
			conn = DBUtil.getConnection();
			//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
			UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
			//
			user=userMgrDao.selectpage(page, row);
		} catch (DaoException e) {
			//将自定义异常并抛出
			throw e;			
		} catch (Exception e) {
			//将异常封装成定义异常并抛出
			e.printStackTrace();
			
		}
		return user;
}

	/**
	 * 修改密码
	 */
	public boolean updatepassword(int userid, String password) {
		// 声明数据库连接对象，用于保存数据库连接对象
		Connection conn = null;	
		boolean flag = false;
		try {
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
			conn = DBUtil.getConnection();
			//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
			UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
			//
			flag=userMgrDao.updatepassword(userid, password);
		} catch (DaoException e) {
			//将自定义异常并抛出
			throw e;			
		} catch (Exception e) {
			//将异常封装成定义异常并抛出
			e.printStackTrace();
			
		}
		return flag;
	}

	/**
	 * 更改性别
	 */
	public boolean updatesex(int userid, String sex) {
		// 声明数据库连接对象，用于保存数据库连接对象
		Connection conn = null;	
		boolean flag = false;
		try {
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
			conn = DBUtil.getConnection();
			//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
			UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
			//
			flag=userMgrDao.updatesex(userid, sex);
		} catch (DaoException e) {
			//将自定义异常并抛出
			throw e;			
		} catch (Exception e) {
			//将异常封装成定义异常并抛出
			e.printStackTrace();
			
		}
		return flag;
	}

	/**
	 * 更改邮箱
	 */
	public boolean updateemail(int userid, String email) {
		// 声明数据库连接对象，用于保存数据库连接对象
		Connection conn = null;	
		boolean flag = false;
		try {
			//调用数据库工具类的getConnection方法，取得数据库连接对象，并赋予给数据库连接对象变量
			conn = DBUtil.getConnection();
			//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现了，并赋值给dao接口变量
			UserDao userMgrDao = (UserDao)DaoFactory.getDao(conn, EnumType.USER_DAO);
			//
			flag=userMgrDao.updateemail(userid, email);
		} catch (DaoException e) {
			//将自定义异常并抛出
			throw e;			
		} catch (Exception e) {
			//将异常封装成定义异常并抛出
			e.printStackTrace();
			
		}
		return flag;
	}
	

}
