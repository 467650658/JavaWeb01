<%@ page import="day1126.User" %><%--
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
<%
    User user= (User) session.getAttribute("user");
    if (user==null){
        out.print("您还没有登录");
    }else {
        out.print("用户名"+user.getUserName());
    }
%>
</body>
</html>
