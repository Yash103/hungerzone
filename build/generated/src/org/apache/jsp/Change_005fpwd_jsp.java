package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Change_005fpwd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <div class=\"container-fluid\">\n");
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
      out.write("                    \n");
      out.write("                     <a href=\"#\" style=\"color:white\">Home</a>\n");
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
      out.write("                    <hr>        \n");
      out.write("                    \n");
      out.write("              \n");
      out.write("           \n");
      out.write("          \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("             \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    \n");
      out.write("                         <div class=\"page-header\">\n");
      out.write("                        <h1>Change password</h1>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <form method=\"post\" action=\"Change_pwd.jsp\">\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                        <label for=\"pwd\">Old Password</label>\n");
      out.write("                          <input type=\"Password\" class=\"form-control \" placeholder=\"Enter  Password\" name=\"t1\">\n");
      out.write("                                                            \n");
      out.write("                            </div>\n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                        <label for=\"pwd\">New Password</label>\n");
      out.write("                          <input type=\"Password\" class=\"form-control \" placeholder=\"Enter  Password\" name=\"t2\">\n");
      out.write("                                                            \n");
      out.write("                            </div>\n");
      out.write("    \n");
      out.write("                                                            \n");
      out.write("                    \n");
      out.write("                           <div class=\"form-group\">\n");
      out.write("                        <label for=\"pwd\">Confirm Password</label>\n");
      out.write("                          <input type=\"Password\" class=\"form-control \" placeholder=\"Enter  Password\" name=\"t3\">\n");
      out.write("                                                            \n");
      out.write("                            </div>\n");
      out.write("                             <br>\n");
      out.write("                               <br>\n");
      out.write("                                                     \n");
      out.write("                         <input type=\"submit\" class=\"btn btn-lg btn-block\" style=\"background-color:#ff8800; color:white;\" value=\"submit\">\n");
      out.write("                    </form>\n");
      out.write("                           <br>\n");
      out.write("                                                \n");
      out.write("                </div>                                 \n");
      out.write("                       </div>\n");
      out.write("            </div>\n");
      out.write("   \n");
      out.write("            </div>\n");
      out.write("         </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    ");

    if(request.getParameter("t1")!=null)
    {
        try
        {
             String id=session.getAttribute("loginid").toString();
            String opwd=request.getParameter("t1");
            String npwd=request.getParameter("t2");
              String cpwd=request.getParameter("t2");
            
            boolean flag=false;
            String dbpwd="";
         
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select pwd from login where loginid='"+id+"'");        
            while(rs.next())
            {
                flag=true;
                dbpwd=rs.getString(1);
            }
            con.close();
            
            if(flag==true)
            {
                if(dbpwd.equals(opwd))
                {
                   
                if(npwd.equals(cpwd))
                {  
                    int a =  st.executeUpdate(" update login set pwd='"+npwd+"' where id='"+id+"'");
                    out.write("<script>alert(' Password');</script>");
                                  
                }
                else
                {
                out.write("<script>alert(' New Password & confirm password does't matched');</script>");     
                }
                
       }
                else
                {                   
                    out.write("<script>alert(' Password does't matched');</script>");                
                }
               
            }
        }
        
        catch(SQLException e)
        {
            out.write(e+"");
        }
    }

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
