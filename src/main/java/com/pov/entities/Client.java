package com.pov.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_client;
	private String libelleClient;
	private String secteur;
	private String activite;
	@OneToMany(mappedBy = "client")
	private Collection<Pov> povs;
	@OneToMany(mappedBy = "client")
	private Collection<Contact> contacts;
	
	
	
	public Collection<Pov> getPovs() {
		return povs;
	}
	public void setPovs(Collection<Pov> povs) {
		this.povs = povs;
	}
	public Collection<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(Collection<Contact> contacts) {
		this.contacts = contacts;
	}
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
	public Client(String libelleClient, String secteur, String activite) {
		super();
		this.libelleClient = libelleClient;
		this.secteur = secteur;
		this.activite = activite;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
