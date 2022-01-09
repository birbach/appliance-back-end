package com.pov.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contact;
	private String nom;
	private String prenom;
	private String telephone;
	private String fonction;
	private String email;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "client_id_contact")
	private Client client;
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
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
	public Contact(String nom, String prenom, String telephone, String fonction, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.fonction = fonction;
		this.email = email;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
