package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.ClientDto;

public interface IClientService {
	
	public List<ClientDto> allClient();
	public ClientDto oneClient(Long id);
	public boolean addClient(ClientDto clientDto);
	public boolean editClient(ClientDto clientDto);
	public void deleteClient(Long id);
	
}
