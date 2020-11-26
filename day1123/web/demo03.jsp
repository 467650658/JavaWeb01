<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: WuLiangHang
  Date: 2020/11/24
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("百度", "www.baidu.com");
    map.put("雅虎", "cn.yahoi.com");
    map.put("谷歌", "www.google.com");
    request.setAttribute("map", map);
%>
<c:forEach items="${requestScope.map}" var="entry">
    <h1>${entry.key} = ${entry.value}</h1>
</c:forEach>
</body>
</html>
