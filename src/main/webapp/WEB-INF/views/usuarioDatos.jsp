<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primera aplicación con Spring MVC</title>
        <style type="text/css">
            .formFieldError{
                background-color: #FFC;
            }
        </style>
    </head>
    <body>
        <h1> Datos del usuario </h1>
        <br/>
        <mvc:form modelAttribute="usuarioBean" action="usuarioGrabar">
            <table>
                <tr>
                    <td> <mvc:label path="usuario">Usuario: </mvc:label></td>
                    <td> <mvc:input path="usuario" cssErrorClass="formFieldError" cssClass="form-control text-box"/></td>
                    <td> <mvc:errors path="usuario"/></td>
                </tr>
                <tr>
                    <td> <mvc:label path="clave">Clave: </mvc:label></td>
                    <td> <mvc:input path="clave" cssErrorClass="formFieldError" cssClass="form-control text-box"/></td>
                    <td> <mvc:errors path="clave"/></td>
                </tr>
                <tr>
                    <td> <mvc:label path="nombreCompleto">Nombre Completo: </mvc:label></td>
                    <td> <mvc:input path="nombreCompleto" cssErrorClass="formFieldError" cssClass="form-control text-box"/></td>
                    <td> <mvc:errors path="nombreCompleto"/></td>
                </tr>
                <tr>
                    <td colspan="1">
                        <input type="submit" value="Insertar" class="btn btn-primary button-submit"/>
                    </td>
                </tr>
            </table>
        </mvc:form>
    </body>
</html>