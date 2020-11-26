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
 * @date 2020-11-25 19:14
 **/
@WebServlet("/GetCookitServlet")
public class GetCookitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Cookie[] cookies=request.getCookies();
        for(Cookie cookie:cookies){
            response.getWriter().write("cookie["+cookie.getName()+"="+cookie.getValue()+"]");
        }
        Cookie cookie=CookieUtils.findCookie("key1",cookies);
        if (cookie!=null){
            response.getWriter().write(cookie.toString());
        }
    }
}
