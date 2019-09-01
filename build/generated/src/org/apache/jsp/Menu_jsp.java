package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <script>\n");
      out.write("\n");
      out.write("   \t\tfunction PreviewImage(){\n");
      out.write("\n");
      out.write("   \t\t\tvar oFReader= new FileReader();\n");
      out.write("   \t\t\toFReader.readAsDataURL(document.getElementById(\"imglink\").files[0]);\n");
      out.write("\n");
      out.write("   \t\t\toFReader.onload= function (oFEvent)\n");
      out.write("   \t\t\t{\n");
      out.write("   \t\t\t\tdocument.getElementById(\"uploadPreview\").src=oFEvent.target.result;\n");
      out.write("   \t\t\t  \t\t};\n");
      out.write("   \t\t\t  };\n");
      out.write("   </script>\n");
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
      out.write("                  \n");
      out.write("                     <a href=\"Hotel_Admin.jsp\" style=\"color:white\">Home</a>\n");
      out.write("                    \n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"Menu.jsp\" style=\"color:white\">Menu Add</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"Delivery_Boy.jsp\" style=\"color:white\">Delivery boy Add</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"\" style=\"color:white\">Order List</a>\n");
      out.write("                    <hr>\n");
      out.write("                    <a href=\"#\" style=\"color:white\">Profile</a>\n");
      out.write("                    <hr>\n");
      out.write("                      <a href=\"Change_Pwd_H.jsp\" style=\"color:white\">Change Password</a>\n");
      out.write("                    <hr>\n");
      out.write("                       <a href=\"#\" style=\"color:white\">Logout</a>\n");
      out.write("                    <hr>\n");
      out.write("              \n");
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
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("             <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span>login up</a></li>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("                    <hr>      \n");
      out.write("                    \n");
      out.write("                       \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"page-header\">\n");
      out.write("                        <h1>Menu</h1>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                       <form method=\"post\" action=\"Hotel_Upload.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("                        \n");
      out.write("                \n");
      out.write("                        \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                    <div class=\"img\">\n");
      out.write("\t\t<img src=\"image/camera.png\" width=\"400px\" height=\"300px\" alt=\"avatar\" id=\"uploadPreview\" class=\"avatar\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t <p>Custom file:</p>\n");
      out.write("\t\t\t\t\t\t   \n");
      out.write("\t\t   <div class=\"custom-file mb-3\" >\n");
      out.write("\t\t     <input type=\"file\"  style=\"color:#ff8800;\" class=\"custom-file-input\" id=\"imglink\" name=\"imglink\" accept=\".jpg, .jpeg,.png\" onchange=\"PreviewImage();\">\n");
      out.write("\t\t      \t\t\t\t\t\t\n");
      out.write("\t\t    </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("              \n");
      out.write("                   <div class=\"form-group\">\n");
      out.write("                      <label for=\"login\">Menu Name</label>\n");
      out.write("                     <input type=\"text\" class=\"form-control \" placeholder=\"Enter menu name\" name=\"t1\">\n");
      out.write("                </div>\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("                 <label for=\"login\">Hotel Price</label>\n");
      out.write("                 <input type=\"text\" class=\"form-control \" placeholder=\"Enter Price\" name=\"t2\">\n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                   <label for=\"login\">Specification</label>\n");
      out.write("                  <textarea class=\"form-control\" rows=\"5\" id=\"comment\" name=\"t3\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                       \n");
      out.write("                       <div class=\"form-group\">\n");
      out.write("                    <label for=\"sel1\">Select Category:</label>\n");
      out.write("                 <select class=\"form-control\" id=\"sel1\" name=\"t4\">\n");
      out.write("             \n");
      out.write("               \n");
      out.write("         ");

        
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
        
        
    
  
      out.write("\n");
      out.write("                 </select> \n");
      out.write("                     </div>  \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                       <div class=\"form-group\">\n");
      out.write("                 <label for=\"login\">Hotel ID</label>\n");
      out.write("                 <input type=\"text\" class=\"form-control \" placeholder=\"Enter Price\" name=\"t5\">\n");
      out.write("                 </div>\n");
      out.write("                  \n");
      out.write("                    <div>\n");
      out.write("                             <br>\n");
      out.write("                               <br>\n");
      out.write("                                                     \n");
      out.write("                         <input type=\"submit\" class=\"btn btn-lg btn-block\" style=\"background-color:#ff8800; color:white;\" value=\"submit\">\n");
      out.write("                           <br>\n");
      out.write("                                                \n");
      out.write("                </div>                                 \n");
      out.write("                       </div>\n");
      out.write("            </div>\n");
      out.write("   \n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("                    \n");
      out.write("              \n");
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
