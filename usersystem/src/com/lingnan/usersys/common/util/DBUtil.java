package com.lingnan.usersys.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lingnan.usersys.commom.exception.DaoException;

/**
 * 数据库工具类
 * @author user
 *
 */
public class DBUtil {

/**
 * 获取数据库连接的方法
 * @return 返回获取到的数据库的连接
 */
	public static Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/company",
					"root","123321");					
		}
		catch(ClassNotFoundException e) {
			System.out.println("mysql的驱动程序找不到，看是不是对应的jar包没有加载？");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("获取数据库连接时出现sql语句错误");
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 事务开启
	 * @param conn
	 */
	public static void beginTransaction(Connection conn) {
		try {
			//将事务的自动提交模式设为假
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			throw new DaoException("事务开启失败",e); 
		}
	}
	
	/**
	 * 提交事务
	 * @param conn
	 */
	public static void commit(Connection conn) {
		try {
			//提交事务
			conn.commit();
			//将事务的自动提交模式设为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new DaoException("事务提交失败",e);
		}
	}
	
	/**
	 * 回滚事务
	 * @param conn
	 */
	public static void roolback(Connection conn) {
		try {
			//回滚事务
			conn.rollback();
			//将事务的自动提交模式设为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new DaoException("事务回滚失败",e);
		}
	}
	
	/**
	 * 关闭连接
	 * @param conn
	 */
	public static void closeConnection(Connection conn) {
		try {
			//如果数据库连接对象不为空，关闭该对象
			if(conn !=null) {
				conn.close();
			}
		} catch (SQLException e) {
			throw new DaoException("关闭连接对象失败",e);
		}
	}
	
	/**
	 * 关闭statement
	 * @param rs
	 * @param stmt
	 */
	public static void closeStatement(ResultSet rs, Statement stmt) {
		try {
			//如果查询结果集对象不为空，关闭该对象
			if (rs !=null) {
				rs.close();
			}
			//如果声明对象不为空，关闭该对象
			if (stmt !=null) {
				stmt.close();
			}
		 } catch (SQLException e) {
			 //将异常封装为自定义异常
			throw new DaoException("关闭声明对象失败",e);
		 }
	} 
}
