package com.crazy.shop.model;

import java.io.Serializable;

public class KdniaoTrack implements Serializable{
	
	private String EBusinessID;
	private String ShipperCode;
	private Boolean Success;
	private String LogisticCode;
	private String State;
	private Traces trace;
	
	public String getEBusinessID() {
		return EBusinessID;
	}
	public void setEBusinessID(String eBusinessID) {
		EBusinessID = eBusinessID;
	}
	public String getShipperCode() {
		return ShipperCode;
	}
	public void setShipperCode(String shipperCode) {
		ShipperCode = shipperCode;
	}
	public Boolean getSuccess() {
		return Success;
	}
	public void setSuccess(Boolean success) {
		Success = success;
	}
	public String getLogisticCode() {
		return LogisticCode;
	}
	public void setLogisticCode(String logisticCode) {
		LogisticCode = logisticCode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Traces getTrace() {
		return trace;
	}
	public void setTrace(Traces trace) {
		this.trace = trace;
	}
	
	
}
