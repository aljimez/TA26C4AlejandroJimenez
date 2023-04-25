package com.aljimez.T26C4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "piezas")
public class Piezas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "pieza")
	private List<Suministra> suministra;

	public Piezas() {
	}

	public Piezas(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
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
