/**
*ContactsServiceImpl.java
*
*@author Sagar Shrestha 
**/
package com.sahero.contactinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sahero.contactinfo.DAO.ContactsDAO;
import com.sahero.contactinfo.entity.Contacts;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsDAO contactsDAO;

	@Override
	@Transactional
	public List<Contacts> getAllContacts() {
		return contactsDAO.getAllContacts();
	}

	@Override
	@Transactional
	public void saveContacts(Contacts theContacts) {
		contactsDAO.saveContacts(theContacts);

	}

	@Override
	@Transactional
	public Contacts getContacts(int theId) {
		return contactsDAO.getContacts(theId);
	}

	@Override
	@Transactional
	public void deleteContacts(int theId) {
		contactsDAO.deleteContacts(theId);

	}

}
