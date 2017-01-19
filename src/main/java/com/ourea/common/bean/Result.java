package com.ourea.common.bean;

import com.ourea.common.HttpReponseStatus;

public class Result<T> {
	private boolean success = false;
	private T data = null;
	private String msg = "";
	private String code = "";
	
	public static <T> Result<T> success(T data){
		Result<T> result = new Result<T>();
		result.setCode(HttpReponseStatus.SC_OK + "");
		result.setData(data);
		result.setSuccess(true);
		result.setMsg("success");
		return result;
 	}
	
	public static <T> Result<T> fail(String code, String msg){
		Result<T> result = new Result<T>();
		result.setCode(code);
		result.setSuccess(false);
		result.setMsg(msg);
		return result;
 	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
