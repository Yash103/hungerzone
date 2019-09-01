<%@ page import="java.sql.*" %>
<%

    String city=request.getParameter("city");
    
  
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
                          <div class="col-sm-1">
                              
                         </div>
</div>
 </div>
        <br>
        <br>
       <div class="container-fluid">
          
            <div class="row">
              
                <div class="col-sm-1"></div>
               
      <div class="col-sm-9">
           
       
  <% 
     
     try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from hotel_add where city='"+city+"' and type ='Veg' and status='active' " );
            while(rs.next())
            
            
            {
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
       }     
        catch(SQLException e)
                {
                
                    out.write(e+"");
                }
   %>
      
            </div>
    <div class="col-sm-1" style="background-color:#ff8800;">
        <a href="Hotel_Veg.jsp?city=<% out.write(city+""); %>" style="color:white;"><h3>Veg</h3></a>
     <hr>
     <a href="Hotel_NonVeg.jsp?city=<% out.write(city+""); %>" style="color:white;"><h3>Non-Veg</h3></a>
       <hr>
       <a href="Hotel_Both.jsp?city=<% out.write(city+""); %>" style="color:white;"><h3>Both</h3></a>

                              
      </div>
            </div>
          
  
     
        </div>
           
			