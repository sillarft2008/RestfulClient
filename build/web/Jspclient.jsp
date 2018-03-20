<%-- 
    Document   : Jspclient
    Created on : Mar 20, 2018, 9:56:07 PM
    Author     : Flor
--%>

<%@page import="org.me.restfulclient.RestfulClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action = "">
            Input text: <TEXTAREA NAME="textarea1" ROWS="10"></TEXTAREA><br>
                      <input type="submit" value="test" name="testbutton">
               </form> 
        
            <%
            String a = request.getParameter("textarea1");
            RestfulClient  c = new RestfulClient();
            out.println("Text: " + a);
            out.println("<br />");
            out.println("Number of Letters: " + c.callgetLetterCount(a));
            out.println("<br />");
            out.println("Number of Words: " + c.callgetWordCount(a));
            out.println("<br />");
            out.println("Number of Lines: " + c.callgetLineCount(a));
            %>

    </body>
    
    
</html>
