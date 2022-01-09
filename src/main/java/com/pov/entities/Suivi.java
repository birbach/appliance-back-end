package com.pov.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Suivi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_suivi;
	private Boolean offerCommercial;
	private Double montant;
	private String compteRendu;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pov_id_suivi")
	private Pov pov;
	@ManyToOne(fetch =  FetchType.EAGER)
	@JoinColumn(name = "typeP_id_suivi")
	private TypePrestation typePrestation;
	
	
	
	public Pov getPov() {
		return pov;
	}
	public void setPov(Pov pov) {
		this.pov = pov;
	}
	public TypePrestation getTypePrestation() {
		return typePrestation;
	}
	public void setTypePrestation(TypePrestation typePrestation) {
		this.typePrestation = typePrestation;
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
	public Suivi(Boolean offerCommercial, Double montant, String compteRendu) {
		super();
		this.offerCommercial = offerCommercial;
		this.montant = montant;
		this.compteRendu = compteRendu;
	}
	public Suivi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
