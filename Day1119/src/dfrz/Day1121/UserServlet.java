package dfrz.Day1121;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/21 9:23
 * 描述:
 */
@WebServlet("/loginServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        getServletContext().setAttribute("count",0);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("用户名="+username);
        System.out.println("用户名="+password);
        int count= (int) getServletContext().getAttribute("count");
        count++;
        getServletContext().setAttribute("count",count);
        PrintWriter out = response.getWriter();
        if ("admin".equals(username) && "123".equals(password)){
            out.println(username+"登陆成功");
            out.println("您是第"+count+"登陆的");
        }else {
            out.println("登陆失败");
        }






    }
}
