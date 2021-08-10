package com.liang.lagou.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TestController {

    @RequestMapping("/test")
    public void hello(HttpServletRequest servletRequest, HttpServletResponse servletResponse){


        try {
            servletResponse.getWriter().write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

}
