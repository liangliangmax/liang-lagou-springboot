package com.liang.lagou.demo;


import com.liang.lagou.springboot.SpringApplication;
import org.apache.catalina.LifecycleException;

import javax.servlet.ServletException;


public class MyRunBoot {

    public static void main(String[] args) throws ServletException, LifecycleException {

        SpringApplication.run(MyRunBoot.class,args);
    }


}
