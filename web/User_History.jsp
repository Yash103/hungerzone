<%@ page import="java.sql.*" %>
<%
  String id=session.getAttribute("loginid").toString();
  %>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
         <link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
        <script src="jquery/jquery-3.3.1.js"></script>
        <script src="bootstrap3/js/bootstrap.min.js"></script>
        <script src="jquery/jquery-3.3.1.js" type="text/javascript"></script>        
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
         
          <style>
           
           
              </style>
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
    
                       
            <div class="container">          
    <div class="row">
        <div col-sm-2></div>
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
                         <th>status</th>
                        <th>Time</th>
                        <th>View Menu</th>
                

			</tr>
		</thead>
                <tbody id="myTable">
     <%
   
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
        ResultSet rs= st.executeQuery("select *from orderm where loginid='"+id+"'");
       
        
       
        
        while(rs.next())
        {           
            out.write("<tr>");
            out.write("<td>"+rs.getString(1)+"</td>");
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs.getString(3)+"</td>");
              out.write("<td> "+rs.getString(4)+"</td>");
               out.write("<td> "+rs.getString(5)+"</td>");
             out.write("<td> "+rs.getString(6)+"</td>");
              out.write("<td> "+rs.getString(8)+"</td>");
           
             out.write("<td><p style='color:green;'>"+rs.getString(10)+"</td></p>");
                 out.write("<td><a href='User_History_Menu.jsp?id="+rs.getString(1) +"' class='btn' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>View</a></td>");
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
  
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  
  <br>
  
            <div class="footer">
         <div class="row" style="background-color:#000000">
             <center> <h3 style="color:#FFFAFA">HungerZone </h3></center>
             <hr>
             
              <div class="col-sm-5">
              </div>
              <div class="col-sm-2">
                  <h3 style="color:#FFFAFA">@ 2018 HungerZone</h3>
              </div>
                <div class="col-sm-3">
              <section id="lab_social_icon_footer">
<!-- Include Font Awesome Stylesheet in Header -->
        <div class="container">
        <div class="">
                    <a href="https://www.facebook.com/profile.php?id=100007281463124"><i id="social-fb" class="fa fa-facebook-square fa-3x social"></i></a>
	            <a href="https://twitter.com/_Sakth_launda"><i id="social-tw" class="fa fa-twitter-square fa-3x social"></i></a>
	            <a href="https://mail.google.com/mail/u/0/?tab=wm#inbox"><i id="social-gp" class="fa fa-google-plus-square fa-3x social"></i></a>
	            <a href="mailto:#"><i id="social-em" class="fa fa-envelope-square fa-3x social"></i></a>
        </div>
    </div>
</section>
              </div>
            
         </div>
            </div>
    </body>