<%@page import="java.sql.*"%>

 <% 
    String oid=request.getParameter("id");
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
                    <a href="" style="color:white">Order List</a>
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
		<h2>Food Menu List</h2>
                <hr>
                <table class="table table-hover">
		<thead>
			<tr>
			<th>Menu Name</th>
                      
			<th>Price</th>
                        <th>Qty</th>
                    

			</tr>
		</thead>
                <tbody>
     <%
   
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
     
            ResultSet rs= st.executeQuery("select * from orderc where oid='"+oid+"'");       
            while(rs.next())
            {           
                ResultSet rs1= st1.executeQuery("select mname from menu where mid='"+rs.getString(2)+"'");       
                while(rs1.next())
                {    
                    out.write("<tr>");
                    out.write("<td>"+rs1.getString(1)+"</td>");
                    
                    out.write("<td> "+rs.getString(3)+"</td>");
                    out.write("<td> "+rs.getString(4)+"</td>");
                    out.write("</tr>");
                }
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
           
        
    </body>
</html>
