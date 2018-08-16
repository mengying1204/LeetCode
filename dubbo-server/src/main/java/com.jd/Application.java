package com.jd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo.xml"});
        context.start();
        System.out.println("任意按键退出");
        System.in.read();
        context.close();

    }
}
