package day1125;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lihanqin
 * @Description
 * @date 2020-11-25 20:14
 **/
@WebServlet("/Dome01Servlet")
public class Dome01Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        Cookie cookie1 = new Cookie("LastTime",sdf.format(new Date()));
        response.addCookie(cookie1);
        Cookie[] cookies=request.getCookies();
        Cookie cookie=CookieUtils.findCookie("LastTime",cookies);
        cookie.setMaxAge(24*60*60);
        cookie.setDomain("localhost:80/");
        PrintWriter out1=response.getWriter();
        String s="第一次访问";
        if(cookie!=null){
            out1.println("LastTime:"+cookie.getValue());
            out1.println("IP:"+cookie.getDomain()+""+cookie.getPath());

        }else{
            out1.println(s);

        }

    }
}
