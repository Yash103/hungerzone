<%@ page import="java.sql.*" %>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>

<%
    String amt=request.getParameter("amt");
      String hid=request.getParameter("hid");
    String id=session.getAttribute("loginid").toString();
    
    java.util.Date date= new java.util.Date();
    java.util.Date date1= new java.util.Date();
    SimpleDateFormat sm=new SimpleDateFormat("dd/MM/yy");
    String mydt=sm.format(date);
    SimpleDateFormat sm1=new SimpleDateFormat("hh:mm");
        String mydt1=sm1.format(date);

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
                    <ul class="nav navbar-nav navbar-right"></ul>
            
             

</div>
</div>
</nav>
                </div>
                
            </div>
         </div>
        
        <div class="container" style=" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);">
                <div class="page-header">
                        <h1>Order Payment</h1>
                    </div>
            <div class="row">
                <form method="post" action="Order_Success.jsp">
                <div class="col-sm-10">
                    <div class="row">
                    
                
                          
                        <div class="col-sm-5">
                                  <div class="form-group">
                      <label for="login">Order Date</label>
                     <input type="text" class="form-control " value="<% out.write(mydt);%>" readonly name="t2">
                            </div>
                        </div>
                        </div>
                        <div class="row">
                        <div class="col-sm-5">
                                  <div class="form-group">
                      <label for="login">Loginid</label>
                     <input type="text" class="form-control " name="t3" readonly value="<% out.write(id);%>">
                            </div>
                        </div>
                
                          
                        <div class="col-sm-5">
                        <div class="form-group">
                      <label for="number">Phone No.</label>
                     <input type="text" class="form-control " name="t4">
                            </div>
                        </div>
                        </div>
                             <div class="row">
                        <div class="col-sm-5">
                                  <div class="form-group">
                      <label for="login">Address</label>
                     <textarea class="form-control" rows="5" id="comment" name="t5"></textarea>
                            </div>
                        </div>
                
                          
                        <div class="col-sm-5">
                        <div class="form-group">
                      <label for="login">Pay Amount</label>
                     <input type="text" class="form-control " name="t6" readonly value="<% out.write(amt); %>&#x20b9;">
                     
                            </div>
                           
                        </div>
                         
                      <div class="col-sm-5">
                        <div class="form-group">
                      <label for="login">Hotel ID</label>
                     <input type="text" class="form-control " name="t7" readonly value="<% out.write(hid); %>">
                     
                            </div>
                           
                        </div>
                     
                        </div>

                    <br>
                    <br>
                    <div class="row">
                     <div class="col-sm-10">
                      <input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" value="Proceed" name="submit">
                    </div>
                    </div>
                    <br>
                    <br>
                      
                    
                      
                      
                </div>
                   </form>
                </div>
      
               
            </div>
        <br>
        <br>
       
        	<div class="container" style=" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);">
		<h2>Foods</h2>
                <hr>
                <table class="table table-hover">
		<thead>
			<tr>
                            <th>Name</th>
			<th>Hotel</th>
                        <th>Price</th>
			</tr>
		</thead>
                <tbody>
    <%
    int total=0;
    try
    {
        
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            
            String  cart=session.getAttribute("cart").toString();
           String product[]=cart.split("@");
           
        for(int i=0;i<product.length;i++)
        {
        ResultSet rs= st.executeQuery("select *from menu where mid='"+product[i]+"'");
          while(rs.next())
            {       
         ResultSet rs1= st1.executeQuery("select name from hotel_add where hid='"+rs.getString(6)+"'");       
                while(rs1.next())
        
   
        {           
            out.write("<tr>");
       
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs1.getString(1)+"</td>");
              out.write("<td> "+rs.getString(3)+"</td>");
            out.write("</tr>");
           total= total+Integer.parseInt(rs.getString(3));
             
        }
            }
       }
        out.write("<tr>");
       
          out.write("<td>");
         out.write("</td>");
          out.write("<td>");
         out.write("</td>");
         out.write("<td>");
        out.write("<p><b>Total="+total+"</p>");
        out.write("</td>");
        
          out.write("</tr>");
        
      
        
        
        
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