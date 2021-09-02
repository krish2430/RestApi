package com.tcs.pim.domain;

import java.io.Serializable;

public class MarketingSubHeading implements Serializable {
	private String country;
	private String language;
	private String marketingSubHeading;
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
	public String getMarketingSubHeading() {
		return marketingSubHeading;
	}
	public void setMarketingSubHeading(String marketingSubHeading) {
		this.marketingSubHeading = marketingSubHeading;
	}
	

}
