package com.quynhdv.springcore.annotation;

import org.springframework.stereotype.Component;

@Component("smsService ")
public class SMSService {
    public void sendMessage(String mail, String message) {
        System.out.println("Message is sending to " + mail + ": " + message);
    }
}
