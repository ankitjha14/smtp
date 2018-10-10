package com.smtp.smtp.controller;

import com.smtp.smtp.service.SslEmail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SendMail {
    @GetMapping("/")
    public void send() {
        SslEmail.send();

    }
}




