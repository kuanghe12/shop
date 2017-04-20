package com.crazy.shop.model;
import java.io.Serializable;
import java.util.Date;

public class GoodsInfo implements Serializable{
	private Long infoId;
	private Long supplierSkuId;
	private Long goodId;
	private Byte typeId;
	private Double goodPrice;
	private Integer goodNum;
	private String goodDesc;
	private Date goodCreatTime;
	private Byte goodStatus;
	private String remark;
	public Long getInfoId() {
		return infoId;
	}
	public void setInfoId(Long infoId) {
		this.infoId = infoId;
	}
	public Long getSupplierSkuId() {
		return supplierSkuId;
	}
	public void setSupplierSkuId(Long supplierSkuId) {
		this.supplierSkuId = supplierSkuId;
	}
	public Long getGoodId() {
		return goodId;
	}
	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}
	public Byte getTypeId() {
		return typeId;
	}
	public void setTypeId(Byte typeId) {
		this.typeId = typeId;
	}
	public Double getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(Double goodPrice) {
		this.goodPrice = goodPrice;
	}
	public Integer getGoodNum() {
		return goodNum;
	}
	public void setGoodNum(Integer goodNum) {
		this.goodNum = goodNum;
	}
	public String getGoodDesc() {
		return goodDesc;
	}
	public void setGoodDesc(String goodDesc) {
		this.goodDesc = goodDesc;
	}
	public Date getGoodCreatTime() {
		return goodCreatTime;
	}
	public void setGoodCreatTime(Date goodCreatTime) {
		this.goodCreatTime = goodCreatTime;
	}
	public Byte getGoodStatus() {
		return goodStatus;
	}
	public void setGoodStatus(Byte goodStatus) {
		this.goodStatus = goodStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
