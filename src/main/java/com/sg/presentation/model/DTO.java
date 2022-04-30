package com.sg.presentation.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Donacion")
public class DTO {

	@Id
	private String id;
	private String poblacion;
	private String nombre;
	private double donacion;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDonacion() {
		return donacion;
	}
	public void setDonacion(double donacion) {
		this.donacion = donacion;
	}
	
	
}
