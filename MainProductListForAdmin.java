package com.tcs.pim.domain;

import java.io.Serializable;
import java.util.List;

public class MainProductListForAdmin  implements Serializable{

	private List<ProductListForAdmin> products;
    private String errorCode;
	public List<ProductListForAdmin> getProducts() {
		return products;
	}
	public void setProducts(List<ProductListForAdmin> products) {
		this.products = products;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}	
}
