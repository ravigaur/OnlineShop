<%@page import="java.util.Iterator"%>
<%@page import= "com.shop.model.DetailBean"%>
<%@page import= "java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<!DOCTYPE html>
<html>  
<head>  

	<!--   <meta charset="utf-8">
	 <meta name="viewport" content="width=device-width, initial-scale=1">
	 <link href="Bootstrap/bootstrap.min.css" rel="stylesheet">
	 <script src="/scripts/jquery.min.js"></script>
	 <script src="Bootstrap/bootstrap.min.js"></script>
	 -->
	 <script>
	 	
    	 function popUp(url) {
    			newwindow=window.open(url,'name','height=300,width=450,left = 645,top = 350');
    			if (window.focus) {newwindow.focus();}
    			return false;
    		}

</script>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>

<jsp:directive.include file="header.jsp" />
<body style="background-color:#98AFC7;">

	<div>
	
	</div>
    <div class="container-fluid">
		<div class="row">
  			<div class="col-sm-1" >
  				
  			</div>
			<div class="col-sm-8">
 	<!--   <div class="col-sm-2" style="background-color:lavenderblush;"></div>
  			<div class="col-sm-4" style="background-color:lavenderblush;">-->
  			
    					<div class="container-fluid">
    						<div class="row">
       							 <div class="col-xs-4">
       							 <p>
				 					<img src="images/clothe_dis.jpg" class="img-thumbnail" style="margin-top: 5px; height: 290px;" >
				 				</p>  					 
				  				 </div>
				  				<div class="col-xs-4">
				 					<p>
				 					<img src="images/puma_dis.jpg" class="img-thumbnail" style="margin-top: 5px; height: 290px;" >
				 				</p>  			 
				  				 </div>
				  				 <div class="col-xs-4">
				 				<p>
				 					<img src="images/sale.jpg" class="img-thumbnail" style="margin-top: 5px; height: 290px;" >
				 				</p>  			 
				  				 </div>
				  			</div>
				  		</div> 	
				  		
				  		<div class="container-fluid">
    						<div class="row">
       							 <div class="col-xs-4">
				 				<!--  	<img src="images/top.jpg" class="img-thumbnail" style="height: 290px;" >
				 					<img src="images/pr_top.png"  style="margin-top: 5px;" >
				 					 <button type="button" onclick="val();" class="btn btn-info active">Add  to  cart</button> --> 
				  				 </div>
				  				<div class="col-xs-4">
				 					<!--  <img src="images/phone.jpg" class="img-thumbnail" style="height: 290px; width: 300px" >
				 					<img src="images/pr_iphone.png"  style="margin-top: 5px;" >
				 					 <button type="button" onclick="val();" class="btn btn-info active">Add  to  cart</button>  -->
				  				 </div>
				  				 <div class="col-xs-4">
				 				  <!--  	<img src="images/laptop.jpg" class="img-thumbnail" style="height: 290px;" > 
				 					<img src="images/pr_lap.png"  style="margin-top: 5px;" >
				 					 <button type="button" onclick="val();" class="btn btn-info active">Add  to  cart</button> -->
				  				 </div>
				  			</div>
				  		</div> 	
				  		
				  		
			</div>
		
		<div class="col-sm-3" >
    		<div class="jumbotron" style="background-color:lavenderblush; margin-top: 30px;">
    				<div class="container-fluid">
    					<div class="row">
       				 		<div class="col-xs-3">
    							<img src="images/Cart_icon.png" >
    						</div> 
    		
    						<div class="col-xs-3">
    							<h4><b>CART</b></h4>
    						</div>
    						
    						<div class="col-xs-3">
    							
    						</div>
    						<div class="col-xs-3">
    							
    						</div>
    					</div>
    				</div>
  				<h6 style="margin-top: 30px"></h6>
  				<form action="DBCon" method="post">
  				 <a href="cart.jsp"><button type="submit"  name="go" class="btn btn-lg btn-primary btn-block" >View Cart</button></a>
  				 </form>
    		</div>
    	</div>
    </div>
  </div>
  
</body>
</html>

