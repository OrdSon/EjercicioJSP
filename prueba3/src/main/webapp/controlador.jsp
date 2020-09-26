<%-- 
    Document   : controlador
    Created on : 25/09/2020, 17:56:44
    Author     : samuelson
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="Manager.ManagerHtml"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>controlador</title>
    </head>
    <body>
        <%! ManagerHtml manager= new ManagerHtml();%>
        <h3><%
            LinkedList <String> resultados = manager.calcular(request);
            for (int i = 0; i < resultados.size(); i++) {
                    out.println("<br>"+resultados.get(i)+"<br>");
                }
            %>
        </h3>
    </body>
</html>
