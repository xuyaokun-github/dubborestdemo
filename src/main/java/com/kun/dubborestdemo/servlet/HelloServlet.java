package com.kun.dubborestdemo.servlet;

import com.kun.dubborestdemo.service.DemoService;
import com.kun.dubborestdemo.util.SpringContextUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello kunghsu!!!!!");

        DemoService demoService =  SpringContextUtil.getBean("DemoService");
        demoService.show();

        resp.getWriter().write("hello kunghsu!!!!!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}
