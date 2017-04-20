package com.crazy.shop.model;

import java.io.Serializable;
import java.util.Date;
/**
 * private Long
 * @author crazy
 *
 */
public class Invoice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long invoiceId;
	private Long orderId;
	private String invoiceTitle;
	private Double invoiceMoney;
	private String invoiceTaitou;
	private String invoiceCompany;
	private String invoiceType;
	private Byte invoiceStatus;
	private Date invoiceTime;
	private String remark;
	
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getInvoiceTitle() {
		return invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}
	public Double getInvoiceMoney() {
		return invoiceMoney;
	}
	public void setInvoiceMoney(Double invoiceMoney) {
		this.invoiceMoney = invoiceMoney;
	}
	public String getInvoiceTaitou() {
		return invoiceTaitou;
	}
	public void setInvoiceTaitou(String invoiceTaitou) {
		this.invoiceTaitou = invoiceTaitou;
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
	public Byte getInvoiceStatus() {
		return invoiceStatus;
	}
	public void setInvoiceStatus(Byte invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	public Date getInvoiceTime() {
		return invoiceTime;
	}
	public void setInvoiceTime(Date invoiceTime) {
		this.invoiceTime = invoiceTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
