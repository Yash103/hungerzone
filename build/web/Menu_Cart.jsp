<%
    String pcode = request.getParameter("mid");
    String id=request.getParameter("hid");
    String total="";
    
    if(session.getAttribute("cart")!=null)
    total=session.getAttribute("cart").toString();
    else    
    session.setAttribute("cart","");
    
    session.setAttribute("cart",total+"@"+pcode);
 // out.write("code:"+session.getAttribute("cart").toString());
    response.sendRedirect("Menu_Show.jsp?id="+id+"");



%>