package com.tcs.pim.domain;


public class PhysicalProperty implements Comparable<PhysicalProperty>{
	private String prodId;
	private String lang;
	private String lob;
	private String type;
	private String id;
	private String property;
	private String testMethod;
	private String testMethodActive;
	private String typicalResultOrUnits;
	private String region;
	private String displayOrder;
	private FootNote footNote;
	private String label;
	private String maximum;
	private String minimum;
	private String nominal;
	private String value;
	private WebPageSection webPageSection;
	private String fabricCd;
	private String pageName;
	private String description;
	private String enClass;
	private String stdDev;
	
	
	public String getTestMethodActive() {
		return testMethodActive;
	}

	public void setTestMethodActive(String testMethodActive) {
		this.testMethodActive = testMethodActive;
	}
	public String getEnClass() {
		return enClass;
	}

	public void setEnClass(String enClass) {
		this.enClass = enClass;
	}

	public String getStdDev() {
		return stdDev;
	}

	public void setStdDev(String stdDev) {
		this.stdDev = stdDev;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFabricCd() {
		return fabricCd;
	}

	public void setFabricCd(String fabricCd) {
		this.fabricCd = fabricCd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLob() {
		return lob;
	}

	public void setLob(String lob) {
		this.lob = lob;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getTestMethod() {
		return testMethod;
	}

	public void setTestMethod(String testMethod) {
		this.testMethod = testMethod;
	}

	public String getTypicalResultOrUnits() {
		return typicalResultOrUnits;
	}

	public void setTypicalResultOrUnits(String typicalResultOrUnits) {
		this.typicalResultOrUnits = typicalResultOrUnits;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(String displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getMaximum() {
		return maximum;
	}

	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	public String getNominal() {
		return nominal;
	}

	public void setNominal(String nominal) {
		this.nominal = nominal;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public WebPageSection getWebPageSection() {
		return webPageSection;
	}

	public void setWebPageSection(WebPageSection webPageSection) {
		this.webPageSection = webPageSection;
	}

	public FootNote getFootNote() {
		return footNote;
	}

	public void setFootNote(FootNote footNote) {
		this.footNote = footNote;
	}
	@Override
	public int compareTo(PhysicalProperty o) {
		int o1=Integer.parseInt(this.getDisplayOrder());
		int o2=Integer.parseInt(o.getDisplayOrder());
		return (o1 < o2 ? -1 : 
	        (o1 == 02? 0 : 1));  
	}

}
