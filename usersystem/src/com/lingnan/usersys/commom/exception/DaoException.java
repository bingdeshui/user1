package com.lingnan.usersys.commom.exception;

public class DaoException extends RuntimeException {
	
	/**
	 * 无参数构造方法
	 */
	public DaoException() {
		
	}

	/**
	 * 参数为字符串的构造方法
	 * @param arg0
	 */
	public DaoException(String arg0) {
		super(arg0);
	}
	
	/**
	 * 参数为异常的构造方法
	 * @param d
	 */
	public DaoException(Throwable d) {
		super(d);
	}
	/**
	 * 两个参数的构造方法
	 * @param s 打印出来的异常
	 * @param d 要抛出的异常
	 */
	public DaoException(String s, Throwable d) {
		super(s, d);
		
	}
}
