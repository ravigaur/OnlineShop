<%@page import="java.util.Iterator"%>
<%@page import= "com.shop.model.DetailBean"%>
<%@page import= "java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<jsp:directive.include file="header.jsp" />
<body style="background-color:#98AFC7;">
<img src="images/orderhistory.png" style="margin-left: 500px">
<div class="container">            
  <table class="table" id="myTable">
    <thead>
      <tr>
       
        <th style="background-color: #FFFFFF">Date</th>
        <th style="background-color: #FFFFFF">Quantity</th>
        <th style="background-color: #FFFFFF">Price</th>
       
      </tr>
    </thead>
    <tbody>
    	<tr class="info">
    	 <%
    	 	int count=0;
			ArrayList it;
			it=(ArrayList)request.getAttribute("list");
			Iterator itr=it.iterator();
	 		while(itr.hasNext()){
		 		if(count==3){
		 			count=0;%>
		 			 <tr class="info">
		  <%}else { %>
				 <td><% out.print(itr.next());%></td>
					<% count=count+1;%>
		<% }}%>  
	</tr>
     </tbody>
  </table>
 <%
	/* ArrayList it;
	it=(ArrayList)request.getAttribute("list");
	Iterator itr=it.iterator();
	 while(itr.hasNext()){
		 out.println(itr.next());
	 }  */
	%>
</body>
</html>