package com.pandit.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("mypob")
@ConfigurationProperties(prefix="my.app")
public class MyProfileData {
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "MyProfileData [pid=" + pid + ", pcode=" + pcode + ", model=" + model + ", format=" + format
				+ ", version=" + version + "]";
	}
	private Integer pid;
	private String pcode;
	private String model;
	private String format;
	private Double version;

}
