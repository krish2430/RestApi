package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;

public class ChemicalResistanceData  implements Serializable{

String ChemicalResistanceFieldText;	
public String getChemicalResistanceFieldText() {
	return ChemicalResistanceFieldText;
}
public void setChemicalResistanceFieldText(String chemicalResistanceFieldText) {
	ChemicalResistanceFieldText = chemicalResistanceFieldText;
}
@Override
public String toString() {
	return "ChemicalResistanceData [ChemicalResistanceFieldText=" + ChemicalResistanceFieldText
			+ ", ChemicalResistance=" + ChemicalResistance + "]";
}
public List<ChemicalResitance> getChemicalResistance() {
	return ChemicalResistance;
}
public void setChemicalResistance(List<ChemicalResitance> chemicalResistance) {
	ChemicalResistance = chemicalResistance;
}
List <ChemicalResitance> ChemicalResistance;
}
