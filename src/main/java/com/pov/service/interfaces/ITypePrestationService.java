package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.TypePrestationDto;

public interface ITypePrestationService {

	public List<TypePrestationDto> allTypePrestations();
	public TypePrestationDto oneTypePrestation(Long id);
	public boolean addTypePrestation(TypePrestationDto typePrestationDto);
	public boolean editTypePrestation(TypePrestationDto typePrestationDto);
	public void deleteTypePrestation(Long id);
}
