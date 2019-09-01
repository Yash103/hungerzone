package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Admin_005fMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"bootstrap3/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("   \n");
      out.write("                <div class=\"col-sm-2\" style=\"background-color:#1c1e2e; height:900px;\">\n");
      out.write("                    <div class=\"space\" style=\"margin-left:15px;\">\n");
      out.write("                  \t<div class=\"page-header\">\t\n");
      out.write("                            \n");
      out.write("\t\t<h1 style=\"color:white;\">Admin</h1>\n");
      out.write("                        </div>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                  <a href=\"#\" style=\"color:white\">Home</a>\n");
      out.write("                    \n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"Hotel_Add.jsp\" style=\"color:white\">Hotel Add</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"Cat.jsp\" style=\"color:white\">Category Add</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"Change_pwd.jsp\" style=\"color:white\">Change password</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"#\" style=\"color:white\">Logout</a>\n");
      out.write("                    <hr>\n");
      out.write("              \n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("             \n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    \n");
      out.write("                    <nav class=\"navbar navbar-info\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#mynavbar\">\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" style=\"color:#ff8800;\"><h1><b>HungerZone</h1></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"mynavbar\">\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>login up</a></li>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("                    <hr>       \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-2\">\n");

 
         
    
    try
    {

        
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
          
               int c=0;
                                    
                                    ResultSet rs=st.executeQuery("select count(hid) from hotel_add");
                                    while(rs.next())
                                    {
                                        c=rs.getInt(1);
                                        
                                    
                                    }
                                     out.write("<div class='thumbnail' style=' background:  linear-gradient(to right, #fe8c00, #f83600);'");
                                     out.write("<center><h4 style='color:white;'>Total Hotels:</h4></center>");

                                    out.write("<center><h3 style='color:white;'>"+c+"</h3></center>");
                                    
                                       out.write("</div>");
     
       
        con.close();
     
              
            
        
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
  
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("  <br>\n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-1\">\n");
      out.write("           </div>\n");
      out.write("      \n");
      out.write("      <div class=\"col-sm-8\">\n");
      out.write("                \n");
      out.write("                    \t<div class=\"container\" style=\" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);\">\n");
      out.write("\t\t<h2>Hotels Record</h2>\n");
      out.write("                <hr>\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<th>Hotel Id</th>\n");
      out.write("                        <th>Profile</th>\n");
      out.write("\t\t\t<th>Name</th>\n");
      out.write("                        <th>City</th>\n");
      out.write("                         <th>Phone</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                        <th>Types</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                 \n");
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("                <tbody>\n");
      out.write("     ");

   
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
        ResultSet rs= st.executeQuery("select *from hotel_add");
       
        
       
        
        while(rs.next())
        {           
            out.write("<tr>");
            out.write("<td>"+rs.getString(1)+"</td>");
            out.write("<td><img src='upload/" +rs.getString(1)+".jpg' style='width:40px; height:40px;' class='img-circle'></td>");
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs.getString(3)+"</td>");
              out.write("<td> "+rs.getString(4)+"</td>");
               out.write("<td> "+rs.getString(5)+"</td>");
             out.write("<td> "+rs.getString(7)+"</td>");
               if(rs.getString(8).equals("active"))
                out.write("<td><a href='Admin_Block.jsp?id="+rs.getString(1) +"&status=block' class='btn' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>Block</a></td>");
                else
                out.write("<td><a href='Admin_Block.jsp?id="+rs.getString(1) +"&status=active' class='btn btn-danger' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>Active</a></td>");
                out.write("</tr>");
              
     
             
            out.write("</tr>");
        
             
        }
        
     
      
      
        
        
        
             con.close();
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
  
      out.write("\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("                </table>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("       \n");
      out.write("    \n");
      out.write("                </div>\n");
      out.write("    </body>");
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
