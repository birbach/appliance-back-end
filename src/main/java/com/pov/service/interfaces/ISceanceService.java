package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.SceanceDto;

public interface ISceanceService {
	
	public List<SceanceDto> allSceance();
	public SceanceDto oneSceance(Long id);
	public boolean addSceance(SceanceDto sceanceDto);
	public boolean editSceance(SceanceDto sceanceDto);
	public void deleteSceance(Long id);
	public List<SceanceDto> detailSceance(Long idPov);
	
}
