package com.tcs.pim.domain;

import java.io.Serializable;


public class FeaturePoint implements Serializable{
	private String featurePoint;
	private String featurePointClassification;
	private int order;
	private String country;
	private String language;

	public String getFeaturePoint() {
		return featurePoint;
	}

	public void setFeaturePoint(String featurePoint) {
		this.featurePoint = featurePoint;
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

	public String getFeaturePointClassification() {
		return featurePointClassification;
	}

	public void setFeaturePointClassification(String featurePointClassification) {
		this.featurePointClassification = featurePointClassification;
	}

}
