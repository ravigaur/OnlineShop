
<%@page import="java.util.Iterator"%>
<%@page import= "com.shop.model.DetailBean"%>
<%@page import= "java.util.ArrayList"%>
<jsp:useBean id="DetailBean" class="com.shop.model.DetailBean" scope="application"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<script>
	function deleteRow(r) {
    var i = r.parentNode.parentNode.rowIndex;
    document.getElementById("myTable").deleteRow(i);
	}
</script>
     
<style type="text/css">

		.myButton {
	-moz-box-shadow: 0px 1px 0px 0px #1c1b18;
	-webkit-box-shadow: 0px 1px 0px 0px #1c1b18;
	box-shadow: 0px 1px 0px 0px #1c1b18;
	background-color:#eae0c2;
	-moz-border-radius:15px;
	-webkit-border-radius:15px;
	border-radius:15px;
	border:2px solid #333029;
	display:inline-block;
	cursor:pointer;
	color:#505739;
	font-family:arial;
	font-size:14px;
	font-weight:bold;
	padding:12px 16px;
	text-decoration:none;
	text-shadow:0px 1px 0px #ffffff;
}
.myButton:hover {
	background-color:#ccc2a6;
}
.myButton:active {
	position:relative;
	top:1px;
}
		
</style>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  
</head>

<jsp:directive.include file="header.jsp" />

<body style="background-color:#98AFC7;">


<img src="images/cartname.png" style="margin-left: 500px">
<div class="container">            
  <table class="table" id="myTable">
    <thead>
      <tr>
       <th style="background-color: #FFFFFF">Remove</th>
        <th style="background-color: #FFFFFF">ID</th>
        <th style="background-color: #FFFFFF">ItemName</th>
        <th style="background-color: #FFFFFF">Quantity</th>
        <th style="background-color: #FFFFFF">Cost</th>
      </tr>
    </thead>
    <tbody>
    <%
	ArrayList it;
	it=(ArrayList)request.getAttribute("data");
	int count=-1;
	Iterator itr=it.iterator();%>
	 <tr class="info">
	 <td><button type="submit" name="deleteitem" onclick="deleteRow(this)"><img src="images/remove.png"/> </button></td>
	
		 	
		 	<% 
		 		for (int i = 0; i<it.size(); i++) {
		 				if(count==3){
		 					count=0;
		 					int id=(Integer)it.get(i);
		 					
		 					%>
		 				 	
		 					<tr class="info">
		 				   <td><button type="submit" onclick="deleteRow(this)" ><img src="images/remove.png"/></button></td>
		 				   <td><% out.print(it.get(i));%></td> 
		 				   
		 				<%  
		 				}
		 				else{%>
		 					<% count++; %>
		 					<td><% out.print(it.get(i));%></td>
		 				<% }
		 				%>
		 			<% }
		 	
		   %>
		 
		   </tr>
	 </tbody>
  </table>
		  
		 
	
		
	 
	
	 <% 
	 float getrs;
	getrs=(Float)request.getAttribute("total");%>
		
		<b style="float: right; margin-right: 180px;"><% out.println(getrs);%></b>
		<b style="float: right; margin-right: 240px;">Total Bill :</b>

     <!-- <tr class="info">
      <td><input type="image" src="images/remove.png" onclick="deleteRow(this)"></td>
       
        <td></td>
        <td>200$</td>
        <td>2</td>
        <td>400$</td>
        
      </tr>
    
        
      <tr class="info">
       <td><input type="image" src="images/remove.png" onclick="deleteRow(this)"></td>
        <td>Jeans</td>
        <td>200$</td>
        <td>2</td>
        <td>400$</td>
        
      </tr>
      <tr class="info">
       <td><input type="image" src="images/remove.png" onclick="deleteRow(this)"></td>
        <td>Jeans</td>
        <td>200$</td>
        <td>2</td>
        <td>400$</td>
      </tr>
      
      <tr >
      <td></td>
      <td></td>
      <td></td>
      <td><b>Total</b></td>
      <td><b>1200$</b></td>
      </tr>-->
      
  
  <div class="container">
  <div class="row">
    <div class="col-sm-4">
<a href="index.jsp" class="myButton" style="margin-top: 50px">Continue Shoping</a></div>
    <div class="col-sm-4" ></div>
    <div class="col-sm-4">
    <form action="DBCon" method="post">
    <input type="submit" name="place" class="btn btn-info active" value="Place Order" style="margin-top: 50px" >
    <!--  <a href="#" class="myButton" style="margin-left: 100px; background-color:#D8D8D8 ;">Place Order</a>-->
    </form>
    </div>
    </div>
  </div>
</div>
</body>
</html>