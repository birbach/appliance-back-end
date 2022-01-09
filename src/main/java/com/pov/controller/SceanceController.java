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

import com.pov.dtos.SceanceDto;
import com.pov.service.interfaces.ISceanceService;

@RestController
@RequestMapping("/api/v1/")
public class SceanceController {
	@Autowired
	private ISceanceService sceanceService;
	
	@GetMapping("/sceances")
	public List<SceanceDto> listSceance(){
	return	sceanceService.allSceance();
	}
	
	@GetMapping("/sceances/{id}")
	public SceanceDto getOneSceance(@PathVariable Long id) {
		return sceanceService.oneSceance(id);
	}
	
	@PostMapping("/sceances/add")
	public boolean createSceance(@RequestBody SceanceDto sceanceDto) {
		return sceanceService.addSceance(sceanceDto);
	}
	
	@PutMapping("/sceances/update")
	public boolean updateSceance(@RequestBody SceanceDto sceanceDto) {
		return sceanceService.editSceance(sceanceDto);
	}
	@DeleteMapping("/sceances/{id}")
	public boolean deleteSceance(@PathVariable Long id) {
		sceanceService.deleteSceance(id);
		return true;
	}
	@GetMapping("/sceances/detail/{id}")
	public List<SceanceDto> detailSceance(@PathVariable("id") Long idPov){
		return sceanceService.detailSceance(idPov);
	}
}
