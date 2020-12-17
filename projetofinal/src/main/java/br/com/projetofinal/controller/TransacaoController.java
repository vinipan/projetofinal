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
	
	@GetMapping("/status/sucesso/{cod}")
	public int getSucesso(@PathVariable int cod){
		int status = dao.findSucessoByParceiro(cod);
		return status;
	}
	
	@GetMapping("/status/falha/{cod}")
	public int getFalha(@PathVariable int cod){
		int status = dao.findFalhaByParceiro(cod);
		return status;
	}
	
	@GetMapping("/status/fraude/{cod}")
	public int getFraude(@PathVariable int cod){
		int status = dao.findFraudeByParceiro(cod);
		return status;
	}
	
	
	
	
	
	

}
