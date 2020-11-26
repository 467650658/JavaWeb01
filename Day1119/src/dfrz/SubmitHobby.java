package dfrz;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/20 20:31
 * 描述:
 */
@WebServlet("/submitHobby")
public class SubmitHobby extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName= request.getParameter("username");
        String passWord= request.getParameter("password");
        String [] hobby= request.getParameterValues("hobby");
        System.out.println(userName);
        System.out.println(passWord);
        System.out.println(Arrays.asList(hobby));

    }


}
