package com.tcs.pim.domain;

import java.io.Serializable;

public class IndustrySegment implements Serializable{
	public String id;
	public String industrySegment;
	public String order;
	public String country;
	public String language;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIndustrySegment() {
		return industrySegment;
	}

	public void setIndustrySegment(String industrySegment) {
		this.industrySegment = industrySegment;
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
