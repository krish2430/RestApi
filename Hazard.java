package com.tcs.pim.domain;

import java.io.Serializable;

public class Hazard implements Serializable{
	private String id;
	private String hazard;
	private String order;
	private String country;
	private String language;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getHazard() {
		return hazard;
	}
	public void setHazard(String hazard) {
		this.hazard = hazard;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
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
