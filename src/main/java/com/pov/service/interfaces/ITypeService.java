package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.TypeDto;

public interface ITypeService {

	public List<TypeDto> allTypes();
	public TypeDto oneType(Long id);
	public boolean addType(TypeDto typeDto);
	public boolean editType(TypeDto typeDto);
	public void deleteType(Long id);
}
