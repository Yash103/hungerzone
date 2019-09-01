package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Loginext_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("        <div class=\"container\" style=\"margin-top:50px;\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <h1>Login</h1>\n");
      out.write("                    <hr>\n");
      out.write("                    <center> <img src=\"image/18284.jpg\" width=\"100px\" height=\"100px\"></center>\n");
      out.write("          \n");
      out.write("\n");
      out.write("                                                         <form method=\"post\" action=\"Loginext.jsp\">\n");
      out.write("                                                        \n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                            <label for=\"login\">Email / HungerZoon Username</label>\n");
      out.write("                                                                <input type=\"text\" class=\"form-control \" placeholder=\"Enter Username\" name=\"t1\">\n");
      out.write("                                                                \n");
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
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    ");

      if(request.getParameter("t1")!=null)
      {   
  
    try
    {
        
        String id = request.getParameter("t1");
        String pwd = request.getParameter("t2");
        String role="";
        boolean flag=false;
        
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
