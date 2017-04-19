package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 供应商对账单
 * @author crazy
 *
 */
public class SupplierBill implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderNum;
	private String typeName;
	private String goodDesc;
	private Integer exchangeNum;
	private Double goodPrice;
	private String goodName;
	private Long supplierId;
	private String supplierName;
	private Date orderTime;
	private String skuNo;
	
	private Date startTime;
	private Date endTime;
	
	
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getSkuNo() {
		return skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getGoodDesc() {
		return goodDesc;
	}
	public void setGoodDesc(String goodDesc) {
		this.goodDesc = goodDesc;
	}
	public Integer getExchangeNum() {
		return exchangeNum;
	}
	public void setExchangeNum(Integer exchangeNum) {
		this.exchangeNum = exchangeNum;
	}
	public Double getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(Double goodPrice) {
		this.goodPrice = goodPrice;
	}
	

}
