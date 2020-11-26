package com.dfrz.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/25 18:41
 * 描述:
 */
@WebServlet("/DateCookie")
public class DateCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月ddHH:mm:ss");
        String dateStr=simpleDateFormat.format(new Date());
        Cookie cookie=new Cookie("lastTime",dateStr);
        cookie.setMaxAge(1*60*60);
        response.addCookie(cookie);

        Cookie [] cookies=request.getCookies();
        Cookie cookie1=CookieUtils.findCookie("lastTime",cookies);
        String s="您是首次访问网站";
        if (cookie1 != null){
            s=cookie1.getValue();
        }
        response.getWriter().print(s);
    }
}
