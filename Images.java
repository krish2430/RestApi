package com.tcs.pim.domain;

import java.util.List;

public class Images {
	List <String> Image;

	public List<String> getImage() {
		return Image;
	}

	public void setImage(List<String> image) {
		Image = image;
	}

	@Override
	public String toString() {
		return "Images [Image=" + Image + "]";
	}

}
