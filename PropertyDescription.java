package com.tcs.pim.domain;

public class PropertyDescription {
	private String lang;
	private String propId;
	private String propName;
	private String region;
	private String description;
	
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getPropId() {
		return propId;
	}
	public void setPropId(String propId) {
		this.propId = propId;
	}
	public String getPropName() {
		return propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((propId == null) ? 0 : propId.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        PropertyDescription other = (PropertyDescription) obj;
        if (propId == null) {
          if (other.propId != null)
            return false;
        } else if (!propId.equals(other.propId))
          return false;
        return true;
      }	
}
