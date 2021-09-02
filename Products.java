package com.tcs.pim.domain;

import java.util.List;
 
public class Products {
	
List <Product> Product;

public List<Product> getProduct() {
	return Product;
}

public void setProduct(List<Product> product) {
	Product = product;
}

@Override
public String toString() {
	return "Products [Product_1=" + Product + "]";
}



}
