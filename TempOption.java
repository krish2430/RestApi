package com.tcs.pim.domain;

public class TempOption  implements Comparable<TempOption>{
	private String size;
	private String option;
	private OptionCode optionCode;
	private String sku;
	private String status;
	private String article;
	private String info;
	private String order;
	
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public OptionCode getOptionCode() {
		return optionCode;
	}
	public void setOptionCode(OptionCode optionCode) {
		this.optionCode = optionCode;
	}
	@Override
	public int compareTo(TempOption o) {
		return this.option.compareTo(o.option);
	}
	
}
