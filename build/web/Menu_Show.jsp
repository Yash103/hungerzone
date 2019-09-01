<%@ page import="java.sql.*" %>
<%
    String hid="";
    if(session.getAttribute("loginid")!=null)
    {
        hid=request.getParameter("id");
    }
    else
    {
        response.sendRedirect("Loginext.jsp");
    }    
  %>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
         <link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
        <script src="jquery/jquery-3.3.1.js"></script>
        <script src="bootstrap3/js/bootstrap.min.js"></script>
        <script src="jquery/jquery-3.3.1.js" type="text/javascript"></script>        
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">    </head>
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
    
    
    <div class="coniatner-fluid">
        <div class="row" style="background-color:#1c1e2e; margin-top:50px;">
            <div class="col-sm-2">
                
            </div>
            
           
           
 <%
      try
        {
            
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");			
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("select *from hotel_add where hid='"+hid+"'");
        while(rs.next())
        {     
             out.write("<div class='col-sm-3'>");             
             out.write("<img src='upload/"+rs.getString(1)+".jpg' style='width:300px; height:200px;'>");
            
             out.write("</div>");
             
             out.write("<div class='col-sm-3'>");
              out.write("<h1 style='color:white;'>"+rs.getString(2)+"</h1>");
             out.write("<p style='color:white; margin-top:20px;'>"+rs.getString(7)+"</p>");
              out.write("<p style='color:white; margin-top:20px;'>"+rs.getString(4)+"</p>");
                           out.write("<p style='color:white; margin-top:20px;'>"+rs.getString(5)+"</p>");
             out.write("</div>");
        }
        }     
        catch(SQLException e)
                {
                
                    out.write(e+"");
                }
        
                    

   %>
   
   
            </div>
             
             </div>
   
   
   <br>
   <div class="conatiner">
       <div class="row">
       

   <div class="col-sm-9" style="margin-left:30px">        
          
 <% 
      String city=request.getParameter("t1");
     try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from menu where hid='"+hid+"'");
            while(rs.next())
            {                 
                out.write("<div class='col-sm-3' style='margin-top:20px;'>");
                out.write("<img src='menu/" +rs.getString(1)+".jpg' style='width:300px; height:150px;'>");
                out.write("<div class='caption'>");
                out.write("<p style='color:Black;'>"+rs.getString(2)+"</p>");
                out.write("<p>"+rs.getString(3)+"&#x20b9;</p>");
                out.write("<span><a href='Menu_Cart.jsp?mid="+rs.getString(1)+"&hid="+rs.getString(6)+"' class='btn' role='button' style='background-color:#ff8800; color:white;'>Add</a>");
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
   
   <div class="col-sm-2" style="margin-left:40px">
   <h1>Cart</h1>
  <%
      
    int total=0;
       if(session.getAttribute("cart")!=null)
        {
    try
    {
       
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            
            String  cart=session.getAttribute("cart").toString();
           String product[]=cart.split("@");
           
        for(int i=0;i<product.length;i++)
        {
        ResultSet rs= st.executeQuery("select *from menu where mid='"+product[i]+"'");
        
        while(rs.next())
        {           
           out.write("<p>"+rs.getString(2)+" "+rs.getString(3)+"&#x20b9;</p>");
           
           total= total+Integer.parseInt(rs.getString(3));
        }
        
       }
        out.write("<h3>Total: "+total+"&#x20b9;</h3>");
             con.close();
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
        }
  %>
  
  
  <a href="Checkout.jsp?amt=<% out.write(total+""); %>&hid=<% out.write(hid+""); %>" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white; width:200px;" >CHECKOUT</a>   
   </div>
       </div>
   
   
   
            </div>
   <br>
   <br>
   
   
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
   
   
      
 
   