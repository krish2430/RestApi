package com.tcs.pim.domain;

import java.io.Serializable;

public class FamilyFeaturePoint implements Serializable{
	private String featurePoint;
	private String featurePointClassification;
	private String order;
	private String country;
	private String language;
	public String getFeaturePoint() {
		return featurePoint;
	}
	public void setFeaturePoint(String featurePoint) {
		this.featurePoint = featurePoint;
	}
	public String getFeaturePointClassification() {
		return featurePointClassification;
	}
	public void setFeaturePointClassification(String featurePointClassification) {
		this.featurePointClassification = featurePointClassification;
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
