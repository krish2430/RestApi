package com.tcs.pim.domain;

import java.io.Serializable;


public class Application implements Comparable<Application>,Serializable{
	private String application;
	private int order;
	private String country;
	private String language;

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
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
	@Override
	public int compareTo(Application o) {
		return (this.getOrder() < o.getOrder() ? -1 : 
            (this.getOrder() == o.getOrder() ? 0 : 1));     
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
