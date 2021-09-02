package com.tcs.pim.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class HazardMatrix {

	private String hazardMatrixId;
	private String  solutionRank;

	public String getHazardMatrixId() {
		return hazardMatrixId;
	}

	public void setHazardMatrixId(String hazardMatrixId) {
		this.hazardMatrixId = hazardMatrixId;
	}

	public String getSolutionRank() {
		return solutionRank;
	}

	public void setSolutionRank(String solutionRank) {
		this.solutionRank = solutionRank;
	}

	



	





}
