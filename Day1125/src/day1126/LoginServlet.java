package day1126;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

/**
 * @author Lihanqin
 * @Description
 * @date 2020-11-26 9:47
 **/
@WebServlet("/day1126/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        String token= (String) request.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String code=request.getParameter("code");
        if (token!=null&&token.equalsIgnoreCase(code)){
        if ("admin".equals(username)&&"123456".equals(password)){
            User user=new User(username,password);
            HttpSession session=request.getSession();
            session.setAttribute("user",user);
            response.sendRedirect("/day1125/day1126/index1.jsp");
        }
        }else {
            response.getWriter().write("验证码输入错误！！！");
        }
    }
}
