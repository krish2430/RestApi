package com.tcs.pim.domain;

import java.util.Map;

public class PermeationDataTemp {
	private String hazardId;
	private String hazardName;
	private String casNumber;
	private String physicalState;
	private WebPageSection webPageSection;
private Map<String,String> permData;



public PermeationDataTemp(String hazardId, String hazardName, String casNumber, String physicalState,
		WebPageSection webPageSection, Map<String, String> permData) {
	super();
	this.hazardId = hazardId;
	this.hazardName = hazardName;
	this.casNumber = casNumber;
	this.physicalState = physicalState;
	this.webPageSection = webPageSection;
	this.permData = permData;
}
@Override
public boolean equals(Object obj) {
	 if (!(obj instanceof PermeationDataTemp)) {
	      return false;
	    }
	 PermeationDataTemp other = (PermeationDataTemp) obj;
	    return other.hazardId.equals(hazardId) && other.hazardName.equals(hazardName) 
	    		&& other.casNumber.equals(casNumber) && other.physicalState.equals(physicalState);
}
@Override
public int hashCode() {
	return super.hashCode();
}
public String getHazardId() {
	return hazardId;
}
public void setHazardId(String hazardId) {
	this.hazardId = hazardId;
}
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
public WebPageSection getWebPageSection() {
	return webPageSection;
}
public void setWebPageSection(WebPageSection webPageSection) {
	this.webPageSection = webPageSection;
}
public Map<String, String> getPermData() {
	return permData;
}
public void setPermData(Map<String, String> permData) {
	this.permData = permData;
}

}
