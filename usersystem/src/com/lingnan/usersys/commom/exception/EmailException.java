package com.lingnan.usersys.commom.exception;

public class EmailException  extends  ServiceException {
	
	/**
	 * 构造方法
	 */
	public EmailException() {
		
	}
	
	/**
	 * 参数为字符串的构造方法
	 * @param arg0
	 */
	public EmailException(String arg0) {
		super(arg0);
	}
	
	/**
	 * 参数为异常的构造方法
	 * @param d
	 */
	public EmailException(Throwable d) {
		super(d);
	}
	
	/**
	 * 两个参数的构造方法
	 * @param s
	 * @param d
	 */
	public EmailException(String s, Throwable d) {
		super(s, d);
		
	}
	

}


