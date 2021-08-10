package com.liang.lagou.springboot;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletException;
import java.io.File;
import java.util.ServiceLoader;

public class SpringApplication {

    private static int port = 8080;
    private static String contextPath = "/";

    public static void run(Class configClass, String[] args) throws ServletException, LifecycleException {

        Tomcat tomcat = new Tomcat();
        String baseDir = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        tomcat.setBaseDir(baseDir);
        tomcat.setPort(port);
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(port);
        tomcat.setConnector(connector);

        tomcat.addWebapp(contextPath, baseDir);
        tomcat.enableNaming();
        //手动创建
        //tomcat.getConnector();
        tomcat.start();
        tomcat.getServer().await();


    }
}
