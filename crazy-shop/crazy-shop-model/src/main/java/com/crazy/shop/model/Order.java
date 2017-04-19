package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author crazy
 */
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long orderId;
	private String skuNo;
	private String distriNum;
	private String orderNum;
	private String productNum;
	private String exchangeName;
	private Integer exchangeNum;
	private String operationType;
	private String paymentType;
	private Double payAmoutCount;
	private Double payAmout;
	private Integer payScore;
	private Double otherPayAmount;
	private String orderTime;
	private String isInvoice;
	private String logisticCode;
	private String shipperCode;
	private String kuaidiStatus;//快递状态
	
	private String remark;
	private Long supplierId;
	
	private Date startTime;
	private Date endTime;
	
	private Integer pageIndex;
	private Integer pageSize;
	private Integer limit;
	
	
	public String getKuaidiStatus() {
		return kuaidiStatus;
	}
	public void setKuaidiStatus(String kuaidiStatus) {
		this.kuaidiStatus = kuaidiStatus;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
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
	public String getLogisticCode() {
		return logisticCode;
	}
	public void setLogisticCode(String logisticCode) {
		this.logisticCode = logisticCode;
	}
	public String getShipperCode() {
		return shipperCode;
	}
	public void setShipperCode(String shipperCode) {
		this.shipperCode = shipperCode;
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
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}
	public String getExchangeName() {
		return exchangeName;
	}
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	public Integer getExchangeNum() {
		return exchangeNum;
	}
	public void setExchangeNum(Integer exchangeNum) {
		this.exchangeNum = exchangeNum;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
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
	
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	
	public String getIsInvoice() {
		return isInvoice;
	}
	public void setIsInvoice(String isInvoice) {
		this.isInvoice = isInvoice;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getSkuNo() {
		return skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}
	public String getProductNum() {
		return productNum;
	}
	public String getDistriNum() {
		return distriNum;
	}
	public void setDistriNum(String distriNum) {
		this.distriNum = distriNum;
	}
	
}
