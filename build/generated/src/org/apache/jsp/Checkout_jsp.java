package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.text.*;

public final class Checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String amt=request.getParameter("amt");
    String hid=request.getParameter("hid");
    java.util.Date date= new java.util.Date();
    SimpleDateFormat sm=new SimpleDateFormat("");
    String mydt=sm.format(date);

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap3/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\"></script>\r\n");
      out.write("        <script src=\"bootstrap3/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("                \r\n");
      out.write("                   \r\n");
      out.write("                 \r\n");
      out.write("                \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("         <div class=\"container-fluid\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-12\">\r\n");
      out.write("                  <nav class=\"navbar navbar-info\" style=\"background-color:#ff8800;\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#mynavbar\">\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("                   <a class=\"navbar-brand\" href=\"#\" style=\"color:#ff8800;\"><img src=\"image/logoh.PNG\" width=\"100px\" height=\"90px\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"mynavbar\">\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("             <li ><a href=\"#\" style=\"color:white;\"><span class=\"glyphicon glyphicon-log-in\" ></span>Sign in</a></li>\r\n");
      out.write("             \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\" style=\" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);\">\r\n");
      out.write("                <div class=\"page-header\">\r\n");
      out.write("                        <h1>Checkout</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                   <form method=\"post\" action=\"Checkout.jsp\">\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                         \r\n");
      out.write("                                  <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"login\">Order ID</label>\r\n");
      out.write("                     <input type=\"text\" class=\"form-control \" name=\"t1\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                \r\n");
      out.write("                          \r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                                  <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"login\">Order Date</label>\r\n");
      out.write("                     <input type=\"text\" class=\"form-control \" value=\"");
out.write(mydt);
      out.write("\" name=\"t2\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                                  <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"login\">Loginid</label>\r\n");
      out.write("                     <input type=\"text\" class=\"form-control \" name=\"t3\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                \r\n");
      out.write("                          \r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"number\">Phone No.</label>\r\n");
      out.write("                     <input type=\"text\" class=\"form-control \"name=\"t4\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                             <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                                  <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"login\">Address</label>\r\n");
      out.write("                     <textarea class=\"form-control\" rows=\"5\" id=\"comment\" name=\"t5\"></textarea>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                \r\n");
      out.write("                          \r\n");
      out.write("                        <div class=\"col-sm-5\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"login\">Pay Amount</label>\r\n");
      out.write("                     <input type=\"text\" class=\"form-control \" name=\"t6\" value=\"");
 out.write(amt); 
      out.write("\">\r\n");
      out.write("                     \r\n");
      out.write("                            </div>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                         \r\n");
      out.write("                      <div class=\"col-sm-5\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                      <label for=\"login\">Hotel ID</label>\r\n");
      out.write("                     <input type=\"text\" class=\"form-control \" name=\"t7\" value=\"");
 out.write(hid); 
      out.write("\">\r\n");
      out.write("                     \r\n");
      out.write("                            </div>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("                     \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                     <div class=\"col-sm-10\">\r\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-lg btn-block\" style=\"background-color:#ff8800; color:white;\" value=\"Proceed\" name=\"submit\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                      \r\n");
      out.write("                    \r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                </div>\r\n");
      out.write("                   </form>\r\n");
      out.write("                </div>\r\n");
      out.write("      \r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("       \r\n");
      out.write("        \t<div class=\"container\" style=\" box-shadow: 10px 10px 15px 4px rgba(0,0,0,0.4);\">\r\n");
      out.write("\t\t<h2>Product In Cart</h2>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <table class=\"table table-hover\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t<th>Menu Id</th>\r\n");
      out.write("\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t<th>Hotel</th>\r\n");
      out.write("                        <th>Price</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("    ");

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
            out.write("<tr>");
            out.write("<td>"+rs.getString(1)+"</td>");
            out.write("<td> "+rs.getString(2)+"</td>");
             out.write("<td> "+rs.getString(6)+"</td>");
              out.write("<td> "+rs.getString(3)+"</td>");
            out.write("</tr>");
           total= total+Integer.parseInt(rs.getString(3));
             
        }
        
       }
        out.write("<tr>");
        out.write("<td>");
         out.write("</td>");
          out.write("<td>");
         out.write("</td>");
          out.write("<td>");
         out.write("</td>");
         out.write("<td>");
        out.write("<p><b>Total="+total+"</p>");
        out.write("</td>");
        
          out.write("</tr>");
        
      
        
        
        
             con.close();
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
  
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("                </div>\r\n");

    if(request.getParameter("t1")!=null)
         
    {
    try
    {
        
     
      
           String odate=request.getParameter("t2");
              String id=request.getParameter("t3");
        
        String phone=request.getParameter("t4");
        
        String add=request.getParameter("t5");
        String pay=request.getParameter("t6");
        String hotelid=request.getParameter("t7");
        
             DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
             Statement st1=con.createStatement();
               int c=0;
                                    
                                    ResultSet rs=st.executeQuery("select count(oid) from orderm");
                                    while(rs.next())
                                    {
                                        c=rs.getInt(1);
                                        
                                    }
                                    c=c+111;
                                    
        int b = st.executeUpdate("insert into orderm values('"+c+"','"+odate+"','"+id+"','"+pay+"','"+phone+"','"+add+"','"+hotelid+"','pending','none')");
       // int b=st.executeUpdate("insert into orderm values('"+c+"','"+name+"','"+phone+"','"+email+"')");
        String cart=session.getAttribute("cart").toString();
            String product[]=cart.split("@");
            for(int i=0;i<product.length;i++)
            {                
                ResultSet rs1= st1.executeQuery("select *from menu where mid='"+product[i]+"'"); 
                while(rs1.next())
                {    
                    st.executeUpdate("insert into orderc values('"+c+"','"+rs1.getString(1)+"','"+rs1.getString(3)+"','1','"+rs1.getString(3)+"')");        
                }
               
            }
      
        con.close();
     
                  if(b==0)
                response.sendRedirect("Order_Success.jsp?flag=0");
                else
                response.sendRedirect("Order_Success.jsp?flag=1"); 
            
        
    }
    catch(SQLException e)
    {
        out.write(e+"");
    }
    
}

      out.write('\r');
      out.write('\n');
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
