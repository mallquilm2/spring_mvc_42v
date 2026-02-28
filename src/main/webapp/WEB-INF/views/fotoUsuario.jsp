<%@page import="java.util.Base64"%>
<%@page import="edu.cibertec.spring_mvc_42v.resources.model.UsuarioDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Foto Usuario</title>
    </head>
    <body>
        <%
            UsuarioDTO usuario = (UsuarioDTO)request.getAttribute("usuario");
        %>
        <%
            if(usuario == null || usuario.getFoto() == null){
        %>
            <h2>Usuario sin foto</h2>
        <%
            } else {
                String fotoBase64 = "data:image/jpg;base64,"+Base64.getEncoder().encodeToString(usuario.getFoto());
        %>
        <img src="<%= fotoBase64 %>" />
        <% } %>
        <br/>
        <a href="loginMostrar">Ingresar al login</a>
        <br/>
        <form method="post" action="fotoGrabar" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Seleccione foto:</td>
                    <td><input type="file" name="archivo"></td>
                </tr>
                <tr colspan="2" align="center">
                    <td><input type="submit" value="Subir foto en jpg"></td>
                </tr>
            </table>
            <input type="hidden" name="codigoUsuario" value="<%= usuario != null ? usuario.getUsuario() : "" %>" >
        </form>

    </body>
</html>