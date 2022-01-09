package com.pov.mappers;

import org.springframework.stereotype.Component;

import com.pov.dtos.ApplianceDto;
import com.pov.entities.Appliance;
import com.pov.entities.Type;

@Component
public class ApplianceMapper {

	
	
	public ApplianceDto toDto(Appliance appliance,ApplianceDto applianceDto) {
		if(applianceDto == null)
			applianceDto = new ApplianceDto();
		applianceDto.setDbid(appliance.getDbid());
		applianceDto.setDisponibilitte(appliance.getDisponibilitte());
		applianceDto.setId_appliance(appliance.getId_appliance());
		applianceDto.setLibelleApplliance(appliance.getLibelleApplliance());
		applianceDto.setReference(appliance.getReference());
		
		
		if(appliance.getType() != null) {
			applianceDto.setId_type(appliance.getType().getId_type());
			applianceDto.setLibelleType(appliance.getType().getLibelleType());
		}	
		return applianceDto;
	}
	
	public Appliance toDomain(Appliance appliance,ApplianceDto applianceDto) {
		if(appliance == null)
			appliance = new Appliance();
		appliance.setDbid(applianceDto.getDbid());
		appliance.setDisponibilitte(applianceDto.getDisponibilitte());
		appliance.setId_appliance(applianceDto.getId_appliance());
		appliance.setLibelleApplliance(applianceDto.getLibelleApplliance());
		appliance.setReference(applianceDto.getReference());
		
		if(applianceDto.getId_type() != null) {
			Type type=new Type();
			type.setId_type(applianceDto.getId_type());
			
			appliance.setType(type);
		}
		return appliance;
	}
}
