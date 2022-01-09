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

import com.pov.dtos.TypePrestationDto;
import com.pov.service.interfaces.ITypePrestationService;

@RestController
@RequestMapping("/api/v1/")
public class TypePrestationController {
	@Autowired
	private ITypePrestationService prestationService;
	
	@GetMapping("/typePrestations")
	public List<TypePrestationDto> listTypePrestation(){
		return prestationService.allTypePrestations();
	}
	
	@GetMapping("/typePrestations/{id}")
	public TypePrestationDto getOneTypePrestation(@PathVariable Long id) {
		return prestationService.oneTypePrestation(id);
	}
	@PostMapping("/typePrestations/add")
	public boolean createTypePrestation(@RequestBody TypePrestationDto typePrestationDto) {
		return prestationService.addTypePrestation(typePrestationDto);
	}
	@PutMapping("/typePrestations/update")
	public boolean updateTypePrestation(@RequestBody TypePrestationDto typePrestationDto) {
		return prestationService.editTypePrestation(typePrestationDto);
	}
	@DeleteMapping("/typePrestations/{id}")
	public boolean deleteTypePrestation(@PathVariable Long id) {
		prestationService.deleteTypePrestation(id);
		return true;
	}
}
