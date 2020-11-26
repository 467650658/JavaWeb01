package dfrz.Day1121;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/21 10:39
 * 描述:
 */
@WebServlet("Demo01Servlet")
public class Demo01Servlet extends HttpServlet {
    List<String> banndIP=new ArrayList<>(10);

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        banndIP.add("");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String ip=request.getRemoteAddr();
        System.out.println(ip);
        if (banndIP.contains(ip)){
            response.getWriter().println("ip已被禁止");

        }else {
            response.getWriter().println("爬");
        }
    }
}
