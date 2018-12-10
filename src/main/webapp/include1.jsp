<%--
  Created by IntelliJ IDEA.
  User: justinreich
  Date: 8/20/18
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="partials/head.jsp">
    <jsp:param name="title" value="Include 1" />
</jsp:include>
<body>

    <%@include file="partials/navbar.html" %>

    <h1>Some title</h1>

    <%@include file="partials/footer.html" %>

</body>
</html>
