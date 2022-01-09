package com.pov.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pov.dtos.ContactDto;
import com.pov.entities.Client;
import com.pov.entities.Contact;
import com.pov.mappers.ContactMapper;
import com.pov.repository.IContactRepository;
import com.pov.service.interfaces.IContactService;
@Service
@Transactional
public class ContactServiceImpl implements IContactService {
	@Autowired
	private IContactRepository contactRepository;
	
	@Autowired
	private ContactMapper contactMapper;
	
	@Override
	public void deleteContact(Long id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
	}


	@Override
	public List<ContactDto> allContact() {
		List<Contact> listContacts=contactRepository.findAll();
		List<ContactDto> listContactDtos=new ArrayList<>(1);
		
		for(Contact contact:listContacts) {
			listContactDtos.add(contactMapper.toDto(contact, new ContactDto()));
		}
		
		return listContactDtos;
	}


	@Override
	public ContactDto oneContact(Long id) {
		Contact contact=contactRepository.getById(id);
		ContactDto contactDto=contactMapper.toDto(contact, new ContactDto());
		return contactDto;
	}


	@Override
	public boolean addContact(ContactDto contactDto) {
		Contact contact=contactMapper.toDomain(new Contact(), contactDto);
		contactRepository.save(contact);
		return true;
	}


	@Override
	public boolean editContact(ContactDto contactDto) {
		Contact contact=contactMapper.toDomain(new Contact(), contactDto);
		contactRepository.save(contact);
		return true;
	}


	@Override
	public List<ContactDto> detailContact(Long idClient) {
		Client client=new Client();
		client.setId_client(idClient);
		List<Contact> list=contactRepository.findByClient(client);
		List<ContactDto> listContactDtos =new ArrayList<ContactDto>(1);
		for(Contact contact:list) {
			listContactDtos.add(contactMapper.toDto(contact, new ContactDto()));
			
		}
		return listContactDtos;
	}

}
