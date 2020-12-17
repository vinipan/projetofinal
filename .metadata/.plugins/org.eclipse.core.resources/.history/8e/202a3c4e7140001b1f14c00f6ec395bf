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
@Table(name="mtb310_ag_financeiro") 

public class Agente {
	
		
	
	@Id //indica que este cara será a chave privada
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica a estratégia de input dos dados, neste caso vai incremetando o id a cada novo registro 
	@Column(name="id_agente")
	private int idAgente;
	
	@Column(name="nome_agente", length = 100)
	private String nomeAgente;
	
	@Column(name="volume_transacional")
	private float volumeTransacional;
	
	@OneToMany(mappedBy="agente", cascade=CascadeType.ALL) //a classe Artista está do lado "1" no SGBD relacional
	@JsonIgnoreProperties("agente")
	private List<Transacao> transacoes;

	public Agente(int idAgente, String nomeAgente, float volumeTransacional, List<Transacao> transacoes) {
		super();
		this.idAgente = idAgente;
		this.nomeAgente = nomeAgente;
		this.volumeTransacional = volumeTransacional;
		this.transacoes = transacoes;
	}

	public Agente() {
		super();
	}

	public int getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

	public String getNomeAgente() {
		return nomeAgente;
	}

	public void setNomeAgente(String nomeAgente) {
		this.nomeAgente = nomeAgente;
	}

	public float getVolumeTransacional() {
		return volumeTransacional;
	}

	public void setVolumeTransacional(float volumeTransacional) {
		this.volumeTransacional = volumeTransacional;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}

	@Override
	public String toString() {
		return "Agente [idAgente=" + idAgente + ", nomeAgente=" + nomeAgente + ", volumeTransacional="
				+ volumeTransacional + ", transacoes=" + transacoes + "]";
	}	
	
	
	
	
	
}
