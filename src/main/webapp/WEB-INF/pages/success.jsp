<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/6
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success!!!
<c:forEach items="${accountList}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
