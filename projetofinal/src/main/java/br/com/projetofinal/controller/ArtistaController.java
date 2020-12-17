package br.com.projetofinal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.beans.Musica;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
@CrossOrigin("*")

public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	@DeleteMapping("/apagarartista2/{cod")
	public void apagarArtista2(@PathVariable int cod) {
		try {
			dao.deleteById(cod);
		}
		catch (Exception erro){
			erro.printStackTrace();
		}
		
	}
	
	
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll()
	{
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size() ==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
		
	}
	
	@PostMapping("/artistapost")
	public ResponseEntity<Artista> getArtistaPost(@RequestBody Artista objeto){
		Artista resposta = dao.findById(objeto.getId()).orElse(null);
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);	}
	
	
	
	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista> getArtista(@PathVariable int cod) {
		Artista objeto = dao.findById(cod).orElse(null);
		if (objeto == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
		
	}
	
	@GetMapping("/artista/del/{cod}")
	public void delArtista (@PathVariable int cod) {
		try {					
			dao.deleteById(cod);			 
		}
		
		catch (Exception erro) {
			erro.printStackTrace();
		}
	}
	
	@GetMapping("/artista/add/{nam}.{nac}.[mus]")
	public String addArtista (@PathVariable String nam, @PathVariable String nac, @PathVariable Musica mus) {
		Artista objArtista = new Artista (0,nam,nac, new ArrayList<Musica>());
		dao.save(objArtista);		
		return "";
	}

}
