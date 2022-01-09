package com.pov.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pov.dtos.ContactDto;
import com.pov.service.interfaces.IContactService;
@RestController
@RequestMapping("/api/v1/")
public class ContactController {
	@Autowired
	private IContactService contactService;

	@GetMapping("/contacts")
	public List<ContactDto> listContacts(){
		return contactService.allContact(); 
	}
	
	@GetMapping("/contacts/{id}")
	public ContactDto getOneContact(@PathVariable Long id) {
		return contactService.oneContact(id);
	}
	@PostMapping("/contacts/add")
	public boolean addContact(@RequestBody ContactDto contactDto) {
		return contactService.addContact(contactDto);
	}
	@PutMapping("/contacts/update")
	public boolean updateContact(@RequestBody ContactDto contactDto) {
		return contactService.editContact(contactDto);
	}
	@DeleteMapping("/contacts/{id}")
	public boolean deleteContact(@PathVariable Long id) {
		contactService.deleteContact(id);
		return true;
	}
	@GetMapping("/contacts/detail/{id}")
	public List<ContactDto> detailContact(@PathVariable("id") Long idClient){
		return contactService.detailContact(idClient);
	}
}
