<%--
  Created by IntelliJ IDEA.
  User: justinreich
  Date: 2018-12-10
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Name Form</title>
</head>
<body>

    <c:choose>
        <c:when test="${product != null}">
            <h1>products.Product name: ${product.name}</h1>
            <h3>Price: ${product.price}</h3>
            <p>${product.description}</p>
        </c:when>
        <c:otherwise>
            <h1>No product found</h1>
        </c:otherwise>
    </c:choose>

</body>
</html>
