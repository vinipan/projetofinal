package br.com.projetofinal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Agente;

import br.com.projetofinal.dao.AgenteDAO;

@RestController
@CrossOrigin("*")
public class AgenteController {
	
	@Autowired
	private AgenteDAO dao;	
	
		
	
	@GetMapping("/agentes")
	public ResponseEntity<List<Agente>> getAll()
	{
		List<Agente> lista = (List<Agente>) dao.findAll();
		if (lista.size() ==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);		
	}
	
	/*
	@GetMapping("/nameagentes")
	public ResponseEntity<List<Agente>> getAll()
	{
		List<Agente> lista = (List<Agente>) dao.findAll();
		if (lista.size() ==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);		
	}
	*/
	
	@GetMapping("/topagentes")
	public ResponseEntity<List<Agente>> getTop()
	{
		List<Agente> lista = (List<Agente>) dao.findTopAgentes();
		if (lista.size() ==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);		
	}	
	

}
