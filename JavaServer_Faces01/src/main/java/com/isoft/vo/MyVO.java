package com.isoft.vo;

import java.io.Serializable;

public class MyVO implements Serializable{
	private String id;
	private String uname;
	public String getId() {
		return id;
	}
	public String getUname() {
		return uname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

}
