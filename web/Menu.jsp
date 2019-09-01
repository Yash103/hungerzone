<%@ page import="java.sql.*"%> 
<%
String hid=session.getAttribute("loginid").toString();
%>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
        <script src="jquery/jquery-3.3.1.js"></script>
        <script src="bootstrap3/js/bootstrap.min.js"></script>
        <script src="jquery/jquery-3.3.1.js" type="text/javascript"></script>
          <script>

   		function PreviewImage(){

   			var oFReader= new FileReader();
   			oFReader.readAsDataURL(document.getElementById("imglink").files[0]);

   			oFReader.onload= function (oFEvent)
   			{
   				document.getElementById("uploadPreview").src=oFEvent.target.result;
   			  		};
   			  };
   </script>
   
   <style>
       
   .img{
    position: relative;
    text-align: center;
    color: white;
    filter: blur(2px);
}
.cen {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}
       
   </style>
    </head>
    <body>
        
        <div class="container-fluid">
            <div class="row">
   
                <div class="col-sm-2" style="background-color:#1c1e2e; height:900px;">
                    <div class="space" style="margin-left:15px;">
                  	<div class="page-header">	
                            
		<h1 style="color:white;">Admin</h1>
                        </div>
	
		
                   
              
                       <a href="Hotel_Admin.jsp" style="color:white">Home</a>
                    
                    <hr>
                    <a href="Menu.jsp" style="color:white">Menu Add</a>
                    <hr>
                    <a href="Delivery_Boy.jsp" style="color:white">Delivery boy Add</a>
                    <hr>
                    <a href="Order_List.jsp" style="color:white">Order List</a>
                    <hr>
                    <a href="#" style="color:white">Profile</a>
                    <hr>
                      <a href="Change_Pwd_H.jsp" style="color:white">Change Password</a>
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
                        <h1>Menu</h1>
                    </div>
                    
                       <form method="post" action="Hotel_Upload.jsp" enctype="multipart/form-data">
                        
                
                        
                    <div class="form-group">

                     <div class="img">
		<img src="image/burger.jpg" width="400px" height="300px" alt="avatar" id="uploadPreview" class="avatar" style/>
                <div class="cen">Select image</div>
		</div>
		 <p>Select menu Image:</p>
						   
		   <div class="custom-file mb-3" >
		     <input type="file"  style="color:#ff8800;" class="custom-file-input" id="imglink" name="imglink" accept=".jpg, .jpeg,.png" onchange="PreviewImage();">
		      						
		    </div>
                    </div>

              
                   <div class="form-group">
                      <label for="login">Menu Name</label>
                     <input type="text" class="form-control " placeholder="Enter menu name" name="t1">
                </div>
               <div class="form-group">
                 <label for="login">Menu Price</label>
                 <input type="text" class="form-control " placeholder="Enter Price" name="t2">
                 </div>
                
                 <div class="form-group">
                   <label for="login">Specification</label>
                  <textarea class="form-control" rows="5" id="comment" name="t3"></textarea>
                    </div>
                       
                       <div class="form-group">
                    <label for="sel1">Select Category:</label>
                 <select class="form-control" id="sel1" name="t4">
             
               
         <%
        
        try
        {
            
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");			
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("select *from cat");
        while(rs.next())
            
        {
                out.write("<option value='"+rs.getString(1)+"'>"+rs.getString(2)+"</option>");
       
         
            
        
        }
                con.close();
  }
        catch(SQLException e)
        {
            out.write(e+"");
        }
        
        
    
  %>
                 </select> 
                     </div>  
                           
                           
                       <div class="form-group">
                 <label for="login">Hotel ID</label>
                 <input type="text" class="form-control " placeholder="Enter Price" name="t5" disabled="disabled" value="<%out.write(hid);%>">
                 </div>
                  
                    <div>
                             <br>
                               <br>
                                                     
                         <input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" value="submit">
                           <br>
                                                
                </div>                                 
                       </div>
            </div>
                 
                 
                 
                        <div class="row">
                            <div class="col-sm-2"></div>
                <div class="col-sm-6">
              

                    
                    	<div class="container" style=" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);">
		<h2>Menu Details</h2>
                <hr>
                <input class="form-control" id="myInput" type="text"  placeholder="Search...">
		<br>
		<table class="table table-hover">
		<thead>
			<tr>
                          
			<th>Pic</th>
                        <th>Menu ID</th>
			<th>Name</th>
			<th>Price</th>
                        <th>Specification</th>
                </tr>
		</thead>
                <tbody id="myTable">
     <%
   
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
        ResultSet rs= st.executeQuery("select *from menu where hid='"+hid+"'");
       
        
       
        
        while(rs.next())
        {           
            out.write("<tr>");
            out.write("<td><img src='menu/" +rs.getString(1)+".jpg' style='width:40px; height:40px;' class='img-circle'></td>");
            out.write("<td>"+rs.getString(1)+"</td>");
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs.getString(3)+"</td>");
              out.write("<td> "+rs.getString(4)+"</td>");
        
                  out.write("</str>");
              
              
             
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
   </div>
         </div>
  <br>
  <br>
   <script>
		
			$(document).ready(function(){
			
				$("#myInput").on("keyup",function(){
				
					var value=$(this).val().toLowerCase();
					$("#myTable tr").filter(function()
					{
						$(this).toggle($(this).text().toLowerCase().indexOf(value)>-1)
						
					});
					
				
				});
			
			});
		</script>
           
        
    </body>
</html>
   
        
                    
              
