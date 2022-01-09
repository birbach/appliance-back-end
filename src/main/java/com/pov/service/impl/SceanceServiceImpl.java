package com.pov.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pov.dtos.SceanceDto;
import com.pov.entities.Pov;
import com.pov.entities.Sceance;
import com.pov.mappers.SceanceMapper;
import com.pov.repository.ISceanceRepository;
import com.pov.service.interfaces.ISceanceService;

@Service
@Transactional
public class SceanceServiceImpl implements ISceanceService {
	@Autowired
	private ISceanceRepository sceanceRepository;

	@Autowired
	private SceanceMapper sceanceMapper;
	
	@Override
	public void deleteSceance(Long id) {
		// TODO Auto-generated method stub
		sceanceRepository.deleteById(id);
	}


	@Override
	public List<SceanceDto> allSceance() {
		List<Sceance> listSceances=sceanceRepository.findAll();
		List<SceanceDto> listSceanceDtos=new ArrayList<>(1);
		
		for(Sceance sceance:listSceances) {
			listSceanceDtos.add(sceanceMapper.toDto(sceance, new SceanceDto()));
		}
		return listSceanceDtos;
	}


	@Override
	public SceanceDto oneSceance(Long id) {
		
		Sceance sceance=sceanceRepository.getById(id);
		SceanceDto sceanceDto=sceanceMapper.toDto(sceance, new SceanceDto());
		return sceanceDto;
	}


	@Override
	public boolean addSceance(SceanceDto sceanceDto) {
		
		Sceance sceance=sceanceMapper.toDomain(new Sceance(), sceanceDto);
		sceanceRepository.save(sceance);
		return true;
	}


	@Override
	public boolean editSceance(SceanceDto sceanceDto) {
		Sceance sceance=sceanceMapper.toDomain(new Sceance(), sceanceDto);
		sceanceRepository.save(sceance);
		return true;
	}


	@Override
	public List<SceanceDto> detailSceance(Long idPov) {
		Pov pov=new Pov();
		pov.setId_pov(idPov);
		List<Sceance> listSceances=sceanceRepository.findByPov(pov);
		List<SceanceDto> listSceanceDtos=new ArrayList<SceanceDto>(1);
		for(Sceance sceance:listSceances) {
			listSceanceDtos.add(sceanceMapper.toDto(sceance, new SceanceDto()));
		}
		return listSceanceDtos;
	}

}
