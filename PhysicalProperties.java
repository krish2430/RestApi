package com.tcs.pim.domain;

import java.util.List;

public class PhysicalProperties {
	
	String physicalPropertiesText;
	public String getPhysicalPropertiesText() {
		return physicalPropertiesText;
	}
	public void setPhysicalPropertiesText(String physicalPropertiesText) {
		this.physicalPropertiesText = physicalPropertiesText;
	}
	public List<PhysicalProperty> getPhysicalProperty() {
		return physicalProperty;
	}
	@Override
	public String toString() {
		return "PhysicalProperties [physicalPropertiesText=" + physicalPropertiesText + ", physicalProperty="
				+ physicalProperty + "]";
	}
	public void setPhysicalProperty(List<PhysicalProperty> physicalProperty) {
		this.physicalProperty = physicalProperty;
	}
	List <PhysicalProperty> physicalProperty;

}
