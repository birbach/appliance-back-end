package com.pov.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.Client;
import com.pov.entities.Contact;

@Repository
public interface IContactRepository  extends JpaRepository<Contact, Long>{
	
	public List<Contact> findByClient(Client client);

}
