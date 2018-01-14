package com.zyq.springmvc.bean;

import java.io.Serializable;

public class CommonBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String resultCode;
	private String timeStamp;
	private Object data;
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
