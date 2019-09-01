<%@ page import="java.sql.*"%> 

  <%
      if(request.getParameter("t1")!=null)
      {   
  
    try
    {
        
        String id = request.getParameter("t1");
        String pwd = request.getParameter("t2");
        String role="";
        boolean flag=false;
        String msg="";
        
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



<%
       String msg="";
            
    if(request.getParameter("s1")!=null)
        
    {
    try
    {
        
        
        String name=request.getParameter("s1");
        String uid=request.getParameter("s2");
        String email=request.getParameter("s3");
        String phone=request.getParameter("s4");
        String pwd=request.getParameter("s5");
        
        
        if(name.equals(""))
      {
          msg="<div class='alert alert-danger'><p><strong>Name is Empty!</div>";
      }
        else if(uid.equals(""))
        {
             msg="<div class='alert alert-danger'><p><strong>userid is Empty!</div>";
        }
        else if(email.equals(""))
        {
             msg="<div class='alert alert-danger'><p><strong>Email is Empty!</div>";
        }
        else if(phone.equals(""))
        {
             msg="<div class='alert alert-danger'><p><strong>Phone is Empty!</div>";
        }
        else if(pwd.equals(""))
        {
             msg="<div class='alert alert-danger'><p><strong>Password is Empty!</div>";
        }
      else
      {
     
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
        int a = st.executeUpdate("insert into login values('"+uid+"','"+pwd+"','user')");
        int b=st.executeUpdate("insert into user_detail values('"+uid+"','"+name+"','"+phone+"','"+email+"')");
        msg="<div class='alert alert-success'><p><strong>Your Successfully Signup!</div>";
        con.close();
     
            
      }      
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
    
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
        <script src="validator.js" type="text/javascript"></script>
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
        <!-- Font Awesome -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">


        <style>
                    .image { 
                                position: relative; 
                                width: 100%; /* for IE 6 */
                             }
                            

                            h2 { 
                               position: absolute; 
                               top: 215px; 
                               left: 0; 
                               width:300px; 
                                  color: white; 
                                   font: bold 24px/45px Helvetica, Sans-Serif; 
                                    letter-spacing: -1px;  
                                    background: rgb(0, 0, 0); /* fallback color */
                                     background: rgba(0, 0, 0, 0.7);
                                     padding: 10px; 
                                     
                                                                 }
                                                                 
                                                                 
                                                                 
                                 #lab_social_icon_footer {
  padding: 40px 0;
 
}

#lab_social_icon_footer a {
  color: #333;
}

#lab_social_icon_footer .social:hover {
  -webkit-transform: scale(1.1);
  -moz-transform: scale(1.1);
  -o-transform: scale(1.1);
}

#lab_social_icon_footer .social {
  -webkit-transform: scale(0.8);
  /* Browser Variations: */
  
  -moz-transform: scale(0.8);
  -o-transform: scale(0.8);
  -webkit-transition-duration: 0.5s;
  -moz-transition-duration: 0.5s;
  -o-transition-duration: 0.5s;
}
/*
    Multicoloured Hover Variations
*/

#lab_social_icon_footer #social-fb:hover {
  color: #3B5998;
}

#lab_social_icon_footer #social-tw:hover {
  color: #4099FF;
}

#lab_social_icon_footer #social-gp:hover {
  color: #d34836;
}

#lab_social_icon_footer #social-em:hover {
  color: #f39c12;
}

        </style>
        
      
    </head>
    
       <body>
     <div class="container-fluid">
       <div class="row">
        <div class="col-sm-1 bg-info"></div>
          <div class="col-sm-6" style="margin-top:4%;">
            <div class="row">
              <div class="col-sm-6">
                 <img src="image/logoh.PNG" width="200px" height="150px">
                 
              </div>
                   <div class="col-sm-1">
                    </div>
                     <div class="col-sm-2">
                       <button  type="button" class="btn  btn-lg" style="background-color:#ff8800; color:white;" data-toggle="modal" data-target="#myModal">Login</button>
                         <div class="modal fade" id="myModal" role="dialog">
                          <div class="modal-dialog">
                             <div class="modal-content">
                               <div class="modal-header">
                                 <button type="button" class="close" data-dismiss="modal">&times;</button>
                                     <h1 class="modal-title">Log in</h1>
                                 
                                     <center> <img src="image/18284.jpg" width="100px" height="100px"></center>
                                      </div>
                                                    <div class="modal-body">
                                                        <form method="post" action="hungerzone.jsp">
                                                        
                                                        <div class="form-group">
                                                            <label for="login">Email / HungerZoon Username</label>
                                                                <input type="text" class="form-control " placeholder="Enter Username" name="t1" id="t1" >
                                                                <p id="p1"></p>
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
                                                        <br>
                                                        
                                                             </div>
                                               
                                                    </div>
                                            </div>
	</div>
                                      
                                       </div>
                                       <div class="col-sm-3">
                                          <button  type="button" class="btn  btn-lg" style="background-color:black; color:white;" data-toggle="modal" data-target="#myModal1">Sign up</button>
                                                             <div class="modal fade" id="myModal1" role="dialog">
                                            <div class="modal-dialog">
+
                                             <div class="modal-content">
                                              <div class="modal-header">
                                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                    <h1 class="modal-title">Sign up</h1>
                                                     <center> <img src="image/18284.jpg" width="100px" height="100px"></center>
                                                    </div>
                                                    <div class="modal-body">
                                                        
                                                        <form method="post" action="hungerzone.jsp" id="myform">
                                                        
                                                        <div class="form-group">
                                                            <label for="login">Full Name</label>
                                                                <input type="text" class="form-control " placeholder="Enter Fullname" name="s1" id="s1">
                                                                <p id=""p1></p>
                                                        </div>
                                                            <div class="form-group">
                                                            <label for="login">User ID</label>
                                                                <input type="text" class="form-control " placeholder="Enter UserId" name="s2" id="s2">
                                                        </div>
                                                            <div class="form-group">
                                                            <label for="login">Email</label>
                                                                <input type="text" class="form-control " placeholder="Enter Email Address" name="s3" id="s3">
                                                        </div>
                                                               <div class="form-group">
                                                            <label for="login">Phone Number</label>
                                                                <input type="text" class="form-control " placeholder="Enter Phone Number" name="s4" id="s4">
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="pwd">Password</label>
                                                            <input type="Password" class="form-control " placeholder="Enter  Password" name="s5" id="s5">
                                                            
                                                        </div>
                                                        <br>
                                                        <br>
                                                     
                                                        <input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" value="Signup">
                                                        <br>
                                                        </form>
                                                        
                                                             </div>
                                               
                                                    </div>
                                            </div>
	</div>
                         <br>
                         <br>
                            <%
                     
                                    out.write(msg);
                                
                    %>

                                       </div>
                        </div>
                        
                 <script>
var validator=new Validator("myform");

validator.addValidation("s1","alpha","Enter Only Char in FullName");

validator.addValidation("s3","email","Invalid Email ID");
validator.addValidation("s4","num","Enter Only No in Phone No");
</script>

                             <div class="modal fade" id="myModal2" role="dialog">
                                                                <div class="modal-dialog">
                    
                                                                 <div class="modal-content">
                                                                  <div class="modal-header">
                                                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                                        <h1 class="modal-title">Forgot password?</h1>
                                                                        </div>
                                                                        <div class="modal-body">

                                                                            <div class="form-group">
                                                                                <h3> <small for="login">Please enter the email address you signed up with and we'll send you a password reset link.</small></h3>
                                                                                <input type="text" class="form-control input-lg" placeholder="Enter Email">
                                                                            </div>
                                                                            
                                                                    <button type="button" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;">Reset Password</button>
                                                        <br>
                                                        <br>
                                                        
                        
                                                                        </div>
                                                                 </div>
                                                                </div>
                             </div>
              <br>
              <br>
              
                    <marquee behavior="scroll" direction="up" scrollamount="1" style="height:30px;">
                        <h1>Are You hungry?</h1>
                        
                        <h1>Latenight At Office?</h1>
                    </marquee>
              
                                <h1><small>Order food from favourite restaurants near you.</small></h1>
                                <br>
                                <br>
                             
                                    
                                          
                                          <form method="post" action="Hotel_Show.jsp">
                                	<div class="form-inline">
					<input type="text" class="form-control input-lg" style="width:400px;" placeholder="Enter Your delivery location" name="t1">
                                        <input type="submit" class="btn" style="background-color: #ff8800; color:white; height:48px;" name="submit" value="FIND FOOD">
					</div>
                                          </form>
                                        <h3><small>Bhilai Durg</small></h3>
                                           
                                        
                      </div>
                         <div class="col-sm-5">
                          	<img src="image/yash.jpg" width="750px" height="600px">
                        </div>
                       
                        
    </div>
                          <div class="row" style="background-color:#180D01">
                               <div class="col-sm-2">
                               </div>
                     <div class="col-sm-3">
                         <img src="image/pic3.png" width="150px" height="200px">
                         <h4  style="color:white">No Minimum Order</h4>
                         <p style="color:#bcaaa4">Order in for yourself or for the group,<br> with no restrictions on order value</p>
                         <br>
                         <br>
                        
          
                        
                    </div>
                         <div class="col-sm-3">
                              <img src="image/pic2.png" width="150px" height="200px">
                               <h4  style="color:white">Live Order Tracking</h4>
                               <p style="color:#bcaaa4">Know where your order is at all times,<br>from the restaurant to your doorstep</p>
                             <br>
                            <br>
                       
                        
                    </div>
                         <div class="col-sm-3">
                              <img src="image/pic1.png" width="150px" height="200px">
                                    <h4  style="color:white">Lightning-Fast Delivery</h4>
                               <p style="color:#bcaaa4">Experience HungerZoon superfast delivery<br>for food delivered fresh & on time</p>
                             <br>
                            <br>
                            
                       
                        
                    </div>
                </div>
         <br>
         <br>
         <hr>
         <div class="row">
             <center><h1 style="font:sans-serif">Most Trusted Restaurants</h1></center>
             <br>
             <div class="col-sm-2">
             </div>
             <div class="col-sm-3">
                <div class="image">
                     <img src="image/veg.jpg" width="300px" height="300px"/>
                     <h2>Veg</h2>
                </div>
                 <br>
                 <br>
                  <div class="image">
                  <img src="image/cake.jpg" width="300px" height="300px">
                  <h2>Cake</h2>
                </div>  
                </div>
         
            
             
             
    
    
    

       



                <div class="col-sm-3">
                <div class="image">
                     <img src="image/burger.jpg" width="300px" height="300px"/>
                     <h2>Burger</h2>
                </div>
                 <br>
                 <br>
                 <div class="image">
                  <img src="image/chi.jpg" width="300px" height="300px">
                  <h2>Chinese</h2>
                </div>  
                </div>
                <div class="col-sm-3">
                <div class="image">
                     <img src="image/ice.jpg" width="300px" height="300px"/>
                     <h2>Ice-Cream</h2>
                </div>
                 <br>
                 <br>
                 <div class="image">
                  <img src="image/nveg.jpg" width="300px" height="300px">
                  <h2>Non-veg</h2>
                </div>  
                </div>
         </div>

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
       
         
<br>        
        
     