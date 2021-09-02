package com.tcs.pim.domain;

import java.io.Serializable;

public class HazardClassSubClassDetails implements Serializable{
	public String hazardClassName;
	public String hazardClassCd;
	public String subClassCd;
	public String subClassName;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String language;
	public String getHazardClassName() {
		return hazardClassName;
	}
	public void setHazardClassName(String hazardClassName) {
		this.hazardClassName = hazardClassName;
	}
	public String getHazardClassCd() {
		return hazardClassCd;
	}
	public void setHazardClassCd(String hazardClassCd) {
		this.hazardClassCd = hazardClassCd;
	}
	public String getSubClassCd() {
		return subClassCd;
	}
	public void setSubClassCd(String subClassCd) {
		this.subClassCd = subClassCd;
	}
	public String getSubClassName() {
		return subClassName;
	}
	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}
	public HazardClassSubClassDetails(HazardClassSubClassDetails d) {
		super();
		this.hazardClassName = d.getHazardClassName();
		this.hazardClassCd = d.getHazardClassCd();
	}
	public HazardClassSubClassDetails() {
		// TODO Auto-generated constructor stub
	}
	
}
