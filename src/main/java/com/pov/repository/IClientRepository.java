package com.pov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pov.entities.Client;
@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {
	
	

}
