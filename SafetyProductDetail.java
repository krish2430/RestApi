package com.tcs.pim.domain;

import java.util.List;

public class SafetyProductDetail {
	private List<ProductFamily> productFamilys;
	private List<Product> products;
	private List<Item> items;
	public List<ProductFamily> getProductFamilys() {
		return productFamilys;
	}
	public void setProductFamilys(List<ProductFamily> productFamilys) {
		this.productFamilys = productFamilys;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	

}
