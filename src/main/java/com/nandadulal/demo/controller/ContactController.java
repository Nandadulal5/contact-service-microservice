package com.nandadulal.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandadulal.demo.model.Contact;
import com.nandadulal.demo.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService service;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") int userId){
		
		return this.service.getContacts(userId);
	}

}
