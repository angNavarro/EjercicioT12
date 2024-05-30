<%-- 
    Document   : index
    Created on : 30 may 2024, 12:07:30
    Author     : angel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Nos traemos la variable de sesion -->
<% 
    ArrayList<Persona> resultado =(ArrayList<Persona>)session.getAttribute("personas");
    if (resultado == null) resultado =new ArrayList<>();
    
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Personas en la lista</title>
    </head>
    <body>
        <h1>Lista de personas </h1>
        <p><a href="alta.html">Alta de persona</a></p>
        <table border="1">
            <tr><td>Codigo</td><td>Nombre</td><td>Apellidos</td><td>Edad</td></tr>
            <!-- Insertar bucle para que muestre todos los resultados -->
            <% for (Persona p:resultado){ %>
            <tr>
                <td><%=p.getCodigo()%></td>
                <td><%=p.getNombre()%></td>
                <td><%=p.getApellidos()%></td>
                <td><%=p.getEdad()%></td>
                
            </tr>
                <%}%>
              </table>
             <p>Se han encontrado <%= resultado.size() %> personas. </p>
          
    </body>
</html>
