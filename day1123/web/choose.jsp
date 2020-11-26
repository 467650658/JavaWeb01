<%@ page import="java.util.Arrays" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/23
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
    String[] value=request.getParameterValues("tool");
    out.println("您选择的交通工具："+Arrays.asList(value).toString());

%>
</body>
</html>
