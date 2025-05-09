package com.quynhdv.springcore.config;

import com.quynhdv.springcore.EmailService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class AppConfig {
    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean
    @Scope("prototype")
    public EmailService prototypeEmailService(){
        return new EmailService();
    }
}
