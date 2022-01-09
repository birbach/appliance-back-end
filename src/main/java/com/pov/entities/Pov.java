package com.pov.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Pov {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pov;
	private String libellePov;
	private String  analyseCyber;
	private String ingenieurCyber;
	private String description;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date dateDebut;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date dateFin;
	private String compteManager;
	
	
	@ManyToOne(fetch =  FetchType.EAGER)
	@JoinColumn(name = "appliance_id_pov")
	private Appliance appliance;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "client_id_pov")
	private Client client;
	
	@OneToMany(mappedBy = "pov")
	private Collection<Sceance> sceances;
	
	@OneToMany(mappedBy = "pov")
	private Collection<Suivi> suivis;
	
	public Appliance getAppliance() {
		return appliance;
	}
	public void setAppliance(Appliance appliance) {
		this.appliance = appliance;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Sceance> getSceances() {
		return sceances;
	}
	public void setSceances(Collection<Sceance> sceances) {
		this.sceances = sceances;
	}
	public Collection<Suivi> getSuivis() {
		return suivis;
	}
	public void setSuivis(Collection<Suivi> suivis) {
		this.suivis = suivis;
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
	public Pov(String libellePov, String analyseCyber, String ingenieurCyber, String description, Date dateDebut,
			Date dateFin, String compteManager) {
		super();
		this.libellePov = libellePov;
		this.analyseCyber = analyseCyber;
		this.ingenieurCyber = ingenieurCyber;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.compteManager = compteManager;
	}
	public Pov() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
