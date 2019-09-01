package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        \n");
      out.write("        <script> \n");
      out.write("function Validate()                                    \n");
      out.write("{ \n");
      out.write("    var name = document.forms[\"RegForm\"][\"Name\"];                 \n");
      out.write("   \n");
      out.write("    if (name.value===\"\")                                  \n");
      out.write("    { \n");
      out.write("      alert(\"Please enter your name.\"); \n");
      out.write("        name.focus(); \n");
      out.write("        return false; \n");
      out.write("    } \n");
      out.write("     return true;\n");
      out.write("     }\n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"post\" action=\"login.jsp\" onsubmit=\"return Validate()\" name=\"vform\">\n");
      out.write("\t\t<div class=\"container\" style=\"margin-top:5%;\">\n");
      out.write("\t\t\t<h2>Login page</h2>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-3\" style=\"background-color: green\"></div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\"> \n");
      out.write("                    \t\t\t\t <input type=\"text\" name=\"name\">\n");
      out.write("                                                           \n");
      out.write("                                               \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\" > \n");
      out.write("\t\t\t\t\t\t<input type=\"email\" name=\"email\" >\n");
      out.write("                                                               \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                   \n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-success\"  name=\"register\"  value=\"Login\">\n");
      out.write("\t\t\t\t\t<a href=\"registration\">New user?</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("    ");
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
