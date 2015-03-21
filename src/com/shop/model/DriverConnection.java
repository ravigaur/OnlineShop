package com.shop.model;

import java.sql.Connection;
import java.sql.DriverManager;

public  class DriverConnection {
	
	private static DbConfig dbConfig;
	
	
public static Connection getConnection()
{
	Connection conn=null;
	
	dbConfig=new DbConfig();
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://"+dbConfig.getDbAddress()+"/"+dbConfig.getDbName()+"",""+dbConfig.getUserName()+"",""+dbConfig.getPassword()+"");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	}
}
