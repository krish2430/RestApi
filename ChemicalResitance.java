package com.tcs.pim.domain;

import java.io.Serializable;


public class ChemicalResitance implements Serializable {

	String HazardName;
	String CASNumber;
	String Phase;
	String NormalizedBreakThrough;

	public String getHazardName() {
		return HazardName;
	}

	public void setHazardName(String hazardName) {
		HazardName = hazardName;
	}

	public String getCASNumber() {
		return CASNumber;
	}

	public void setCASNumber(String cASNumber) {
		CASNumber = cASNumber;
	}

	public String getPhase() {
		return Phase;
	}

	public void setPhase(String phase) {
		Phase = phase;
	}

	@Override
	public String toString() {
		return "ChemicalResitance [HazardName=" + HazardName + ", CASNumber="
				+ CASNumber + ", Phase=" + Phase + ", NormalizedBreakThrough="
				+ NormalizedBreakThrough + "]";
	}

	public String getNormalizedBreakThrough() {
		return NormalizedBreakThrough;
	}

	public void setNormalizedBreakThrough(String normalizedBreakThrough) {
		NormalizedBreakThrough = normalizedBreakThrough;
	}

}
