package gofit.auth.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.apache.kafka.common.utils.Java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class EmailSenderService {


    private JavaMailSender mailSender;

    @Autowired
    public EmailSenderService(JavaMailSender mailSender)
    {
        this.mailSender = mailSender;
    }
    public void sendEmail(String toEmail,
                          String toSubject,
                          String body) throws MessagingException, UnsupportedEncodingException {
//        SimpleMailMessage message = new SimpleMailMessage();
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper  message =new MimeMessageHelper(mimeMessage,true);
        message.setFrom("donotreply@mydomain.com", "Admin");
        message.setTo(toEmail);
        message.setText(body,true);
        message.setSubject(toSubject);

        mailSender.send(mimeMessage);
        System.out.println("Mail Send Succesfully");
    }
}
