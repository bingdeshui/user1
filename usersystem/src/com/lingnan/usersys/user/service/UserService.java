package com.lingnan.usersys.user.service;

import com.lingnan.usersys.usermgr.domain.UserDto;

public interface UserService {
	
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
	 * @return
	 */
	public boolean deleteUser(int userid);
	
	/**
	 * 按userid查找用户信息
	 * @param userid
	 * @return
	 */
	public UserDto selectuerid( int userid);
	
	/**
	 * 按username查找用户信息
	 * @param username
	 * @return
	 */
	public UserDto selectusername(String  username);

	
	

}
