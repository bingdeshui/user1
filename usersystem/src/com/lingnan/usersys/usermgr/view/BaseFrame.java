package com.lingnan.usersys.usermgr.view;

import com.lingnan.usersys.usermgr.domain.UserDto;

public interface BaseFrame {
	
	/**
	 * 页面显示
	 */
	public void show();
	
	/**
	 * 增加用户页面显示
	 * @param type
	 */
	public void addShow(String type);
	
	/**
	 * 登录
	 */
	public void loginShow();
	
	/**
	 * 查询
	 */
	public void searchShow(String type);
	
	/**
	 * 修改
	 * @param type
	 * @param user
	 */
	public void updateShow(String type,UserDto user);
	
	

}
