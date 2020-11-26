package day1126;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 作者：HongSiDa
 * 日期: 2020/11/26 11:34
 * 描述:
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("对象被创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("对象被销毁");
    }
}
