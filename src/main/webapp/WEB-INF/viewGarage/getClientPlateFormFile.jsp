<%--
  Created by IntelliJ IDEA.
  User: ClaudioCristianLopez
  Date: 10/11/2023
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Client Plate</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>

    <h1> Input Client Plate </h1>
</head>
<body>

        <div style="text-align: center">
            <form action="processClientDataURL" method="get">

                <input type="text" name="plateToSearch">
                <input type="submit">

            </form>
        </div>
</body>
</html>
