package com.pov.dtos;

public class SuiviDto {

	private Long id_suivi;
	private Boolean offerCommercial;
	private Double montant;
	private String compteRendu;
	private Long id_pov;
	private String libellePov;
	private Long id_perstation;
	private String libellePerstation;
	
	
	
	
	public String getLibellePov() {
		return libellePov;
	}
	public void setLibellePov(String libellePov) {
		this.libellePov = libellePov;
	}
	public String getLibellePerstation() {
		return libellePerstation;
	}
	public void setLibellePerstation(String libellePerstation) {
		this.libellePerstation = libellePerstation;
	}
	public Long getId_suivi() {
		return id_suivi;
	}
	public void setId_suivi(Long id_suivi) {
		this.id_suivi = id_suivi;
	}
	public Boolean getOfferCommercial() {
		return offerCommercial;
	}
	public void setOfferCommercial(Boolean offerCommercial) {
		this.offerCommercial = offerCommercial;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public String getCompteRendu() {
		return compteRendu;
	}
	public void setCompteRendu(String compteRendu) {
		this.compteRendu = compteRendu;
	}
	public Long getId_pov() {
		return id_pov;
	}
	public void setId_pov(Long id_pov) {
		this.id_pov = id_pov;
	}
	public Long getId_perstation() {
		return id_perstation;
	}
	public void setId_perstation(Long id_perstation) {
		this.id_perstation = id_perstation;
	}	
	
}
