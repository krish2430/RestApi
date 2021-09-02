package com.tcs.pim.domain;

import java.io.Serializable;

public class ItemFlexibleAttribute  implements Serializable{
	private String name;
	private String value;
	private String language;
	private String order;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getOrder() {
		return order;
}

	public void setOrder(String order) {
		this.order = order;
	}

}
