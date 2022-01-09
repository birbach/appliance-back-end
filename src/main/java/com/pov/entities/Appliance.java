package com.pov.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Appliance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_appliance;
	private String libelleApplliance;
	private String dbid;
	private Boolean disponibilitte;
	private String reference;
	
	@OneToMany(mappedBy = "appliance")
	private Collection<Pov> povs;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "type_id_appliance")
	private Type type;
	
	
	
	public Collection<Pov> getPovs() {
		return povs;
	}
	public void setPovs(Collection<Pov> povs) {
		this.povs = povs;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Long getId_appliance() {
		return id_appliance;
	}
	public void setId_appliance(Long id_appliance) {
		this.id_appliance = id_appliance;
	}
	public String getLibelleApplliance() {
		return libelleApplliance;
	}
	public void setLibelleApplliance(String libelleApplliance) {
		this.libelleApplliance = libelleApplliance;
	}
	public String getDbid() {
		return dbid;
	}
	public void setDbid(String dbid) {
		this.dbid = dbid;
	}
	public Boolean getDisponibilitte() {
		return disponibilitte;
	}
	public void setDisponibilitte(Boolean disponibilitte) {
		this.disponibilitte = disponibilitte;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Appliance(String libelleApplliance, String dbid, Boolean disponibilitte, String reference) {
		super();
		this.libelleApplliance = libelleApplliance;
		this.dbid = dbid;
		this.disponibilitte = disponibilitte;
		this.reference = reference;
	}
	public Appliance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
