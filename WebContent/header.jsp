
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="shortcut icon" href="images/title.png" />
<title>Online Shop</title>

 <style type="text/css">
	ul{
        padding: 0;
        list-style: none;
    }
    ul li{
        float: left;
        width: 100px;
        height:auto;
        text-align: center;
        line-height: 21px;
    }
    ul li a{
        display: block;
        padding: 5px 10px;
        color: #333;
        height:auto;
        background: #f2f2f2;
        text-decoration: none;
    }
    ul li a:hover{
        color: #fff;
        background: #939393;
    }
    ul li ul{
        display: none;
    }
    ul li:hover ul{
        display: block; 
    }
    ul li button:hover{
        color: #fff;
        background: #939393;
    }
   div ul{
        padding: 0;
        list-style: none;
    }
	.onclick-menu {
    	position: relative;
    	display: inline-block;
    	
	}
	.bgcol{
		display: block;
        padding: 5px 10px;
        color: #333;
        height:auto;
        background: #f2f2f2;
        text-decoration: none;
        border: none;
	}
	.onclick-menu:before {
    	content: "My Account";
    	font-weight: bold;
    	font-size-adjust:inherit;
    	background: #f2f2f2;
	}
		.onclick-menu:focus {
    	pointer-events: none;
	}
	.onclick-menu:focus .onclick-menu-content {
    	opacity: 1;
    	visibility: visible;
    	pointer-events: auto;
	}
	.onclick-menu-content {
    	position: absolute;
    	z-index: 1;	
    	opacity: 0;
    	visibility: hidden;
    	transition: visibility 0.5s;
	} 
</style>
    
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body onload="">
	<div class="page-header">
	<div class="container-fluid " >
		<div class="row">
		<form action="DBCon" method="post">
		<img src="images/project_title.png">
		 <input type="text" name="searchItem"  placeholder="Search Item" style="width: 400px; margin-left: 100px; height: 40px;" >
		 <button type="submit" name="search" class="btn btn-success">Search</button>
		 
		   <%
  				 session=request.getSession();
  				 if(session.getAttribute("email")!=null)
  				 {
  					 out.println("Hi "+session.getAttribute("email"));
  				 }
  				 %>
  				 </form>
		 <% 
		 /*//Cookie[] cookie=request.getCookies();
			     	       String name=null;
			     	       for(Cookie c:cookie)
			     	       {
			     	    	   if(c.getName().equals("name"))
			     	    	   {
			     	    		   name=c.getValue();
			     	    	   }
			     	       }
			     	       if(name!=null)
			     	       {
			     	    	   out.println(name);
			     	    	   System.out.print(name);
			     	       }
			 */    	       
			             %>
			            
			             <img src="images/arr_dwn.png" style="float: right; margin-top: 28px; margin-right: 10px; background-color:#f2f2f2; ">
			<div tabindex="0" class="onclick-menu" style="float: right;  margin-top: 25px">
   				 <ul class="onclick-menu-content">
       				 <li class="bgcol"><button type="submit" name="login" id="myBtn" class="bgcol" onclick="javascript:popUp('login.html');" >Login</button></li>
       				  <form action="DBCon" method="post">
        			 <li class="bgcol"><input type="submit" id="ord" value="Orders" name="order" class="bgcol"></li>
        			 <li class="bgcol"><input type="submit" onclick="preventBack()" value="Logout" name="logout" class="bgcol"></li>
        			 </form>
   				 </ul>
			</div>
		<!--  <button type="button" class="btn btn-info" onclick="javascript:popUp('login.html')"  style="float: right; margin-top: 20px; margin-right: 20px;">Login</button>-->
	  	<img src="images/icon.png" style="float: right; margin-top: 20px;">
	  <!--  	<button type="button" class="btn btn-info"  style="float: right;">Cart</button>
	  	<img src="images/Cart_icon.png" style="float: right;">-->
	  	<!--  <hr style="height:1px;border:none;color:#333;background-color:#333;" />-->
	  	 	<ul style="margin-left: 145px; position: relative;">
			  	<li>
			            <a href="#">Men &#9662;</a>
			            <ul>
			            	<form action="DBCon" method="post">
			                <li><input type="submit"  value="Jeans    " name="lijeans" class="bgcol"></li>
			                <li><input type="submit"  value="shoe      " name="lishoes" class="bgcol"></li>
			                <li><input type="submit"  value="watch    " name="liwatch" class="bgcol"></li>
			                <li><input type="submit"  value="wallet    " name="liwallet" class="bgcol"></li>
			                </form>
			            </ul>
			   </li>
			   
			    <li>
			            <a href="#">Women &#9662;</a>
			            <ul>
			                <li><a href="#">Shoes</a></li>
			                <li><a href="#">Clothes</a></li>
			                <li><a href="#">Watches</a></li>
			                <li><a href="#">Bags</a></li>
			            </ul>
			   </li>
			   
			    <li>
			            <a href="#">Other &#9662;</a>
			            <ul>
			                <li><a href="#">Laptops</a></li>
			                <li><a href="#">Mobile</a></li>
			                <li><a href="#">Furniture</a></li>
			                <li><a href="#">Toys</a></li>
			            </ul>
			   </li>
				</ul>
				</div>
	  	</div>
  	</div>
</body>
 <script>
	 		
 			function preventBack(){
 				<% 
 				
 				%>
 			}
 				
 			
    	 		function popUp(url) {
    	 		<%  session=request.getSession();
    	 		
    	 			if(session.getAttribute("email") != null  && !(session.isNew())){
    	 				
    	 			
    	 				%>
    	 				
    	 		<% 	}
    	 			else{
    	 		%>
    			newwindow=window.open(url,'name','height=300,width=450,left = 645,top = 350');
    			if (window.focus) {newwindow.focus();}
    			return false;
    			<%  	} %>
    		}
    	/* function myFunction() {
    			 
					 document.getElementById("myBtn").disabled = true;
					 document.getElementById("log").disabled = false;
					 document.getElementById("ord").disabled = false;
				 
    		}
    	 function chkButton(){
			 
			 document.getElementById("log").disabled = true;
			 document.getElementById("ord").disabled = true;
		 
	}*/

</script>
</html>