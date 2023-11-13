<%-- 
    Document   : mostrarUsuarios
    Created on : 10 nov. 2023, 0:18:04
    Author     : Alfre
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostradera</title>
    </head>
    <body>
        <h1>Mostrar Usuarios</h1>
        <%
            List<Usuarios> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont=1;
            for (Usuarios usu : listaUsuarios) {
        %>
        <p><b>Usuario N°<%=cont%> </b></p>
        <p>Dni: <%=usu.getDni()%></p>
        <p>Nombre: <%=usu.getNombre()%></p>
        <p>Apellido: <%=usu.getApellido()%></p>
        <p>Telefono: <%=usu.getTelefono()%></p>
        <p>-----------------------------------</p>
        <% cont++;%>
        <%}%>
    </body>
</html>
