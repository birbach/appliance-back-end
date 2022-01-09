package com.pov.dtos;

public class TypeDto {

	private Long id_type;
	private String libelleType;
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
	public TypeDto() {
		
	}
	public TypeDto(Long id_type, String libelleType) {
		
		this.id_type = id_type;
		this.libelleType = libelleType;
	}
	
}
