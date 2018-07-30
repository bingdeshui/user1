package com.lingnan.usersys.common.dao;

import java.sql.Connection;

import com.lingnan.usersys.commom.exception.ServiceException;
import com.lingnan.usersys.user.dao.UserDaoImpl;


public class DaoFactory {
    /**
     * 获得用户dao对象的工厂方法
     * 
     * @param conn 数据库连接对象
     * @param type dao常量
     * @return dao接口
     */
	
	public static BaseDao getDao(Connection conn, String type) {
		if("user".equals(type)) {
			//返回实例化的dao对象
			return new UserDaoImpl(conn);
			
		}
		else {
			throw new ServiceException("连接不成功");
		}
		
	}
}
