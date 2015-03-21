package com.shop.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.shop.model.LoginBean;
import com.sun.media.sound.ModelAbstractChannelMixer;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html");  
	       PrintWriter out=response.getWriter();  
	       
	       
	         
	       String email=request.getParameter("eml");  
	       String password=request.getParameter("pass");
	              
	      
	       
	       LoginBean bean=new LoginBean();
	       
	       bean.setEmail(email);  
	       bean.setPassword(password);  
	       
	       request.setAttribute("bean",bean); 
	       
	       boolean status=bean.validate(request,response);  
	       
	       /*  Cookie[] cookie=request.getCookies();
	            
	       String name=null;
	      
	       
	      for(Cookie c:cookie)
	       {
	    	  
	    	   if(c.getName().equals("name"))
	    	   {
	    		   name=c.getValue();
	    	   }
	    	   System.out.print(name);
	       }
	       
	       if(name!=null)
 	       {
 	    	   out.println(name);
 	    	   System.out.print(name);
 	       }*/
	       if(status){
	    	   
	    	  // System.out.print(name);
	    	   RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
	    	   rd.include(request, response);
	    	   
	       }
	       else{
	    	   JOptionPane.showMessageDialog(null, "ur id and password doesnt match, please try again");
	       }
	       

	}

}
