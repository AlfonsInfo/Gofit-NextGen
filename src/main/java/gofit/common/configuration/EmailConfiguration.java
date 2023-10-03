//package gofit.common.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//
//import java.util.Properties;
//
//@Configuration
//public class EmailConfiguration {
//
//    @Bean
//    public JavaMailSender getJavaMailSender()
//    {
//        try{
//        JavaMailSenderImpl mailSender;
//            mailSender= new JavaMailSenderImpl();
//
//        mailSender.setHost("smtp.gmail.com");
//        mailSender.setPort(JavaMailSenderImpl.DEFAULT_PORT);
//
//        mailSender.setUsername("gofit-nextgen");
//        mailSender.setPassword("aejgiwolrsvaaicd");
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//        }catch (Exception e){
//            System.out.println("Error " + e.getMessage());
//        }
//        return null;
//    }
//}
