package com.tcs.pim.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AvailableSize implements Serializable{
	private String name;
	private String value;
	private String footNoteId;
	private String language;
	@JsonProperty(value = "units")
	public String units;
	public String order;

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

	public String getFootNoteId() {
		return footNoteId;
	}

	public void setFootNoteId(String footNoteId) {
		this.footNoteId = footNoteId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;	
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
