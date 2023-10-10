<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 10/6/2023
  Time: 12:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Client</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>


</head>
<body>

        <h1> Update Client </h1>


        <form:form action="addNewClientDataURL" modelAttribute="oneClientAttribute" method="post">

            <form:hidden path="id"/>

            <table>
                <tr>
                    <td>Nombre</td>                         <!--Texto -->
                    <td><form:input path="nombre"/></td>
                </tr>

                <tr>
                    <td>Apellido</td>
                    <td><form:input path="apellido"/></td>
                </tr>

                <tr>
                    <td>Email</td>
                    <td><form:input path="email"/></td>
                </tr>

                <tr>
                    <td>Calle</td>
                    <td><form:input path="calle"/></td>
                </tr>

                <tr>
                    <td>Numero</td>
                    <td><form:input path="numero"/></td>
                </tr>

                <tr>
                    <td>Piso</td>
                    <td><form:input path="piso"/></td>
                </tr>

                <tr>
                    <td>Departamento</td>
                    <td><form:input path="departamento"/></td>
                </tr>

                <tr>
                    <td>Marca Auto</td>
                    <td><form:input path="marca_auto"/></td>
                </tr>

                <tr>
                    <td>Modelo</td>
                    <td><form:input path="modelo"/></td>
                </tr>

                <tr>
                    <td>Anio</td>
                    <td><form:input path="anio"/></td>
                </tr>

                <tr>
                    <td>Patente</td>
                    <td><form:input path="patente"/></td>
                </tr>

                <tr>
                    <td colspan="2"><input type="submit" value="Update Client"></td>
                </tr>

            </table>

        </form:form>
</body>
</html>
