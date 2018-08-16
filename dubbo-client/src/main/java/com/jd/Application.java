package com.jd;

import com.jd.service.ElasticService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo.xml"});
        context.start();
        ElasticService service = (ElasticService) context.getBean("elasticService");
        System.out.println(service.helloDubbo("world"));
        context.close();
    }
}
