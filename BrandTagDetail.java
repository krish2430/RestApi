package com.tcs.pim.domain;

import java.io.Serializable;

public class BrandTagDetail implements Serializable{
	private String familyType;
	private String brandTag;
	private String region;
	private String language;
	public String getFamilyType() {
		return familyType;
	}
	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}
	public String getBrandTag() {
		return brandTag;
	}
	public void setBrandTag(String brandTag) {
		this.brandTag = brandTag;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
