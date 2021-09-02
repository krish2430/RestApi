package com.tcs.pim.domain;

import java.io.Serializable;


public class AdditionalEquipment implements Serializable{
	private String additionalEquipment;
	private int order;
	private String country;
	private String language;

	public String getAdditionalEquipment() {
		return additionalEquipment;
	}

	public void setAdditionalEquipment(String additionalEquipment) {
		this.additionalEquipment = additionalEquipment;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
