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

import com.pov.dtos.ClientDto;
import com.pov.service.interfaces.IClientService;

@RestController
@RequestMapping("/api/v1/")
public class ClientController {
	@Autowired
	private IClientService clientService;
	
	@GetMapping("/clients")
	public List<ClientDto> listClients(){
		return clientService.allClient();
	}
	
	@PostMapping("/clients/add")
	public boolean createClient(@RequestBody ClientDto clientDto) {
		return clientService.addClient(clientDto);
	}
	
	@GetMapping("/clients/{id}")
	public ClientDto getOneClient(@PathVariable Long id) {
		return clientService.oneClient(id);
	}
	
	@DeleteMapping("/clients/{id}")
	public boolean deleteClient(@PathVariable Long id) {
		clientService.deleteClient(id);
		return true;
	}
	
	
	@PutMapping("/clients/update")
	public boolean updateClient(@RequestBody ClientDto clientDto) {
		return clientService.editClient(clientDto);
	}
	
}
