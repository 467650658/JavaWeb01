package day1125;

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
 * @date 2020-11-25 19:47
 **/
@WebServlet("/BServlet")
public class BServlet extends HttpServlet {
    //获取客户请求中的cookie
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies=request.getCookies();
        if (cookies==null||cookies.length==0){
            Cookie cookie=CookieUtils.findCookie("id",cookies);
            response.getWriter().write("您的id是"+cookie.getValue());
        }
    }
}
