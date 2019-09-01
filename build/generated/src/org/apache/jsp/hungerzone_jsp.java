package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class hungerzone_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("  ");

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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
    

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"bootstrap3/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"validator.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("                    .image { \n");
      out.write("                                position: relative; \n");
      out.write("                                width: 100%; /* for IE 6 */\n");
      out.write("                             }\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            h2 { \n");
      out.write("                               position: absolute; \n");
      out.write("                               top: 215px; \n");
      out.write("                               left: 0; \n");
      out.write("                               width:300px; \n");
      out.write("                                  color: white; \n");
      out.write("                                   font: bold 24px/45px Helvetica, Sans-Serif; \n");
      out.write("                                    letter-spacing: -1px;  \n");
      out.write("                                    background: rgb(0, 0, 0); /* fallback color */\n");
      out.write("                                     background: rgba(0, 0, 0, 0.7);\n");
      out.write("                                     padding: 10px; \n");
      out.write("                                     \n");
      out.write("                                                                 }\n");
      out.write("                                                                 \n");
      out.write("                                                                 \n");
      out.write("                                                                 \n");
      out.write("                                 #lab_social_icon_footer {\n");
      out.write("  padding: 40px 0;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write("#lab_social_icon_footer a {\n");
      out.write("  color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#lab_social_icon_footer .social:hover {\n");
      out.write("  -webkit-transform: scale(1.1);\n");
      out.write("  -moz-transform: scale(1.1);\n");
      out.write("  -o-transform: scale(1.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#lab_social_icon_footer .social {\n");
      out.write("  -webkit-transform: scale(0.8);\n");
      out.write("  /* Browser Variations: */\n");
      out.write("  \n");
      out.write("  -moz-transform: scale(0.8);\n");
      out.write("  -o-transform: scale(0.8);\n");
      out.write("  -webkit-transition-duration: 0.5s;\n");
      out.write("  -moz-transition-duration: 0.5s;\n");
      out.write("  -o-transition-duration: 0.5s;\n");
      out.write("}\n");
      out.write("/*\n");
      out.write("    Multicoloured Hover Variations\n");
      out.write("*/\n");
      out.write("\n");
      out.write("#lab_social_icon_footer #social-fb:hover {\n");
      out.write("  color: #3B5998;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#lab_social_icon_footer #social-tw:hover {\n");
      out.write("  color: #4099FF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#lab_social_icon_footer #social-gp:hover {\n");
      out.write("  color: #d34836;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#lab_social_icon_footer #social-em:hover {\n");
      out.write("  color: #f39c12;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("       <body>\n");
      out.write("     <div class=\"container-fluid\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-1 bg-info\"></div>\n");
      out.write("          <div class=\"col-sm-6\" style=\"margin-top:4%;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-6\">\n");
      out.write("                 <img src=\"image/logoh.PNG\" width=\"200px\" height=\"150px\">\n");
      out.write("                 \n");
      out.write("              </div>\n");
      out.write("                   <div class=\"col-sm-1\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-sm-2\">\n");
      out.write("                       <button  type=\"button\" class=\"btn  btn-lg\" style=\"background-color:#ff8800; color:white;\" data-toggle=\"modal\" data-target=\"#myModal\">Login</button>\n");
      out.write("                         <div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("                          <div class=\"modal-dialog\">\n");
      out.write("                             <div class=\"modal-content\">\n");
      out.write("                               <div class=\"modal-header\">\n");
      out.write("                                 <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                     <h1 class=\"modal-title\">Log in</h1>\n");
      out.write("                                 \n");
      out.write("                                     <center> <img src=\"image/18284.jpg\" width=\"100px\" height=\"100px\"></center>\n");
      out.write("                                      </div>\n");
      out.write("                                                    <div class=\"modal-body\">\n");
      out.write("                                                        <form method=\"post\" action=\"hungerzone.jsp\">\n");
      out.write("                                                        \n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"login\">Email / HungerZoon Username</label>\n");
      out.write("                                                                <input type=\"text\" class=\"form-control \" placeholder=\"Enter Username\" name=\"t1\" id=\"t1\" >\n");
      out.write("                                                                <p id=\"p1\"></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"pwd\">Password</label>\n");
      out.write("                                                            <input type=\"Password\" class=\"form-control \" placeholder=\"Enter  Password\" name=\"t2\">\n");
      out.write("                                                            \n");
      out.write("                                                        </div>\n");
      out.write("                                                        <a style=\"color:#ff8800\" href=\"\" data-toggle=\"modal\" data-target=\"#myModal2\" >Forgot password?</a>\n");
      out.write("                                                        <br>\n");
      out.write("                                                        <br>\n");
      out.write("                                                        <input type=\"submit\" class=\"btn btn-lg btn-block\" style=\"background-color:#ff8800; color:white;\" value=\"Login\">\n");
      out.write("                                                        </form>\n");
      out.write("                                                        <br>\n");
      out.write("                                                        \n");
      out.write("                                                             </div>\n");
      out.write("                                               \n");
      out.write("                                                    </div>\n");
      out.write("                                            </div>\n");
      out.write("\t</div>\n");
      out.write("                                      \n");
      out.write("                                       </div>\n");
      out.write("                                       <div class=\"col-sm-3\">\n");
      out.write("                                          <button  type=\"button\" class=\"btn  btn-lg\" style=\"background-color:black; color:white;\" data-toggle=\"modal\" data-target=\"#myModal1\">Sign up</button>\n");
      out.write("                                                             <div class=\"modal fade\" id=\"myModal1\" role=\"dialog\">\n");
      out.write("                                            <div class=\"modal-dialog\">\n");
      out.write("+\n");
      out.write("                                             <div class=\"modal-content\">\n");
      out.write("                                              <div class=\"modal-header\">\n");
      out.write("                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                                    <h1 class=\"modal-title\">Sign up</h1>\n");
      out.write("                                                     <center> <img src=\"image/18284.jpg\" width=\"100px\" height=\"100px\"></center>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"modal-body\">\n");
      out.write("                                                        \n");
      out.write("                                                        <form method=\"post\" action=\"hungerzone.jsp\" id=\"myform\">\n");
      out.write("                                                        \n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"login\">Full Name</label>\n");
      out.write("                                                                <input type=\"text\" class=\"form-control \" placeholder=\"Enter Fullname\" name=\"s1\" id=\"s1\">\n");
      out.write("                                                                <p id=\"\"p1></p>\n");
      out.write("                                                        </div>\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"login\">User ID</label>\n");
      out.write("                                                                <input type=\"text\" class=\"form-control \" placeholder=\"Enter UserId\" name=\"s2\" id=\"s2\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"login\">Email</label>\n");
      out.write("                                                                <input type=\"text\" class=\"form-control \" placeholder=\"Enter Email Address\" name=\"s3\" id=\"s3\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                               <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"login\">Phone Number</label>\n");
      out.write("                                                                <input type=\"text\" class=\"form-control \" placeholder=\"Enter Phone Number\" name=\"s4\" id=\"s4\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"pwd\">Password</label>\n");
      out.write("                                                            <input type=\"Password\" class=\"form-control \" placeholder=\"Enter  Password\" name=\"s5\" id=\"s5\">\n");
      out.write("                                                            \n");
      out.write("                                                        </div>\n");
      out.write("                                                        <br>\n");
      out.write("                                                        <br>\n");
      out.write("                                                     \n");
      out.write("                                                        <input type=\"submit\" class=\"btn btn-lg btn-block\" style=\"background-color:#ff8800; color:white;\" value=\"Signup\">\n");
      out.write("                                                        <br>\n");
      out.write("                                                        </form>\n");
      out.write("                                                        \n");
      out.write("                                                             </div>\n");
      out.write("                                               \n");
      out.write("                                                    </div>\n");
      out.write("                                            </div>\n");
      out.write("\t</div>\n");
      out.write("                         <br>\n");
      out.write("                         <br>\n");
      out.write("                            ");

                     
                                    out.write(msg);
                                
                    
      out.write("\n");
      out.write("\n");
      out.write("                                       </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                 <script>\n");
      out.write("var validator=new Validator(\"myform\");\n");
      out.write("\n");
      out.write("validator.addValidation(\"s1\",\"alpha\",\"Enter Only Char in FullName\");\n");
      out.write("\n");
      out.write("validator.addValidation(\"s3\",\"email\",\"Invalid Email ID\");\n");
      out.write("validator.addValidation(\"s4\",\"num\",\"Enter Only No in Phone No\");\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("                             <div class=\"modal fade\" id=\"myModal2\" role=\"dialog\">\n");
      out.write("                                                                <div class=\"modal-dialog\">\n");
      out.write("                    \n");
      out.write("                                                                 <div class=\"modal-content\">\n");
      out.write("                                                                  <div class=\"modal-header\">\n");
      out.write("                                                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                                                                        <h1 class=\"modal-title\">Forgot password?</h1>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                                                                            <div class=\"form-group\">\n");
      out.write("                                                                                <h3> <small for=\"login\">Please enter the email address you signed up with and we'll send you a password reset link.</small></h3>\n");
      out.write("                                                                                <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Enter Email\">\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            \n");
      out.write("                                                                    <button type=\"button\" class=\"btn btn-lg btn-block\" style=\"background-color:#ff8800; color:white;\">Reset Password</button>\n");
      out.write("                                                        <br>\n");
      out.write("                                                        <br>\n");
      out.write("                                                        \n");
      out.write("                        \n");
      out.write("                                                                        </div>\n");
      out.write("                                                                 </div>\n");
      out.write("                                                                </div>\n");
      out.write("                             </div>\n");
      out.write("              <br>\n");
      out.write("              <br>\n");
      out.write("              \n");
      out.write("                    <marquee behavior=\"scroll\" direction=\"up\" scrollamount=\"1\" style=\"height:30px;\">\n");
      out.write("                        <h1>Are You hungry?</h1>\n");
      out.write("                        \n");
      out.write("                        <h1>Latenight At Office?</h1>\n");
      out.write("                    </marquee>\n");
      out.write("              \n");
      out.write("                                <h1><small>Order food from favourite restaurants near you.</small></h1>\n");
      out.write("                                <br>\n");
      out.write("                                <br>\n");
      out.write("                             \n");
      out.write("                                    \n");
      out.write("                                          \n");
      out.write("                                          <form method=\"post\" action=\"Hotel_Show.jsp\">\n");
      out.write("                                \t<div class=\"form-inline\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control input-lg\" style=\"width:400px;\" placeholder=\"Enter Your delivery location\" name=\"t1\">\n");
      out.write("                                        <input type=\"submit\" class=\"btn\" style=\"background-color: #ff8800; color:white; height:48px;\" name=\"submit\" value=\"FIND FOOD\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                          </form>\n");
      out.write("                                        <h3><small>Bhilai Durg</small></h3>\n");
      out.write("                                           \n");
      out.write("                                        \n");
      out.write("                      </div>\n");
      out.write("                         <div class=\"col-sm-5\">\n");
      out.write("                          \t<img src=\"image/yash.jpg\" width=\"750px\" height=\"600px\">\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("    </div>\n");
      out.write("                          <div class=\"row\" style=\"background-color:#180D01\">\n");
      out.write("                               <div class=\"col-sm-2\">\n");
      out.write("                               </div>\n");
      out.write("                     <div class=\"col-sm-3\">\n");
      out.write("                         <img src=\"image/pic3.png\" width=\"150px\" height=\"200px\">\n");
      out.write("                         <h4  style=\"color:white\">No Minimum Order</h4>\n");
      out.write("                         <p style=\"color:#bcaaa4\">Order in for yourself or for the group,<br> with no restrictions on order value</p>\n");
      out.write("                         <br>\n");
      out.write("                         <br>\n");
      out.write("                        \n");
      out.write("          \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                         <div class=\"col-sm-3\">\n");
      out.write("                              <img src=\"image/pic2.png\" width=\"150px\" height=\"200px\">\n");
      out.write("                               <h4  style=\"color:white\">Live Order Tracking</h4>\n");
      out.write("                               <p style=\"color:#bcaaa4\">Know where your order is at all times,<br>from the restaurant to your doorstep</p>\n");
      out.write("                             <br>\n");
      out.write("                            <br>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                         <div class=\"col-sm-3\">\n");
      out.write("                              <img src=\"image/pic1.png\" width=\"150px\" height=\"200px\">\n");
      out.write("                                    <h4  style=\"color:white\">Lightning-Fast Delivery</h4>\n");
      out.write("                               <p style=\"color:#bcaaa4\">Experience HungerZoon superfast delivery<br>for food delivered fresh & on time</p>\n");
      out.write("                             <br>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("         <hr>\n");
      out.write("         <div class=\"row\">\n");
      out.write("             <center><h1 style=\"font:sans-serif\">Most Trusted Restaurants</h1></center>\n");
      out.write("             <br>\n");
      out.write("             <div class=\"col-sm-2\">\n");
      out.write("             </div>\n");
      out.write("             <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"image\">\n");
      out.write("                     <img src=\"image/veg.jpg\" width=\"300px\" height=\"300px\"/>\n");
      out.write("                     <h2>Veg</h2>\n");
      out.write("                </div>\n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                  <div class=\"image\">\n");
      out.write("                  <img src=\"image/cake.jpg\" width=\"300px\" height=\"300px\">\n");
      out.write("                  <h2>Cake</h2>\n");
      out.write("                </div>  \n");
      out.write("                </div>\n");
      out.write("         \n");
      out.write("            \n");
      out.write("             \n");
      out.write("             \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"image\">\n");
      out.write("                     <img src=\"image/burger.jpg\" width=\"300px\" height=\"300px\"/>\n");
      out.write("                     <h2>Burger</h2>\n");
      out.write("                </div>\n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                 <div class=\"image\">\n");
      out.write("                  <img src=\"image/chi.jpg\" width=\"300px\" height=\"300px\">\n");
      out.write("                  <h2>Chinese</h2>\n");
      out.write("                </div>  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"image\">\n");
      out.write("                     <img src=\"image/ice.jpg\" width=\"300px\" height=\"300px\"/>\n");
      out.write("                     <h2>Ice-Cream</h2>\n");
      out.write("                </div>\n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                 <div class=\"image\">\n");
      out.write("                  <img src=\"image/nveg.jpg\" width=\"300px\" height=\"300px\">\n");
      out.write("                  <h2>Non-veg</h2>\n");
      out.write("                </div>  \n");
      out.write("                </div>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write(" \n");
      out.write("         <div class=\"row\" style=\"background-color:#000000\">\n");
      out.write("             <center> <h3 style=\"color:#FFFAFA\">HungerZone </h3></center>\n");
      out.write("             <hr>\n");
      out.write("             \n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-2\">\n");
      out.write("                  <h3 style=\"color:#FFFAFA\">@ 2018 HungerZone</h3>\n");
      out.write("              </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("              <section id=\"lab_social_icon_footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"\">\n");
      out.write("                    <a href=\"https://www.facebook.com/profile.php?id=100007281463124\"><i id=\"social-fb\" class=\"fa fa-facebook-square fa-3x social\"></i></a>\n");
      out.write("\t            <a href=\"https://twitter.com/_Sakth_launda\"><i id=\"social-tw\" class=\"fa fa-twitter-square fa-3x social\"></i></a>\n");
      out.write("\t            <a href=\"https://mail.google.com/mail/u/0/?tab=wm#inbox\"><i id=\"social-gp\" class=\"fa fa-google-plus-square fa-3x social\"></i></a>\n");
      out.write("\t            <a href=\"mailto:#\"><i id=\"social-em\" class=\"fa fa-envelope-square fa-3x social\"></i></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write("       \n");
      out.write("         \n");
      out.write("<br>        \n");
      out.write("        \n");
      out.write("     ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
