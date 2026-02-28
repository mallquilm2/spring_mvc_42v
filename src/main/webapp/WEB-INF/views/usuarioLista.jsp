<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List"%>
<%@page import="edu.cibertec.spring_mvc_42v.resources.model.UsuarioDTO"%>
<!DOCTYPE html>
<html>
    <head>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mantenimiento de usuarios</title>
    </head>
    <body>
        <h1> Listado de Usuarios. </h1>
        <br/>
        <% List<UsuarioDTO> lista = (List<UsuarioDTO>)request.getAttribute("lista"); %>

        <table class="table mx-2">
            <thead>
                <tr class="table-primary">
                    <th>Usuario</th>
                    <th>Clave</th>
                    <th>Nombre completo</th>
                    <th>Foto</th>
                    <th colspan="2">Accion</th>
                </tr>
            </thead>
            <tbody>
                <% for(UsuarioDTO usuario:lista) { %>
                    <tr>
                        <td> <%= usuario.getUsuario()  %> </td>
                        <td> <%= usuario.getClave()  %> </td>
                        <td> <%= usuario.getNombreCompleto()  %> </td>
                        <td> <a href="fotoMostrar?codigoUsuario=<%=usuario.getUsuario()%>">foto</a></td>
                        <td> <a href="usuarioEliminar?id=<%= usuario.getId() %>" >Eliminar</a> </td>
                        <td> <a href="usuarioActualizar">Actualizar</a> </td>
                    </tr>
                    <% } %>
            </tbody>
        </table>
        <a href="usuarioCrear" class="btn btn-primary btn-lg active mx-2">Crear Usuario</a>
    </body>
</html>