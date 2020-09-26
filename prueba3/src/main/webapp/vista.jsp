<%-- 
Document   : newjsp
Created on : 24/09/2020, 18:17:48
Author     : samuelson
--%>

<%@page import="Manager.ManagerHtml"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora!</h1>
        <form name = "form1" action="controlador.jsp"  method ="POST">
            <input type="number" name="texto1" ><br>
            <input type="number" name="texto2" ><br>
            <br><input type="checkbox" name="check1" >Sumar valores<br>
            <br><input type="checkbox" name="check2" >Multiplicar valores<br>
            <br><input type="checkbox" name="check3" >Encontrar mayor<br>
            <br><input type="checkbox" name="check4" >Elevar<br>
            <br><input type="checkbox" name="check5" >Binario<br>
            
            <input type="submit" onclick = "validar()" >
        </form>
    </body>
</html>
