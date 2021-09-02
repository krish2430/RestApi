package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;

public class HazardClass implements Serializable{
private String hazardClassName;
private String hazardClassCd;
private List<HazardSubClass> subClasses;
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
public List<HazardSubClass> getSubClasses() {
	return subClasses;
}
public void setSubClasses(List<HazardSubClass> subClasses) {
	this.subClasses = subClasses;
}


}
