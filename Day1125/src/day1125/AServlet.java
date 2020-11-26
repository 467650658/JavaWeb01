package day1125;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Lihanqin
 * @Description
 * @date 2020-11-25 19:42
 **/
@WebServlet(name = "AddcookieServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html;charset=utf-8");
         String id= UUID.randomUUID().toString();
         //生成随机的字符串
        Cookie cookie=new Cookie("id",id);
        //在响应中添加cookie对象
        response.addCookie(cookie);
        response.getWriter().write("我已经向你发送了");
    }
}
