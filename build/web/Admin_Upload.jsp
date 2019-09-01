<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>


<%
    
    String filesavepath;
    String resp="";
    String t1="",t2="",t3="",t4="",t5="";
    
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hunger","root","");
        Statement st=con.createStatement();
        
        InputStream is=null;
        OutputStream os=null;
        
            filesavepath="D:/upload";
            
            if(!(new File(filesavepath)).exists())
            {
                (new File(filesavepath)).mkdir();
            }
            int i=100;
            
               try
                    {
                        
                    MultipartParser parser = new MultipartParser(request,1024*1024*1024);
                    
                    com.oreilly.servlet.multipart.Part _part;
                    
                    while((_part=parser.readNextPart())!=null)
                    {
                        if(_part.isFile())
                        {
                            FilePart fPart=(FilePart) _part;
                            String name= fPart.getFileName();
                            
                            if(name!=null)
                                
                            {
                                long fileSize = fPart.writeTo(new File (filesavepath));
                                resp +=i++ +"." + fPart.getFilePath() + "["  + fileSize/1024 +"KB]<br>";
                            
                                try
                                {
                                    int c=0;
                                    String  code="";
                                    ResultSet rs=st.executeQuery("select count(hid) from hotel_add");
                                    while(rs.next())
                                    {
                                        c=rs.getInt(1);
                                        
                                    }
                                    c=c+1001;
                                    code="H"+c;
                                
                                    try
                                    {
                                        is = new FileInputStream("D:/upload/"+fPart.getFilePath());
                                        os = new FileOutputStream("C:/Users/user/Documents/hungerzone/web/upload/"+code+".jpg");
                                   
                                        byte[] buffer=new byte[1024];
                                        int length;
                                        while((length=is.read(buffer))>0)
                                        {
                                            os.write(buffer,0,length);
                                        }
                                    }
                                        finally
                                        {
                                         
                                                is.close();
                                                os.close();
                                         }
                                    }
                                    catch(Exception e)
                                    {
                                    
                                        out.write(e+"");
                                    }
                                }
                                else
                                {
                                        resp="The user did not upload a file for this part";
                                        
                                 }
                                
                            }
                    
                                
                            if(_part.isParam())
                            {
                                ParamPart fPart =(ParamPart)_part;
                                String s=fPart.getStringValue();
                                
                                   if(_part.getName().equals("t1"))
                                    t1=s;
                                 if(_part.getName().equals("t2"))
                                    t2=s;
                                    if(_part.getName().equals("t3"))
                                    t3=s;
                                 if(_part.getName().equals("t4"))
                                    t4=s;
                                    if(_part.getName().equals("t5"))
                                    t5=s;
                                  
                               
                        }
                    }
            
                              int m=0;
                              String value="";
                               ResultSet rs=st.executeQuery("select count(hid) from hotel_add");
                                while(rs.next())
                                    {
                                        m=rs.getInt(1);
                                        
                                    }
                                    m=m+1001;
                                    value="H"+m;
               int a =st.executeUpdate("insert into hotel_add values('"+value+"','"+t1+"','"+t2+"','"+t3+"','"+t4+"','"+value+"','"+t5+"','active')");
                     int b = st.executeUpdate("insert into login values('"+value+"','"+value+"','hadmin')");                
               con.close();
               
               File file =new File(filesavepath);
               File[] files=file.listFiles();
               for(File f:files)
               {
                   if(f.isFile()&& f.exists())
                       f.delete();
                   else
                       out.write("can't delete a filedue to open or error");
               }
            
        
    }
        catch(java.io.IOException ioe)
    {
            resp = ioe.getMessage();
    }

  response.sendRedirect("Hotel_Add.jsp");
      //out.write(resp);

%>
