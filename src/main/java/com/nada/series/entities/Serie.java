package com.nada.series.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Serie {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSerie;
	private String nomSerie;
	private String langue;
	private Date dateDiffusion;
	
	public Serie() {
		super();
	}

	public Serie(String nomSerie, String langue, Date dateDiffusion) {
		this.nomSerie = nomSerie;
		this.langue = langue;
		this.dateDiffusion = dateDiffusion;
	}

	public Long getIdSerie() {
		return idSerie;
	}

	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}

	public String getNomSerie() {
		return nomSerie;
	}

	public void setNomSerie(String nomSerie) {
		this.nomSerie = nomSerie;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Date getDateDiffusion() {
		return dateDiffusion;
	}

	public void setDateDiffusion(Date dateDiffusion) {
		this.dateDiffusion = dateDiffusion;
	}

	@Override
	public String toString() {
		return "Serie [idSerie=" + idSerie + ", nomSerie=" + nomSerie + ", langue=" + langue + ", dateDiffusion="
				+ dateDiffusion + "]";
	}
	
	
	
	
}
