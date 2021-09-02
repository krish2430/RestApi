package com.tcs.pim.domain;

import java.io.Serializable;

public class HazardSubClass implements Serializable{
private String hazardSubClassName;
private String hazardSubClassCd;
public String getHazardSubClassName() {
	return hazardSubClassName;
}
public void setHazardSubClassName(String hazardSubClassName) {
	this.hazardSubClassName = hazardSubClassName;
}
public String getHazardSubClassCd() {
	return hazardSubClassCd;
}
public void setHazardSubClassCd(String hazardSubClassCd) {
	this.hazardSubClassCd = hazardSubClassCd;
}

}
