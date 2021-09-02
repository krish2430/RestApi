package com.tcs.pim.domain;

import java.util.List;

public class PermHazard {
	private String hazardId;
	private String region ;
	private String country ;
	private String language ;
	private String hazardNameId;
	private String casNum ;
	private String eniecsNm ;
	private String unNum ;
	private String concentrationRank;
	private String solvent ;
	private String usePermDataFlag ;
	private String lowTempLiq ;
    private String hazardGasId;
    private List<HazardClassSubClass> hazardClassSubClassDtls;
    private List<HazardSynonymDetails> hazardSynonymDtls;
    private List<String> fabricsFamilyLevel;
    private List<String> fabricProductLevel;
    private List<PermTask> tasks;


  
	public String getHazardId() {
		return hazardId;
	}
	public void setHazardId( String hazardId) {
		this.hazardId = hazardId;
	}

	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
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
	public String getCasNum() {
		return casNum;
	}
	public void setCasNum(String casNum) {
		this.casNum = casNum;
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
	
	public String getConcentrationRank() {
		return concentrationRank;
	}
	public void setConcentrationRank(String concentrationRank) {
		this.concentrationRank = concentrationRank;
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
	public String getLowTempLiq() {
		return lowTempLiq;
	}
	public void setLowTempLiq(String lowTempLiq) {
		this.lowTempLiq = lowTempLiq;
	}

	public List<HazardClassSubClass> getHazardClassSubClassDtls() {
		return hazardClassSubClassDtls;
	}
	public void setHazardClassSubClassDtls(List<HazardClassSubClass> hazardClassSubClassDtls) {
		this.hazardClassSubClassDtls = hazardClassSubClassDtls;
	}

	public String getHazardGasId() {
		return hazardGasId;
	}
	public void setHazardGasId(String hazardGasId) {
		this.hazardGasId = hazardGasId;
	}
	public List<String> getFabricsFamilyLevel() {
		return fabricsFamilyLevel;
	}
	public void setFabricsFamilyLevel(List<String> fabricsFamilyLevel) {
		this.fabricsFamilyLevel = fabricsFamilyLevel;
	}
	public List<String> getFabricProductLevel() {
		return fabricProductLevel;
	}
	public void setFabricProductLevel(List<String> fabricProductLevel) {
		this.fabricProductLevel = fabricProductLevel;
	}
	public List<PermTask> getTasks() {
		return tasks;
	}
	public void setTasks(List<PermTask> tasks) {
		this.tasks = tasks;
	}
	public List<HazardSynonymDetails> getHazardSynonymDtls() {
		return hazardSynonymDtls;
	}
	public void setHazardSynonymDtls(List<HazardSynonymDetails> hazardSynonymDtls) {
		this.hazardSynonymDtls = hazardSynonymDtls;
	}
    
    
}
