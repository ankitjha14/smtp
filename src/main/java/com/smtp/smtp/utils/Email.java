package com.smtp.smtp.utils;

import com.smtp.smtp.utils.EmailUtil;

import javax.mail.Session;
import java.util.Properties;

public class Email {

    public static void send() {

        System.out.println("SimpleEmail Start");

        String smtpHostServer = "smtp.example.com";
        String emailID = "email_me@example.com";

        Properties props = System.getProperties();

        props.put("mail.smtp.host", smtpHostServer);

        Session session = Session.getInstance(props, null);

        EmailUtil.sendEmail(session, emailID,"SimpleEmail Testing Subject", "SimpleEmail Testing Body");
    }

}