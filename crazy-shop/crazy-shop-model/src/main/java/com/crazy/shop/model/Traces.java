package com.crazy.shop.model;

import java.io.Serializable;

public class Traces implements Serializable{
	
	private String acceptTime;//时间
	private String acceptStation;//地址
	private String remark;
	
	public String getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}
	public String getAcceptStation() {
		return acceptStation;
	}
	public void setAcceptStation(String acceptStation) {
		this.acceptStation = acceptStation;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	
}
