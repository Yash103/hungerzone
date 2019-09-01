<%@page import="java.sql.*"%>
<% String id=session.getAttribute("loginid").toString();%>
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
                        <h1>Change password</h1>
                    </div>
                    
                    <form method="post" action="Change_pwd.jsp">
                         <div class="form-group">
                        <label for="pwd">Old Password</label>
                          <input type="Password" class="form-control " placeholder="Enter  Password" name="t1">
                                                            
                            </div>
                             <div class="form-group">
                        <label for="pwd">New Password</label>
                          <input type="Password" class="form-control " placeholder="Enter  Password" name="t2">
                                                            
                            </div>
    
                                                            
                    
                           <div class="form-group">
                        <label for="pwd">Confirm Password</label>
                          <input type="Password" class="form-control " placeholder="Enter  Password" name="t3">
                                                            
                            </div>
                             <br>
                               <br>
                                                     
                         <input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" value="submit">
                    </form>
                           <br>
                                                
                </div>                                 
                       </div>
            </div>
   
            </div>
         </div>
        
        
    </body>
    
    <%
    if(request.getParameter("t1")!=null)
    {
        try
        {
            
            String opwd=request.getParameter("t1");
            String npwd=request.getParameter("t2");
              String cpwd=request.getParameter("t3");
            
            boolean flag=false;
            String dbpwd="";
         
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select pwd from login where loginid='"+id+"'");        
            while(rs.next())
            {
                flag=true;
                dbpwd=rs.getString(1);
            }
           
            
            if(flag==true)
            {
                if(dbpwd.equals(opwd))
                {
                   
                if(npwd.equals(cpwd))
                {  
                    int a =  st.executeUpdate(" update login set pwd='"+npwd+"' where id='"+id+"'");
                    out.write("<script>alert(' Password');</script>");
                                  
                }
                else
                {
                out.write("<script>alert(' New Password & confirm password does't matched');</script>");     
                }
                
       }
                else
                {                   
                    out.write("<script>alert(' Password does't matched');</script>");                
                }
               
            }
             con.close();
        }
        
        catch(SQLException e)
        {
            out.write(e+"");
        }
    }
%>