package com.crazy.shop.model;

import java.io.Serializable;

public class OrderInfoVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long orderId;
	private String exchangeName;//兑换品名称
	private Integer exchangeNum;//兑换品数量
	private String skuNo;//sku
	private String orderNum;//订单编号
	private Double payAmout;//支付总额
	private Integer payScore;//支付积分
	private String productNum;//产品编号
	private String goodName;//商品名称
	private String goodOtherName;//商品副标题
	private String supplierName;//供应商名称
	private String recipientsName;//收件人名称
	private String recipientsAddress;//收件人地址
	private String recipientsMobile;//收件人电话
	private String logisticCode;
	private String shipperCode;
	private String kuaidiStatus;//快递状态
	private Long typeId;
	
	
	public String getKuaidiStatus() {
		return kuaidiStatus;
	}
	public void setKuaidiStatus(String kuaidiStatus) {
		this.kuaidiStatus = kuaidiStatus;
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
	public String getSkuNo() {
		return skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
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
	public String getProductNum() {
		return productNum;
	}
	public void setProductNum(String productNum) {
		this.productNum = productNum;
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
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getRecipientsName() {
		return recipientsName;
	}
	public void setRecipientsName(String recipientsName) {
		this.recipientsName = recipientsName;
	}
	public String getRecipientsAddress() {
		return recipientsAddress;
	}
	public void setRecipientsAddress(String recipientsAddress) {
		this.recipientsAddress = recipientsAddress;
	}
	public String getRecipientsMobile() {
		return recipientsMobile;
	}
	public void setRecipientsMobile(String recipientsMobile) {
		this.recipientsMobile = recipientsMobile;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	

}
