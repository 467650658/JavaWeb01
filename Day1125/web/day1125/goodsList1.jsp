<%--
  Created by IntelliJ IDEA.
  User: youji
  Date: 2020/11/25
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body style="text-align: center" align="center">

<%
    Cookie[] cookies=request.getCookies();
    if(cookies!=null){
        for (Cookie cookie:cookies) {
            if("goods".equals(cookie.getName())){
                String value =cookie.getValue();
                String[] names=value.split("&");
                %>
<table border="1" style="text-align: center" align="center" width="400px">
    <tr>
        <th><b>您已经浏览的商品:</b></th>
    </tr>
    <%
        for (int i = 0; i < names.length; i++) {
            %>
    <tr>
        <td>
            <%=names[i]%>
        </td>
    </tr>
    <%
        }
    %>
</table>
<%
            }
        }
    }
%>
<a href="/days1125/GoodsListServlet?goodName=apple"><img src="../img/test01/apple.jpg"/></a>
<br/>苹果<br/>
<a href="/days1125/GoodsListServlet?goodName=banana"><img src="../img/test01/banana.jpg"/></a>
<br/>香蕉<br/>
<a href="/days1125/GoodsListServlet?goodName=lemon"><img src="../img/test01/lemon.jpg"/></a>
<br/>柠檬<br/>
<a href="/days1125/GoodsListServlet?goodName=orange"><img src="../img/test01/orange.jpg"/></a>
<br/>橙子<br/>
<a href="/days1125/GoodsListServlet?goodName=watermelon"><img src="../img/test01/watermelon.jpg"/></a>
<br/>西瓜<br/>
</body>
</html>
