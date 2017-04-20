package com.crazy.shop.model;

import java.io.Serializable;
/**
 * @author crazy
 *
 */
public class OrderVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String distriNo;//配送编号
	private String orderNo;//订单编号
	private String OrderCreateTime;//订单生成时间
	private String productNo;//产品编号
	private String exchangeNo;//兑换品名称
	private String exchangeNum;//兑换品数量
	private String operationType;//操作类型
	private String recipientsName;//收件人名称
	private String recipientsAddress;//收件人地址
	private String recipientsMobile;//收件人电话
	private String distriDesc;//配送说明
	private String distriTime;//送货时间
	private String supplierMsg;//供应商反馈
	private String signTime;//签收时间
	private String distriResult;//配送结果
	private String uploadStatus;//上载状态
	private String isClientDelayed;//是否客户要求延时
	private String operationStatus;//操作状态
	private String supplierName;//供应商名称
	private String supplierCode;//邮编
	private String standardOne;//规格属性1
	private String standardTwo;//规格属性2
	private String commonCarrier;//承运商
	private String expressageNum;//快递单号
	private String fenCenter;//分中心
	private String sourceType;//渠道来源
	private String shopNum;//商品货号
	private String shopFTitile;//商品副标题
	private String isInvoice;//是否开票
	private String invoiceTitle;//开票抬头
	private String invoiceMoney;//开票金额
	private String invoiceTaiTou;//发票抬头
	private String invoiceCompany;//发票公司名称
	private String invoiceType;//发票类型
	private String payAmout;//支付总额
	private String payMoney;//支付现金额
	private String payPoints;//支付积分
	private String otherPay;//其他支付
	private String province;//省
	private String city;//市
	private String  area;//区
	private String address;//收货人详细地址ַ
	public String getDistriNo() {
		return distriNo;
	}
	public void setDistriNo(String distriNo) {
		this.distriNo = distriNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderCreateTime() {
		return OrderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		OrderCreateTime = orderCreateTime;
	}
	public String getProductNo() {
		return productNo;
	}
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public String getExchangeNo() {
		return exchangeNo;
	}
	public void setExchangeNo(String exchangeNo) {
		this.exchangeNo = exchangeNo;
	}
	public String getExchangeNum() {
		return exchangeNum;
	}
	public void setExchangeNum(String exchangeNum) {
		this.exchangeNum = exchangeNum;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
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
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
	public String getStandardTwo() {
		return standardTwo;
	}
	public void setStandardTwo(String standardTwo) {
		this.standardTwo = standardTwo;
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
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getShopNum() {
		return shopNum;
	}
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}
	public String getShopFTitile() {
		return shopFTitile;
	}
	public void setShopFTitile(String shopFTitile) {
		this.shopFTitile = shopFTitile;
	}
	public String getIsInvoice() {
		return isInvoice;
	}
	public void setIsInvoice(String isInvoice) {
		this.isInvoice = isInvoice;
	}
	public String getInvoiceTitle() {
		return invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}
	public String getInvoiceMoney() {
		return invoiceMoney;
	}
	public void setInvoiceMoney(String invoiceMoney) {
		this.invoiceMoney = invoiceMoney;
	}
	public String getInvoiceTaiTou() {
		return invoiceTaiTou;
	}
	public void setInvoiceTaiTou(String invoiceTaiTou) {
		this.invoiceTaiTou = invoiceTaiTou;
	}
	public String getInvoiceCompany() {
		return invoiceCompany;
	}
	public void setInvoiceCompany(String invoiceCompany) {
		this.invoiceCompany = invoiceCompany;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getPayAmout() {
		return payAmout;
	}
	public void setPayAmout(String payAmout) {
		this.payAmout = payAmout;
	}
	public String getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}
	public String getPayPoints() {
		return payPoints;
	}
	public void setPayPoints(String payPoints) {
		this.payPoints = payPoints;
	}
	public String getOtherPay() {
		return otherPay;
	}
	public void setOtherPay(String otherPay) {
		this.otherPay = otherPay;
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
	
	
	
	

}
