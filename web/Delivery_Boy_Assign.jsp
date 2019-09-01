<%@page import="java.sql.*"%>
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
                       <a href="#" style="color:white">Logout</a>
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

                    
                    
 <% 
    String oid=request.getParameter("id");
%>


<form method="post" action="Delivery_Boy_Assign.jsp">
    
                <div class="form-group">
                <label for="login">ID</label>
              <input type="text" class="form-control " name="t1" value="<%out.write(oid);%>">
              </div>
                
                
      <div class="form-group">
      <label for="sel1">Select DeliveryBoy:</label>
      <select class="form-control" id="sel1" name="t2">

    <%
                    try
                    {
                        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select * from deliveryboy");  
                        while(rs.next())
                        {
                            out.write("<option value='"+rs.getString(1) +"'>"+rs.getString(2) +"</option>");
                        }
                        con.close();
                    }
                    catch(SQLException e)
                    { 
                        out.write(e+""); 
                    }
  %>
            </select>   
      </div>
              <input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" value="Assign" name="submit">
    
  
</form>


                    
                    
                    
                    
                </div>
                        
         </div>
           
        
    </body>
</html>
<%
    if(request.getParameter("t2")!=null)
    {
        try
        {
            String id=request.getParameter("t1");
            String dname=request.getParameter("t2");

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            int a=st.executeUpdate("update orderm set status='closed',delivery_boy='"+dname+"' where oid='"+id+"'");        
            con.close();
            response.sendRedirect("Order_List.jsp");
        }
        catch(SQLException e)
        {
            out.write(e+"");
        }
    }
%>

                    