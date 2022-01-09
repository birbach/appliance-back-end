package com.pov.mappers;

import org.springframework.stereotype.Component;

import com.pov.dtos.ClientDto;
import com.pov.entities.Client;

@Component
public class ClientMapper {
	
	public ClientDto toDto(Client client,ClientDto clientDto) {
		if(clientDto==null)
			clientDto=new ClientDto();
		clientDto.setId_client(client.getId_client());
		clientDto.setLibelleClient(client.getLibelleClient());
		clientDto.setSecteur(client.getSecteur());
		clientDto.setActivite(client.getActivite());
		return clientDto;
	
	}
	
	public Client toDomain(Client client,ClientDto clientDto) {
		if(client==null)
			client =new Client();
		client.setId_client(clientDto.getId_client());
		client.setLibelleClient(clientDto.getLibelleClient());
		client.setSecteur(clientDto.getSecteur());
		client.setActivite(clientDto.getActivite());
		
		return client;
			
	}

}
