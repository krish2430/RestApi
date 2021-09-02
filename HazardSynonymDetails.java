package com.tcs.pim.domain;

import java.io.Serializable;

public class HazardSynonymDetails implements Serializable {
    private String hazardSynonymId;
    private String language;
	private String hazardSynonyms ;
	private String hazardName;
	private String hazardCompleteName;
	private String temperature ;
	private String conc ;
	private String physStateId;
	private String physicalState ;
	public String getHazardSynonymId() {
		return hazardSynonymId;
	}
	public void setHazardSynonymId(String hazardSynonymId) {
		this.hazardSynonymId = hazardSynonymId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getHazardSynonyms() {
		return hazardSynonyms;
	}
	public void setHazardSynonyms(String hazardSynonyms) {
		this.hazardSynonyms = hazardSynonyms;
	}
	public String getHazardName() {
		return hazardName;
	}
	public void setHazardName(String hazardName) {
		this.hazardName = hazardName;
	}
	public String getHazardCompleteName() {
		return hazardCompleteName;
	}
	public void setHazardCompleteName(String hazardCompleteName) {
		this.hazardCompleteName = hazardCompleteName;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getConc() {
		return conc;
	}
	public void setConc(String conc) {
		this.conc = conc;
	}
	public String getPhysStateId() {
		return physStateId;
	}
	public void setPhysStateId(String physStateId) {
		this.physStateId = physStateId;
	}
	public String getPhysicalState() {
		return physicalState;
	}
	public void setPhysicalState(String physicalState) {
		this.physicalState = physicalState;
	}
	
}
