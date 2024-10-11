package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SendEmailService;

@RestController
public class EmailController {
	@Autowired
	private SendEmailService sendEmailService;
	@GetMapping("sendEmail")
	public String sendEmail()
	{
		sendEmailService.sendEmail("avikanjalkar335@gmail.com","Avinash,Ajinkya", "Subject Tested");
		return "sent successfully";
	}

}
