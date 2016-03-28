package com.summitworks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.summitworks.mappers.ContactMapper;
import com.summitworks.model.Contact;
import com.summitworks.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ContactMapper contactMapper;
	
	@Transactional
	public List<Contact> listContactByMybatis() {
		return contactMapper.selectContactList("");
	}
	
	@Transactional
	public void addContact(Contact contact) {
		contactRepository.addContact(contact);
	}

	@Transactional
	public List<Contact> listContact() {

		return contactRepository.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactRepository.removeContact(id);
	}
}
