package com.dfrz.demo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/25 14:31
 * 描述:
 */
@WebServlet("GoodsServlet")
public class GoodsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String goodsName=req.getParameter("name");
        Cookie goodsNameCookie=CookieUtils.findCookie("goods",req.getCookies());
        if (goodsNameCookie == null){
            Cookie cookie=new Cookie("goods",goodsName);
            cookie.setMaxAge(3*24*60*60);
            resp.addCookie(cookie);
            return;
        }
        String goods=goodsNameCookie.getValue();
        if (goods!=null) {
            String[] arr=goods.split("&");
            Set<String> goodsSet=new LinkedHashSet<>(Arrays.asList(arr));
            goodsSet.add(goodsName);
            goods=goodsSet.toString();
            goods=goods.substring(1,goods.length()-1);
            goods=goods.replaceAll(",","&");

            System.out.println(goods);
        }else{
            goods=goodsName;
        }
        Cookie cookie=new Cookie("goods",goods);
        cookie.setMaxAge(3*24*60*60);
        resp.addCookie(cookie);
        resp.sendRedirect("/Day1123");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
