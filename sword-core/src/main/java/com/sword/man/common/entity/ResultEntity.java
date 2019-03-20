package com.sword.man.common.entity;

public class ResultEntity<T> {

	private String code;

	private String msg;

	private T data;

	public ResultEntity() {
		this.code = "0";
		this.msg = "请求成功";
	}

	public ResultEntity(T data) {
		this();
		this.data = data;
	}

	public ResultEntity(BaseErrorType errorType) {
		this.code = errorType.getCode();
		this.msg = errorType.getMsg();
	}

	public ResultEntity(BaseErrorType errorType, T data) {
		this(errorType);
		this.data = data;
	}

	public ResultEntity(String code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
