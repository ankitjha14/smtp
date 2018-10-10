package com.smtp.smtp.controller;

import com.smtp.smtp.service.SslEmail;
import org.jsoup.Jsoup;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;


@RestController

public class SendMail {

    @GetMapping("/")
    public void send() {
        String content = null;
        StringBuilder contentBuilder = new StringBuilder();
        try {
            File file = new ClassPathResource("static/test.html").getFile();
            content = Jsoup.parse(file, "UTF-8").toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(content);
        SslEmail.send("uberkmkckbkc@gmail.com", content);

    }
}




