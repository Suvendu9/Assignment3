package com.componentprocessing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompleteRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int requestId; 
	private int creditCardNumber;
	private int creditLimit;
	private int processingCharge;
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	public int getProcessingCharge() {
		return processingCharge;
	}
	public void setProcessingCharge(int processingCharge) {
		this.processingCharge = processingCharge;
	}
	
	
}
