package com.arco.phcsa.dominio;

import java.util.ArrayList;
import java.util.List;

public class Edificio {
	
	int idEdificio;
	private String direccion;
	
	public int getIdEdificio() {
		return idEdificio;
	}
	public void setIdEdificio(int idEdificio) {
		this.idEdificio = idEdificio;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public static List<Edificio> dameTodos(){
		List<Edificio> resultList = new ArrayList<Edificio>();
		Edificio edificio = new Edificio();
		edificio.setIdEdificio(1);
		edificio.setDireccion("Por aca 345");
		
		resultList.add(edificio);
	    edificio = new Edificio();
		edificio.setIdEdificio(2);
		edificio.setDireccion("Por alla 345");
		
		resultList.add(edificio);
		return resultList;
	}

}
