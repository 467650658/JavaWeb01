package day1126;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Lihanqin
 * @Description
 * @date 2020-11-26 10:24
 **/
@WebServlet("/day1126/Login2Servlet")
public class Login2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //销毁session中用户登录的信息
        request.getSession().invalidate();
        //重定到首页
        response.sendRedirect("/day1125/day1126/login.jsp");
    }
}
