package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ��Ӧ����Ϣ��
 * @author crazy
 *
 */
public class Supplier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long supplierId;
	private String supplierSkuId;
	private Byte supplierType;
	private String supplierName;
	private String supplierAddress;
	private String supplierMobile;
	private String supplierEmail;
	private String supplierQq;
	private String supplierWeixin;
	private Date supplierTime;
	private Byte supplierStatus;
	private String remark;
	private Integer pageIndex;
	private Integer pageSize;
	private Integer limit;
	
	private Date startTime;
	private Date endTime;
	
	
	
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
	public String getSupplierSkuId() {
		return supplierSkuId;
	}
	public void setSupplierSkuId(String supplierSkuId) {
		this.supplierSkuId = supplierSkuId;
	}
	public Byte getSupplierType() {
		return supplierType;
	}
	public void setSupplierType(Byte supplierType) {
		this.supplierType = supplierType;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierAddress() {
		return supplierAddress;
	}
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	public String getSupplierMobile() {
		return supplierMobile;
	}
	public void setSupplierMobile(String supplierMobile) {
		this.supplierMobile = supplierMobile;
	}
	public String getSupplierEmail() {
		return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
	public String getSupplierQq() {
		return supplierQq;
	}
	public void setSupplierQq(String supplierQq) {
		this.supplierQq = supplierQq;
	}
	public String getSupplierWeixin() {
		return supplierWeixin;
	}
	public void setSupplierWeixin(String supplierWeixin) {
		this.supplierWeixin = supplierWeixin;
	}
	public Date getSupplierTime() {
		return supplierTime;
	}
	public void setSupplierTime(Date supplierTime) {
		this.supplierTime = supplierTime;
	}
	public Byte getSupplierStatus() {
		return supplierStatus;
	}
	public void setSupplierStatus(Byte supplierStatus) {
		this.supplierStatus = supplierStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
