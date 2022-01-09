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

import com.pov.dtos.SuiviDto;
import com.pov.service.interfaces.ISuiviService;

@RestController
@RequestMapping("/api/v1/")
public class SuiviController {
	@Autowired
	private ISuiviService suiviService;
	
	@GetMapping("/suivis")
	public List<SuiviDto> listSuivis(){
		return suiviService.allSuivi();
	}
	@GetMapping("/suivis/{id}")
	public SuiviDto getOneSuivi(@PathVariable Long id) {
		return suiviService.oneSuivi(id);
	}
	@PostMapping("/suivis/add")
	public boolean addSuivi(@RequestBody SuiviDto suiviDto) {
		return suiviService.addSuivi(suiviDto);
	}
	@PutMapping("/suivis/update")
	public boolean updateSuivi(@RequestBody SuiviDto suiviDto) {
		return suiviService.editSuivi(suiviDto);
	}
	@DeleteMapping("/suivis/{id}")
	public boolean deleteSuivi(@PathVariable Long id) {
		suiviService.deleteSuivi(id);
		return true;
	}
}
