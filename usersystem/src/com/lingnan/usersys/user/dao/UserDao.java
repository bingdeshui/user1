package com.lingnan.usersys.user.dao;

import java.util.List;

import com.lingnan.usersys.common.dao.BaseDao;
import com.lingnan.usersys.usermgr.domain.UserDto;

public interface UserDao extends BaseDao {
	
	/**
	 * 注册用户/添加用户
	 * @param user 用户信息
	 * @return 成功返回true，失败返回false
	 */
	public boolean addUser(UserDto user);
	
	/**
	 * 用户登录
	 * @param name 用户账号
	 * @param password 密码
	 * @return
	 */
	public UserDto login(String name, String password);
	
	/**
	 * 删除用户信息
	 * @param userid
	 * @return flag值
	 */
	public boolean deleteUser(int userid);
	
	/**
	 * 按userid查找用户信息
	 * @param userid
	 * @return 用户信息
	 */
	public UserDto selectuerid( int userid);
	
	/**
	 * 按username查找用户信息
	 * @param username
	 * @return 用户信息
	 */
	public UserDto selectusername(String  username);
	
	/**
	 * 查找全部数据
	 * @return 用户信息
	 */
	public UserDto selectAll();
	
	/**
	 * 更新数据
	 * @param userid
	 * @param user1
	 * @return flag值
	 */
	public boolean updateAll(int userid, UserDto user1); 
	
	/**
	 * 输入userid，进而修改密码
	 * @param userid 
	 * @param password
	 * @return flag值
	 */
	public boolean updatepassword(int userid, String password); 
	
	/**
	 * 修改性别
	 * @param userid
	 * @param password
	 * @return flag值
	 */
	public boolean updatesex(int userid, String sex); 
	
	/**
	 * 修改email
	 * @param userid
	 * @param emain
	 * @return flag值
	 */
	public boolean updateemail(int userid, String email); 
	
	/**
	 * 分页查询
	 * @return 用户信息
	 */
	public UserDto selectpage(int page,int row);
	

}
