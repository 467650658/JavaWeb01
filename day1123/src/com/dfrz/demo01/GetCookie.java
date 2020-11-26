package com.dfrz.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/25 9:53
 * 描述:
 */@WebServlet("/getCookie")
public class GetCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        Cookie[] cookies=req.getCookies();
        for (Cookie cookie :
                cookies) {
            resp.getWriter().print("cookie" + cookie.getName() + "=" + cookie.getValue());
        }

    }
}
