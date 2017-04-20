package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;
/**
 * 快递单号基本信息
 * @author crazy
 *
 */
public class ExpressTrack implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long expressId;
	private Long orderId;
	private String ebusinessId;
	private String shipperCode;
	private String success;
	private String logisticCode;
	private String State;
	private Date expressTime;
	private String remark;
	
	public Long getExpressId() {
		return expressId;
	}
	public void setExpressId(Long expressId) {
		this.expressId = expressId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getEbusinessId() {
		return ebusinessId;
	}
	public void setEbusinessId(String ebusinessId) {
		this.ebusinessId = ebusinessId;
	}
	public String getShipperCode() {
		return shipperCode;
	}
	public void setShipperCode(String shipperCode) {
		this.shipperCode = shipperCode;
	}
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getLogisticCode() {
		return logisticCode;
	}
	public void setLogisticCode(String logisticCode) {
		this.logisticCode = logisticCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Date getExpressTime() {
		return expressTime;
	}
	public void setExpressTime(Date expressTime) {
		this.expressTime = expressTime;
	}
	
}
