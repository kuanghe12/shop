package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 平台对账单
 * @author crazy
 *
 */
public class PlatformBill implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String platformName;
	private String platformCategory;
	private String goodName;
	private String goodDesc;
	private Integer exchangeNum;
	private Double payAmoutCount;
	private Double payAmout;
	private Integer payScore;
	private Double otherPayAmount;
	
	private Date startTime;
	private Date endTime;
	
	
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
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
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
	public Double getPayAmoutCount() {
		return payAmoutCount;
	}
	public void setPayAmoutCount(Double payAmoutCount) {
		this.payAmoutCount = payAmoutCount;
	}
	public Double getPayAmout() {
		return payAmout;
	}
	public void setPayAmout(Double payAmout) {
		this.payAmout = payAmout;
	}
	public Integer getPayScore() {
		return payScore;
	}
	public void setPayScore(Integer payScore) {
		this.payScore = payScore;
	}
	public Double getOtherPayAmount() {
		return otherPayAmount;
	}
	public void setOtherPayAmount(Double otherPayAmount) {
		this.otherPayAmount = otherPayAmount;
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
	

}
