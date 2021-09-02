package com.tcs.pim.domain;


public class PermeationData implements Comparable<PermeationData>{
	private String hazardID;
	private String hazardName;
	private String casNumber;
	private String physicalState;
	private String propertyName;
	private String propertyValue;
	private WebPageSection webPageSection;

	public String getHazardName() {
		return hazardName;
	}

	public void setHazardName(String hazardName) {
		this.hazardName = hazardName;
	}

	public String getCasNumber() {
		return casNumber;
	}

	public void setCasNumber(String casNumber) {
		this.casNumber = casNumber;
	}

	public String getPhysicalState() {
		return physicalState;
	}

	public void setPhysicalState(String physicalState) {
		this.physicalState = physicalState;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public WebPageSection getWebPageSection() {
		return webPageSection;
	}

	public void setWebPageSection(WebPageSection webPageSection) {
		this.webPageSection = webPageSection;
	}

	

	public String getHazardID() {
		return hazardID;
	}

	public void setHazardID(String hazardID) {
		this.hazardID = hazardID;
	}

	@Override
	public int compareTo(PermeationData arg0) {     
		return this.getHazardName().compareTo(arg0.getHazardName());
}



}
