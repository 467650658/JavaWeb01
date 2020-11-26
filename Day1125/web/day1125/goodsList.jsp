<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach" %><%--
  Created by IntelliJ IDEA.
  User: 14286
  Date: 2020/11/25
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <a href="/day1125/Servlet2?name=toy"><img src="../img/toy.jpg"/> </a><br/>
    <font>玩具车</font>
</div>
<div>
    <a href="/day1125/Servlet2?name=car"><img src="../img/car.jpg"/> </a><br/>
    <font>兰博基尼</font>
</div>
<div>
    <a href="/day1125/Servlet2?name=grape"><img src="../img/grape.jpg"/> </a><br/>
    <font>葡萄</font>
</div>
<div>
    <a href="/day1125/Servlet2?name=sausage"><img src="../img/sausage.jpg"/> </a><br/>
    <font>香肠</font>
</div>
<div>
    <a href="/day1125/Servlet2?name=wash"><img src="../img/wash.jpg"/> </a><br/>
    <font>香水</font>
</div>
您浏览过的商品:
<%
    Cookie[] cookies=request.getCookies();
    if (cookies!=null){
        for(Cookie c:cookies){
           if("goods".equals(c.getName())){
               out.print(c.getValue());
           }
        }
    }
%>
</body>
</html>
