/**
 *ContactsDAO.java
 *
 *@author Sagar Shrestha 
 **/
package com.sahero.contactinfo.DAO;

import java.util.List;

import com.sahero.contactinfo.entity.Contacts;

public interface ContactsDAO {
	
	public List<Contacts> getAllContacts();

	public void saveContacts(Contacts theContacts);

	public Contacts getContacts(int theId);

	public void deleteContacts(int theId);

}
