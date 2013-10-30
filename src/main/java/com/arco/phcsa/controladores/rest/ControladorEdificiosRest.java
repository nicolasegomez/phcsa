package com.arco.phcsa.controladores.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arco.phcsa.dominio.Edificio;

@Controller
@RequestMapping("edificios")
public class ControladorEdificiosRest {
	
	
	public ControladorEdificiosRest() {
		// TODO Auto-generated constructor stub
	}
	
	//se invoca /edificios/get?id=1
	@RequestMapping(value="get", params="id")
	@ResponseBody
	public Edificio getEdificioById(@RequestParam Long id) {
		return new Edificio(1,"Larrea 1354");
	}
	
	@RequestMapping("getAll")
	@ResponseBody
	public List<Edificio> getEdificios() {
		List<Edificio> list = new ArrayList<Edificio>();
		list.add( new Edificio(1,"Larrea 1354"));
		list.add( new Edificio(2,"Vidal 1345"));
		list.add( new Edificio(3,"Marcelo T. Alvear 354"));
		list.add( new Edificio(4,"Rivadavia 1354"));
		return list;
	}

}
