package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Menu_005fShow_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String hid=request.getParameter("id");
    
   
  
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
      out.write("      <div class=\"container-fluid\">\n");
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
      out.write("    <div class=\"coniatner-fluid\">\n");
      out.write("        <div class=\"row\" style=\"background-color:#1c1e2e; margin-top:50px;\">\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("              \n");
      out.write(" ");

      try
        {
            
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");			
        Statement st = con.createStatement();
        ResultSet rs= st.executeQuery("select *from hotel_add where hid='"+hid+"'");
        while(rs.next())
        {     
             out.write("<div class='col-sm-2'>");
             
                out.write("<img src='upload/"+rs.getString(1)+".jpg' style='width:300px; height:200px;'>");
                  out.write("<h1 style='color:white;'>"+rs.getString(2)+"</h1>");
                  out.write("</div>");
                out.write("<div class='col-sm-3'>");
                  out.write("<p style='color:white; margin-left:30px; margin-top:20px;'>"+rs.getString(7)+"</p>");
                
                
                   out.write("</div>");
                
        
                 
                
                 }
       }     
        catch(SQLException e)
                {
                
                    out.write(e+"");
                }
        
                    

   
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("             </div>\n");
      out.write("   <br>\n");
      out.write("   <div class=\"conatiner\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("           <div class=\"col-sm-1\">\n");
      out.write("               \n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("          \n");
      out.write(" ");
 
      String city=request.getParameter("t1");
     try
        {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from menu where hid='"+hid+"'");
            while(rs.next())
            
            
            {
                 
                out.write("<div class='col-sm-3'>");
                 out.write("<img src='menu/" +rs.getString(1)+".jpg' style='width:300px; height:150px;'>");
                 out.write("<div class='caption'>");
                 out.write("<h2 style='color:Black;'>"+rs.getString(2)+"</h2>");
                  out.write("<p>"+rs.getString(3)+"</p>");
                  out.write("<span><a href='Menu_Cart.jsp?mid="+rs.getString(1)+"&hid="+rs.getString(6)+"' class='btn' role='button' style='background-color:#ff8800; color:white;'>Add</a>");
             
                  out.write("</div>");
                 out.write("</div>");     
            }
            
            
       }     
        catch(SQLException e)
                {
                
                    out.write(e+"");
                }
   
      out.write("\n");
      out.write("   \n");
      out.write("  ");

    int total=0;
    try
    {
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
            String  cart=session.getAttribute("cart").toString();
           String product[]=cart.split("@");
        for(int i=0;i<product.length;i++)
        {
        ResultSet rs= st.executeQuery("select *from menu where mid='"+product[i]+"'");
        
        while(rs.next())
        {
            out.write("<div class='col-sm-2'>");
       
              out.write("<p>"+rs.getString(2)+"</p>");
           out.write("<p>"+rs.getString(3)+"</p>");
         
           total= total+Integer.parseInt(rs.getString(3));
           out.write("</div>");
        }
       }
             con.close();
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
  
      out.write("\n");
      out.write("   </div>\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("           \n");
      out.write("           \n");
      out.write("   \n");
      out.write("        \n");
      out.write("        \n");
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
