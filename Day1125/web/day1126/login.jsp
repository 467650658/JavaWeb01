<%--
  Created by IntelliJ IDEA.
  User: 14286
  Date: 2020/11/26
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="/day1125/day1126/LoginServlet">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    验证码：<img src="/day1125/kaptcha.jpg" style="width: 100px;height: 30px">
    验证码输入：<input type="text" name="code">
    <input type="submit" >
</form>
</body>
</html>
