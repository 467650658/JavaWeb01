<%@ page import="java.util.List" %>
<%@ page import="dfrz.Day1123.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/23
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<User> users= (List<User>) request.getAttribute("users"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>用户名</td>
    </tr>
    </thead>
    <tbody>
    <% for (int i = 0; i <users.size() ; i++) {
        User user=users.get(i);

        <%=user.getId()%>
    <%=user.getUserName()%>
    } %>



    </tbody>
</table>
</body>
</html>
