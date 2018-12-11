<%--
  Created by IntelliJ IDEA.
  User: justinreich
  Date: 2018-12-11
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Form</title>
</head>
<body>

    <h1>Pick Color Form</h1>
    <form action="/pickcolor" method="POST">
        <input type="text" name="color">
        <button>Submit</button>
    </form>

</body>
</html>
