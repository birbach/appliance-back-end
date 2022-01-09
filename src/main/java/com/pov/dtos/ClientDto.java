package com.pov.dtos;

public class ClientDto {
	
	private Long id_client;
	private String libelleClient;
	private String secteur;
	private String activite;
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	public String getLibelleClient() {
		return libelleClient;
	}
	public void setLibelleClient(String libelleClient) {
		this.libelleClient = libelleClient;
	}
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	
	

}
