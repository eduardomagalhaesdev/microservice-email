package com.spring.ms.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ms.dto.EmailDto;
import com.spring.ms.model.EmailModel;
import com.spring.ms.service.EmailService; 

@RestController
public class EmailController {

	@Autowired
	EmailService emailService;
	
	@PostMapping("/sending-email")
	public ResponseEntity<EmailModel> sendEmail(@RequestBody @Valid EmailDto emailDto){
		
		EmailModel email = new EmailModel();
		BeanUtils.copyProperties(emailDto, email);//(convertido de, convertido para)
		emailService.sendEmail(email);
		
		return new ResponseEntity<>(email, HttpStatus.CREATED);
	}
	
}
