package com.packaginganddelevery.entity;

import org.springframework.stereotype.Component;

@Component
public class PackageAndDeliveryCostDetail {
	
	 private int  integralItem= 100;
	 private int acessory = 50;
	 private int protectiveSheath = 50;
	
	
	 private int integralItemDeliveryCharge=200;
	 private int accessoryDeliveryCharge=100;
	 
	 
	public int getIntegralItem() {
		return integralItem;
	}
	public int getAcessory() {
		return acessory;
	}
	public int getProtectiveSheath() {
		return protectiveSheath;
	}
	public int getIntegralItemDeliveryCharge() {
		return integralItemDeliveryCharge;
	}
	public int getAccessoryDeliveryCharge() {
		return accessoryDeliveryCharge;
	}
	
	 
	 

	

}
