package code.explore.controllers;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet{
    public HelloServlet(){
        System.out.println("construct...");
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("inti...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
