package com.lingnan.usersys.commom.exception;

public class DateException extends  ServiceException{
	
	/**
	 * 构造方法
	 */
	public DateException() {
		
	}
	
	/**
	 * 参数为字符串的构造方法，要打印出来的
	 * @param arg0
	 */
	public DateException(String arg0) {
		super(arg0);
	}
	
	/**
	 * 参数为异常的构造方法
	 * @param d
	 */
	public DateException(Throwable d) {
		super(d);
	}
	
	/**
	 * 两个参数的构造方法
	 * @param s 打印出来的字符串
	 * @param d 要抛出的异常
	 */
	public DateException(String s, Throwable d) {
		super(s, d);
		
	}
	

}
