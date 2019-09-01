<%@ page import="java.sql.*"%> 
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
        <script src="jquery/jquery-3.3.1.js"></script>
        <script src="bootstrap3/js/bootstrap.min.js"></script>
        <script src="jquery/jquery-3.3.1.js" type="text/javascript"></script>
    </head>
    <body>
        
        <div class="container-fluid">
            <div class="row">
   
                <div class="col-sm-2" style="background-color:#1c1e2e; height:900px;">
                    <div class="space" style="margin-left:15px;">
                  	<div class="page-header">	
                            
		<h1 style="color:white;">Admin</h1>
                        </div>
	
		
                   
               
                    
                             
                    <a href="Admin_Block.jsp" style="color:white">Home</a>
                    
                    <hr>
                    <a href="Hotel_Add.jsp" style="color:white">Hotel Add</a>
                    <hr>
                    <a href="Cat.jsp" style="color:white">Category Add</a>
                    <hr>
                    <a href="Change_pwd.jsp" style="color:white">Change password</a>
                    <hr>
                    <a href="Logout.jsp" style="color:white">Logout</a>
                    <hr>
              
                   </div>
                </div>
                    
             
                <div class="col-sm-10">
                    
                    <nav class="navbar navbar-info">
		<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
                    <a class="navbar-brand" href="#" style="color:#ff8800;"><h1><b>HungerZone</h1></a>
		</div>
		<div class="collapse navbar-collapse" id="mynavbar">
		
		
	
		
	
	

		

	<ul class="nav navbar-nav navbar-right">
	
	<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>login up</a></li>

</div>
</div>
</nav>
                    <hr>       
                    
                    
                    

                
                
                <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-2">
<%
 
         
    
    try
    {

        
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
          
               int c=0;
                                    
                                    ResultSet rs=st.executeQuery("select count(hid) from hotel_add");
                                    while(rs.next())
                                    {
                                        c=rs.getInt(1);
                                        
                                    
                                    }
                                     out.write("<div class='thumbnail' style=' background:  linear-gradient(to right, #fe8c00, #f83600);'");
                                     out.write("<center><h4 style='color:black;'>Total Hotels:</h4></center>");

                                    out.write("<center><h3 style='color:white;'>"+c+"</h3></center>");
                                    
                                       out.write("</div>");
     
       
        con.close();
     
              
            
        
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
  %>                  
                    
                    
            </div>
        </div>
  <br>
  <div class="row">
      <div class="col-sm-1">
           </div>
      
      <div class="col-sm-8">
                
                    	<div class="container" style=" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);">
		<h2>Hotels Record</h2>
                <hr>
                <input class="form-control" id="myInput" type="text"  placeholder="Search...">
		<br>
		<table class="table table-bordered table-striped">
		<thead>
			<tr>
			<th>Hotel Id</th>
                        <th>Profile</th>
			<th>Name</th>
                        <th>City</th>
                         <th>Phone</th>
                        <th>Address</th>
                        <th>Types</th>
                        <th>Action</th>
                 

			</tr>
		</thead>
                <tbody id="myTable">
     <%
   
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
        ResultSet rs= st.executeQuery("select *from hotel_add");
       
        
       
        
        while(rs.next())
        {           
            out.write("<tr>");
            out.write("<td>"+rs.getString(1)+"</td>");
            out.write("<td><img src='upload/" +rs.getString(1)+".jpg' style='width:40px; height:40px;' class='img-circle'></td>");
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs.getString(3)+"</td>");
              out.write("<td> "+rs.getString(4)+"</td>");
               out.write("<td> "+rs.getString(5)+"</td>");
             out.write("<td> "+rs.getString(7)+"</td>");
               if(rs.getString(8).equals("active"))
                out.write("<td><a href='Admin_Block.jsp?id="+rs.getString(1) +"&status=block' class='btn' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>Block</a></td>");
                else
                out.write("<td><a href='Admin_Block.jsp?id="+rs.getString(1) +"&status=active' class='btn btn-danger' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>Active</a></td>");
                out.write("</tr>");
              
     
             
            out.write("</tr>");
        
             
        }
        
     
      
      
        
        
        
             con.close();
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
  %>
                    
                </tbody>
                </table>
                </div>
                    
            
      </div>
  </div>
       
    
                </div>
  <script>
		
			$(document).ready(function(){
			
				$("#myInput").on("keyup",function(){
				
					var value=$(this).val().toLowerCase();
					$("#myTable tr").filter(function()
					{
						$(this).toggle($(this).text().toLowerCase().indexOf(value)>-1)
						
					});
					
				
				});
			
			});
		</script>
    </body>