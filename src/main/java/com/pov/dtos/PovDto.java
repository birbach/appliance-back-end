package com.pov.dtos;

import java.util.Date;

public class PovDto {
	
	private Long id_pov;
	private String libellePov;
	private String  analyseCyber;
	private String ingenieurCyber;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private String compteManager;
	private Boolean status;
	
	private Long id_appliance;
	private String libelleApplliance;
	private Long id_client;
	private String libelleClient;
	private Long id_employe;
	private int nbrSeance;
	private Boolean offerCommercial;
	
	
	
	
	public Boolean getOfferCommercial() {
		return offerCommercial;
	}
	public void setOfferCommercial(Boolean offerCommercial) {
		this.offerCommercial = offerCommercial;
	}
	public int getNbrSeance() {
		return nbrSeance;
	}
	public void setNbrSeance(int nbrSeance) {
		this.nbrSeance = nbrSeance;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getLibelleApplliance() {
		return libelleApplliance;
	}
	public void setLibelleApplliance(String libelleApplliance) {
		this.libelleApplliance = libelleApplliance;
	}
	public String getLibelleClient() {
		return libelleClient;
	}
	public void setLibelleClient(String libelleClient) {
		this.libelleClient = libelleClient;
	}
	public Long getId_pov() {
		return id_pov;
	}
	public void setId_pov(Long id_pov) {
		this.id_pov = id_pov;
	}
	public String getLibellePov() {
		return libellePov;
	}
	public void setLibellePov(String libellePov) {
		this.libellePov = libellePov;
	}
	public String getAnalyseCyber() {
		return analyseCyber;
	}
	public void setAnalyseCyber(String analyseCyber) {
		this.analyseCyber = analyseCyber;
	}
	public String getIngenieurCyber() {
		return ingenieurCyber;
	}
	public void setIngenieurCyber(String ingenieurCyber) {
		this.ingenieurCyber = ingenieurCyber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getCompteManager() {
		return compteManager;
	}
	public void setCompteManager(String compteManager) {
		this.compteManager = compteManager;
	}
	public Long getId_appliance() {
		return id_appliance;
	}
	public void setId_appliance(Long id_appliance) {
		this.id_appliance = id_appliance;
	}
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	public Long getId_employe() {
		return id_employe;
	}
	public void setId_employe(Long id_employe) {
		this.id_employe = id_employe;
	}
	
	

}
