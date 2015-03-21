package com.shop.model;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.pept.transport.Connection;

public class DBConnection {
	
	

 
	
 
	public boolean jeans() {
		// TODO Auto-generated method stub
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "SELECT * FROM user where status='active'";
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()){
				if((rs.getString("name"))!=null){
					return true;
				}
			}
			
			/*if(sql!=null){
				System.out.print(sql);
				
				
				return true;
			}*/
			
			//System.out.print(sql);
			
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
	}

	public boolean insert() {
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "insert into odetail(od_proname,od_qty,od_price,i_id,uid)values('jeans',1,(select price from item where name='jeans'),(select i_id from item where name='jeans'),(select uid from user where status='active'));";
			
			st.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
	}

	public boolean logout(HttpServletRequest request) {
		try{
			
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			HttpSession session=request.getSession();
			String sql=null;
			
			sql = "UPDATE user SET status='inactive' where status='active'";
			
			int rs = st.executeUpdate(sql);
			
			return true;
			
			
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
	}

	

	public boolean shoes() {
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "insert into odetail(od_proname,od_qty,od_price,i_id,uid)values('shoes',1,(select price from item where name='shoes'),(select i_id from item where name='shoes'),(select uid from user where status='active'));";
			
			st.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
		
	}

	

	public boolean watch() {
		// TODO Auto-generated method stub
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "insert into odetail(od_proname,od_qty,od_price,i_id,uid)values('watch',1,(select price from item where name='watch'),(select i_id from item where name='watch'),(select uid from user where status='active'));";
			
			st.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
		
	}

	public boolean chek() {
		
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "insert into orders(o_date,o_qty,o_price,uid)values(CURDATE(),(select count(*) from odetail where uid=(select uid from user where status='active')),(select sum(od_price) from odetail where uid=(select uid from user where status='active')),(select uid from user where status='active'))";
			
			st.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
		
	}

	public float getAmount() {
		try{
			float val=0;
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "select sum(od_price) from odetail where uid=(select uid from user where status='active')";
			
			ResultSet rs= st.executeQuery(sql);
			 rs.next();
			 String sum = rs.getString(1);
		    // System.out.println(sum);
			
		     val=Float.parseFloat(sum);
			return val;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return 0;
		
	}

	public boolean removeOrder() {
		
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "delete from odetail where uid=(select uid from user where status='active')";
			
			st.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
	}

	

	public boolean orderLoginCheck() {
		
		
		return false;
	}

	public boolean checkcart() {
		// TODO Auto-generated method stub
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "SELECT od_id FROM odetail where uid=(select uid from user where status='active')";
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()){
				if((rs.getString("od_id"))!=null){
					return true;
				}
			}
			
			/*if(sql!=null){
				System.out.print(sql);
				
				
				return true;
			}*/
			
			//System.out.print(sql);
			
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
	}

	public boolean deletItem(int uid) {
		
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "delete from odetail where od_id='"+uid+"'";
			
			st.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
	}

	public boolean wallet() {
		try{
			java.sql.Connection conn=DriverConnection.getConnection();
			Statement st=conn.createStatement();
			
			String sql=null;
			
			sql = "insert into odetail(od_proname,od_qty,od_price,i_id,uid)values('wallet',1,(select price from item where name='wallet'),(select i_id from item where name='wallet'),(select uid from user where status='active'));";
			
			st.executeUpdate(sql);
			
			return true;
		}
		catch(SQLException se){
	         se.printStackTrace();
	      }catch(Exception e){
	         e.printStackTrace();
		
	      }
		return false;
	}

	
	
	

	/*public void viewCart(HttpServletRequest request,HttpServletResponse response) {
		
		
		 HttpSession session = request.getSession();
		ArrayList<String> history;
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
		    session.setAttribute("items", items);
		    
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		try {
			response.sendRedirect("cart.jsp");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		*/
	
}
