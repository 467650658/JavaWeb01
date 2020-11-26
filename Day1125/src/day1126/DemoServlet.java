package day1126;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/26 9:12
 * 描述:
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        System.out.println("Session是否为新建:"+session.isNew());
        System.out.println("SessionId:"+session.getId());
        session.setAttribute("username","张三");
        //设置session超时时间，负数为永不超时(极少使用)，单位秒
        session.setMaxInactiveInterval(60*60);
        //获取session的超时时间
        System.out.println(session.getMaxInactiveInterval());
        //让session立即超时
        session.invalidate();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
