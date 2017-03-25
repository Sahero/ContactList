/**
 *ContactsDAOImpl.java
 *
 *@author Sagar Shrestha 
 **/
package com.sahero.contactinfo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sahero.contactinfo.entity.Contacts;

@Repository
public class ContactsDAOImpl implements ContactsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Contacts> getAllContacts() {
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// query ...sort by last name
		Query<Contacts> theQuery = currentSession.createQuery("from Contacts order by last_Name",Contacts.class);

		//get the list using the query 
		List<Contacts> contacts = theQuery.getResultList();

		return contacts;
	}

	@Override
	public void saveContacts(Contacts theContacts) {
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		//save the contact ...

		currentSession.saveOrUpdate(theContacts);

	}

	@Override
	public Contacts getContacts(int theId) {
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();


		//return the contact using the ID
		Contacts theContacts = currentSession.get(Contacts.class, theId);

		return theContacts;
	}

	@Override
	public void deleteContacts(int theId) {
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		//delete the contact
		Query theQuery = currentSession.createQuery("delete from Contacts where id=:contactsId");
		theQuery.setParameter("contactsId", theId);

		theQuery.executeUpdate();

	}

}
