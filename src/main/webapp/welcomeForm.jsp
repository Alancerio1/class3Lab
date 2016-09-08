<%-- 
    Document   : welcomePage
    Created on : Sep 7, 2016, 6:27:47 PM
    Author     : alancerio18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
       
        
          <%
        Object obj = request.getAttribute("Msg");
        String msg = "unknown";
        
        if(obj != null){
           msg = obj.toString();
        }
        
        out.println("<p style='color:blue;font-weight:bold'>" + msg + "</p>");
        



        %>
    </body>
</html>
