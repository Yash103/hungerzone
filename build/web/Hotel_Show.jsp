<%@ page import="java.sql.*" %>

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
a:link {
    color: black; 
    background-color: transparent; 
    text-decoration: none;
}



a:hover {
    color:#ff8800;
    background-color:transparent;
    text-decoration: none;
}


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
             <%
             if(session.getAttribute("loginid")!=null)
             {
             %>
             <li ><a href="User_History.jsp" style="color:white;"><span class="glyphicon glyphicon-shopping-cart" ></span>Order Details</a></li>
             <li ><a href="User_Change_Pwd.jsp"style="color:white;"><span class="glyphicon glyphicon-log-in" ></span>Change Password</a></li>
             <%
             }
             %>
                          
                </ul>
</div>
</div>
</nav>
                </div>
                
            </div>
         </div>
       <div class="container-fluid">
		<div class="row">
                    <div class="col-sm-1">
                         </div>
		<div class="col-sm-10">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
		
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
                        <li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
			 <img src="image/2.jpg" alt="image" style="width:100%; height:500px;">
                            <div class="carousel-caption">
					<h3>Find the best restaurants</h3>
			</div>
		</div>
		
		<div class="item">
			 <img src="image/3.jpg" alt="image" style="width:100%; height:500px;">
				<div class="carousel-caption">
			
			</div>
		</div>
		
		<div class="item">
			 <img src="image/4.jpg" alt="image" style="width:100%; height:500px;">
				<div class="carousel-caption">
			
				
			</div>
		</div>
                    	<div class="item">
			 <img src="image/1.jpg" alt="image" style="width:100%; height:500px;">
				<div class="carousel-caption">
				
			</div>
		</div>
		
</div>
</div>
</div>
                        
</div>
 </div>
        <br>
        <br>
        <div class="container-fluid">
            <center><h2> Popular Hotels</h2></center>
            <br>
            <br>
            <hr>
          <div class="row">
                <div class="col-sm-1"></div>
               
      <div class="col-sm-9">
       
  <% 
      boolean flag=false;
      String city=request.getParameter("t1");
      if(city.equals(""))
      {
          response.sendRedirect("hungerzone.jsp");
      }
      else
      {
      String type="";
     try
        {
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from hotel_add where city='"+city+"' and status='active'");
            while(rs.next())            
            {
                flag=true;
                    type=rs.getString(5);
                
                  out.write("<div class='col-sm-3'>");
                 out.write("<div class='thumbnail'>");
                 out.write("<a href='Menu_Show.jsp?id="+rs.getString(1)+"'>");
                 out.write("<img src='upload/" +rs.getString(1)+".jpg' style='width:300px; height:150px;'>");
                 out.write("<div class='caption'>");
                 out.write("<h2 style='color:Black;'>"+rs.getString(2)+"</h2>");
                 out.write("</a>");
                 out.write("<p>"+rs.getString(7)+"</p>");
                 out.write("</div>");                 
                 out.write("</div>");
                 out.write("</div>");
            }
            
            if(flag==false)
            {
                response.sendRedirect("hungerzone.jsp");
            }
       }     
        catch(SQLException e)
                {
                
                    out.write(e+"");
                }
      }
   %>
      
      </div>
   
    <div class="col-sm-1">
        <div class="row">
            <center> <h3 style="background-color:#ff8800; color:white; padding-top:20px; padding-bottom:40px;">Hotels</h3></center>
        </div>
        <div class="href">
        <a href="Hotel_Veg.jsp?city=<% out.write(city+""); %>"><h3>Veg</h3></a>
     <hr>
     <a href="Hotel_NonVeg.jsp?city=<% out.write(city+""); %>"><h3>Non-Veg</h3></a>
       <hr>
       <a href="Hotel_Both.jsp?city=<% out.write(city+""); %>" ><h3>Both</h3></a>
        </div>
                              
      </div>
            </div>
          
  
     
        </div>
        
        
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
           
			