<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/15/2025
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login</h2>
    <c:if test="${not empty error}">
        <div style="color: red">${error}</div>
    </c:if>
    <br>
    <form action="login" method="post">
        <label for="username">Tên người dùng: </label>
        <input type="text" name="username" id="username">
        <br><br>
        <label for="password">Mật khẩu: </label>
        <input type="password" name="password" id="password">
        <br><br>
        <input type="submit" value="LOGIN">
    </form>
</body>
</html>
