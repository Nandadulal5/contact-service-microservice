package com.nandadulal.demo.service;

import java.util.List;

import com.nandadulal.demo.model.Contact;

public interface ContactService {
	
	List<Contact> getContacts(int userId);

}
