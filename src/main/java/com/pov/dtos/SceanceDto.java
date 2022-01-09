package com.pov.dtos;

import java.util.Date;

public class SceanceDto {
	
	private Long id_sceance;
	private Date dateSceance;
	private String resumer;
	private String participants;
	private Long id_pov;
	private String libellePov;
	
	
	
	public String getLibellePov() {
		return libellePov;
	}
	public void setLibellePov(String libellePov) {
		this.libellePov = libellePov;
	}
	public Long getId_sceance() {
		return id_sceance;
	}
	public void setId_sceance(Long id_sceance) {
		this.id_sceance = id_sceance;
	}
	public Date getDateSceance() {
		return dateSceance;
	}
	public void setDateSceance(Date dateSceance) {
		this.dateSceance = dateSceance;
	}
	public String getResumer() {
		return resumer;
	}
	public void setResumer(String resumer) {
		this.resumer = resumer;
	}
	public String getParticipants() {
		return participants;
	}
	public void setParticipants(String participants) {
		this.participants = participants;
	}
	public Long getId_pov() {
		return id_pov;
	}
	public void setId_pov(Long id_pov) {
		this.id_pov = id_pov;
	}
	
	

}
