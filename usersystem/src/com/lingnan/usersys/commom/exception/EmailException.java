package com.lingnan.usersys.commom.exception;

public class EmailException  extends  ServiceException {
	
	/**
	 * 无参数构造方法
	 */
	public EmailException() {
		
	}
	
	/**
	 * 参数为字符串的构造方法，是打印出来的
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
	 * @param s 需要打印出来的异常
	 * @param d 抛出的异常
	 */
	public EmailException(String s, Throwable d) {
		super(s, d);
		
	}
	

}


