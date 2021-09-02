package com.tcs.pim.domain;

import java.util.List;

public class PermeationHazard {
	private List<PermHazard> hazards;
	private List<HazardClass> hazardClasses;
	private List<String> fabrics;
	public List<PermHazard> getHazards() {
		return hazards;
	}
	public void setHazards(List<PermHazard> hazards) {
		this.hazards = hazards;
	}
	public List<HazardClass> getHazardClasses() {
		return hazardClasses;
	}
	public void setHazardClasses(List<HazardClass> hazardClasses) {
		this.hazardClasses = hazardClasses;
	}
	public List<String> getFabrics() {
		return fabrics;
	}
	public void setFabrics(List<String> fabrics) {
		this.fabrics = fabrics;
	}
		
	
	
}
