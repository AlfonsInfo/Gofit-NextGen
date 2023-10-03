package gofit.nextgen;


import gofit.auth.service.EmailSenderService;

import jakarta.mail.MessagingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
public class EmailSenderServiceTesting {

    @Autowired
    private EmailSenderService emailSenderService;

    @Autowired
    private JavaMailSender javaMailSender; // Inject the configured JavaMailSender

    @Test
    public void sendEmail() throws MessagingException {
        emailSenderService.sendEmail("alvonsus.setiawan@gmail.com",
                "New Member Email",
                "<html><body><h1>Welcome new member!!!</h1></body></html>");
    }
}





