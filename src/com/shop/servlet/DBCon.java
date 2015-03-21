package com.shop.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.shop.model.CartDetail;
import com.shop.model.DBConnection;
import com.shop.model.DetailBean;
import com.shop.model.SearchBean;

/**
 * Servlet implementation class DBCon
 */
@WebServlet("/DBCon")
public class DBCon extends HttpServlet {
private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
		 PrintWriter out = response.getWriter();
		 int count=0;
		 float tot=0;
		 int uid2=0;
		 String item=request.getParameter("searchItem");
		boolean val,store,log,place_order,remove_order,checklog,chkcart,delitem;
		ArrayList viewcart,ordercart,search,al;
		HttpSession session1=request.getSession();
		if(session1.getAttribute("email")!=null)
		{
			uid2=(int) session1.getAttribute("uid");
		}
		 CartDetail cd=new CartDetail(uid2,item);
		 DBConnection cart = new DBConnection();
		 
		if(request.getParameter("lijeans") != null){
			ArrayList searchlist;
			 
			 search=cd.searchjeans(request,response); //for fetch price of jeans
			 
			 if(!(search.isEmpty())){
			 Iterator itr=search.iterator();
			 
			 searchlist=new ArrayList();
			    while(itr.hasNext()){  
			     SearchBean s=(SearchBean)itr.next();
			     searchlist.add(s.getImgpath());
			     searchlist.add(s.getItemPrice());
			  
			     
			    }  
	   
			    request.setAttribute("searchitem", searchlist);

	    	RequestDispatcher rd=request.getRequestDispatcher("/clothe.jsp");
	    	rd.forward(request, response);
			 }	 
		}
		if(request.getParameter("lishoes") != null){
			ArrayList searchlist;
			 
			 search=cd.searchShoes(request,response); //for fetch price of shoes
			 
			 if(!(search.isEmpty())){
			 Iterator itr=search.iterator();
			 
			 searchlist=new ArrayList();
			    while(itr.hasNext()){  
			     SearchBean s=(SearchBean)itr.next();
			     searchlist.add(s.getImgpath());
			     searchlist.add(s.getItemPrice());
			  
			     
			    }  
	   
			    request.setAttribute("searchitem", searchlist);

	    	RequestDispatcher rd=request.getRequestDispatcher("/shoe.jsp");
	    	rd.forward(request, response);
			 }	 
		}
		if(request.getParameter("liwatch") != null){
			ArrayList searchlist;
			 
			 search=cd.searchWatch(request,response); //for fetch price of watch
			 
			 if(!(search.isEmpty())){
			 Iterator itr=search.iterator();
			 
			 searchlist=new ArrayList();
			    while(itr.hasNext()){  
			     SearchBean s=(SearchBean)itr.next();
			     searchlist.add(s.getImgpath());
			     searchlist.add(s.getItemPrice());
			  
			     
			    }  
	   
			    request.setAttribute("searchitem", searchlist);

	    	RequestDispatcher rd=request.getRequestDispatcher("/watch.jsp");
	    	rd.forward(request, response);
			 }	 
		}
		if(request.getParameter("liwallet") != null){
			ArrayList searchlist;
			 
			 search=cd.searchWallet(request,response); //for fetch price of wallet
			 
			 if(!(search.isEmpty())){
			 Iterator itr=search.iterator();
			 
			 searchlist=new ArrayList();
			    while(itr.hasNext()){  
			     SearchBean s=(SearchBean)itr.next();
			     searchlist.add(s.getImgpath());
			     searchlist.add(s.getItemPrice());
			  
			     
			    }  
	   
			    request.setAttribute("searchitem", searchlist);

	    	RequestDispatcher rd=request.getRequestDispatcher("/wallet.jsp");
	    	rd.forward(request, response);
			 }	 
		}
		 if (request.getParameter("jeans") != null) {
			 
			 //for added item into cart
			 
	          val= cart.jeans();
	          if(val){
	        	 
	        	  	store =cart.insert();
	        	  	if(store){
	        	  		
	        	  		JOptionPane.showMessageDialog(null, "item added successfully");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	        	  	else{
	        	  		JOptionPane.showMessageDialog(null, "item not added");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	          }
	          else{
	        	  JOptionPane.showMessageDialog(null, "Please login frist");
	        	  response.sendRedirect("index.jsp");
	          }
		 }
		 if(request.getParameter("shoes")!=null){
			 
			 
			 
			 val= cart.jeans();  //for check login or not
			 if(val){
	        	 
	        	  	store =cart.shoes();  //for added item into cart
	        	  	if(store){
	        	  		JOptionPane.showMessageDialog(null, "item added successfully");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	        	  	else{
	        	  		JOptionPane.showMessageDialog(null, "item not added");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	          }
	          else{
	        	  JOptionPane.showMessageDialog(null, "Please login frist");
	        	  response.sendRedirect("index.jsp");
	          }
			 
		 }
		 
		 if(request.getParameter("wallet")!=null){
			 
				
		 		
			 val= cart.jeans();  //for check login or not
			 if(val){
	        	 
	        	  	store =cart.wallet();  //for added item into cart
	        	  	if(store){
	        	  		JOptionPane.showMessageDialog(null, "item added successfully");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	        	  	else{
	        	  		JOptionPane.showMessageDialog(null, "item not added");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	          }
	          else{
	        	  JOptionPane.showMessageDialog(null, "Please login frist");
	        	  response.sendRedirect("index.jsp");
	          }
			 
		 }
		 	if(request.getParameter("watch")!=null){
			 
		
		 		
			 val= cart.jeans();  //for check login or not
			 if(val){
	        	 
	        	  	store =cart.watch();  //for added item into cart
	        	  	if(store){
	        	  		JOptionPane.showMessageDialog(null, "item added successfully");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	        	  	else{
	        	  		JOptionPane.showMessageDialog(null, "item not added");
	        	  		response.sendRedirect("index.jsp");
	        	  	}
	          }
	          else{
	        	  JOptionPane.showMessageDialog(null, "Please login frist");
	        	  response.sendRedirect("index.jsp");
	          }
			 
		 }
		 if(request.getParameter("logout")!=null){
			 
			 //for logout
			 
			 val= cart.jeans();  //for check login or not
			 if(val){
					 log=cart.logout(request);
					 
					 if(log){
						 HttpSession session=request.getSession();
						 session.removeAttribute("email");
						 JOptionPane.showMessageDialog(null, "You logout successfully");
						// request.getSession().invalidate();
					     response.sendRedirect("index.jsp");
						
					 }
			 }
			 else{
				 	JOptionPane.showMessageDialog(null, "Please login frist");
				 	response.sendRedirect("index.jsp");
			 }
			 
		 }
		 if(request.getParameter("place")!=null){
			 
			
			 
			 place_order=cart.chek();  //for order placed
			 if(place_order){
				 remove_order=cart.removeOrder(); //remove item from cart
				 	if(remove_order){
				 		JOptionPane.showMessageDialog(null, "Your orders successfully placed");
				 		response.sendRedirect("index.jsp");
				 	}
			 }
			 else{
				 JOptionPane.showMessageDialog(null, "Your orders is not placed");
				 response.sendRedirect("cart.jsp");
			 }
		 }
		 if(request.getParameter("order")!=null){
			 
			
			 
			 
			 	val= cart.jeans();    //check login or not
			 	if(val){
			 		ArrayList orderlist;
			 		viewcart=cd.orderCartDetail(request,response);  //for fetch the order detail 
			 		
			 		  Iterator itr=viewcart.iterator();  
			 		  
			 		 orderlist=new ArrayList();
					    while(itr.hasNext()){  
					     DetailBean d=(DetailBean)itr.next();
					    orderlist.add(d.getDate());
					    orderlist.add(d.getQty());
					    orderlist.add(d.getPrice());
					    }
					    request.setAttribute("list", orderlist);
					    
					    RequestDispatcher rd=request.getRequestDispatcher("/order.jsp");
					    rd.forward(request, response);
					    
			 	}
			 	else{
		        	  JOptionPane.showMessageDialog(null, "Please login frist");
		        	  response.sendRedirect("index.jsp");
		          }
		 }
		 if(request.getParameter("search")!=null){
			
			ArrayList searchlist;
			 
			 search=cd.searchItem(request,response); //for search item
			 
			 if(!(search.isEmpty())){
			 Iterator itr=search.iterator();
			 
			 searchlist=new ArrayList();
			    while(itr.hasNext()){  
			     SearchBean s=(SearchBean)itr.next();
			     searchlist.add(s.getItemName());
			     searchlist.add(s.getDiscription());
			     searchlist.add(s.getItemPrice());
			     searchlist.add(s.getItemQty());
			     searchlist.add(s.getImgpath());
			    // System.out.println(d.getName()+" "+d.getQty()+" "+d.getPrice());  
			     
			    }  
	    //response.sendRedirect("cart.jsp");
			    request.setAttribute("searchitem", searchlist);

	    	RequestDispatcher rd=request.getRequestDispatcher("/search.jsp");
	    	rd.forward(request, response);
			 }
		 else{
			 JOptionPane.showMessageDialog(null, "this item is not available");
			 response.sendRedirect("index.jsp");
		 	}
		 }	 
		 if(request.getParameter("delrow")!=null){
			
			
			int id = (int) request.getAttribute("itemid");
			 System.out.print(id);

			  //int id = Integer.parseInt("usrID");
			  delitem=cart.deletItem(id);
			  if(delitem){
				  System.out.print("hiiii");
			  }
			  else{
				  response.sendRedirect("cart.jsp");
			  }
		 }
		 if(request.getParameter("go")!=null){
			 
			 val=cart.jeans(); //for check the login or not 
			
			 if(val){
				 chkcart=cart.checkcart();  //for check cart is empty or not
				 if(chkcart){
					 tot=cart.getAmount();  //for fetch total amount of cart
					
			
					 viewcart=cd.viewCartDetail(request,response); //for fetch the item into cart
			 
					 //ServletContext context=getServletContext();  
			 
					 // List list;  
			 
					 Iterator itr=viewcart.iterator();  
			   
			   
					 al=new ArrayList();
					    while(itr.hasNext()){  
					     DetailBean d=(DetailBean)itr.next();
					     al.add(d.getId());
					     al.add(d.getName());
					     al.add(d.getQty());
					     al.add(d.getPrice()); 
					     
					    }  
			    //response.sendRedirect("cart.jsp");
			    request.setAttribute("data", al);
			    request.setAttribute("total", tot);
			    RequestDispatcher rd=request.getRequestDispatcher("/cart.jsp");
			    rd.forward(request, response);
				 }
				 else{
					 JOptionPane.showMessageDialog(null, "Ur cart is empty");
		        	  response.sendRedirect("index.jsp");
				 }
			 }
			 else{
				 JOptionPane.showMessageDialog(null, "Please login frist");
	        	  response.sendRedirect("index.jsp");
			 }
		 }
		 
	}

	

}
