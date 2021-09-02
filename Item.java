package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;

public class Item implements Serializable{

	private String p360ItemNo;
	private String status;
	private String language;
	private String itemName;
	private String businessName;
	private String subBusinessUnit;
	private List<Region> region;
	private List<Country> country;
	private String p360HigherLevelVariantNo;
	private String ProductFamilyReference;
	private String ProductReference;
	private String ProductReferencePageName;
	private String gmid;
	private List<GmidName> gmidName;
	private String labelGmid;
	private String specificCustomer;
	private String productUpc;
	private List<TradeProductName> tradeProductName;
	private String cooAdditional;
	private String optionCode;
	private String optionCodeID;
	
	
	public String getOptionCode() {
		return optionCode;
	}

	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getOptionCodeID() {
		return optionCodeID;
	}

	public void setOptionCodeID(String optionCodeID) {
		this.optionCodeID = optionCodeID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	private String publishingChannel;
	private List<ItemFlexibleAttribute> itemFlexibleAttributes;
	private List<AvailableSize> availableSizes;
	private List<ItemFlexibleAttribute> finishedDimensions;

	public String getP360ItemNo() {
		return p360ItemNo;
	}

	public void setP360ItemNo(String p360ItemNo) {
		this.p360ItemNo = p360ItemNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getSubBusinessUnit() {
		return subBusinessUnit;
	}

	public void setSubBusinessUnit(String subBusinessUnit) {
		this.subBusinessUnit = subBusinessUnit;
	}

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}

	public List<GmidName> getGmidName() {
		return gmidName;
	}

	public void setGmidName(List<GmidName> gmidName) {
		this.gmidName = gmidName;
	}

	public List<TradeProductName> getTradeProductName() {
		return tradeProductName;
	}

	public void setTradeProductName(List<TradeProductName> tradeProductName) {
		this.tradeProductName = tradeProductName;
	}

	public String getP360HigherLevelVariantNo() {
		return p360HigherLevelVariantNo;
	}

	public void setP360HigherLevelVariantNo(String p360HigherLevelVariantNo) {
		this.p360HigherLevelVariantNo = p360HigherLevelVariantNo;
	}

	public String getProductFamilyReference() {
		return ProductFamilyReference;
	}

	public void setProductFamilyReference(String productFamilyReference) {
		ProductFamilyReference = productFamilyReference;
	}

	public String getProductReference() {
		return ProductReference;
	}

	public void setProductReference(String productReference) {
		ProductReference = productReference;
	}

	public String getProductReferencePageName() {
		return ProductReferencePageName;
	}

	public void setProductReferencePageName(String productReferencePageName) {
		ProductReferencePageName = productReferencePageName;
	}

	public String getGmid() {
		return gmid;
	}

	public void setGmid(String gmid) {
		this.gmid = gmid;
	}

	public String getLabelGmid() {
		return labelGmid;
	}

	public void setLabelGmid(String labelGmid) {
		this.labelGmid = labelGmid;
	}

	public String getSpecificCustomer() {
		return specificCustomer;
	}

	public void setSpecificCustomer(String specificCustomer) {
		this.specificCustomer = specificCustomer;
	}

	public String getProductUpc() {
		return productUpc;
	}

	public void setProductUpc(String productUpc) {
		this.productUpc = productUpc;
	}

	public String getCooAdditional() {
		return cooAdditional;
	}

	public void setCooAdditional(String cooAdditional) {
		this.cooAdditional = cooAdditional;
	}

	public String getPublishingChannel() {
		return publishingChannel;
	}

	public void setPublishingChannel(String publishingChannel) {
		this.publishingChannel = publishingChannel;
	}

	public List<ItemFlexibleAttribute> getItemFlexibleAttributes() {
		return itemFlexibleAttributes;
	}

	public void setItemFlexibleAttributes(List<ItemFlexibleAttribute> itemFlexibleAttributes) {
		this.itemFlexibleAttributes = itemFlexibleAttributes;
	}

	public List<ItemFlexibleAttribute> getFinishedDimensions() {
		return finishedDimensions;
	}

	public void setFinishedDimensions(List<ItemFlexibleAttribute> finishedDimensions) {
		this.finishedDimensions = finishedDimensions;
	}

	public List<Region> getRegion() {
		return region;
	}

	public void setRegion(List<Region> region) {
		this.region = region;
	}

	public List<AvailableSize> getAvailableSizes() {
		return availableSizes;
	}

	public void setAvailableSizes(List<AvailableSize> availableSizes) {
		this.availableSizes = availableSizes;
	}

}
