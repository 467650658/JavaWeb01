package day1125;

import sun.awt.SunHints;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Lihanqin
 * @Description
 * @date 2020-11-25 19:06
 **/
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie cookie=new Cookie("key1", "value2");
        //通知客户端保存cookie
        response.addCookie(cookie);
        response.getWriter().write("cookit创建成功");
    }
}
