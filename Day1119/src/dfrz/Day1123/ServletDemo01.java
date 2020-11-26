package dfrz.Day1123;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/23 9:47
 * 描述:
 */
public class ServletDemo01 extends HttpServlet {
    List<User> users;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        users =new ArrayList<>(5);
        users.add(new User(1,"张三"));
        users.add(new User(2,"张三"));
        users.add(new User(3,"张三"));
        users.add(new User(4,"张三"));
        users.add(new User(5,"张三"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("users",users);
    req.getRequestDispatcher("/userList.jsp").forward(req,resp);
    }
}
