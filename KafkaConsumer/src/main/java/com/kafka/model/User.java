package com.kafka.model;

public class User {

	
	private String name;
	private String company;
	private String email;

	public User() {
		super();
	}

	public User(String name, String company, String email) {
		super();
		this.name = name;
		this.company = company;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
