<%@ page import="java.sql.*"%> 

<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <link rel="stylesheet" href="bootstrap3/css/bootstrap.min.css">
        <script src="jquery/jquery-3.3.1.js"></script>
        <script src="bootstrap3/js/bootstrap.min.js"></script>
        <script src="jquery/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="validator.js" type="text/javascript"></script>
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
            <form method="post" action="Admin_Upload.jsp" enctype="multipart/form-data">
     
         <div class="container-fluid">
            <div class="row">
   
                <div class="col-sm-2" style="background-color:#1c1e2e; height:1150px;">
                    <div class="space" style="margin-left:15px;">
                  	<div class="page-header">	
                            
		<h1 style="color:white;">Admin</h1>
                        </div>
	
		
                   
                       
                    <a href="Admin_Block.jsp" style="color:white">Home</a>
                    
                    <hr>
                    <a href="Hotel_Add.jsp" style="color:white">Hotel Add</a>
                    <hr>
                    <a href="Cat.jsp" style="color:white">Category Add</a>
                    <hr>
                    <a href="Change_pwd.jsp" style="color:white">Change password</a>
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
                        <center> <h1>Hotel Add</h1></center>
                    </div>
                    <form method="post" action="Admin_Upload.jsp" enctype="multipart/form-data">
                        
                
                        
                    <div class="form-group">

                    <div class="img">
		<img src="image/hotel.jpg" width="400px" height="300px" alt="avatar" id="uploadPreview" class="avatar" style/>
                <div class="cen">Select image</div>
		</div>
		 <p>Select hotel image:</p>
						   
		   <div class="custom-file mb-3" >
		     <input type="file"  style="color:#ff8800;" class="custom-file-input" id="imglink" name="imglink" accept=".jpg, .jpeg,.png" onchange="PreviewImage();">
		      						
		    </div>
                    </div>

                    
                     
                 <div class="form-group">
                      <label for="login">Hotel Name</label>
                     <input type="text" class="form-control " placeholder="Enter hotel name" name="t1" id="t1">
                </div>
                    
           <div class="form-group">
      <label for="sel1">Select City:</label>
      <select class="form-control" id="sel1" name="t2">
        <option style="font-size:18px;">Bhilai</option>
        <option style="font-size:18px;">Durg</option>

      </select>
           </div>
                    <div class="form-group">
                 <label for="login">Phone Number</label>
                 <input type="text" class="form-control " placeholder="Enter Phone name" name="t3" id="t3">
                </div>
         <div class="form-group">
      <label for="sel1">Type:</label>
      <select class="form-control" id="sel1" name="t4">
        <option style="font-size:18px;">Veg</option>
        <option style="font-size:18px;">Non-Veg</option>
         <option style="font-size:18px;">Both</option>

      </select>
           </div>

                 <div class="form-group">
                   <label for="login">Address</label>
                    <input type="text" class="form-control " placeholder="Enter Hotel Address" name="t5">
                    </div>
                   
                    <div>
                             <br>
                               <br>
                                                     
                    
                         	<input type="submit" class="btn btn-lg btn-block" style="background-color:#ff8800; color:white;" name="submit" value="Login">
                             </form>
                         <br>
                         
                                                
                </div>                                 
                       </div>
            </div>
   
            </div>
         </div>
           
        
    </body>
</html>
