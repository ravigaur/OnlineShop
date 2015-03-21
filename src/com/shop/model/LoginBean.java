package com.shop.model;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.catalina.connector.Response;

import com.sun.corba.se.pept.transport.Connection;

public class LoginBean {
	
	
	
	
	private  static String email,password;  
	  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public String getPassword() {  
	    return password;  
	}  
	public void setPassword(String password) {  
	    this.password = password;  
	}  
	
	public boolean validate(HttpServletRequest request,HttpServletResponse response){
		
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql;
			
			sql = "SELECT uid,name, email, password FROM user";
	        ResultSet rs = st.executeQuery(sql);
	      
	        while(rs.next()){
	        	
	        	if(email.equals(rs.getString("email")) && password.equals(rs.getString("password")))
	        	{
	        		java.sql.Connection con=DriverConnection.getConnection();
	    			Statement stm=con.createStatement();
	    		
	    			HttpSession session=request.getSession();
	        		if(session!=null)
	        		{
	        			session.setAttribute("email", rs.getString("email"));
	        			session.setAttribute("uid", rs.getInt(1));
	        		}
	        		
	        		String up="UPDATE user"
				+ " SET status = 'active' "
				+ " WHERE email in('"+email+"')";
	        		stm.executeUpdate(up);
	        		
	        		return true;
	        	}
	        }
		}
		catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
		
	      }
	
		return false;
		
	}
}

