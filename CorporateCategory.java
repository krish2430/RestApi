package com.tcs.pim.domain;

import java.io.Serializable;

public class CorporateCategory implements Serializable{
	private String id;
	private String region;
	private String language;
	private String corporateCategories;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCorporateCategories() {
		return corporateCategories;
	}

	public void setCorporateCategories(String corporateCategories) {
		this.corporateCategories = corporateCategories;
	}

}
