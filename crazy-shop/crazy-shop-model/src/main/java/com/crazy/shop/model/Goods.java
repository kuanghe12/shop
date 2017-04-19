package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品信息
 * @author crazy
 *
 */
public class Goods implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long goodId;
	private Long goodType;
	private Long supplierId;
	private String skuNo;
	private String supplierName;
	private String goodName;
	private String goodOtherName;
	private String goodDesc;
	private Byte goodStatus;
	private String remark;
	private Date goodCreatTime;
	private Date updateTime;
	private Integer pageIndex;
	private Integer pageSize;
	private Integer limit;
	private String goodTypeName;
	
	
	
	public String getGoodTypeName() {
		return goodTypeName;
	}
	public void setGoodTypeName(String goodTypeName) {
		this.goodTypeName = goodTypeName;
	}
	public Long getGoodId() {
		return goodId;
	}
	public void setGoodId(Long goodId) {
		this.goodId = goodId;
	}
	public Long getGoodType() {
		return goodType;
	}
	public void setGoodType(Long goodType) {
		this.goodType = goodType;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getGoodOtherName() {
		return goodOtherName;
	}
	public void setGoodOtherName(String goodOtherName) {
		this.goodOtherName = goodOtherName;
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
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSkuNo() {
		return skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
