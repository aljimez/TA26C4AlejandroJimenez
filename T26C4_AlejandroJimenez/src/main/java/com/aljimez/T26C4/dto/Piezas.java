package com.aljimez.T26C4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "piezas")
public class Piezas {

	@Id
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "pieza",fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	private List<Suministra> suministra;
	
	public Piezas() {}

	public Piezas(Long id, String nombre) {

		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pieza")
	public List<Suministra> getSuministra() {
		return suministra;
	}
	public void setSuministro(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@Override
	public String toString() {
		return "Piezas [id=" + id + ", nombre=" + nombre + ", suministra=" + suministra + "]";
	}

}
