package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Hotel_005fShow_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("       <link rel=\"stylesheet\" href=\"bootstrap3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\"></script>\n");
      out.write("        <script src=\"bootstrap3/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\" type=\"text/javascript\"></script>        \n");
      out.write("          <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("a:link {\n");
      out.write("    color: black; \n");
      out.write("    background-color: transparent; \n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("    color:#ff8800;\n");
      out.write("    background-color:transparent;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
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
      out.write("             ");

             if(session.getAttribute("loginid")!=null)
             {
             
      out.write("\n");
      out.write("             <li ><a href=\"User_History.jsp\" style=\"color:white;\"><span class=\"glyphicon glyphicon-shopping-cart\" ></span>Order Details</a></li>\n");
      out.write("             <li ><a href=\"User_Change_Pwd.jsp\"style=\"color:white;\"><span class=\"glyphicon glyphicon-log-in\" ></span>Change Password</a></li>\n");
      out.write("             ");

             }
             
      out.write("\n");
      out.write("                          \n");
      out.write("                </ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("       <div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-1\">\n");
      out.write("                         </div>\n");
      out.write("\t\t<div class=\"col-sm-10\">\n");
      out.write("\t\t<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("\t\t</ol>\n");
      out.write("\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t <img src=\"image/2.jpg\" alt=\"image\" style=\"width:100%; height:500px;\">\n");
      out.write("                            <div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\t<h3>Find the best restaurants</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"item\">\n");
      out.write("\t\t\t <img src=\"image/3.jpg\" alt=\"image\" style=\"width:100%; height:500px;\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"item\">\n");
      out.write("\t\t\t <img src=\"image/4.jpg\" alt=\"image\" style=\"width:100%; height:500px;\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("                    \t<div class=\"item\">\n");
      out.write("\t\t\t <img src=\"image/1.jpg\" alt=\"image\" style=\"width:100%; height:500px;\">\n");
      out.write("\t\t\t\t<div class=\"carousel-caption\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("                        \n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <center><h2> Popular Hotels</h2></center>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <hr>\n");
      out.write("          <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-1\"></div>\n");
      out.write("               \n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("       \n");
      out.write("  ");
 
      boolean flag=false;
      String city=request.getParameter("t1");
      if(city.equals(""))
      {
          response.sendRedirect("hungerzone.jsp");
      }
      else
      {
      String type="";
     try
        {
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from hotel_add where city='"+city+"' and status='active'");
            while(rs.next())            
            {
                flag=true;
                    type=rs.getString(5);
                
                  out.write("<div class='col-sm-3'>");
                 out.write("<div class='thumbnail'>");
                 out.write("<a href='Menu_Show.jsp?id="+rs.getString(1)+"'>");
                 out.write("<img src='upload/" +rs.getString(1)+".jpg' style='width:30%; height:30%;'>");
                 out.write("<div class='caption'>");
                 out.write("<h2 style='color:Black;'>"+rs.getString(2)+"</h2>");
                 out.write("</a>");
                 out.write("<p>"+rs.getString(7)+"</p>");
                 out.write("</div>");                 
                 out.write("</div>");
                 out.write("</div>");
            }
            
            if(flag==false)
            {
                response.sendRedirect("hungerzone.jsp");
            }
       }     
        catch(SQLException e)
                {
                
                    out.write(e+"");
                }
      }
   
      out.write("\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("    <div class=\"col-sm-1\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <center> <h3 style=\"background-color:#ff8800; color:white; padding-top:20px; padding-bottom:40px;\">Hotels</h3></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"href\">\n");
      out.write("        <a href=\"Hotel_Veg.jsp?city=");
 out.write(city+""); 
      out.write("\"><h3>Veg</h3></a>\n");
      out.write("     <hr>\n");
      out.write("     <a href=\"Hotel_NonVeg.jsp?city=");
 out.write(city+""); 
      out.write("\"><h3>Non-Veg</h3></a>\n");
      out.write("       <hr>\n");
      out.write("       <a href=\"Hotel_Both.jsp?city=");
 out.write(city+""); 
      out.write("\" ><h3>Both</h3></a>\n");
      out.write("        </div>\n");
      out.write("                              \n");
      out.write("      </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("  \n");
      out.write("     \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
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
      out.write("           \n");
      out.write("\t\t\t");
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
