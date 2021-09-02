package com.tcs.pim.domain;

import java.util.List;

public class ProductFamily {
	public String p360ProductNo;
	public String status;
	public String language;
	public String familyType;
	private List<ProductFamilyName> productFamilyName;
	public String businessIdentifier;
	public String subBusinessUnit;
	public String businessName;
	private List<Region> region;
	private List<Country> country;
	private List<ProductFamilyDescription> productFamilyDescription;
	private List<Industry> industries;
	private List<FamilyFeaturePoint> featurePoints;
	private List<SpecialWarning> specialWarnings;
	private List<Faq> productFaq;
	private List<HazardMatrix> hazardMatrix;
	private List<Solution> solutions;
	private List<Type> type;
	private Brand brands;
	private List<ValueCenterName> valueCenterName;
	private Feature features;
	private List<PermeationData> permeationData;
	private List<QacName> qacName;
	private List<PlantDescription> plantDescription;
	private String plantId;
	private String rfglCode;
	private List<ValueCentercode> valueCenterCode;
	private String publishingChannel;
	private List<PhysicalProperty> physicalProperties;
	private String productFamilyType;
	private String qacNumber;
	
	

	public String getProductFamilyType() {
		return productFamilyType;
	}

	public void setProductFamilyType(String productFamilyType) {
		this.productFamilyType = productFamilyType;
	}

	public String getP360ProductNo() {
		return p360ProductNo;
	}

	public void setP360ProductNo(String p360ProductNo) {
		this.p360ProductNo = p360ProductNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getBusinessIdentifier() {
		return businessIdentifier;
	}

	public void setBusinessIdentifier(String businessIdentifier) {
		this.businessIdentifier = businessIdentifier;
	}

	public String getSubBusinessUnit() {
		return subBusinessUnit;
	}

	public void setSubBusinessUnit(String subBusinessUnit) {
		this.subBusinessUnit = subBusinessUnit;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public List<Region> getRegion() {
		return region;
	}

	public void setRegion(List<Region> region) {
		this.region = region;
	}

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}

	public List<Industry> getIndustries() {
		return industries;
	}

	public void setIndustries(List<Industry> industries) {
		this.industries = industries;
	}

	public List<FamilyFeaturePoint> getFeaturePoints() {
		return featurePoints;
	}

	public void setFeaturePoints(List<FamilyFeaturePoint> featurePoints) {
		this.featurePoints = featurePoints;
	}

	public List<SpecialWarning> getSpecialWarnings() {
		return specialWarnings;
	}

	public void setSpecialWarnings(List<SpecialWarning> specialWarnings) {
		this.specialWarnings = specialWarnings;
	}

	public List<Faq> getProductFaq() {
		return productFaq;
	}

	public void setProductFaq(List<Faq> productFaq) {
		this.productFaq = productFaq;
	}

	public List<HazardMatrix> getHazardMatrix() {
		return hazardMatrix;
	}

	public void setHazardMatrix(List<HazardMatrix> hazardMatrix) {
		this.hazardMatrix = hazardMatrix;
	}

	public List<PhysicalProperty> getPhysicalProperties() {
		return physicalProperties;
	}

	public void setPhysicalProperties(List<PhysicalProperty> physicalProperties) {
		this.physicalProperties = physicalProperties;
	}

	public List<Solution> getSolutions() {
		return solutions;
	}

	public void setSolutions(List<Solution> solutions) {
		this.solutions = solutions;
	}

	public List<Type> getType() {
		return type;
	}

	public void setType(List<Type> type) {
		this.type = type;
	}

	public Feature getFeatures() {
		return features;
	}

	public void setFeatures(Feature features) {
		this.features = features;
	}

	public List<PermeationData> getPermeationData() {
		return permeationData;
	}

	public void setPermeationData(List<PermeationData> permeationData) {
		this.permeationData = permeationData;
	}

	public List<QacName>  getQacName() {
		return qacName;
	}

	public List<ProductFamilyDescription> getProductFamilyDescription() {
		return productFamilyDescription;
	}

	public void setProductFamilyDescription(
			List<ProductFamilyDescription> productFamilyDescription) {
		this.productFamilyDescription = productFamilyDescription;
	}

	public void setQacName(List<QacName>  qacName) {
		this.qacName = qacName;
	}

	public String getRfglCode() {
		return rfglCode;
	}

	public void setRfglCode(String rfglCode) {
		this.rfglCode = rfglCode;
	}

	public String getPublishingChannel() {
		return publishingChannel;
	}

	public void setPublishingChannel(String publishingChannel) {
		this.publishingChannel = publishingChannel;
	}

	public List<ProductFamilyName> getProductFamilyName() {
		return productFamilyName;
	}

	public List<PlantDescription> getPlantDescription() {
		return plantDescription;
	}

	public void setPlantDescription(List<PlantDescription> plantDescription) {
		this.plantDescription = plantDescription;
	}

	public void setProductFamilyName(List<ProductFamilyName> productFamilyName) {
		this.productFamilyName = productFamilyName;
	}

	public List<ValueCentercode> getValueCenterCode() {
		return valueCenterCode;
	}

	public void setValueCenterCode(List<ValueCentercode> valueCenterCode) {
		this.valueCenterCode = valueCenterCode;
	}

	public List<ValueCenterName> getValueCenterName() {
		return valueCenterName;
	}

	public void setValueCenterName(List<ValueCenterName> valueCenterName) {
		this.valueCenterName = valueCenterName;
	}

	public String getFamilyType() {
		return familyType;
	}

	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}

	public Brand getBrands() {
		return brands;
	}

	public void setBrands(Brand brands) {
		this.brands = brands;
	}

	public String getQacNumber() {
		return qacNumber;
	}

	public void setQacNumber(String qacNumber) {
		this.qacNumber = qacNumber;
	}

	public String getPlantId() {
		return plantId;
	}

	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}
	

}
