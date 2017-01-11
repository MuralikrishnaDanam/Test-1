package com.app.model;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long customerId;
	private String fName, lName;
	
	public Customer() {}
	
	
	public Customer(Long customerId, String fName, String lName) {
		super();
		this.customerId = customerId;
		this.fName = fName;
		this.lName = lName;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

}
