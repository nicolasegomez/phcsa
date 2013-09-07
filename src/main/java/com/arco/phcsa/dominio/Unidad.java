package com.arco.phcsa.dominio;

public class Unidad {
	
	long idUnidad;
	int numero;
	String direccionExtendida;
	
	public Unidad(long id, int numero, String direccionExtendida) {
		idUnidad = id;
		this.numero = numero;
		this.direccionExtendida = direccionExtendida;
	}
	
	public long getIdUnidad() {
		return idUnidad;
	}
	public void setIdUnidad(long idUnidad) {
		this.idUnidad = idUnidad;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDireccionExtendida() {
		return direccionExtendida;
	}
	public void setDireccionExtendida(String direccionExtendida) {
		this.direccionExtendida = direccionExtendida;
	}

}
