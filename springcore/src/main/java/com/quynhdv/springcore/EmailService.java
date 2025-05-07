package com.quynhdv.springcore;

public class EmailService {
    public void sendMessage(String receiver, String message) {
        System.out.println(message + " is being sent to " + receiver);
    }
}
