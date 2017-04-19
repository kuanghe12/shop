package com.crazy.shop.model;

import java.io.Serializable;

/**
 * 收货地址
 * @author crazy
 *
 */
public class GoodsReceipt implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long receiptId;
	private Long orderId;
	private String recipientsName;
	private String recipientsAddress;
	private String recipientsMobile;
	private String distriDesc;
	private String distriTime;
	private String supplierMsg;
	private String signTime;
	private String distriResult;
	private String uploadStatus;
	private String isClientDelayed;
	private String operationStatus;
	private String supplierCode;
	private String standardOne;
	private String standardYTwo;
	private String commonCarrier;
	private String expressageNum;
	private String fenCenter;
	private String province;
	private String city;
	private String area;
	private String address;
	private Byte receiptStatus;
	private String remark;
	public Long getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(Long receiptId) {
		this.receiptId = receiptId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
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
	public String getDistriDesc() {
		return distriDesc;
	}
	public void setDistriDesc(String distriDesc) {
		this.distriDesc = distriDesc;
	}
	
	public String getDistriTime() {
		return distriTime;
	}
	public void setDistriTime(String distriTime) {
		this.distriTime = distriTime;
	}
	public String getSupplierMsg() {
		return supplierMsg;
	}
	public void setSupplierMsg(String supplierMsg) {
		this.supplierMsg = supplierMsg;
	}
	public String getSignTime() {
		return signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}
	public String getDistriResult() {
		return distriResult;
	}
	public void setDistriResult(String distriResult) {
		this.distriResult = distriResult;
	}
	public String getUploadStatus() {
		return uploadStatus;
	}
	public void setUploadStatus(String uploadStatus) {
		this.uploadStatus = uploadStatus;
	}
	public String getIsClientDelayed() {
		return isClientDelayed;
	}
	public void setIsClientDelayed(String isClientDelayed) {
		this.isClientDelayed = isClientDelayed;
	}
	public String getOperationStatus() {
		return operationStatus;
	}
	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public String getStandardOne() {
		return standardOne;
	}
	public void setStandardOne(String standardOne) {
		this.standardOne = standardOne;
	}
	public String getStandardYTwo() {
		return standardYTwo;
	}
	public void setStandardYTwo(String standardYTwo) {
		this.standardYTwo = standardYTwo;
	}
	public String getCommonCarrier() {
		return commonCarrier;
	}
	public void setCommonCarrier(String commonCarrier) {
		this.commonCarrier = commonCarrier;
	}
	public String getExpressageNum() {
		return expressageNum;
	}
	public void setExpressageNum(String expressageNum) {
		this.expressageNum = expressageNum;
	}
	public String getFenCenter() {
		return fenCenter;
	}
	public void setFenCenter(String fenCenter) {
		this.fenCenter = fenCenter;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Byte getReceiptStatus() {
		return receiptStatus;
	}
	public void setReceiptStatus(Byte receiptStatus) {
		this.receiptStatus = receiptStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
