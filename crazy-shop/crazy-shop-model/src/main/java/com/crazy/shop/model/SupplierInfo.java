package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ��Ӧ�̸�����
 * @author crazy
 *
 */
public class SupplierInfo implements Serializable{
	private Long infoId;
	private Long supplierId;
	private String infoImg;
	private Date infoTime;
	private Byte infoStatus;
	private String remark;
	public Long getInfoId() {
		return infoId;
	}
	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getInfoImg() {
		return infoImg;
	}
	public void setInfoImg(String infoImg) {
		this.infoImg = infoImg;
	}
	public Date getInfoTime() {
		return infoTime;
	}
	public void setInfoTime(Date infoTime) {
		this.infoTime = infoTime;
	}
	public Byte getInfoStatus() {
		return infoStatus;
	}
	public void setInfoStatus(Byte infoStatus) {
		this.infoStatus = infoStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
