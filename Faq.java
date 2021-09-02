package com.tcs.pim.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class Faq implements Serializable{
	private String faqID;
	private String qTxt;
	private String aTxt;
	private int order;
	private String country;
	private String language;

	
	public String getFaqID() {
		return faqID;
	}

	public void setFaqID(String faqID) {
		this.faqID = faqID;
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

	public String getqTxt() {
		return qTxt;
	}

	public void setqTxt(String qTxt) {
		this.qTxt = qTxt;
	}

	public String getaTxt() {
		return aTxt;
	}

	public void setaTxt(String aTxt) {
		this.aTxt = aTxt;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
