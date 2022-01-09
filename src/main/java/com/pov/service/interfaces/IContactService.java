package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.ContactDto;

public interface IContactService {

	public List<ContactDto> allContact();
	public ContactDto oneContact(Long id);
	public boolean addContact(ContactDto contactDto);
	public boolean editContact(ContactDto contactDto);
	public void deleteContact(Long id);
	public List<ContactDto> detailContact(Long idClient);
}
