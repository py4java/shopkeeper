package com.shopkeeper.dto;

import java.io.Serializable;

public class StoreDto implements Serializable {

	private static final long serialVersionUID = -7074888941932485662L;

	private String storeCode;
	private String storeName;
	private String contactNumber;
	private String storeAddress;

	public StoreDto(String storeCode, String storeName, String contactNumber, String storeAddress) {
		this.storeCode = storeCode;
		this.storeName = storeName;
		this.contactNumber = contactNumber;
		this.storeAddress = storeAddress;
	}

	public String getStoreCode() {
		return storeCode;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	@Override
	public String toString() {
		return "StoreDto [storeCode=" + storeCode + ", storeName=" + storeName + ", contactNumber=" + contactNumber
				+ ", storeAddress=" + storeAddress + "]";
	}

}
