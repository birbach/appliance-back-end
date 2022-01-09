package com.pov.service.interfaces;

import java.util.List;

import com.pov.dtos.PovDto;

public interface IPovService {

	public List<PovDto> allPov();
	public PovDto onePov(Long id);
	public boolean addPov(PovDto povDto);
	public boolean editPov(PovDto povDto);
	public void deletePov(Long id);
	public List<PovDto> detailPovAppliance(Long idAppliance);
	public PovDto getInfoPovEncours(Long id);
}
