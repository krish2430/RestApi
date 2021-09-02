package com.tcs.pim.domain;

import java.io.Serializable;

public class Feature implements Serializable{
	public String country;
	public String language;
	public String features;

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

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

}
