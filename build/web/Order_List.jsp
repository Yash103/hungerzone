<%@page import="java.sql.*"%>
<%
String hid=session.getAttribute("loginid").toString();
%>
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
	
		
                   
               
                    
                    <a href="Hotel_Admin.jsp" style="color:white">Home</a>
                    
                    <hr>
                    <a href="Menu.jsp" style="color:white">Menu Add</a>
                    <hr>
                    <a href="Delivery_Boy.jsp" style="color:white">Delivery boy Add</a>
                    <hr>
                    <a href="Order_List.jsp" style="color:white">Order List</a>
                    <hr>
                    <a href="#" style="color:white">Profile</a>
                    <hr>
                      <a href="Change_Pwd_H.jsp" style="color:white">Change Password</a>
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
                <div class="col-sm-6">
              

                    
                    	<div class="container" style=" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);">
		<h2>Order Details</h2>
                <hr>
                <input class="form-control" id="myInput" type="text"  placeholder="Search...">
		<br>
		<table class="table table-bordered table-striped">
		<thead>
			<tr>
			<th>Order Id</th>
			<th>Date</th>
			<th>loginid</th>
                        <th>Payamt</th>
                         <th>Phone</th>
                        <th>Address</th>
                      <th>hotel id</th>
                      
                     
                      <th>status</th>
                      <th>Delivery boy</th>
                      <th>View Menu</th>
                      <th>Time</th>
                

			</tr>
		</thead>
                <tbody id="myTable">
     <%
   
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
        ResultSet rs= st.executeQuery("select *from orderm where hid='"+hid+"'");
       
        
       
        
        while(rs.next())
        {           
            out.write("<tr>");
            out.write("<td>"+rs.getString(1)+"</td>");
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs.getString(3)+"</td>");
              out.write("<td> "+rs.getString(4)+"</td>");
               out.write("<td> "+rs.getString(5)+"</td>");
             out.write("<td> "+rs.getString(6)+"</td>");
              out.write("<td> "+rs.getString(7)+"</td>");
              
              
                 if(rs.getString(8).equals("pending"))
                out.write("<td><a href='Delivery_Boy_Assign.jsp?id="+rs.getString(1) +"' class='btn' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>Assign DeliveryBoy</a></td>");
                else
                out.write("<td>"+rs.getString(8) +"</td>");   
                 
                  out.write("<td> "+rs.getString(9)+"</td>");
                  out.write("<td><a href='Order_Menu_Show.jsp?id="+rs.getString(1) +"' class='btn' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>View</a></td>");
             out.write("<td><p style='color:green;'>"+rs.getString(10)+"</td></p>");
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
</html>
