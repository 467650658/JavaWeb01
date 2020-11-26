package dfrz.day1120.web;

import javax.servlet.*;
import java.io.IOException;

/**
 * 作者：HongSiDa
 *
 *
 * 日期: 2020/11/20 9:39
 * 描述:
 */
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("=======init=========");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hehe");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("******destroy**********");
    }
}
