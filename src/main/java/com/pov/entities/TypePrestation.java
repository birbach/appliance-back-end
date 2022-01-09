package com.pov.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypePrestation{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_perstation;
	private String libellePerstation;
	@OneToMany(mappedBy = "typePrestation")
	private Collection<Suivi> suivis;
	
	
	public Collection<Suivi> getSuivis() {
		return suivis;
	}
	public void setSuivis(Collection<Suivi> suivis) {
		this.suivis = suivis;
	}
	public Long getId_perstation() {
		return id_perstation;
	}
	public void setId_perstation(Long id_perstation) {
		this.id_perstation = id_perstation;
	}
	public String getLibellePerstation() {
		return libellePerstation;
	}
	public void setLibellePerstation(String libellePerstation) {
		this.libellePerstation = libellePerstation;
	}
	public TypePrestation(String libellePerstation) {
		super();
		this.libellePerstation = libellePerstation;
	}
	public TypePrestation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
