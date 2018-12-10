<%--
  Created by IntelliJ IDEA.
  User: justinreich
  Date: 2018-12-10
  Time: 09:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<%@ include file="partials/head.jsp" %>--%>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Include Test" />
</jsp:include>
<body>

    <%@ include file="partials/navbar.html" %>

    <h1>Include Test</h1>

</body>
</html>
