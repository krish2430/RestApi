package com.tcs.pim.domain;

import java.io.Serializable;

public class GmidName implements Serializable{
	private String gmidName;
	private String country;
	private String language;

	public String getGmidName() {
		return gmidName;
	}

	public void setGmidName(String gmidName) {
		this.gmidName = gmidName;
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
