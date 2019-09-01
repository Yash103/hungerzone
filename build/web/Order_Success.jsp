<%@ page import="java.sql.*" %>
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>

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
		<ul class="nav navbar-nav navbar-right">
             <li ><a href="#" style="color:white;"><span class="glyphicon glyphicon-log-in" ></span>Sign in</a></li>
             <li ><a href="User_History.jsp" style="color:white;"><span class="glyphicon glyphicon-shopping-cart" ></span>Order Details</a></li>
             <li ><a href="User_Change_Pwd.jsp"style="color:white;"><span class="glyphicon glyphicon-log-in" ></span>Change Password</a></li>
             

</div>
</div>
</nav>
                </div>
                
            </div>
         </div>
        <div class="container">
            
        
        <center>
<h1>Order Detail</h1>
<hr>
<%
    int b=0;
      String amt=request.getParameter("amt");
      String hid=request.getParameter("hid");
    String id=session.getAttribute("loginid").toString();
    
    
     java.util.Date date= new java.util.Date();
    java.util.Date date1= new java.util.Date();
    SimpleDateFormat sm=new SimpleDateFormat("dd/MM/yy");
    String mydt=sm.format(date);
    SimpleDateFormat sm1=new SimpleDateFormat("hh:mm");
        String mydt1=sm1.format(date);
        String msg="";
        
      try
    {
        
            String uid=request.getParameter("t3");
           String odate=request.getParameter("t2");
        String phone=request.getParameter("t4");
        
        String add=request.getParameter("t5");
        String pay=request.getParameter("t6");
           String hotelid=request.getParameter("t7");
           
      
       
        
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
             Statement st1=con.createStatement();
               int c=0;
                                    
                                    ResultSet rs=st.executeQuery("select count(oid) from orderm");
                                    while(rs.next())
                                    {
                                        c=rs.getInt(1);
                                        
                                    }
                                    c=c+111;
                                 
                                    
        b = st.executeUpdate("insert into orderm values('"+c+"','"+odate+"','"+uid+"','"+pay+"','"+phone+"','"+add+"','"+hotelid+"','pending','none','"+mydt1+"')");
       // int b=st.executeUpdate("insert into orderm values('"+c+"','"+name+"','"+phone+"','"+email+"')");
        String cart=session.getAttribute("cart").toString();
            String product[]=cart.split("@");
            for(int i=0;i<product.length;i++)
            {                
                ResultSet rs1= st1.executeQuery("select *from menu where mid='"+product[i]+"'"); 
                while(rs1.next())
                {    
                    st.executeUpdate("insert into orderc values('"+c+"','"+rs1.getString(1)+"','"+rs1.getString(3)+"','1','"+rs1.getString(3)+"')");        
                }
               
            }
      
        con.close();
     
              
            
        
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
      
if(b==0)
    out.write("<p class='text-success'>* Sry Order Not Booked </p>");

else
    
    out.write("<p class='text-success'>* Order Booked Successfully.. Food Delivered in 50-60 .</p>");
%>
<hr>

<a href="hungerzone.jsp">Continue shopping</a>
</center>
        </div>