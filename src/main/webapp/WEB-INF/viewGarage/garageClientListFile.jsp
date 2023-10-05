<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 10/5/2023
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Garage Client List </title>
</head>
<body>

    <h1> Lista de futuros clinetes</h1>

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

        <c:forEach var="clientTMP" items="${ClientsAttributes}">

            <tr>
                <td>${clientTMP.nombre}</td>
                <td>${clientTMP.apellido}</td>
                <td>${clientTMP.email}</td>
                <td>${clientTMP.calle}</td>
                <td>${clientTMP.numero}</td>
                <td>${clientTMP.piso}</td>
                <td>${clientTMP.departamento}</td>
                <td>${clientTMP.marca_auto}</td>
                <td>${clientTMP.modelo}</td>
                <td>${clientTMP.anio}</td>
                <td>${clientTMP.patente}</td>
            </tr>

        </c:forEach>



    </table>

</body>
</html>
