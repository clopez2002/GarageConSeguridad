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

    <!-- Aca le indicamos donde estan los recursos-->
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>

    <h1> Garage Client List</h1>
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


            <!-- Boton que agregamos de UPDATE -->
            <th>Update</th>


            <!-- Boton que agregamos de DELETE -->
            <th>Delete</th>


        </tr>

        <c:forEach var="clientTMP" items="${ClientsAttributes}">

            <!-- Aca obtenemos el ID en forma oculta para luego poder modificar el registro -->
            <c:url var="linkUpdate" value="/garageHomeURL/updateLinkURL">
                <c:param name="clientID" value="${clientTMP.id}"/> <!-- aca el valor Id que lo tenemos  de aca clientTMP.id, lo llamaremos: clientID -->
            </c:url>


            <!-- Aca obtenemos ponemos para borrar un registro -->
            <c:url var="linkDelete" value="/garageHomeURL/deleteLinkURL">
                <c:param name="clientID" value="${clientTMP.id}"/> <!-- aca el valor Id que lo tenemos  de aca clientTMP.id, lo llamaremos: clientID -->

            </c:url>


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


                <!-- Aca va el boton que nos lleva a hacer el update del cliente -->
                <td><a href="${linkUpdate}"><input type="button" value="Update Client"></a> </td>


                <!-- Aca va el boton que nos lleva a hacer el update del cliente -->
                <td><a href="${linkDelete}"><input type="button" value="Delete Client"
                    onclick="if (!(confirm('Esta seguro de eliminar el usuario?'))) return false"/></a> </td>


            </tr>

        </c:forEach>

    </table>

    <br>

                        <!-- Boton para agregar cliente -->
    <div style="text-align: center">
        <input type="button" value="Add client" onclick="window.location.href='addClientURL'; return false;">
    </div>



</body>
</html>
