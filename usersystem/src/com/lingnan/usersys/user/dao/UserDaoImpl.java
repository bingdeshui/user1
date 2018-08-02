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
	 * 无参数的构造方法
	 */
	public UserDaoImpl(){
		
	}
	
	/**
	 * 连接方法
	 * @param conn
	 */
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
	 * 增加用户信息
	 */
	public boolean addUser(UserDto user1) {
       ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();			
			String username = user1.getUsername();
			String passwd = user1.getPasswd();
			String sex = user1.getSex();
			String email = user1.getEmail();
			String power = user1.getPower();		     
			stat.executeUpdate("insert into user(username, passwd,sex ,email,power) values('"+username+"','"+passwd+"','"+sex+"','"+email+"','"+power+"')");		
			 flag = true;		
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
	 * 根据userid删除用户信息
	 */
	public boolean deleteUser(int userid) {
       ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
			 rs=stat.executeQuery("select * from user where userid='"+userid+"'");
			 while (rs.next()) {
				 flag = true;
			 }
			 if(flag==true)
			 {
			stat.executeUpdate("delete from user where userid='"+userid+"'");}
			 		
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
				System.out.println(user.getUserid()+" "+user.getUsername()+" "+user.getPasswd()+" "+user.getSex()+" "+user.getEmail()+" "+user.getPower());	
				System.out.println("----------------------------------");
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
	 * 按userid查找用户信息
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
				System.out.println(user.getUserid()+" "+user.getUsername()+" "+user.getPasswd()+" "+user.getSex()+" "+user.getEmail()+" "+user.getPower());	
				System.out.println("----------------------------------");
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
	 * 按usename查找用户信息
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
			 rs=stat.executeQuery("select * from user where username='"+username+"'");
			while (rs.next()) {
				user = new UserDto();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPasswd(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setPower(rs.getString(6));
				System.out.println(user.getUserid()+" "+user.getUsername()+" "+user.getPasswd()+" "+user.getSex()+" "+user.getEmail()+" "+user.getPower());	
				System.out.println("----------------------------------");
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
	 * 根据userid更新用户信息
	 */
	public boolean updateAll(int userid, UserDto user1) {
		ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();			
			String username = user1.getUsername();
			String passwd = user1.getPasswd();
			String sex = user1.getSex();
			String email = user1.getEmail();
			String power = user1.getPower();		     
			stat.executeUpdate("update user set username='"+username+"', passwd='"+passwd+"' ,sex='"+sex+"', email='"+email+"', power='"+power+"' where userid='"+userid+"'");		
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
	 * 分页查询
	 */
	public UserDto selectpage(int page,int row) {
		//声明结果集对象变量，用于保存数据库查询结果
				ResultSet rs=null;				
				Statement stat=null;
				//声明用户对象变量，用于保存从结果集中提取出来的数据
				UserDto user = null;
				try{//调用连接对象的statement方法，
					conn=DBUtil.getConnection();
				    stat=conn.createStatement();
					 rs=stat.executeQuery("select * from user limit "+((page-1)*row)+","+row+"");
					while (rs.next()) {
						user = new UserDto();
						user.setUserid(rs.getInt(1));
						user.setUsername(rs.getString(2));
						user.setPasswd(rs.getString(3));
						user.setSex(rs.getString(4));
						user.setEmail(rs.getString(5));
						user.setPower(rs.getString(6));
						System.out.println(user.getUserid()+" "+user.getUsername()+" "+user.getPasswd()+" "+user.getSex()+" "+user.getEmail()+" "+user.getPower());	
						System.out.println("----------------------------------");
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
	 * 输入userid修改密码
	 */
	public boolean updatepassword(int userid, String password) {
		ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
		    rs=stat.executeQuery("select * from user where userid='"+userid+"'");
			 while (rs.next()) {
				 flag = true;
			 }
			 if(flag==true)
			 {
			 stat.executeUpdate("update user set  passwd='"+password+"' where userid='"+userid+"'");		
			 }		
		}
		catch(SQLException e) {
			System.out.println("修改数据时出现错误");
			e.printStackTrace();
			throw new DaoException("更新数据时出错",e);
		}		
		finally {			
			DBUtil.closeStatement(rs, stat);
		}
		return flag;
	}
	
	/**
	 * 根据userid修改性别
	 */
	public boolean updatesex(int userid, String sex) {
		ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
		    rs=stat.executeQuery("select * from user where userid='"+userid+"'");
			 while (rs.next()) {
				 flag = true;
			 }
			 if(flag==true)
			 {
			stat.executeUpdate("update user set  sex='"+sex+"' where userid='"+userid+"'");		
			 }			
		}
		catch(SQLException e) {
			System.out.println("修改数据时出现错误");
			e.printStackTrace();
			throw new DaoException("更新数据时出错",e);
		}
		
		finally {			
			DBUtil.closeStatement(rs, stat);
		}
		return flag;
	}
	
	/**
	 * 根据userid修改email
	 */
	public boolean updateemail(int userid, String email) {
		ResultSet rs=null;
		Statement stat=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		boolean flag = false;
		try{
			conn=DBUtil.getConnection();
		    stat=conn.createStatement();
		    rs=stat.executeQuery("select * from user where userid='"+userid+"'");
			 while (rs.next()) {
				 flag = true;
			 }
			 if(flag==true)
			 {
			stat.executeUpdate("update user set  email='"+email+"' where userid='"+userid+"'");		
			 }			
		}
		catch(SQLException e) {
			System.out.println("修改数据时出现错误");
			e.printStackTrace();
			throw new DaoException("更新数据时出错",e);
		}		
		finally {			
			DBUtil.closeStatement(rs, stat);
		}
		return flag;
	}
	
	
	

}
