package com.tcs.pim.domain;

import java.io.Serializable;

public class FinishedDimensions implements Serializable{
	String Size;
	String SleeveLength;
	String ChestWidth;

	@Override
	public String toString() {
		return "FinishedDimensions [Size=" + Size + ", SleeveLength="
				+ SleeveLength + ", ChestWidth=" + ChestWidth + ", Inseam="
				+ Inseam + ", FitsChest=" + FitsChest + ", FitsHeight="
				+ FitsHeight + ", InnerGlovesSize=" + InnerGlovesSize
				+ ", OuterGlovesSize=" + OuterGlovesSize + "]";
	}

	String Inseam;
	String FitsChest;
	String FitsHeight;
	String InnerGlovesSize;
	String OuterGlovesSize;

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getSleeveLength() {
		return SleeveLength;
	}

	public void setSleeveLength(String sleeveLength) {
		SleeveLength = sleeveLength;
	}

	public String getChestWidth() {
		return ChestWidth;
	}

	public void setChestWidth(String chestWidth) {
		ChestWidth = chestWidth;
	}

	public String getInseam() {
		return Inseam;
	}

	public void setInseam(String inseam) {
		Inseam = inseam;
	}

	public String getFitsChest() {
		return FitsChest;
	}

	public void setFitsChest(String fitsChest) {
		FitsChest = fitsChest;
	}

	public String getFitsHeight() {
		return FitsHeight;
	}

	public void setFitsHeight(String fitsHeight) {
		FitsHeight = fitsHeight;
	}

	public String getInnerGlovesSize() {
		return InnerGlovesSize;
	}

	public void setInnerGlovesSize(String innerGlovesSize) {
		InnerGlovesSize = innerGlovesSize;
	}

	public String getOuterGlovesSize() {
		return OuterGlovesSize;
	}

	public void setOuterGlovesSize(String outerGlovesSize) {
		OuterGlovesSize = outerGlovesSize;
	}

}
