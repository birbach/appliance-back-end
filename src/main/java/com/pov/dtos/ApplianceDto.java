package com.pov.dtos;

public class ApplianceDto {

	private Long id_appliance;
	private String libelleApplliance;
	private String dbid;
	private Boolean disponibilitte;
	private String reference;
	private Long id_type;
	private String libelleType;
	
	

	public String getLibelleType() {
		return libelleType;
	}
	public void setLibelleType(String libelleType) {
		this.libelleType = libelleType;
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
	public Long getId_type() {
		return id_type;
	}
	public void setId_type(Long id_type) {
		this.id_type = id_type;
	}
	
}
