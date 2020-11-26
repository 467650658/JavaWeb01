package dfrz.day1120.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/20 10:34
 * 描述:
 */
public class Myservlet1 extends HttpServlet {
    public Myservlet1() {
        System.out.println("1.无参构造函数被调用");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("使用了dopost");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("2.init初始化方法");
        System.out.println("helloservlet2的别名是"+config.getServletName());
        System.out.println("初始化参数username的值是"+config.getInitParameter("username"));
        System.out.println("初始化参数url的值是"+config.getInitParameter("url"));
        System.out.println(config.getServletContext());
    }

}
