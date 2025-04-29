package org.example.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class
MailApplication {
@Autowired
private JavaMailSender mailSender;

    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("rp95018089@gmail.com");
        message.setSubject("Request to attend classes");
        message.setText("Please give me tutionss Sarr !!!");
        message.setFrom("himaaanshiii30@gmail.com"); // Optional but recommended

        mailSender.send(message);
    }


}
