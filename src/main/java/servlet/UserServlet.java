package servlet;

import bean.UserInfo;
import biz.UserBiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class UserServlet extends HttpServlet {
    private UserBiz ub = new UserBiz();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 接收请求：我需要用户信息
        List<UserInfo> list = ub.findAllUser();
        HttpSession session = request.getSession();
        session.setAttribute("USER_LIST",list);
        // 做出响应
        response.sendRedirect("index.jsp");
    }
}
