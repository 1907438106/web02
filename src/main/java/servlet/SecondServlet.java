package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

// 第二种Servlet实现方法
public class SecondServlet extends GenericServlet {

    public void service(ServletRequest req, ServletResponse resp)
            throws ServletException, IOException {
        System.out.println("第二种Servlet的实现方法");
    }
}
