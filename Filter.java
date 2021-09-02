package com.tcs.pim.domain;

import java.io.Serializable;

public class Filter implements Comparable<Filter> ,Serializable{

	private String level1;
	private String level2;
	private String level3;
	private String level4;
	private String level5;
	private String filterGrpName;
	private String filterGrpCd;
	private String filterName;
	private String filterCd;
	private int filterDisplayOrder;
	private int filterGrpDisplayOrder;
	private String language;
	private String region;
	private String rfglCode;
	private int fabricDisplayOrder;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLevel1() {
		return level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}
	public String getLevel2() {
		return level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}
	public String getLevel3() {
		return level3;
	}
	public void setLevel3(String level3) {
		this.level3 = level3;
	}
	public String getLevel4() {
		return level4;
	}
	public void setLevel4(String level4) {
		this.level4 = level4;
	}
	public String getLevel5() {
		return level5;
	}
	public void setLevel5(String level5) {
		this.level5 = level5;
	}
	public String getFilterGrpName() {
		return filterGrpName;
	}
	public void setFilterGrpName(String filterGrpName) {
		this.filterGrpName = filterGrpName;
	}
	public String getFilterGrpCd() {
		return filterGrpCd;
	}
	public void setFilterGrpCd(String filterGrpCd) {
		this.filterGrpCd = filterGrpCd;
	}
	public String getFilterName() {
		return filterName;
	}
	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}
	public String getFilterCd() {
		return filterCd;
	}
	public void setFilterCd(String filterCd) {
		this.filterCd = filterCd;
	}
	public int getFilterDisplayOrder() {
		return filterDisplayOrder;
	}
	public void setFilterDisplayOrder(int filterDisplayOrder) {
		this.filterDisplayOrder = filterDisplayOrder;
	}
	public int getFilterGrpDisplayOrder() {
		return filterGrpDisplayOrder;
	}
	public void setFilterGrpDisplayOrder(int filterGrpDisplayOrder) {
		this.filterGrpDisplayOrder = filterGrpDisplayOrder;
	}
	@Override
	public int compareTo(Filter arg0) {
		return 1;
	}
	public String getRfglCode() {
		return rfglCode;
	}
	public void setRfglCode(String rfglCode) {
		this.rfglCode = rfglCode;
	}
	public int getFabricDisplayOrder() {
		return fabricDisplayOrder;
	}
	public void setFabricDisplayOrder(int fabricDisplayOrder) {
		this.fabricDisplayOrder = fabricDisplayOrder;
	}

}
