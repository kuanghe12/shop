package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;
/**
 * 快递单号详细
 * @author crazy
 *
 */
public class ExpressTrackInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long infoId;
	private Long expressId;
	private String acceptStation;
	private String acceptTime;
	private Date infoTime;
	private String remark;
	
	public Long getInfoId() {
		return infoId;
	}
	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
	public Long getExpressId() {
		return expressId;
	}
	public void setExpressId(Long expressId) {
		this.expressId = expressId;
	}
	public String getAcceptStation() {
		return acceptStation;
	}
	public void setAcceptStation(String acceptStation) {
		this.acceptStation = acceptStation;
	}
	public String getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(String acceptTime) {
		this.acceptTime = acceptTime;
	}
	
	public Date getInfoTime() {
		return infoTime;
	}
	public void setInfoTime(Date infoTime) {
		this.infoTime = infoTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
