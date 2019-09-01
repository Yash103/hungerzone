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



<%
   
String id=session.getAttribute("loginid").toString();
String t1="";
String t2="";
String t3="";
String msg="";
if(request.getParameter("t1")!=null)
    {
          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
        Statement st=con.createStatement();
            
        try
        {
            String oldpwd=request.getParameter("t1");
            String newpwd=request.getParameter("t2");
            String confirm=request.getParameter("t3");
            String dbpwd="";            
           
            ResultSet rs=st.executeQuery("select pwd from login where loginid='"+id+"'");
            while(rs.next())
            {
                dbpwd=rs.getString(1);
            }          
            
            if(dbpwd.equals(oldpwd))
            {
                if(newpwd.equals(confirm))
                {
                    int a=st.executeUpdate("update login set pwd='"+newpwd+"' where loginid='"+id+"'");
                    msg="<p class='text-success'>* Password Updated..</p>";
                }
                else
                {
                    msg="<p class='text-danger'>* Both Password not Matched..</p>";
                }
            }
            else
            {
                msg="<p class='text-danger'>* Old Password not Matched..</p>";
            }
             
        }
        catch(SQLException e)
        {
            out.write(e+"");
        }
        con.close();
    }            
%>
  

     
         <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-6">
                    
                         <div class="page-header">
                        <h1>Change password</h1>
                    </div>
                    
                    <form method="post" action="Change_Pwd_H.jsp">
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
                              <%
                               out.write("<div class='alert alert-primary'>");
                                    out.write(msg);
                                    out.write("</div>");
                           %>
                                   
                </div>                                 
                       </div>
            </div>
   
            </div>
         </div>
        
        
    </body>