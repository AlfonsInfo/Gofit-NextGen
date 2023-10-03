package gofit;

import gofit.auth.service.EmailSenderService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class NextgenApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(NextgenApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail() throws MessagingException {
//		emailSenderService.sendEmail("alvonsus.setiawan@gmail.com",
//				"New Member Email"
//		, "<h1>Welcome new member!!!</h1>");
//	}
}
