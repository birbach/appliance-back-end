package com.pov.mappers;

import org.springframework.stereotype.Component;

import com.pov.dtos.ContactDto;
import com.pov.entities.Client;
import com.pov.entities.Contact;

@Component
public class ContactMapper {
	
	
	public ContactDto toDto(Contact contact,ContactDto contactDto){
		if(contactDto==null)
			contactDto=new ContactDto();
		contactDto.setId_contact(contact.getId_contact());
		contactDto.setNom(contact.getNom());
		contactDto.setPrenom(contact.getPrenom());
		contactDto.setTelephone(contact.getTelephone());
		contactDto.setFonction(contact.getFonction());
		contactDto.setEmail(contact.getEmail());
		if(contact.getClient() !=null) {
			contactDto.setId_client(contact.getClient().getId_client());
			contactDto.setLibelleClient(contact.getClient().getLibelleClient());
		}
		return contactDto;
	}
	
	public Contact toDomain(Contact contact,ContactDto contactDto){
		if(contact==null)
			contact=new Contact();
		contact.setId_contact(contactDto.getId_contact());
		contact.setNom(contactDto.getNom());
		contact.setPrenom(contactDto.getPrenom());
		contact.setTelephone(contactDto.getTelephone());
		contact.setFonction(contactDto.getFonction());
		contact.setEmail(contactDto.getEmail());
		
		if(contactDto.getId_client()!=null) {
			Client client=new Client();
			client.setId_client(contactDto.getId_client());
			
			contact.setClient(client);
		}
		
		return contact;
			
	}

}
