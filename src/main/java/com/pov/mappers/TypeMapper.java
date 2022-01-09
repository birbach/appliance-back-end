package com.pov.mappers;

import org.springframework.stereotype.Component;

import com.pov.dtos.TypeDto;
import com.pov.entities.Type;

@Component
public class TypeMapper {

	public TypeDto toDto(Type type,TypeDto typeDto) {
		if(typeDto == null)
			typeDto = new TypeDto();
		typeDto.setId_type(type.getId_type());
		typeDto.setLibelleType(type.getLibelleType());
		return typeDto;
	}
	
	public Type toDomain(Type type,TypeDto typeDto) {
		if(type == null)
			type = new Type();
		type.setId_type(typeDto.getId_type());
		type.setLibelleType(typeDto.getLibelleType());
		return type;
	}
}
