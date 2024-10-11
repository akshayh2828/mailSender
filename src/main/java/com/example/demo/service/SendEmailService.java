package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService
{
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("$(spring.mail.username)")
	private String fromEmailId;
	
	public void sendEmail(String recipient,String body,String subject)
	{
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setFrom(fromEmailId);
		mailMessage.setTo("avikanjalkar335@gmail.com");
		mailMessage.setTo("ajinkyamohale@gmail.com");
		mailMessage.setText(body);
		mailMessage.setSubject(subject);
		
		
		javaMailSender.send(mailMessage);
	}
	
	
	

}

