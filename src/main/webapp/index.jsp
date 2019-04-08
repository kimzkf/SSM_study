<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/4/6
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<a href="account/findAll" >查询所有用户信息</a>
<hr/>
<h3>测试保存用户信息</h3>
<form action="account/saveAccount" method="post">
    姓名：<input type="text" name="name" value="" /><br/>
    money：<input type="number" name="money" value="" /><br/>
    <input type="submit" name="submit"/>
</form>
</body>
</html>
