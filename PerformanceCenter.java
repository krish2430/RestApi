package com.tcs.pim.domain;

import java.io.Serializable;

public class PerformanceCenter  implements Serializable{
	private String id;
	private String language;
	private String performanceCenter;

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

	public String getPerformanceCenter() {
		return performanceCenter;
	}

	public void setPerformanceCenter(String performanceCenter) {
		this.performanceCenter = performanceCenter;
	}

}
