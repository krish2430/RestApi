package com.tcs.pim.domain;

import java.util.List;
import java.util.Set;

public class FiltersProducts {

	private Set<Filter> filter;
	private List<FilterProduct> filterProduct;
	public Set<Filter> getFilter() {
		return filter;
	}
	public void setFilter(Set<Filter> filter) {
		this.filter = filter;
	}
	public List<FilterProduct> getFilterProduct() {
		return filterProduct;
	}
	public void setFilterProduct(List<FilterProduct> filterProduct) {
		this.filterProduct = filterProduct;
	}
}
