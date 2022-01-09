package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.SuiviDto;

public interface ISuiviService {
	
	public List<SuiviDto> allSuivi();
	public SuiviDto oneSuivi(Long id);
	public boolean addSuivi(SuiviDto suiviDto);
	public boolean editSuivi(SuiviDto suiviDto);
	public void deleteSuivi(Long id);

}
