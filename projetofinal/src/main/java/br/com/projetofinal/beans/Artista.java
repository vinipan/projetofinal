package br.com.projetofinal.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // indica que a classe estará relacionada a uma tabela do BD
@Table(name="tb_artista") 

public class Artista {
	
	
	@Id //indica que este cara será a chave privada
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica a estratégia de input dos dados, neste caso vai incremetando o id a cada novo registro 
	@Column(name="id")
	private int id;
	
	@Column(name="nomeArtistico", length = 50)
	private String nomeArtistico;
	
	@Column(name="nacionalidade",length = 30)
	private String nacionalidade;
	
	@OneToMany(mappedBy="artista", cascade=CascadeType.ALL) //a classe Artista está do lado "1" no SGBD relacional
	@JsonIgnoreProperties("artista")
	private List<Musica> musicas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public Artista(int id, String nomeArtistico, String nacionalidade, List<Musica> musicas) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
	}

	public Artista() {
		super();
	}
	
	
	public void setAll(int id, String nomeArtistico, String nacionalidade, List<Musica> musicas) {
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musicas = musicas;
	}

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade
				+ ", musicas=" + musicas + "]";
	}
	
	
	
	

}
