package com.tcs.pim.domain;

import java.io.Serializable;

public class ItemBrand implements Serializable{
	private String id;
	private String brand;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	

}
