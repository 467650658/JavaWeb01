package com;

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
 * @author Lihanqin
 * @Description
 * @date 2020-11-25 11:34
 **/
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取浏览商品的值
        String goodName=request.getParameter("Name");
        Cookie goodCookie=CookieUtils.findCookie("goods",request.getCookies());
        //获取cookie中的值
        if(goodCookie==null){
            Cookie cookie=new Cookie("goods",goodName);
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);
            response.sendRedirect("/day1125/day1125/goodsList.jsp");
            return;
        }
        String goods=goodCookie.getValue();
        if(goods!=null){
            String[] arr=goods.split("&");
            Set<String> goodSet=new LinkedHashSet<String>(Arrays.asList(arr));
            goodSet.add(goodName);
            goods=goodSet.toString();
            goods=goods.substring(1,goods.length()-1);
            goods=goods.replaceAll(", ","&");

        }else{
            goods=goodName;
        }
        Cookie cookie=new Cookie("goods",goods);
//        cookie.setMaxAge(60*60);
        response.addCookie(cookie);
        response.sendRedirect("/day1125/day1125/goodsList.jsp");

    }
}
