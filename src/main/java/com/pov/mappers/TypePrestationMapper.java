package com.pov.mappers;

import org.springframework.stereotype.Component;

import com.pov.dtos.TypePrestationDto;
import com.pov.entities.TypePrestation;

@Component
public class TypePrestationMapper {
	
	
	public TypePrestationDto toDto(TypePrestationDto typePrestationDto,TypePrestation typePrestation) {
		if(typePrestationDto==null)
			typePrestationDto=new TypePrestationDto();
		typePrestationDto.setId_perstation(typePrestation.getId_perstation());
		typePrestationDto.setLibellePerstation(typePrestation.getLibellePerstation());
		return typePrestationDto;
	}

	public TypePrestation toDomain(TypePrestationDto typePrestationDto,TypePrestation typePrestation) {
	
		if(typePrestation==null)
			typePrestation =new TypePrestation();
		typePrestation.setId_perstation(typePrestationDto.getId_perstation());
		typePrestation.setLibellePerstation(typePrestationDto.getLibellePerstation());
		
		return typePrestation;
	}
}
