package com.tcs.pim.domain;

import java.io.Serializable;

public class MarketingTitle implements Serializable{
	private String marketingTitle;
	private String country;
	private String language;

	public String getMarketingTitle() {
		return marketingTitle;
	}

	public void setMarketingTitle(String marketingTitle) {
		this.marketingTitle = marketingTitle;
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
