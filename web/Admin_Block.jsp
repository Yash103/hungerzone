<%@ page import="java.sql.*" %>
<%
        String id=request.getParameter("id");
        String status=request.getParameter("status");
        
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
            Statement st=con.createStatement();
     
       
            
        try
        {            
           int a=st.executeUpdate("update hotel_add set status='"+status+"' where hid='"+id+"'");
           response.sendRedirect("Admin_Main.jsp");
        }
        catch(SQLException e)
        {
            out.write(e+"");
        }
        con.close();
          
%>
