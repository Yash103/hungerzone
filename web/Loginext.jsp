<%@ page import="java.sql.*" %>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
        <script src="jquery/jquery-3.3.1.js"></script>
        <script src="bootstrap3/js/bootstrap.min.js"></script>
        <script src="jquery/jquery-3.3.1.js" type="text/javascript"></script>
          <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    </head>
    
    <body>
        
         <div class="container-fluid">
            <div class="row">
                <div class="col-sm-12">
                  <nav class="navbar navbar-info" style="background-color:#ff8800;">
		<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
                   <a class="navbar-brand" href="#" style="color:#ff8800;"><img src="image/logoh.PNG" width="100px" height="90px"></a>
		</div>
		<div class="collapse navbar-collapse" id="mynavbar">
		<ul class="nav navbar-nav navbar-right">
             <li ><a href="#" style="color:white;"><span class="glyphicon glyphicon-log-in" ></span>Sign in</a></li>
             

</div>
</div>
</nav>
                </div>
                
            </div>
         </div>
        <div class="container" style="margin-top:50px;">
            <div class="row">
                
                <div class="col-sm-2">
                    
                </div>
                <div class="col-sm-8">
                    <h1>Login</h1>
                    <hr>
                    <center> <img src="image/18284.jpg" width="100px" height="100px"></center>
          

                                                         <form method="post" action="Loginext.jsp">
                                                        
                                                        <div class="form-group">
                                                            <label for="login">Email / HungerZoon Username</label>
                                                                <input type="text" class="form-control " placeholder="Enter Username" name="t1">
                                                                
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="pwd">Password</label>
                                                            <input type="Password" class="form-control " placeholder="Enter  Password" name="t2">
                                                            
                                                        </div>
                                                        <a style="color:#ff8800" href="" data-toggle="modal" data-target="#myModal2" >Forgot password?</a>
                                                        <br>
                                                        <br>
                                                        <input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" value="Login">
                                                        </form>
            </div>
                
                
          </div>
        </div>
    </body>
   
    
    <%
      if(request.getParameter("t1")!=null)
      {   
  
    try
    {
        
        String id = request.getParameter("t1");
        String pwd = request.getParameter("t2");
        String role="";
        boolean flag=false;
        
          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
          ResultSet rs = st.executeQuery("select role from login where loginid='"+id+"' and pwd='"+pwd+"'");
        while(rs.next())
        {
            flag=true;
            role=rs.getString(1);
        }
        
            if(flag)
              {
                if(role.equals("admin"))
                {
                    response.sendRedirect("Admin_Main.jsp");
                }
                else if(role.equals("hadmin"))
                {
                    session.setAttribute("loginid",id);
                    response.sendRedirect("Hotel_Admin.jsp");
                    
                }
                else if(role.equals("user"))
                {
                    out.write("<script>alert('Login Successfully');</script>");
                     session.setAttribute("loginid",id);
                    response.sendRedirect("hungerzone.jsp");
                   
                    
                }
            }
            else
            {
            out.write("<script>alert('Invalid login Id & password');</script>");
            }
        con.close();
    }
      catch(SQLException e)
    {
        out.write(e+"");
    }
    
}
%>
