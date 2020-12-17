package br.com.projetofinal.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mtb310_transaction")

public class Transacao {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_transacao")
	private int idTransacao;
	
	@Column(name = "dispositivo")
	private int dispositivo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_hora")
	private Date dataHora;
	
	@Column(name = "valor_solic")
	private float valorSolic;
	
	@Column(name = "valor_aut")
	private float valorAut;
	
	@Column(name = "status")
	private int status;
	
	@JsonIgnoreProperties("transacoes")
	@ManyToOne // esse é o lado "N" no SGBD relacional
	@JoinColumn(name="ag_financeiro")
	private Agente agente;

	public int getIdTransacao() {
		return idTransacao;
	}

	public void setIdTransacao(int idTransacao) {
		this.idTransacao = idTransacao;
	}

	public int getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(int dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public float getValorSolic() {
		return valorSolic;
	}

	public void setValorSolic(float valorSolic) {
		this.valorSolic = valorSolic;
	}

	public float getValorAut() {
		return valorAut;
	}

	public void setValorAut(float valorAut) {
		this.valorAut = valorAut;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}

	public Transacao(int idTransacao, int dispositivo, Date dataHora, float valorSolic, float valorAut, int status,
		Agente agente) {
		super();
		this.idTransacao = idTransacao;
		this.dispositivo = dispositivo;
		this.dataHora = dataHora;
		this.valorSolic = valorSolic;
		this.valorAut = valorAut;
		this.status = status;
		this.agente = agente;
	}

	public Transacao() {
		super();
	}

	@Override
	public String toString() {
		return "Transacao [idTransacao=" + idTransacao + ", dispositivo=" + dispositivo + ", dataHora=" + dataHora
				+ ", valorSolic=" + valorSolic + ", valorAut=" + valorAut + ", status=" + status + ", agente=" + agente + "]";
	}
	
	

}
