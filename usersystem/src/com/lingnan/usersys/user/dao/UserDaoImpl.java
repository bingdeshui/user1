package com.lingnan.usersys.user.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;



import com.lingnan.usersys.commom.exception.DaoException;
import com.lingnan.usersys.common.util.DBUtil;
import com.lingnan.usersys.usermgr.domain.UserDto;

public class UserDaoImpl implements UserDao{
	
	/**
	 * 
	 * 数据库连接
	 */
	private Connection conn;
	
	/**
	 * 连接方法
	 * @param conn
	 */
	public UserDaoImpl(){
		
	}
	public UserDaoImpl(Connection conn) {
		this.conn=conn;
		
	}

	/**
	 * 登录验证
	 */
	public UserDto login(String name, String password) {
		//声明结果集对象变量，用于保存数据库查询结果
		ResultSet rs=null;
		
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		UserDto user = null;
		try{//调用连接对象的statement方法，
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
			 rs=stat.executeQuery("select * from user where username='"+name+"' and passwd='"+password+"'");
			while (rs.next()) {
				user = new UserDto();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPasswd(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setPower(rs.getString(6));
			}
		}
		catch(SQLException e) {
			System.out.println("在用户登录时出现错误");
			e.printStackTrace();
			throw new DaoException("登录时出错",e);
		}
		
		finally {
			
			DBUtil.closeStatement(rs, stat);
			
		}
		return user;
		
	}
	
	
	
	
	
	
	/**
	 * 增加用户
	 */
	public boolean addUser(UserDto user1) {
       ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
			int userid=user1.getUserid();
			String username = user1.getUsername();
			String passwd = user1.getPasswd();
			String sex = user1.getSex();
			String email = user1.getEmail();
			String power = user1.getPower();		     
			stat.executeUpdate("insert into user(username, passwd,sex ,email,power) values('"+username+"','"+passwd+"','"+sex+"','"+email+"','"+power+"')");		
			flag=true;			
		}
		catch(SQLException e) {
			System.out.println("插入数据时出现错误");
			e.printStackTrace();
			throw new DaoException("登录时出错",e);
		}
		
		finally {			
			DBUtil.closeStatement(rs, stat);
		}
		return flag;
	}
	
	/**
	 * 删除用户
	 */
	public boolean deleteUser(int userid) {
       ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();	     
			stat.executeUpdate("delete from user where userid='"+userid+"'");
			flag=true;			
		}
		catch(SQLException e) {
			System.out.println("插入数据时出现错误");
			e.printStackTrace();
			throw new DaoException("登录时出错",e);
		}
		
		finally {			
			DBUtil.closeStatement(rs, stat);
		}
		return flag;
	}
	
	
	/**
	 * 查找全部数据
	 */
	public UserDto selectAll() {
		//声明结果集对象变量，用于保存数据库查询结果
		ResultSet rs=null;
		
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		UserDto user = null;
		try{//调用连接对象的statement方法，
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
			 rs=stat.executeQuery("select * from user ");
			while (rs.next()) {
				user = new UserDto();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPasswd(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setPower(rs.getString(6));
			}
		}
		catch(SQLException e) {
			System.out.println("在用户登录时出现错误");
			e.printStackTrace();
			throw new DaoException("登录时出错",e);
		}
		
		finally {
			
			DBUtil.closeStatement(rs, stat);
			
		}
		return user;
		
	}
	
	/**
	 * 按userid查找全部数据
	 */
	public UserDto selectuerid( int userid) {
		//声明结果集对象变量，用于保存数据库查询结果
		ResultSet rs=null;
		
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		UserDto user = null;
		try{//调用连接对象的statement方法，
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
			 rs=stat.executeQuery("select * from user where userid='"+userid+"'");
			while (rs.next()) {
				user = new UserDto();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPasswd(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setPower(rs.getString(6));
			}
		}
		catch(SQLException e) {
			System.out.println("在用户登录时出现错误");
			e.printStackTrace();
			throw new DaoException("登录时出错",e);
		}
		
		finally {
			
			DBUtil.closeStatement(rs, stat);
			
		}
		return user;
		
	}
	
	/**
	 * 按usename查找全部数据
	 */
	public UserDto selectusername(String  username) {
		//声明结果集对象变量，用于保存数据库查询结果
		ResultSet rs=null;
		
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		UserDto user = null;
		try{//调用连接对象的statement方法，
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
			 rs=stat.executeQuery("select * from user where usename='"+username+"'");
			while (rs.next()) {
				user = new UserDto();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPasswd(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setPower(rs.getString(6));
			}
		}
		catch(SQLException e) {
			System.out.println("在用户登录时出现错误");
			e.printStackTrace();
			throw new DaoException("登录时出错",e);
		}
		
		finally {
			
			DBUtil.closeStatement(rs, stat);
			
		}
		return user;
		
	}
	
	
	

}
