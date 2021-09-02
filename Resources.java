package com.tcs.pim.domain;

import java.util.List;

public class Resources {
	List <String> resource;

	public List<String> getResource() {
		return resource;
	}

	@Override
	public String toString() {
		return "Resources [resource=" + resource + "]";
	}

	public void setResource(List<String> resource) {
		this.resource = resource;
	}

}
