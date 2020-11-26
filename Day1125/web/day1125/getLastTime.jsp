<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.dfrz.test01.utils.CookieUtils" %><%--
  Created by IntelliJ IDEA.
  User: youji
  Date: 2020/11/25
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
    Cookie cookie1 = new Cookie("LastTime",sdf.format(new Date()));
    response.addCookie(cookie1);
    Cookie[] cookies=request.getCookies();
    Cookie cookie=CookieUtils.findCookie("LastTime",cookies);
    if(cookie!=null){
        cookie.setMaxAge(24*60*60);
        cookie.setDomain("localhost:80/");
        cookie.setPath("days1125/test02/getLastTime.jsp");
        out.println("LastTime:"+cookie.getValue());
        out.println("<br/>");
        out.println("IP:"+cookie.getDomain()+""+cookie.getPath());
    }else{
        out.println("无上一次cookie,请刷新");
        cookie=new Cookie("LastTime",sdf.format(new Date()));
    }

%>
</body>
</html>
