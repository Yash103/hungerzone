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
                <div class="col-sm-2"></div>
                <div class="col-sm-6">
                    
                    <div class="page-header">
                        <h1>Category Add</h1>
                    </div>
                    <form method="post" action="Cat.jsp">
               
                
                 <div class="form-group">
                      <label for="login">C-Name</label>
                     <input type="text" class="form-control " placeholder="Enter category name" name="t2">
                </div>
                   
                  
                   
                             <br>
                               <br>
                                                     
                         <input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" name="submit" value="submit">
                        </form> 
                         <br>
                                                
                                                
                       </div>
            </div>
   
            </div>
         </div>
        
        
    </body>
         </html>
         
  <%
                
    if(request.getParameter("t2")!=null)
    {
        try
        {
                
                String catname=request.getParameter("t2");
                      int c=0;
                      String catid="";
     
                 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
                 Statement st=con.createStatement();
                     ResultSet rs=st.executeQuery("select count(cid) from cat");
                                    while(rs.next())
                                    {
                                        c=rs.getInt(1);
                                        
                                    }
                                    c=c+1;
                                    catid="C"+c;
        
            int a = st.executeUpdate("insert into cat values('"+catid+"','"+catname+"')");
            out.write("<span style='color:green'>Add Category Succesfully</span>");
        }
        
        catch(SQLException e)
        {
        
            out.write(e+"");
        }
    
    }
    
%>
             

          