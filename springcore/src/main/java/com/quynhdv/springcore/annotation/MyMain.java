package com.quynhdv.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
        SMSService smsService = (SMSService) context.getBean("smsService");
        smsService.sendMessage("test@email.com", "hi");
    }
}
