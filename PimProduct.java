package com.tcs.pim.domain;

public class PimProduct {

	private String productTitle;
	private String productSubTitle;
	private String productTeaserTxt;
	private String description;
	private String validFacets;
	private String pageName;
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductSubTitle() {
		return productSubTitle;
	}
	public void setProductSubTitle(String productSubTitle) {
		this.productSubTitle = productSubTitle;
	}
	public String getProductTeaserTxt() {
		return productTeaserTxt;
	}
	public void setProductTeaserTxt(String productTeaserTxt) {
		this.productTeaserTxt = productTeaserTxt;
	}
	@Override
	public String toString() {
		return "PimProduct [productTitle=" + productTitle
				+ ", productSubTitle=" + productSubTitle
				+ ", productTeaserTxt=" + productTeaserTxt + ", description="
				+ description + ", validFacets=" + validFacets + ", pageName="
				+ pageName + "]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValidFacets() {
		return validFacets;
	}
	public void setValidFacets(String validFacets) {
		this.validFacets = validFacets;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
}
