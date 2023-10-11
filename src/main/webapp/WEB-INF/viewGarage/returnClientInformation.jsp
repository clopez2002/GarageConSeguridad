<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 10/11/2023
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client Information</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>

    <h1> Client Information </h1>

</head>
<body>

        <table border="1">

            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Calle</th>
                <th>Numero</th>
                <th>Piso</th>
                <th>Depto</th>
                <th>Marca Auto</th>
                <th>Modelo</th>
                <th>Anio</th>
                <th>Patente</th>
            </tr>


            <!-- Aca no necesito c:forEach, dado que es un unico registro -->
            <tr>
                <td>${clientSearchAttributer.nombre}</td>
                <td>${clientSearchAttributer.apellido}</td>
                <td>${clientSearchAttributer.email}</td>
                <td>${clientSearchAttributer.calle}</td>
                <td>${clientSearchAttributer.numero}</td>
                <td>${clientSearchAttributer.piso}</td>
                <td>${clientSearchAttributer.departamento}</td>
                <td>${clientSearchAttributer.marca_auto}</td>
                <td>${clientSearchAttributer.modelo}</td>
                <td>${clientSearchAttributer.anio}</td>
                <td>${clientSearchAttributer.patente}</td>
            </tr>


        </table>

        <div style="text-align: center">

            <input type="button" value="Return Home" onclick="window.location.href='clientListURL'; return false;">

        </div>

</body>
</html>
