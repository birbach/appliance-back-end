package com.pov.mappers;

import org.springframework.stereotype.Component;

import com.pov.dtos.SuiviDto;
import com.pov.entities.Pov;
import com.pov.entities.Suivi;
import com.pov.entities.TypePrestation;

@Component
public class SuiviMapper {
	
	
	
	public SuiviDto toDto( Suivi suivi ,SuiviDto suiviDto) {
		
		if(suiviDto==null)
			suiviDto=new SuiviDto();
		
		suiviDto.setId_suivi(suivi.getId_suivi());
		suiviDto.setOfferCommercial(suivi.getOfferCommercial());
		suiviDto.setMontant(suivi.getMontant());
		suiviDto.setCompteRendu(suivi.getCompteRendu());
		
		if(suivi.getPov()!=null  ) {
			suiviDto.setId_pov(suivi.getPov().getId_pov());
			suiviDto.setLibellePov(suivi.getPov().getLibellePov());;
			
		}
		if(suivi.getTypePrestation() != null) {
			suiviDto.setId_perstation(suivi.getTypePrestation().getId_perstation());
			suiviDto.setLibellePerstation(suivi.getTypePrestation().getLibellePerstation());
		}
		return suiviDto;
		
	}
	public Suivi toDomain(Suivi suivi ,SuiviDto suiviDto) {
		
		if(suivi==null)
			suivi=new Suivi();
		suivi.setId_suivi(suiviDto.getId_suivi());
		suivi.setOfferCommercial(suiviDto.getOfferCommercial());
		suivi.setMontant(suiviDto.getMontant());
		suivi.setCompteRendu(suiviDto.getCompteRendu());
		
		if(suiviDto.getId_pov()!=null ) {
			Pov pov=new Pov();
			pov.setId_pov(suiviDto.getId_pov());
			suivi.setPov(pov);
			
		} 
		
		if(suiviDto.getId_perstation() !=null) {
			TypePrestation typePrestation=new TypePrestation();
			typePrestation.setId_perstation(suiviDto.getId_perstation());
			suivi.setTypePrestation(typePrestation);
			
		}
		return suivi;
	}

}
