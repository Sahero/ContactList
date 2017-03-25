/**
*ContactController.java
*
*@author Sagar Shrestha 
**/
package com.sahero.contactinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sahero.contactinfo.service.ContactsService;
import com.sahero.contactinfo.entity.Contacts;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

	@Autowired
	private ContactsService contactsService;
	
	@GetMapping("/list")
	public String listAllContacts(Model theModel){
		//get contacts from the service
		List<Contacts> allContacts= contactsService.getAllContacts();
		
		//add the contacts to the model
		theModel.addAttribute("contacts",allContacts);
		return "list-contacts";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		
		//create model attribute to bind form data
		Contacts theContacts = new Contacts();
		theModel.addAttribute("contacts",theContacts);
		return "contacts-form";
	}
	
	@PostMapping("/saveContacts")
	public String saveContacts(@ModelAttribute("contacts") Contacts theContacts){
		//save the Contacts
		contactsService.saveContacts(theContacts);
		return "redirect:/contacts/list";
	}
	
	
	@GetMapping("showFormForUpdate")
	public String showFormForUpdate(@RequestParam("contactsId") int theId,
									Model theModel){
		//get the contacts from the database
		Contacts theContacts = contactsService.getContacts(theId);
		
		//set Contacts as a model attribute to prepopulate the form
		theModel.addAttribute("contacts",theContacts);
		
		//send over to our form
			
		return "contacts-form";									
	}
	
	@GetMapping("/delete")
	public String deleteContacts(@RequestParam("contactsId") int theId){
		//delete the Contacts
		contactsService.deleteContacts(theId);
		return "redirect:/contacts/list";
	}
	
}
