package servlet;

import javax.servlet.*;
import java.io.IOException;

// Servlet:Service Applet
/*
其实Servlet就是JSP翻译之后的那个类
但是...
Servlet是一个类,而页面之间的跳转通过路径(URL)来走的!
它就需要具备类的基本特质,而且还需绑定一个URL来调用这个类
 */
// 第一种Servlet的实现方式
public class FirstServlet implements Servlet {
    // 第一次请求时执行
    public FirstServlet(){
        System.out.println("First构造器");
    }
    // 初始化方法
    // 第一次请求时执行
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("firstInit");
    }
    //获取config对象方法
    public ServletConfig getServletConfig() {
        return null;
    }
    // 关键方法,服务方法
    // 每一次请求时执行
    public void service(ServletRequest req, ServletResponse resp)
            throws ServletException, IOException {
        System.out.println("firstService");
    }
    // H获取Servlet信息方法
    public String getServletInfo() {
        return "first";
    }
    // 销毁方法 服务器关闭时执行
    public void destroy() {
        System.out.println("firstDestroy");
    }
}
/*
Servlet的生命周期：装载、初始化(创建、初始化)、服务和销毁
1.装载:在服务器启动时装载web.xml中配置的所有Servlet,所以tomcat也叫Servlet容器
2.初始化:第一次请求当前ServletURL时执行,并只执行一次
3.服务:每一次请求都会执行的内容,调用此方法时会传递request和response对象
4.销毁:服务器关闭时,执行的操作,一般销毁进行一些关闭操作
 */
