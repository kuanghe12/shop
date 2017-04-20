package com.crazy.shop.model;
import java.io.Serializable;
import java.util.Date;
/**
 * 平台相关信息
 * @author crazy
 */
public class Platform implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long platformId;
	private String platformName;
	private String platformCategory;
	private Integer platformContants;
	private Byte platformStatus;
	private Date platformTime;
	private String remark;
	
	
	
	private Integer pageIndex;
	private Integer pageSize;
	private Integer limit;
	
	public Long getPlatformId() {
		return platformId;
	}
	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public String getPlatformCategory() {
		return platformCategory;
	}
	public void setPlatformCategory(String platformCategory) {
		this.platformCategory = platformCategory;
	}
	public Integer getPlatformContants() {
		return platformContants;
	}
	public void setPlatformContants(Integer platformContants) {
		this.platformContants = platformContants;
	}
	public Byte getPlatformStatus() {
		return platformStatus;
	}
	public void setPlatformStatus(Byte platformStatus) {
		this.platformStatus = platformStatus;
	}
	public Date getPlatformTime() {
		return platformTime;
	}
	public void setPlatformTime(Date platformTime) {
		this.platformTime = platformTime;
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
	
}
