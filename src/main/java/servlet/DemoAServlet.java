package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// Servlet能够显示一个页面
public class DemoAServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.print("<title>我的第一个Servlet显示页面</title>");
        out.println("</head>");
        out.println("<body>");
        out.print("<span style='color:red'>你好，中国！</span>");
        out.println("</body>");
        out.println("</html>");

    }
}
