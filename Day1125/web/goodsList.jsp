<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/25
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <a href="/day1125/GoodsServlet?name=toy"><img src="img/day1125/toy.jpg"/> </a><br/>
    <font>玩具车</font>
</div>
<div>
    <a href="/day1125/GoodsServlet?name=car"><img src="img/day1125/car.jpg" /> </a><br/>
    <font>兰博基尼</font>
</div>
<div>
    <a href="/day1125/GoodsServlet?name=grape"><img src="img/day1125/grape.jpg"/> </a><br/>
    <font>葡萄</font>
</div>
<div>


    <a href="/day1125/GoodsServlet?name=sausage"><img src="img/day1125/sausage.jpg"/> </a><br/>
    <font>香肠</font>
</div>
<div>
    <a href="/day1125/GoodsServlet?name=wash"><img src="img/day1125/wash.jpg"/> </a><br/>
    <font>香水</font>
</div>
您已经浏览的商品:
<%
    Cookie[] cookie=request.getCookies();
    if (cookie !=null ) {
        for (Cookie c:
             cookie) {
            if ("goods".equals(c.getName())){
               String value=c.getValue();
               String [] names=value.split("&");
                for (int i = 0; i <names.length ; i++) {%>
            <%=names[i]%>
<%}

            }
        }
    }

%>
</body>
</html>
