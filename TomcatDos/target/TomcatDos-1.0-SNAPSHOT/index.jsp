<%-- 
    Document   : index
    Created on : 8 nov. 2023, 14:10:07
    Author     : Alfre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="SvUsuarios" method="POST">
            <p><label>Dni:</label><input type="text" name="dni"></p>
            <p><label>Nombre:</label><input type="text" name="nombre"></p>
            <p><label>Apellido:</label><input type="text" name="apellido"></p>
            <p><label>Telefono</label><input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>

        <br><!-- comment -->
        <h1>Lista de los usuarios</h1>
        <p>Para ver los datos de los usuarios presione el boton</p>
        <form action="SvUsuarios" method="get">
            <button type="submit">Mostrar Usuarios</button>

        </form>
    </body>
</html>
