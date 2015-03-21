package com.shop.model;

public class DbConfig {
	
	private String dbName;
	private String dbAddress;
	private String userName;
	private String password;
	
	public DbConfig() {
		super();
		this.dbName = "onlineshop";
		this.dbAddress = "localhost";
		this.userName="root";
		this.password="root";
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDbAddress() {
		return dbAddress;
	}
	public void setDbAddress(String dbAddress) {
		this.dbAddress = dbAddress;
	}
		
}
