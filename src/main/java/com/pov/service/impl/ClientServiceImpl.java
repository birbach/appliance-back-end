package com.pov.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pov.dtos.ClientDto;
import com.pov.entities.Client;
import com.pov.mappers.ClientMapper;
import com.pov.repository.IClientRepository;
import com.pov.service.interfaces.IClientService;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {
	@Autowired
	private IClientRepository clientRepository;
	
	@Autowired
	private ClientMapper clientMapper;
	
	

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(id);
	}



	@Override
	public List<ClientDto> allClient() {
		List<Client> listClients=clientRepository.findAll();
		List<ClientDto> listClientDtos=new ArrayList<>(1);
		for(Client client:listClients) {
			listClientDtos.add(clientMapper.toDto(client, new ClientDto()));
		}
		return listClientDtos;
	}



	@Override
	public ClientDto oneClient(Long id) {
		Client client=clientRepository.getById(id);
		ClientDto clientDto=clientMapper.toDto(client, new ClientDto());
		return clientDto;
	}



	@Override
	public boolean addClient(ClientDto clientDto) {
		Client client=clientMapper.toDomain(new Client(), clientDto);
		clientRepository.save(client);
		return true;
	}



	@Override
	public boolean editClient(ClientDto clientDto) {
		Client client=clientMapper.toDomain(new Client(), clientDto);
		clientRepository.save(client);
		return true;
	}



	
}
