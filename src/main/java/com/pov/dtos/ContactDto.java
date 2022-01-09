package com.pov.dtos;

public class ContactDto {
	
	private Long id_contact;
	private String nom;
	private String prenom;
	private String telephone;
	private String fonction;
	private String email;
	private Long id_client;
	private String libelleClient;
	
	
	
	
	public String getLibelleClient() {
		return libelleClient;
	}
	public void setLibelleClient(String libelleClient) {
		this.libelleClient = libelleClient;
	}
	public Long getId_contact() {
		return id_contact;
	}
	public void setId_contact(Long id_contact) {
		this.id_contact = id_contact;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	
	

}
