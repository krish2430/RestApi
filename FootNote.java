package com.tcs.pim.domain;

import java.io.Serializable;

public class FootNote implements Serializable{
	private int footnNoteId;
	private String language;
	private String footnNoteKeyCd;
	private String footnNoteKeyDesc;

	public int getFootnNoteId() {
		return footnNoteId;
	}

	public void setFootnNoteId(int footnNoteId) {
		this.footnNoteId = footnNoteId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getFootnNoteKeyCd() {
		return footnNoteKeyCd;
	}

	public void setFootnNoteKeyCd(String footnNoteKeyCd) {
		this.footnNoteKeyCd = footnNoteKeyCd;
	}

	public String getFootnNoteKeyDesc() {
		return footnNoteKeyDesc;
	}

	public void setFootnNoteKeyDesc(String footnNoteKeyDesc) {
		this.footnNoteKeyDesc = footnNoteKeyDesc;
	}

}
