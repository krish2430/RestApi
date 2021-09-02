package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;
public class Product implements Serializable {
	private String p360VariantNo;
	private String status;
	private String language;
	private List<ProductName> productName;
	private String pageName;
	private String businessIdentifier;
	private String subBusinessUnit;
	private String businessName;
	private List<Region> region;
	private List<Country> country;
	private String productFamilyReference;
	private String p360HigherLevelProductNo;
	private List<OptionCode> optionCode;
	//private Smc smc;
	private String smc;
	private List<SmcName> smcName;
	private List<MarketingTitle> marketingTitle;
	private List<MarketingDescription> marketingDescription;
	private List<MarketingSubHeading> marketingSubHeading;
	private Manufacturer manufacturer;
	private String manufacturerAddress;
	private String manufacturerUrl;
	private List<Application> applications;
	private List<Industry> industries;
    private List<Standard> standards;
	private List<AdditionalEquipment> additionalEquipments;
	private List<FeaturePoint> featurePoints;
	private List<Faq> productFaq;
	private List<Recommendation> recommendations;
	private List<SpecialWarning> specialWarnings;
	private List<Specification> specifications;
	private List<Task> tasks;
	private List<HazardMatrix> hazardMatrix;
	private List<Solution> solutions;
	private List<Type> type;
	private List<Hazard> hazard;
	private List<ProductCategoryGroup> productCategoryGroup;
	private List<SubProductCategoryGroup> subProductCategoryGroup;
	private List<UsesAndApplications> usesAndApplications;
	private List<Topic> topics;
	private List<IndustrySegment> industrySegment;
	private List<ProductLongDescription> productLongDescription;
	private List<Feature> features;
	private String gating;
	private String eloquaMapping;
	private String certificationStartDate;
	private String certificationEndDate;
	private String certificateComment;
	private StorageLocation storageLocation;
	private String regulation;
	private CorporateCategory corporateCategories;
	private String publishingChannel;
	private Brand brands;
	private String msrp;
	private List<VariantFlexibleAtrribute> variantFlexibleAttributes;
	private List<PermeationData> permeationData;
	private List<PhysicalProperty> physicalProperties;
	
	
	public String getSmc() {
		return smc;
	}
	public void setSmc(String smc) {
		this.smc = smc;
	}
	public List<Standard> getStandards() {
		return standards;
	}
	public void setStandards(List<Standard> standards) {
		this.standards = standards;
	}
	public String getP360VariantNo() {
		return p360VariantNo;
	}
	public void setP360VariantNo(String p360VariantNo) {
		this.p360VariantNo = p360VariantNo;
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
	
	public String getManufacturerAddress() {
		return manufacturerAddress;
	}
	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}
	public String getManufacturerUrl() {
		return manufacturerUrl;
	}
	public void setManufacturerUrl(String manufacturerUrl) {
		this.manufacturerUrl = manufacturerUrl;
	}
	
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	
	public List<Hazard> getHazard() {
		return hazard;
	}
	public void setHazard(List<Hazard> hazard) {
		this.hazard = hazard;
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
	public String getProductFamilyReference() {
		return productFamilyReference;
	}
	public void setProductFamilyReference(String productFamilyReference) {
		this.productFamilyReference = productFamilyReference;
	}
	public String getP360HigherLevelProductNo() {
		return p360HigherLevelProductNo;
	}
	public void setP360HigherLevelProductNo(String p360HigherLevelProductNo) {
		this.p360HigherLevelProductNo = p360HigherLevelProductNo;
	}
	
	public List<OptionCode> getOptionCode() {
		return optionCode;
	}
	public void setOptionCode(List<OptionCode> optionCode) {
		this.optionCode = optionCode;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public List<Application> getApplications() {
		return applications;
	}
	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}
	public List<Industry> getIndustries() {
		return industries;
	}
	public void setIndustries(List<Industry> industries) {
		this.industries = industries;
	}
	public List<AdditionalEquipment> getAdditionalEquipments() {
		return additionalEquipments;
	}
	public void setAdditionalEquipments(List<AdditionalEquipment> additionalEquipments) {
		this.additionalEquipments = additionalEquipments;
	}
	public List<FeaturePoint> getFeaturePoints() {
		return featurePoints;
	}
	public void setFeaturePoints(List<FeaturePoint> featurePoints) {
		this.featurePoints = featurePoints;
	}
	public List<Faq> getProductFaq() {
		return productFaq;
	}
	public void setProductFaq(List<Faq> productFaq) {
		this.productFaq = productFaq;
	}
	public List<Recommendation> getRecommendations() {
		return recommendations;
	}
	public void setRecommendations(List<Recommendation> recommendations) {
		this.recommendations = recommendations;
	}
	public List<SpecialWarning> getSpecialWarnings() {
		return specialWarnings;
	}
	public void setSpecialWarnings(List<SpecialWarning> specialWarnings) {
		this.specialWarnings = specialWarnings;
	}
	public List<Specification> getSpecifications() {
		return specifications;
	}
	public void setSpecifications(List<Specification> specifications) {
		this.specifications = specifications;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public List<HazardMatrix> getHazardMatrix() {
		return hazardMatrix;
	}
	public void setHazardMatrix(List<HazardMatrix> hazardMatrix) {
		this.hazardMatrix = hazardMatrix;
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
	public List<ProductCategoryGroup> getProductCategoryGroup() {
		return productCategoryGroup;
	}
	public void setProductCategoryGroup(List<ProductCategoryGroup> productCategoryGroup) {
		this.productCategoryGroup = productCategoryGroup;
	}
	public List<SubProductCategoryGroup> getSubProductCategoryGroup() {
		return subProductCategoryGroup;
	}
	public void setSubProductCategoryGroup(List<SubProductCategoryGroup> subProductCategoryGroup) {
		this.subProductCategoryGroup = subProductCategoryGroup;
	}
	public List<UsesAndApplications> getUsesAndApplications() {
		return usesAndApplications;
	}
	public void setUsesAndApplications(List<UsesAndApplications> usesAndApplications) {
		this.usesAndApplications = usesAndApplications;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	public List<IndustrySegment> getIndustrySegment() {
		return industrySegment;
	}
	public void setIndustrySegment(List<IndustrySegment> industrySegment) {
		this.industrySegment = industrySegment;
	}
	
	public List<ProductName> getProductName() {
		return productName;
	}
	public void setProductName(List<ProductName> productName) {
		this.productName = productName;
	}
	public List<SmcName> getSmcName() {
		return smcName;
	}
	public void setSmcName(List<SmcName> smcName) {
		this.smcName = smcName;
	}
	public List<MarketingTitle> getMarketingTitle() {
		return marketingTitle;
	}
	public void setMarketingTitle(List<MarketingTitle> marketingTitle) {
		this.marketingTitle = marketingTitle;
	}
	public List<MarketingDescription> getMarketingDescription() {
		return marketingDescription;
	}
	public void setMarketingDescription(List<MarketingDescription> marketingDescription) {
		this.marketingDescription = marketingDescription;
	}
	public List<MarketingSubHeading> getMarketingSubHeading() {
		return marketingSubHeading;
	}
	public void setMarketingSubHeading(List<MarketingSubHeading> marketingSubHeading) {
		this.marketingSubHeading = marketingSubHeading;
	}
	public List<ProductLongDescription> getProductLongDescription() {
		return productLongDescription;
	}
	public void setProductLongDescription(List<ProductLongDescription> productLongDescription) {
		this.productLongDescription = productLongDescription;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
	public String getGating() {
		return gating;
	}
	public void setGating(String gating) {
		this.gating = gating;
	}
	public String getEloquaMapping() {
		return eloquaMapping;
	}
	public void setEloquaMapping(String eloquaMapping) {
		this.eloquaMapping = eloquaMapping;
	}
	public String getCertificationStartDate() {
		return certificationStartDate;
	}
	public void setCertificationStartDate(String certificationStartDate) {
		this.certificationStartDate = certificationStartDate;
	}
	public String getCertificationEndDate() {
		return certificationEndDate;
	}
	public void setCertificationEndDate(String certificationEndDate) {
		this.certificationEndDate = certificationEndDate;
	}
	public String getCertificateComment() {
		return certificateComment;
	}
	public void setCertificateComment(String certificateComment) {
		this.certificateComment = certificateComment;
	}
	public StorageLocation getStorageLocation() {
		return storageLocation;
	}
	public void setStorageLocation(StorageLocation storageLocation) {
		this.storageLocation = storageLocation;
	}
	public String getRegulation() {
		return regulation;
	}
	public void setRegulation(String regulation) {
		this.regulation = regulation;
	}
	public CorporateCategory getCorporateCategories() {
		return corporateCategories;
	}
	public void setCorporateCategories(CorporateCategory corporateCategories) {
		this.corporateCategories = corporateCategories;
	}
	public String getPublishingChannel() {
		return publishingChannel;
	}
	public void setPublishingChannel(String publishingChannel) {
		this.publishingChannel = publishingChannel;
	}
	public Brand getBrands() {
		return brands;
	}
	public void setBrands(Brand brands) {
		this.brands = brands;
	}
	public String getMsrp() {
		return msrp;
	}
	public void setMsrp(String msrp) {
		this.msrp = msrp;
	}
	public List<VariantFlexibleAtrribute> getVariantFlexibleAttributes() {
		return variantFlexibleAttributes;
	}
	public void setVariantFlexibleAttributes(List<VariantFlexibleAtrribute> variantFlexibleAttributes) {
		this.variantFlexibleAttributes = variantFlexibleAttributes;
	}
	public List<PermeationData> getPermeationData() {
		return permeationData;
	}
	public void setPermeationData(List<PermeationData> permeationData) {
		this.permeationData = permeationData;
	}
	public List<PhysicalProperty> getPhysicalProperties() {
		return physicalProperties;
	}
	public void setPhysicalProperties(List<PhysicalProperty> physicalProperties) {
		this.physicalProperties = physicalProperties;
	}

/*	public Smc getSmc() {
		return smc;
	}
	public void setSmc(Smc smc) {
		this.smc = smc;
	}*/

	@Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((p360HigherLevelProductNo == null) ? 0 : p360HigherLevelProductNo.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        Product other = (Product) obj;
        if (p360VariantNo == null) {
          if (other.p360VariantNo != null)
            return false;
        } else if (!p360VariantNo.equals(other.p360VariantNo))
          return false;
        return true;
      }	

}
