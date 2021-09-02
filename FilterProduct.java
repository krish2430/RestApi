package com.tcs.pim.domain;
public class FilterProduct {

	private String pageName;
	private String brand;
	private String design;
	private String seam;
	private String nfpaCert;
	private String epaDesign;
	private String bloodBorneStandards;
	private String processingControlled;
	private String endUse;
	private String isoClass;
	private String liner;
	private String coatng;
	private String description;
	private String title;
	private String subTitle;
	private String teaserTxt;
	private String language;
	private String region;
	private String fabricFinish;
	private String validFacets;
	private String type;
	private String hazard;
	private String standard;
	private String controlledEnvironment;
	private String familyStatus;
	private String productStatus;
	private String nhazard;
	private String heatAndFlame;
	private String nfpa70;
	private String csaz;
	private String astm;
	private String dupontBrand;
	private String garmentType;
	private String manufacturer;
	private String color;
	private String fabricWeight;
	private String women;
	private String countries;
	private String norm;
	private String riskHierarchy;
	private String isTyvek;
	private String isNomex;
	private String isKevlar;
	private String mechanical;
	private String electrical;
	private String temperature;
	private String cutnewAnsi;
	private String layers;
	private String cutOldAnsi;
	private String abrasionAnsi;
	private String puncturehn;
	private String punctureen;
	private String contactHeat;
	private String cutnewAnsiEN;
	private String cutOldEn;
	private String abrasionEn;
	private String puncture;
	private String contactHeatEn;
	private String insutry;
	private String gloveWeight;
	private String highDixerity;
	private String enhancedVisibility;
	private String coated;
	private String touchScreen;
	private String serviceUs;
	//
	private String electricArcFlash;
	private String electricArcRating;
	private String garmentUlCertification;
	
	private String highVisibility;
	private String reflectiveAvailables;
	private String garmentCategory;
	private String productFamilyType;
	private String availableOuterFabricColors;
	private String availableOption;
	private String rfglCode;
	private String flamInd;
	private String fabricPermCd;
	private String prodFabricName;
	private String prodDisplayOrder;
	private String designDesc;
	private String seamDesc;
	private String specialPgm;

	public String getFabricPermCd() {
		return fabricPermCd;
	}
	public void setFabricPermCd(String fabricPermCd) {
		this.fabricPermCd = fabricPermCd;
	}
	public String getProdFabricName() {
		return prodFabricName;
	}
	public void setProdFabricName(String prodFabricName) {
		this.prodFabricName = prodFabricName;
	}
	public FilterProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FilterProduct(FilterProduct filterProduct) {
		super();
		this.pageName =filterProduct.pageName;
		this.brand =filterProduct.brand;
		this.design =filterProduct.design;
		this.seam =filterProduct.seam;
		this.nfpaCert =filterProduct.nfpaCert;
		this.epaDesign =filterProduct.epaDesign;
		this.bloodBorneStandards =filterProduct.bloodBorneStandards;
		this.processingControlled =filterProduct.processingControlled;
		this.endUse =filterProduct.endUse;
		this.isoClass =filterProduct.isoClass;
		this.liner =filterProduct.liner;
		this.coatng =filterProduct.coatng;
		this.description =filterProduct.description;
		this.title =filterProduct.title;
		this.subTitle =filterProduct.subTitle;
		this.teaserTxt =filterProduct.teaserTxt;
		this.language =filterProduct.language;
		this.region =filterProduct.region;
		this.validFacets =filterProduct.validFacets;
		this.type =filterProduct.type;
		this.hazard =filterProduct.hazard;
		this.standard =filterProduct.standard;
		this.controlledEnvironment =filterProduct.controlledEnvironment;
		this.familyStatus =filterProduct.familyStatus;
		this.productStatus =filterProduct.productStatus;
		this.nhazard =filterProduct.nhazard;
		this.heatAndFlame =filterProduct.heatAndFlame;
		this.nfpa70 =filterProduct.nfpa70;
		this.csaz =filterProduct.csaz;
		this.astm =filterProduct.astm;
		this.dupontBrand =filterProduct.dupontBrand;
		this.garmentType =filterProduct.garmentType;
		this.manufacturer =filterProduct.manufacturer;
		this.color =filterProduct.color;
		this.fabricWeight =filterProduct.fabricWeight;
		this.women =filterProduct.women;
		this.countries =filterProduct.countries;
		this.norm =filterProduct.norm;
		this.riskHierarchy =filterProduct.riskHierarchy;
		this.isTyvek =filterProduct.isTyvek;
		this.isNomex =filterProduct.isNomex;
		this.isKevlar =filterProduct.isKevlar;
		this.mechanical =filterProduct.mechanical;
		this.electrical =filterProduct.electrical;
		this.temperature =filterProduct.temperature;
		this.cutnewAnsi =filterProduct.cutnewAnsi;
		this.cutOldAnsi =filterProduct.cutOldAnsi;
		this.abrasionAnsi =filterProduct.abrasionAnsi;
		this.puncturehn =filterProduct.puncturehn;
		this.punctureen =filterProduct.punctureen;
		this.contactHeat =filterProduct.contactHeat;
		this.cutnewAnsiEN =filterProduct.cutnewAnsiEN;
		this.cutOldEn =filterProduct.cutOldEn;
		this.abrasionEn =filterProduct.abrasionEn;
		this.puncture =filterProduct.puncture;
		this.contactHeatEn =filterProduct.contactHeatEn;
		this.insutry =filterProduct.insutry;
		this.gloveWeight =filterProduct.gloveWeight;
		this.highDixerity =filterProduct.highDixerity;
		this.enhancedVisibility =filterProduct.enhancedVisibility;
		this.coated =filterProduct.coated;
		this.touchScreen =filterProduct.touchScreen;
		this.electricArcFlash =filterProduct.electricArcFlash;
		this.electricArcRating =filterProduct.electricArcRating;
		this.garmentUlCertification =filterProduct.garmentUlCertification;
		this.highVisibility =filterProduct.highVisibility;
		this.reflectiveAvailables =filterProduct.reflectiveAvailables;
		this.garmentCategory =filterProduct.garmentCategory;
		this.productFamilyType =filterProduct.productFamilyType;
		this.availableOuterFabricColors =filterProduct.availableOuterFabricColors;
		this.availableOption =filterProduct.availableOption;
		this.rfglCode =filterProduct.rfglCode;
		this.flamInd =filterProduct.flamInd;
		this.designDesc =filterProduct.designDesc;
		this.seamDesc =filterProduct.seamDesc;
	}
	public String getDesignDesc() {
        return designDesc;
    }
    public void setDesignDesc(String designDesc) {
        this.designDesc = designDesc;
    }
    public String getSeamDesc() {
        return seamDesc;
    }
    public void setSeamDesc(String seamDesc) {
        this.seamDesc = seamDesc;
    }
	public String getHighVisibility() {
		return highVisibility;
	}
	public void setHighVisibility(String highVisibility) {
		this.highVisibility = highVisibility;
	}
	public String getReflectiveAvailables() {
		return reflectiveAvailables;
	}
	public void setReflectiveAvailables(String reflectiveAvailables) {
		this.reflectiveAvailables = reflectiveAvailables;
	}
	public String getGarmentCategory() {
		return garmentCategory;
	}
	public void setGarmentCategory(String garmentCategory) {
		this.garmentCategory = garmentCategory;
	}
	public String getElectricArcFlash() {
		return electricArcFlash;
	}
	public void setElectricArcFlash(String electricArcFlash) {
		this.electricArcFlash = electricArcFlash;
	}
	public String getElectricArcRating() {
		return electricArcRating;
	}
	public void setElectricArcRating(String electricArcRating) {
		this.electricArcRating = electricArcRating;
	}
	public String getGarmentUlCertification() {
		return garmentUlCertification;
	}
	public void setGarmentUlCertification(String garmentUlCertification) {
		this.garmentUlCertification = garmentUlCertification;
	}
	public String getMechanical() {
		return mechanical;
	}
	public void setMechanical(String mechanical) {
		this.mechanical = mechanical;
	}
	public String getElectrical() {
		return electrical;
	}
	public void setElectrical(String electrical) {
		this.electrical = electrical;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getCutnewAnsi() {
		return cutnewAnsi;
	}
	public void setCutnewAnsi(String cutnewAnsi) {
		this.cutnewAnsi = cutnewAnsi;
	}
	public String getCutOldAnsi() {
		return cutOldAnsi;
	}
	public void setCutOldAnsi(String cutOldAnsi) {
		this.cutOldAnsi = cutOldAnsi;
	}
	public String getAbrasionAnsi() {
		return abrasionAnsi;
	}
	public void setAbrasionAnsi(String abrasionAnsi) {
		this.abrasionAnsi = abrasionAnsi;
	}
	public String getPuncturehn() {
		return puncturehn;
	}
	public void setPuncturehn(String puncturehn) {
		this.puncturehn = puncturehn;
	}
	public String getPunctureen() {
		return punctureen;
	}
	public void setPunctureen(String punctureen) {
		this.punctureen = punctureen;
	}
	public String getContactHeat() {
		return contactHeat;
	}
	public void setContactHeat(String contactHeat) {
		this.contactHeat = contactHeat;
	}
	public String getCutnewAnsiEN() {
		return cutnewAnsiEN;
	}
	public void setCutnewAnsiEN(String cutnewAnsiEN) {
		this.cutnewAnsiEN = cutnewAnsiEN;
	}

	public String getCutOldEn() {
		return cutOldEn;
	}
	public void setCutOldEn(String cutOldEn) {
		this.cutOldEn = cutOldEn;
	}
	public String getAbrasionEn() {
		return abrasionEn;
	}
	public void setAbrasionEn(String abrasionEn) {
		this.abrasionEn = abrasionEn;
	}

	public String getContactHeatEn() {
		return contactHeatEn;
	}
	public void setContactHeatEn(String contactHeatEn) {
		this.contactHeatEn = contactHeatEn;
	}
	public String getInsutry() {
		return insutry;
	}
	public void setInsutry(String insutry) {
		this.insutry = insutry;
	}
	public String getGloveWeight() {
		return gloveWeight;
	}
	public void setGloveWeight(String gloveWeight) {
		this.gloveWeight = gloveWeight;
	}
	public String getHighDixerity() {
		return highDixerity;
	}
	public void setHighDixerity(String highDixerity) {
		this.highDixerity = highDixerity;
	}
	public String getEnhancedVisibility() {
		return enhancedVisibility;
	}
	public void setEnhancedVisibility(String enhancedVisibility) {
		this.enhancedVisibility = enhancedVisibility;
	}
	public String getCoated() {
		return coated;
	}
	public void setCoated(String coated) {
		this.coated = coated;
	}
	public String getTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}
	public String getIsTyvek() {
		return isTyvek;
	}
	public void setIsTyvek(String isTyvek) {
		this.isTyvek = isTyvek;
	}
	public String getIsNomex() {
		return isNomex;
	}
	public void setIsNomex(String isNomex) {
		this.isNomex = isNomex;
	}
	public String getIsKevlar() {
		return isKevlar;
	}
	public void setIsKevlar(String isKevlar) {
		this.isKevlar = isKevlar;
	}
	public String getNhazard() {
		return nhazard;
	}
	public void setNhazard(String nhazard) {
		this.nhazard = nhazard;
	}
	public String getHeatAndFlame() {
		return heatAndFlame;
	}
	public void setHeatAndFlame(String heatAndFlame) {
		this.heatAndFlame = heatAndFlame;
	}
	public String getNfpa70() {
		return nfpa70;
	}
	public void setNfpa70(String nfpa70) {
		this.nfpa70 = nfpa70;
	}
	public String getCsaz() {
		return csaz;
	}
	public void setCsaz(String csaz) {
		this.csaz = csaz;
	}
	public String getAstm() {
		return astm;
	}
	public void setAstm(String astm) {
		this.astm = astm;
	}
	public String getDupontBrand() {
		return dupontBrand;
	}
	public void setDupontBrand(String dupontBrand) {
		this.dupontBrand = dupontBrand;
	}
	public String getGarmentType() {
		return garmentType;
	}
	public void setGarmentType(String garmentType) {
		this.garmentType = garmentType;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFabricWeight() {
		return fabricWeight;
	}
	public void setFabricWeight(String fabricWeight) {
		this.fabricWeight = fabricWeight;
	}
	public String getWomen() {
		return women;
	}
	public void setWomen(String women) {
		this.women = women;
	}
	public String getCountries() {
		return countries;
	}
	public void setCountries(String countries) {
		this.countries = countries;
	}
	public String getFamilyStatus() {
		return familyStatus;
	}
	public void setFamilyStatus(String familyStatus) {
		this.familyStatus = familyStatus;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getHazard() {
		return hazard;
	}
	public void setHazard(String hazard) {
		this.hazard = hazard;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getControlledEnvironment() {
		return controlledEnvironment;
	}
	public void setControlledEnvironment(String controlledEnvironment) {
		this.controlledEnvironment = controlledEnvironment;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getTeaserTxt() {
		return teaserTxt;
	}
	public void setTeaserTxt(String teaserTxt) {
		this.teaserTxt = teaserTxt;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public String getSeam() {
		return seam;
	}
	public void setSeam(String seam) {
		this.seam = seam;
	}
	public String getNfpaCert() {
		return nfpaCert;
	}
	public void setNfpaCert(String nfpaCert) {
		this.nfpaCert = nfpaCert;
	}
	public String getEpaDesign() {
		return epaDesign;
	}
	public void setEpaDesign(String epaDesign) {
		this.epaDesign = epaDesign;
	}
	public String getBloodBorneStandards() {
		return bloodBorneStandards;
	}
	public void setBloodBorneStandards(String bloodBorneStandards) {
		this.bloodBorneStandards = bloodBorneStandards;
	}
	public String getProcessingControlled() {
		return processingControlled;
	}
	public void setProcessingControlled(String processingControlled) {
		this.processingControlled = processingControlled;
	}
	public String getEndUse() {
		return endUse;
	}
	public void setEndUse(String endUse) {
		this.endUse = endUse;
	}
	public String getIsoClass() {
		return isoClass;
	}
	public void setIsoClass(String isoClass) {
		this.isoClass = isoClass;
	}
	public String getLiner() {
		return liner;
	}
	public void setLiner(String liner) {
		this.liner = liner;
	}
	public String getCoatng() {
		return coatng;
	}
	public void setCoatng(String coatng) {
		this.coatng = coatng;
	}
	public String getValidFacets() {
		return validFacets;
	}
	public void setValidFacets(String validFacets) {
		this.validFacets = validFacets;
	}
	public String getNorm() {
		return norm;
	}
	public void setNorm(String norm) {
		this.norm = norm;
	}
	public String getRiskHierarchy() {
		return riskHierarchy;
	}
	public void setRiskHierarchy(String riskHierarchy) {
		this.riskHierarchy = riskHierarchy;
	}
	public String getProductFamilyType() {
		return productFamilyType;
	}
	public void setProductFamilyType(String productFamilyType) {
		this.productFamilyType = productFamilyType;
	}
	public String getPuncture() {
		return puncture;
	}
	public void setPuncture(String puncture) {
		this.puncture = puncture;
	}
	public String getAvailableOuterFabricColors() {
		return availableOuterFabricColors;
	}
	public void setAvailableOuterFabricColors(String availableOuterFabricColors) {
		this.availableOuterFabricColors = availableOuterFabricColors;
	}
	public String getAvailableOption() {
		return availableOption;
	}
	public void setAvailableOption(String availableOption) {
		this.availableOption = availableOption;
	}
	public String getRfglCode() {
		return rfglCode;
	}
	public void setRfglCode(String rfglCode) {
		this.rfglCode = rfglCode;
	}
	public String getFlamInd() {
		return flamInd;
	}
	public void setFlamInd(String flamInd) {
		this.flamInd = flamInd;
	}
	public String getProdDisplayOrder() {
		return prodDisplayOrder;
	}
	public void setProdDisplayOrder(String prodDisplayOrder) {
		this.prodDisplayOrder = prodDisplayOrder;
	}
	public String getServiceUs() {
		return serviceUs;
	}
	public void setServiceUs(String serviceUs) {
		this.serviceUs = serviceUs;
	}
	public String getLayers() {
		return layers;
	}
	public void setLayers(String layers) {
		this.layers = layers;
	}
	public String getFabricFinish() {
		return fabricFinish;
	}
	public void setFabricFinish(String fabricFinish) {
		this.fabricFinish = fabricFinish;
	}
	
	public String getSpecialPgm() {
		return specialPgm;
	}
	public void setSpecialPgm(String specialPgm) {
		this.specialPgm = specialPgm;
	}

	
	
	

}
