package com.lingnan.usersys.usermgr.view;

import com.lingnan.usersys.usermgr.domain.UserDto;

public interface BaseFrame {
	
	/**
	 * 用户操作页面显示
	 */
	public void show();
	
	/**
	 * 增加用户页面显示
	 * @param type
	 */
	public void addShow(String type);
	
	/**
	 * 登录页面
	 */
	public void loginShow();
	
	/**
	 * 查询信息的界面
	 */
	public void searchShow(String type);
	
	/**
	 * 修改信息的界面
	 * @param type
	 * @param user
	 */
	public void updateShow(String type,UserDto user);
	
	/**
	 * 删除信息的界面
	 * @param userid
	 */
	public void deleteShow();

}
