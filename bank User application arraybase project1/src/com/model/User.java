package com.model;

public class User {
	private  int userId;
	private  String username;
	private String address;
	private String aadharno;
	private String emailId;
	private long mobileno;
	private String pancardno;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPancardno() {
		return pancardno;
	}
	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}
	@Override
	public String toString() {
		return "User \n userId=" + userId + "\nusername=" + username + "\naddress=" + address + "\naadharno=" + aadharno
				+ "\nemailId=" + emailId + "\nmobileno=" + mobileno + "\npancardno=" + pancardno ;
	}
	
	
	
	
	
	
	 
	}
	
	
	
	
	
	 


