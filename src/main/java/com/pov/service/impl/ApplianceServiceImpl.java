package com.pov.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pov.dtos.ApplianceDto;
import com.pov.entities.Appliance;
import com.pov.mappers.ApplianceMapper;
import com.pov.repository.IApplianceRepository;
import com.pov.service.interfaces.IApplianceService;

@Service
@Transactional
public class ApplianceServiceImpl implements IApplianceService {
	@Autowired
	private IApplianceRepository applianceRepository;
	
	@Autowired
	private ApplianceMapper applianceMapper;

	@Override
	public List<ApplianceDto> allAppliance() {
		List<Appliance> list = applianceRepository.findAll();
		List<ApplianceDto> listApplianceDtos = new ArrayList<>(1);
		for(Appliance appliance : list) {
			listApplianceDtos.add(applianceMapper.toDto(appliance, new ApplianceDto()));
		}
		return listApplianceDtos;
	}

	@Override
	public boolean addAppliance(ApplianceDto applianceDto) {
		Appliance appliance = applianceMapper.toDomain(new Appliance(), applianceDto);
		applianceRepository.save(appliance);
		return true;
	}

	@Override
	public boolean editAppliance(ApplianceDto applianceDto) {
		Appliance appliance = applianceMapper.toDomain(new Appliance(), applianceDto);
		applianceRepository.save(appliance);
		return true;
	}

	@Override
	public void deleteAppliance(Long id) {
		applianceRepository.deleteById(id);
	}

	@Override
	public ApplianceDto getOneAppliance(Long id) {
		Appliance appliance = applianceRepository.getById(id);
		ApplianceDto applianceDto = applianceMapper.toDto(appliance, new ApplianceDto());
		return applianceDto;
	}

}
