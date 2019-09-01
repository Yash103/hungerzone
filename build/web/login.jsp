<%@ page import="java.sql.*"%>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
        <script src="jquery/jquery-3.3.1.js"></script>
        <script src="bootstrap3/js/bootstrap.min.js"></script>
        <script src="jquery/jquery-3.3.1.js" type="text/javascript"></script>
        
        
        <script> 
function Validate()                                    
{ 
    var name = document.forms["RegForm"]["Name"];                 
   
    if (name.value==="")                                  
    { 
      alert("Please enter your name."); 
        name.focus(); 
        return false; 
    } 
     return true;
     }
    </script>
        
        
        
        
   
    </head>
<body>
    <form method="post" action="login.jsp" onsubmit="return Validate()" name="vform">
		<div class="container" style="margin-top:5%;">
			<h2>Login page</h2>

			<div class="row">
				<div class="col-sm-3" style="background-color: green"></div>
				
				<div class="col-sm-6">
					<div class="form-group"> 
                    				 <input type="text" name="name">
                                                           
                                               
					</div>
					<div class="form-group" > 
						<input type="email" name="email" >
                                                               
					</div>
                                   
					<input type="submit" class="btn btn-success"  name="register"  value="Login">
					<a href="registration">New user?</a>




			</div>

		</div>

		</div>
        </form>
    </body>
</html>
    