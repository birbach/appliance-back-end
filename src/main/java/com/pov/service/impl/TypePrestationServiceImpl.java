package com.pov.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pov.dtos.TypePrestationDto;
import com.pov.entities.TypePrestation;
import com.pov.mappers.TypePrestationMapper;
import com.pov.repository.ITypePrestationRepository;
import com.pov.service.interfaces.ITypePrestationService;
@Service
@Transactional
public class TypePrestationServiceImpl implements ITypePrestationService {

	@Autowired
	private ITypePrestationRepository typePrestationRepository;
	@Autowired
	private TypePrestationMapper typePrestationMapper;
	
	
	@Override
	public void deleteTypePrestation(Long id) {
		
		typePrestationRepository.deleteById(id);
		
	}


	@Override
	public List<TypePrestationDto> allTypePrestations() {
		
		List<TypePrestation> listTypePrestations=typePrestationRepository.findAll();
		List<TypePrestationDto> listTypePrestationDtos=new ArrayList<>(1);
		
		for(TypePrestation typePrestation:listTypePrestations) {
			listTypePrestationDtos.add(typePrestationMapper.toDto(new TypePrestationDto(), typePrestation));
		}
		
		return listTypePrestationDtos;
	}


	@Override
	public TypePrestationDto oneTypePrestation(Long id) {
		TypePrestation typePrestation=typePrestationRepository.getById(id);
		TypePrestationDto typePrestationDto=typePrestationMapper.toDto(new TypePrestationDto(), typePrestation);
		return typePrestationDto;
	}


	@Override
	public boolean addTypePrestation(TypePrestationDto typePrestationDto) {
		TypePrestation typePrestation=typePrestationMapper.toDomain(typePrestationDto, new TypePrestation());
		typePrestationRepository.save(typePrestation);
		return true;
	}


	@Override
	public boolean editTypePrestation(TypePrestationDto typePrestationDto) {
		TypePrestation typePrestation=typePrestationMapper.toDomain(typePrestationDto, new TypePrestation());
		typePrestationRepository.save(typePrestation);
		return true;
	}

}
