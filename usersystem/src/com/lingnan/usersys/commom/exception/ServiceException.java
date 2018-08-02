package com.lingnan.usersys.commom.exception;

public class ServiceException extends RuntimeException {
	
	/**
	 * 无参数的构造方法
	 */
	public ServiceException() {
		
	}
	
	/**
	 * 参数为字符串的构造方法
	 * @param arg0
	 */
	public ServiceException(String arg0) {
		super(arg0);
	}
	
	/**
	 * 参数为异常的构造方法
	 * @param d
	 */
	public ServiceException(Throwable d) {
		super(d);
	}
	
	/**
	 * 两个参数的构造方法
	 * @param s 需要打印出来的异常
	 * @param d 抛出的异常
	 */
	public ServiceException(String s, Throwable d) {
		super(s, d);
		
	}
	
	

}
