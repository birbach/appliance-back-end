package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.ApplianceDto;

public interface IApplianceService {
	
	public List<ApplianceDto> allAppliance();
	public ApplianceDto getOneAppliance(Long id);
	public boolean addAppliance(ApplianceDto applianceDto);
	public boolean editAppliance(ApplianceDto applianceDto);
	public void deleteAppliance(Long id);
	
}
