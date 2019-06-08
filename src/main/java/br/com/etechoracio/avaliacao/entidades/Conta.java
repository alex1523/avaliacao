package br.com.etechoracio.avaliacao.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="registro")
public class Conta {

	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="dsconta")
	private String descricao;
	
	@Column(name="tpconta")
	private String tipo;
	
	@Column(name="dtvencimento")
	private String dtVencimento;
	
	@Column(name="situacao")
	private String situacao;
	
	@Column(name="dtcriacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	
	@PrePersist
	private void preencherDataCriacao() {
		if(dataCriacao == null) {
			dataCriacao = new Date();
		}
	}
	
}
