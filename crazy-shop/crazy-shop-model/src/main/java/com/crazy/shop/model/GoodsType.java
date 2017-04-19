package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ��Ʒ���
 * @author crazy
 *
 */
public class GoodsType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long typeId;
	private String typeName;
	private String typeDesc;
	private Date typeTime;
	private Byte typeStatus;
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
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	public Date getTypeTime() {
		return typeTime;
	}
	public void setTypeTime(Date typeTime) {
		this.typeTime = typeTime;
	}
	public Byte getTypeStatus() {
		return typeStatus;
	}
	public void setTypeStatus(Byte typeStatus) {
		this.typeStatus = typeStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	
}
