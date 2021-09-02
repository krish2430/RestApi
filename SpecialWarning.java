package com.tcs.pim.domain;


public class SpecialWarning implements Comparable<SpecialWarning>{
private String specialWarning;
private int order;
private String country;
private String language;
private String specialWarningID;

public String getSpecialWarning() {
	return specialWarning;
}
public void setSpecialWarning(String specialWarning) {
	this.specialWarning = specialWarning;
}
public int getOrder() {
	return order;
}
public void setOrder(int order) {
	this.order = order;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

public String getSpecialWarningID() {
	return specialWarningID;
}
public void setSpecialWarningID(String specialWarningID) {
	this.specialWarningID = specialWarningID;
}
@Override
public int compareTo(SpecialWarning o) {
	return (this.getOrder() < o.getOrder() ? -1 : 
        (this.getOrder() == o.getOrder() ? 0 : 1));     
}




@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}


}
