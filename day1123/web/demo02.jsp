<%--
  Created by IntelliJ IDEA.
  User: FengJun
  Date: 2020/11/24
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" begin="1" end="9" step="1">
    <c:forEach var="j" begin="1" end="${i}" step="1">
        <c:out value="${i}" />*<c:out value="${j}" />=<c:out value="${i*j}" />
    </c:forEach>
    <br />
</c:forEach>
</body>
<%--<body>--%>
<%--<%--%>
<%--for (int i=1;i<=9;i++) {--%>
<%--for (int j=1;j<=i;j++){--%>
<%--pageContext.setAttribute("i",i);--%>
<%--pageContext.setAttribute("j",j);--%>
<%--%>--%>
<%--${i}*${j}=${i*j}--%>
<%--<%--%>
<%--}--%>
<%--%>--%>
<%--<br>--%>
<%--<%--%>
<%--}--%>
<%--%>--%>
<%--</body>--%>
</html>