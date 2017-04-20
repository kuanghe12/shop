package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 供应商联系人
 * @author crazy
 *
 */
public class SupplierContact implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long contactId;
	private Long supplierId;
	private String contactName;
	private String contactAddress;
	private String contactMobile;
	private String contactEmail;
	private String contactQq;
	private String contactWeixin;
	private Date contactTime;
	private Byte contactIsEmail;
	private Byte contactStatus;
	private String remark;
	
	private Integer pageIndex;
	private Integer pageSize;
	private Integer limit;
	
	
	
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
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getContactMobile() {
		return contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactQq() {
		return contactQq;
	}
	public void setContactQq(String contactQq) {
		this.contactQq = contactQq;
	}
	public String getContactWeixin() {
		return contactWeixin;
	}
	public void setContactWeixin(String contactWeixin) {
		this.contactWeixin = contactWeixin;
	}
	
	public Date getContactTime() {
		return contactTime;
	}
	public void setContactTime(Date contactTime) {
		this.contactTime = contactTime;
	}
	public Byte getContactIsEmail() {
		return contactIsEmail;
	}
	public void setContactIsEmail(Byte contactIsEmail) {
		this.contactIsEmail = contactIsEmail;
	}
	public Byte getContactStatus() {
		return contactStatus;
	}
	public void setContactStatus(Byte contactStatus) {
		this.contactStatus = contactStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
