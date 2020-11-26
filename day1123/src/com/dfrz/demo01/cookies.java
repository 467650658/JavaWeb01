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
 * 日期: 2020/11/25 9:30
 * 描述:
 */
@WebServlet("/createCookie")
public class cookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        Cookie cookie=new Cookie("key1","value1");
        resp.addCookie(cookie);
        resp.getWriter().print("Cookie创建成功");
    }
}
