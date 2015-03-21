package com.shop.model;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartDetail
 */

public class CartDetail implements  ServletContextListener {
	
	int id;
	String item;
	public CartDetail() {
		// TODO Auto-generated constructor stub
	}
	public CartDetail(int id,String item) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.item=item;
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent e) {
		// TODO Auto-generated method stub
		
		/*  ArrayList list=new ArrayList();  
		  try {
				java.sql.Connection conn=DriverConnection.getConnection();
				Statement st=conn.createStatement();
				String sql=null;
				
				sql="select od_proname,od_qty,od_price from odetail";
				ResultSet rs = st.executeQuery(sql);
				 ArrayList items =new ArrayList();
				 while(rs.next())  {
			            DetailBean newItem = new DetailBean();
			 
			            
			            newItem.setName(rs.getString(2));
			            newItem.setQty(rs.getInt(3));
			            newItem.setPrice(rs.getFloat(4));
			            
			                  items.add(newItem);
			                }
				 
				    
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		  	ServletContext context=e.getServletContext();  
		   context.setAttribute("data",list); 	
			}*/
	}

	public ArrayList viewCartDetail(HttpServletRequest request,HttpServletResponse response) {
		
		ArrayList items =new ArrayList();
		CartDetail data = null;
	    try{
	    	java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql="select od_id,od_proname,od_qty,od_price from odetail where uid='"+id+"'";
			
			ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next())  {
		            DetailBean newItem = new DetailBean();
		 
		            newItem.setId(rs.getInt(1));
		            newItem.setName(rs.getString(2));
		            newItem.setQty(rs.getInt(3));
		            newItem.setPrice(rs.getFloat(4));
		            
		                  items.add(newItem);
		                }
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return items;
	}

	public ArrayList orderCartDetail(HttpServletRequest request,HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ArrayList cartlist =new ArrayList();
		CartDetail data = null;
	    try{
	    	java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql="select o_date,o_qty,o_price from orders where uid=(select uid from user where status='active')";
			ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next())  {
		            DetailBean newItem = new DetailBean();
		 
		            
		            newItem.setDate(rs.getString(1));
		            newItem.setQty(rs.getInt(2));
		            newItem.setPrice(rs.getFloat(3));
		            
		                  cartlist.add(newItem);
		                }
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return cartlist;
	}

	public ArrayList searchItem(HttpServletRequest request, HttpServletResponse response) {
		ArrayList items=new ArrayList();
		
		try{
	    	java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql="select name,discription,price,quantity,imagepath from item where name='"+item+"'";
			ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next())  {
		            SearchBean sb=new SearchBean();
		 
		            
		            sb.setItemName(rs.getString(1));
		            sb.setDiscription(rs.getString(2));
		            sb.setItemPrice(rs.getFloat(3));
		            sb.setItemQty(rs.getInt(4));
		            sb.setImgpath(rs.getString(5));
		          
		            
		                  items.add(sb);
		                }
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return items;
	}
	
	
	public ArrayList searchjeans(HttpServletRequest request,HttpServletResponse response) {
			ArrayList items=new ArrayList();
		
		try{
	    	java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql="select imagepath,price from item where name='jeans'";
			ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next())  {
		            SearchBean sb=new SearchBean();
		 
		            sb.setImgpath(rs.getString(1));
		            sb.setItemPrice(rs.getFloat(2));
		                  items.add(sb);
		                }
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return items;
		
	
	}
	public ArrayList searchShoes(HttpServletRequest request,HttpServletResponse response) {
		
	ArrayList items=new ArrayList();
		
		try{
	    	java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql="select imagepath,price from item where name='shoes'";
			ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next())  {
		            SearchBean sb=new SearchBean();
		 
		            sb.setImgpath(rs.getString(1));
		            sb.setItemPrice(rs.getFloat(2));
		                  items.add(sb);
		                }
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return items;
		
	}
	public ArrayList searchWatch(HttpServletRequest request,HttpServletResponse response) {
		ArrayList items=new ArrayList();
		try{
	    	java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql="select imagepath,price from item where name='watch'";
			ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next())  {
		            SearchBean sb=new SearchBean();
		 
		            sb.setImgpath(rs.getString(1));
		            sb.setItemPrice(rs.getFloat(2));
		                  items.add(sb);
		                }
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return items;
	}
	public ArrayList searchWallet(HttpServletRequest request,HttpServletResponse response) {
		ArrayList items=new ArrayList();
		try{
	    	java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql="select imagepath,price from item where name='wallet'";
			ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next())  {
		            SearchBean sb=new SearchBean();
		 
		            sb.setImgpath(rs.getString(1));
		            sb.setItemPrice(rs.getFloat(2));
		                  items.add(sb);
		                }
	    }
	    catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return items;
	}
	

}
