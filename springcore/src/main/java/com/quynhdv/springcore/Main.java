package com.quynhdv.springcore;

import com.quynhdv.springcore.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService = beanFactory.getBean("emailService", EmailService.class);


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        EmailService emailService = applicationContext.getBean("emailService", EmailService.class);
        System.out.println("emailService: " + emailService);

        EmailService emailService2 = applicationContext.getBean("emailService", EmailService.class);
        System.out.println("emailService2: " + emailService2); // will the return the same values of emailService


        EmailService emailService3 = applicationContext.getBean("prototypeEmailService", EmailService.class);
        EmailService emailService4 = applicationContext.getBean("prototypeEmailService", EmailService.class);
        System.out.println("emailService3: " + emailService3);
        System.out.println("emailService4: " + emailService4);

    }
}
