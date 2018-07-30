package com.lingnan.usersys.usermgr.domain;

import java.util.Date;

public class UserDto {
	private int userid ;
	private String username;
	private String passwd ;
	private String sex ;
	private String email ;
	private String power ;
	
	/**
	 * 获取userid
	 * @return
	 */
	public int getUserid() {
		return userid;
	}
	
	/**
	 * 设置userid
	 * @param userid
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取账户名
	 * @return
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * 设置账户
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * 获取密码
	 * @return
	 */
	public String getPasswd() {
		return passwd;
	}
	
	/**
	 * 设置密码
	 * @param passwd
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	/**
	 * 获取性别
	 * @return
	 */
	public String getSex() {
		return sex;
	}
	
	/**
	 * 设置性别
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	/**
	 * 获取email
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * 设置email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 获取身份
	 * @return
	 */
	public String getPower() {
		return power;
	}
	
	/**
	 * 设置身份
	 * @param power
	 */
	public void setPower(String power) {
		this.power = power;
	}
	
	
	

}
