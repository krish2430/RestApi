package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;

public class FinishedDimensionsData implements Serializable{
	
	@Override
	public String toString() {
		return "FinishedDimensionsData [FinishedDimensionsFieldText=" + FinishedDimensionsFieldText
				+ ", FinishedDimensions=" + FinishedDimensions + "]";
	}
	String FinishedDimensionsFieldText;
	public String getFinishedDimensionsFieldText() {
		return FinishedDimensionsFieldText;
	}
	public void setFinishedDimensionsFieldText(String finishedDimensionsFieldText) {
		FinishedDimensionsFieldText = finishedDimensionsFieldText;
	}
	public List<FinishedDimensions> getFinishedDimensions() {
		return FinishedDimensions;
	}
	public void setFinishedDimensions(List<FinishedDimensions> finishedDimensions) {
		FinishedDimensions = finishedDimensions;
	}
	List <FinishedDimensions> FinishedDimensions;

}
