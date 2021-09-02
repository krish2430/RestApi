package com.tcs.pim.domain;


public class PimHazards {
	private String hazardId;
	private String country;
	private String language;
	private String hazardNameId;
	private String hazardName;
	private String casNum;
	private String conc;
	private String eniecsNm;
	private String unNum;
	private String physStateId;
	private String physicalState;
	private String concentrationRank;
	private String hazardSynonyms;
	private String usePermDataFlag;
	private String solvent;
	private String temperature;
	private String lowTempLiq;
	private String hazardCompleteName;
	private String hazardSynonymId;
	private String hazardGasId;
	private String fabricsFamilyLevel;
	private String fabricProductLevel;
	private String hazardClassName;
	private String hazardClassId;
	private String hazardSubClassName;
	private String hazardSubClassId;

	@Override
	public String toString() {
		return "PimHazards [hazardId=" + hazardId + ", country=" + country
				+ ", language=" + language + ", hazardNameId=" + hazardNameId
				+ ", hazardName=" + hazardName + ", casNum=" + casNum
				+ ", conc=" + conc + ", eniecsNm=" + eniecsNm + ", unNum="
				+ unNum + ", physStateId=" + physStateId + ", physicalState="
				+ physicalState + ", concentrationRank=" + concentrationRank
				+ ", hazardSynonyms=" + hazardSynonyms + ", usePermDataFlag="
				+ usePermDataFlag + ", solvent=" + solvent + ", temperature="
				+ temperature + ", lowTempLiq=" + lowTempLiq
				+ ", hazardCompleteName=" + hazardCompleteName
				+ ", hazardSynonymId=" + hazardSynonymId + ", hazardGasId="
				+ hazardGasId + ", fabricsFamilyLevel=" + fabricsFamilyLevel
				+ ", fabricProductLevel=" + fabricProductLevel
				+ ", hazardClassName=" + hazardClassName + ", hazardClassId="
				+ hazardClassId + ", hazardSubClassName=" + hazardSubClassName
				+ ", hazardSubClassId=" + hazardSubClassId + "]";
	}

	public String getHazardClassName() {
		return hazardClassName;
	}

	public void setHazardClassName(String hazardClassName) {
		this.hazardClassName = hazardClassName;
	}

	public String getHazardClassId() {
		return hazardClassId;
	}

	public void setHazardClassId(String hazardClassId) {
		this.hazardClassId = hazardClassId;
	}

	public String getHazardSubClassName() {
		return hazardSubClassName;
	}

	public void setHazardSubClassName(String hazardSubClassName) {
		this.hazardSubClassName = hazardSubClassName;
	}

	public String getHazardSubClassId() {
		return hazardSubClassId;
	}

	public void setHazardSubClassId(String hazardSubClassId) {
		this.hazardSubClassId = hazardSubClassId;
	}

	public String getHazardId() {
		return hazardId;
	}

	public void setHazardId(String hazardId) {
		this.hazardId = hazardId;
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

	public String getHazardNameId() {
		return hazardNameId;
	}

	public void setHazardNameId(String hazardNameId) {
		this.hazardNameId = hazardNameId;
	}

	public String getHazardName() {
		return hazardName;
	}

	public void setHazardName(String hazardName) {
		this.hazardName = hazardName;
	}

	public String getCasNum() {
		return casNum;
	}

	public void setCasNum(String casNum) {
		this.casNum = casNum;
	}

	public String getConc() {
		return conc;
	}

	public void setConc(String conc) {
		this.conc = conc;
	}

	public String getEniecsNm() {
		return eniecsNm;
	}

	public void setEniecsNm(String eniecsNm) {
		this.eniecsNm = eniecsNm;
	}

	public String getUnNum() {
		return unNum;
	}

	public void setUnNum(String unNum) {
		this.unNum = unNum;
	}

	public String getPhysStateId() {
		return physStateId;
	}

	public void setPhysStateId(String physStateId) {
		this.physStateId = physStateId;
	}

	public PimHazards(PimHazards hazard) {
		super();
		this.hazardId = hazard.hazardId;
		this.country = hazard.country;
		this.language = hazard.language;
		this.hazardNameId = hazard.hazardNameId;
		this.hazardName = hazard.hazardName;
		this.casNum = hazard.casNum;
		this.conc = hazard.conc;
		this.eniecsNm = hazard.eniecsNm;
		this.unNum = hazard.unNum;
		this.physStateId = hazard.physStateId;
		this.physicalState = hazard.physicalState;
		this.concentrationRank = hazard.concentrationRank;
		this.hazardSynonyms = hazard.hazardSynonyms;
		this.usePermDataFlag = hazard.usePermDataFlag;
		this.solvent = hazard.solvent;
		this.temperature = hazard.temperature;
		this.lowTempLiq = hazard.lowTempLiq;
		this.hazardCompleteName = hazard.hazardCompleteName;
		this.hazardSynonymId = hazard.hazardSynonymId;
		this.hazardGasId = hazard.hazardGasId;
		this.fabricsFamilyLevel = hazard.fabricsFamilyLevel;
		this.fabricProductLevel = hazard.fabricProductLevel;
		this.hazardClassName = hazard.hazardClassName;
		this.hazardClassId = hazard.hazardClassId;
		this.hazardSubClassName = hazard.hazardSubClassName;
		this.hazardSubClassId = hazard.hazardSubClassId;
	}

	public PimHazards() {
		// TODO Auto-generated constructor stub
	}

	public String getPhysicalState() {
		return physicalState;
	}

	public void setPhysicalState(String physicalState) {
		this.physicalState = physicalState;
	}

	public String getConcentrationRank() {
		return concentrationRank;
	}

	public void setConcentrationRank(String concentrationRank) {
		this.concentrationRank = concentrationRank;
	}

	public String getHazardSynonyms() {
		return hazardSynonyms;
	}

	public void setHazardSynonyms(String hazardSynonyms) {
		this.hazardSynonyms = hazardSynonyms;
	}

	public String getUsePermDataFlag() {
		return usePermDataFlag;
	}

	public void setUsePermDataFlag(String usePermDataFlag) {
		this.usePermDataFlag = usePermDataFlag;
	}

	public String getSolvent() {
		return solvent;
	}

	public void setSolvent(String solvent) {
		this.solvent = solvent;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getLowTempLiq() {
		return lowTempLiq;
	}

	public void setLowTempLiq(String lowTempLiq) {
		this.lowTempLiq = lowTempLiq;
	}

	public String getHazardCompleteName() {
		return hazardCompleteName;
	}

	public void setHazardCompleteName(String hazardCompleteName) {
		this.hazardCompleteName = hazardCompleteName;
	}

	public String getHazardSynonymId() {
		return hazardSynonymId;
	}

	public void setHazardSynonymId(String hazardSynonymId) {
		this.hazardSynonymId = hazardSynonymId;
	}

	public String getHazardGasId() {
		return hazardGasId;
	}

	public void setHazardGasId(String hazardGasId) {
		this.hazardGasId = hazardGasId;
	}

	public String getFabricsFamilyLevel() {
		return fabricsFamilyLevel;
	}

	public void setFabricsFamilyLevel(String fabricsFamilyLevel) {
		this.fabricsFamilyLevel = fabricsFamilyLevel;
	}

	public String getFabricProductLevel() {
		return fabricProductLevel;
	}

	public void setFabricProductLevel(String fabricProductLevel) {
		this.fabricProductLevel = fabricProductLevel;
	}
}
