package dfrz.Day1121;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/21 10:31
 * 描述:
 */
@WebServlet("/requestTestServlet")
public class RequestTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("getContentLength"+request.getContentLength());
        System.out.println("getContentLength"+request.getContentType());
        System.out.println("getContextPath"+request.getContextPath());
        System.out.println("getMethod"+request.getMethod());
        System.out.println("getLocale"+request.getLocale());
        System.out.println("getQueryString"+request.getQueryString());
        System.out.println("getRequestURL"+request.getRequestURL());
        System.out.println("getRequestURI"+request.getRequestURI());
        System.out.println("getServletPath"+request.getServletPath());
        System.out.println("getRequestURL"+request.getRequestURL());
        System.out.println("getRequestURI"+request.getRequestURI());
        System.out.println("getServletPath"+request.getServletPath());
        System.out.println("getRemoteAddr"+request.getRemoteAddr());
        System.out.println("getRemoteHost"+request.getRemoteHost());
        System.out.println("getContentLength"+request.getRemotePort());
        System.out.println("getContentLength"+request.getScheme());
        System.out.println("getContentLength"+request.getServerName());
        System.out.println("getContentLength"+request.getScheme());
    }
}
