package com.crazy.shop.model;

import java.util.Date;

public class PlatformGoods {
	private Long platGoodsId;
	private Long platformId;
	private Long goodId;
	private String platformName;
	private String platformCategory;
	private String skuNo;
	private Byte platformStatus;
	private Date platformTime;
	private String remark;
	private String goodSkuNo;
	
	private Integer pageIndex;
	private Integer pageSize;
	private Integer limit;
	
	public Long getPlatGoodsId() {
		return platGoodsId;
	}
	public void setPlatGoodsId(Long platGoodsId) {
		this.platGoodsId = platGoodsId;
	}
	public Long getPlatformId() {
		return platformId;
	}
	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}
	public Long getGoodId() {
		return goodId;
	}
	public void setGoodId(Long goodId) {
		this.goodId = goodId;
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
	public String getSkuNo() {
		return skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
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
	public String getGoodSkuNo() {
		return goodSkuNo;
	}
	public void setGoodSkuNo(String goodSkuNo) {
		this.goodSkuNo = goodSkuNo;
	}
	

}
