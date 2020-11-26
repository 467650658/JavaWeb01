<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/23
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>交通工具</title>
</head>
<body>
<form action="choose.jsp"  METHOD="get">
    选择交通工具：<br>
    <input type="checkbox" name="tool" value="地铁">地铁<br>
    <input type="checkbox" name="tool" value="公共汽车">公共汽车<br>
    <input type="checkbox" name="tool" value="私家车">私家车<br>
    <input type="checkbox" name="tool" value="自行车">自行车<br>
    <input type="submit">
</form>
</body>
</html>
