package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class HazardClassSubClass implements Serializable{
	private Map<String, String> hazardClass;
	private Map<String, String> hazardSubClass;
	public Map<String, String> getHazardClass() {
		return hazardClass;
	}
	public void setHazardClass(Map<String, String> hazardClass) {
		this.hazardClass = hazardClass;
	}
	public Map<String, String> getHazardSubClass() {
		return hazardSubClass;
	}
	public void setHazardSubClass(Map<String, String> hazardSubClass) {
		this.hazardSubClass = hazardSubClass;
	}

}
