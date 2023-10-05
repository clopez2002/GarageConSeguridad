<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Servlet Garage</title>
</head>
<body>
<h1><%= "Index.jsp Garage!" %></h1>
<br/>

<!--
        <a href="Servlet">Hola Servlet!!!</a>

        pagina de inicio del Servlet, la reemplazamos por la redireccion
-->

    <% response.sendRedirect("garageHomeURL/clientListURL"); %>


</body>
</html>