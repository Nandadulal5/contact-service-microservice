package com.nandadulal.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nandadulal.demo.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	// create fake list of user
	List<Contact> list = Arrays.asList(new Contact(1001,"ravi","ravi@gmail.com",101),
			                           new Contact(1002,"pavan","pavan@gmail.com",101),
			                           new Contact(1003,"paresh","paresh@gmail.com",102));
	@Override
	public List<Contact> getContacts(int userId) {
		// TODO Auto-generated method stub
		//return list.stream().filter(contact->contact.getUserId()==userId).collect(Collectors.toList());
		
		List<Contact> contacts = new ArrayList<>();
		
		for(Contact con : list) {
			if(con.getUserId()==userId) {
				contacts.add(con);
			}
		}
		return contacts;
	}

}
