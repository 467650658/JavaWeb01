package day1126;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Lihanqin
 * @Description
 * @date 2020-11-26 9:13
 **/
@WebServlet("/day1126/Dome01Servlet")
public class Dome01Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        //判断是否刚创建
        System.out.println("是否为新建"+session.isNew());
        System.out.println("id为"+session.getId());
        session.setAttribute("suerName","张三");
        //值为正数是超时时间；负数表示永不超时
        //负数极少使用
        //以秒为单位/默认30分钟
        session.setMaxInactiveInterval(60*60);
        //获取超时时间
        System.out.println(session.getMaxInactiveInterval());

        //让当前会话马上无效
        session.invalidate();
    }
}
