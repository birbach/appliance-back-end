package com.pov.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Sceance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sceance;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateSceance;
	private String resumer;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pov_id_scence")
	private Pov pov;
	private String participants;
	
	
	public Pov getPov() {
		return pov;
	}
	public void setPov(Pov pov) {
		this.pov = pov;
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
	public Sceance(Date dateSceance, String resumer, String participants) {
		super();
		this.dateSceance = dateSceance;
		this.resumer = resumer;
		this.participants = participants;
	}
	public Sceance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
