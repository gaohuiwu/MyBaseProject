package com.mbp.exception;

/**
 * FileName:BusinessException
 * Author:  ghw06
 * Date:    2018/3/27 0:04
 * Description: 业务类异常类
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 5588435315440856575L;
	private int code;
	private String msg;

	public BusinessException(){

	}

	public  BusinessException(String message){
		super(message);
		this.msg=message;
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
		this.msg = message;
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

	public BusinessException(int code) {
		this.code = code;
	}

	public BusinessException(int code, String message) {
		super(message);
		this.code = code;
		this.msg = message;
	}

	public BusinessException(int code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
		this.msg = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
