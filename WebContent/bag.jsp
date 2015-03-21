<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function fun() {
		alert("no action performed");
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body style="background-color:#98AFC7;">
	<div>
	<jsp:directive.include file="header.jsp" />
	</div>
   	<div class="container-fluid">
   		<div class"row">
   			<div class="col-sm-1" >
  				
  			</div>
  			<div class="col-sm-3" >
  				<img src="images/bag.jpg" class="img-thumbnail" style="margin-top: 5px; height: 290px;" >
				 	
				 		<h4><b> Rs.1850 </b></h4> <input type="submit" onclick="fun();" class="btn btn-info active" value="Add to cart" >			
				 	
  			</div>
  			<div class="col-sm-4" >
  				
  			</div>
  			<div class="col-sm-3" ><!--  
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
  				<h6 style="margin-top: 30px"><b>No products in your cart</b></h6>
  				 <a href="cart.jsp"><button type="submit"  name="go" class="btn btn-lg btn-primary btn-block" >View Cart</button></a>
    		</div>-->
    	</div>
   		</div>
   	</div>
</body>
</html>