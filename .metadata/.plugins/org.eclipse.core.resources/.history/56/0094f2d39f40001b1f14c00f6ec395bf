package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.dao.TransacaoDAO;

@RestController
@CrossOrigin("*")

public class TransacaoController {
	
	@Autowired
	private TransacaoDAO dao;
	
	@GetMapping("/status/{cod}")
	public ResponseEntity<List<String>> getStatus(@PathVariable int cod){
		List<String> status = dao.findStatusByParceiro(cod);
		if (status == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(status);
	}
	
	
	
	

}
