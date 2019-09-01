package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class User_005fHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

  String id=session.getAttribute("loginid").toString();
  
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
      out.write("          <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                  <nav class=\"navbar navbar-info\" style=\"background-color:#ff8800;\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#mynavbar\">\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("                   <a class=\"navbar-brand\" href=\"#\" style=\"color:#ff8800;\"><img src=\"image/logoh.PNG\" width=\"100px\" height=\"90px\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"mynavbar\">\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("             <li ><a href=\"#\" style=\"color:white;\"><span class=\"glyphicon glyphicon-log-in\" ></span>Sign in</a></li>\n");
      out.write("             \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("    \n");
      out.write("                       \n");
      out.write("            <div class=\"container\">          \n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div col-sm-2></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("              \n");
      out.write("\n");
      out.write("                    \n");
      out.write("                <div class=\"container\" style=\" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);\">\n");
      out.write("\t\t<h2>Order Details</h2>\n");
      out.write("                <hr>\n");
      out.write("                <input class=\"form-control\" id=\"myInput\" type=\"text\"  placeholder=\"Search...\">\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<table class=\"table table-bordered table-striped\">\n");
      out.write("\t\t<thead>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<th>Order Id</th>\n");
      out.write("\t\t\t<th>Date</th>\n");
      out.write("\t\t\t<th>loginid</th>\n");
      out.write("                        <th>Payamt</th>\n");
      out.write("                         <th>Phone</th>\n");
      out.write("                        <th>Address</th>\n");
      out.write("                         <th>status</th>\n");
      out.write("                        <th>Time</th>\n");
      out.write("                        <th>View Menu</th>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</thead>\n");
      out.write("                <tbody id=\"myTable\">\n");
      out.write("     ");

   
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
        ResultSet rs= st.executeQuery("select *from orderm where loginid='"+id+"'");
       
        
       
        
        while(rs.next())
        {           
            out.write("<tr>");
            out.write("<td>"+rs.getString(1)+"</td>");
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs.getString(3)+"</td>");
              out.write("<td> "+rs.getString(4)+"</td>");
               out.write("<td> "+rs.getString(5)+"</td>");
             out.write("<td> "+rs.getString(6)+"</td>");
              out.write("<td> "+rs.getString(8)+"</td>");
           
             out.write("<td><p style='color:green;'>"+rs.getString(10)+"</td></p>");
                 out.write("<td><a href='User_History_Menu.jsp?id="+rs.getString(1) +"' class='btn' role='button' style='background:linear-gradient(to right, #fe8c00, #f83600); color:white;'>View</a></td>");
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
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("            </div>\n");
      out.write("  \n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  \n");
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
      out.write("<!-- Include Font Awesome Stylesheet in Header -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"text-center center-block\">\n");
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
