<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login de Usuario</title>
    </head>
    <body>
        <h1> Login de usuario  </h1>
        <br/>
        <form action="loginAccion" method="post">
            Usuario: <input type="text" name="txtUsuario"><br/>
            Clave: <input type="password" name="txtClave"><br/>
            <input type="submit" value="Ingresar"/>
        </form>
        <% if(request.getAttribute("msgError") != null){
            out.print(request.getAttribute("msgError"));
        }%>
    </body>
</html>