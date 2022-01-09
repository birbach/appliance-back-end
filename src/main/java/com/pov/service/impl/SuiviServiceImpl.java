package com.pov.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pov.dtos.SuiviDto;
import com.pov.entities.Suivi;
import com.pov.mappers.SuiviMapper;
import com.pov.repository.ISuiviRepository;
import com.pov.service.interfaces.ISuiviService;
@Service
@Transactional
public class SuiviServiceImpl implements ISuiviService {

	@Autowired
	private ISuiviRepository suiviRepository;
	@Autowired
	private SuiviMapper  suiviMapper;
	
	
	@Override
	public void deleteSuivi(Long id) {
		// TODO Auto-generated method stub
		suiviRepository.deleteById(id);
	}




	@Override
	public List<SuiviDto> allSuivi() {
		List<Suivi> listSuivis=suiviRepository.findAll();
		List<SuiviDto> listSuiviDtos=new ArrayList<>(1);
		
		for(Suivi suivi:listSuivis) {
			listSuiviDtos.add(suiviMapper.toDto(suivi, new SuiviDto()));
		}
		return listSuiviDtos;
	}




	@Override
	public SuiviDto oneSuivi(Long id) {
		Suivi suivi=suiviRepository.getById(id);
		SuiviDto suiviDto=suiviMapper.toDto(suivi, new SuiviDto());
		
		return suiviDto;
	}




	@Override
	public boolean addSuivi(SuiviDto suiviDto) {
		Suivi suivi=suiviMapper.toDomain(new Suivi(), suiviDto);
		suiviRepository.save(suivi);
		return true;
	}




	@Override
	public boolean editSuivi(SuiviDto suiviDto) {
		Suivi suivi=suiviMapper.toDomain(new Suivi(), suiviDto);
		suiviRepository.save(suivi);
		return true;
	}

}
