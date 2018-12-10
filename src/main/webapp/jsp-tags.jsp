<%-- This comment does not render client-side --%>
<!-- This comment does -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>

<%! int instanceCount = 0; %>


<%
    int localCount = 1;
    localCount += 1;
    instanceCount  += 1;
    List test = new ArrayList<>(); // requires directive
%>

<html>
<head>
    <title>JSP Tags</title>
</head>
<body>
    <h1>JSP Example</h1>
    <h2>Local count = <%= localCount %></h2>
    <h2>Instance count = <%= instanceCount %></h2>
</body>
</html>
