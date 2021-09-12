package com.nandadulal.demo.model;

public class Contact {
	
	private int cid;
	private String name;
	private String email;
	private int userId;
	
	public Contact(int cid, String name, String email, int userId) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

	public Contact() {
		super();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}

