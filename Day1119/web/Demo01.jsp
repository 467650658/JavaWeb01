<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/23
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%!
    int a=1;
    int b=2;
    %>
    <%!
    public String print(){
        String str="I hate JSP";
        return str;
    }
    %>
</head>
<body>
<%
    out.println("这是JSP代码块打印的："+a+b);

%>
<%="这是JSP脚本输出脚本打印的："+(a+b)
%>
<%=out.print(print())%>
</body>
</html>
