package com.tcs.pim.domain;

import java.util.List;

public class Variant {
	
String VariantName;
String Model;
String ProductLongDesc;
List <String> Images;
public String getVariantName() {
	return VariantName;
}
public void setVariantName(String variantName) {
	VariantName = variantName;
}
@Override
public String toString() {
	return "Variant [VariantName=" + VariantName + ", Model=" + Model + ", ProductLongDesc=" + ProductLongDesc
			+ ", Images=" + Images + ", Design=" + Design + ", Seam=" + Seam + ", color=" + color + ", Quantity="
			+ Quantity + ", OptionCode=" + OptionCode + ", Sizes=" + Sizes + ", featurePoints=" + featurePoints
			+ ", optionCodeDescription=" + optionCodeDescription + ", partNumber=" + partNumber + ", specifications="
			+ specifications + ", additionalEquipment=" + additionalEquipment + ", resources=" + resources + ", Item="
			+ Item + "]";
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}


public List<Item> getItem() {
	return Item;
}
public void setItem(List<Item> item) {
	Item = item;
}
public List<String> getResources() {
	return resources;
}

public void setResources(List<String> resources) {
	this.resources = resources;
}
public List<String> getImages() {
	return Images;
}

public void setImages(List<String> images) {
	Images = images;
}
public String getProductLongDesc() {
	return ProductLongDesc;
}
public void setProductLongDesc(String productLongDesc) {
	ProductLongDesc = productLongDesc;
}

public String getDesign() {
	return Design;
}
public void setDesign(String design) {
	Design = design;
}
public String getSeam() {
	return Seam;
}
public void setSeam(String seam) {
	Seam = seam;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getQuantity() {
	return Quantity;
}
public void setQuantity(String quantity) {
	Quantity = quantity;
}
public String getOptionCode() {
	return OptionCode;
}
public void setOptionCode(String optionCode) {
	OptionCode = optionCode;
}
public String getSizes() {
	return Sizes;
}
public void setSizes(String sizes) {
	Sizes = sizes;
}
public String getFeaturePoints() {
	return featurePoints;
}
public void setFeaturePoints(String featurePoints) {
	this.featurePoints = featurePoints;
}
public String getOptionCodeDescription() {
	return optionCodeDescription;
}
public void setOptionCodeDescription(String optionCodeDescription) {
	this.optionCodeDescription = optionCodeDescription;
}
public String getPartNumber() {
	return partNumber;
}
public void setPartNumber(String partNumber) {
	this.partNumber = partNumber;
}
public String getSpecifications() {
	return specifications;
}
public void setSpecifications(String specifications) {
	this.specifications = specifications;
}
public String getAdditionalEquipment() {
	return additionalEquipment;
}
public void setAdditionalEquipment(String additionalEquipment) {
	this.additionalEquipment = additionalEquipment;
}


String Design;
String Seam;
String color;
String Quantity;
String OptionCode;
String Sizes;
String featurePoints;
String optionCodeDescription;
String partNumber;
String specifications;
String additionalEquipment;
List <String> resources;
List <Item> Item;

}
