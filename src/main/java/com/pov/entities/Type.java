package com.pov.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_type;
	private String libelleType;
	
	@OneToMany(mappedBy = "type")
	private Collection<Appliance> appliances;
	
	
	
	public Collection<Appliance> getAppliances() {
		return appliances;
	}
	public void setAppliances(Collection<Appliance> appliances) {
		this.appliances = appliances;
	}
	public Long getId_type() {
		return id_type;
	}
	public void setId_type(Long id_type) {
		this.id_type = id_type;
	}
	public String getLibelleType() {
		return libelleType;
	}
	public void setLibelleType(String libelleType) {
		this.libelleType = libelleType;
	}
	public Type(String libelleType) {
		super();
		this.libelleType = libelleType;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
