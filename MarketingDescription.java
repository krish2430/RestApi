package com.tcs.pim.domain;

import java.io.Serializable;

public class MarketingDescription implements Serializable{
	private String marketingDescription;
	private String country;
	private String language;

	public String getMarketingDescription() {
		return marketingDescription;
	}

	public void setMarketingDescription(String marketingDescription) {
		this.marketingDescription = marketingDescription;
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
