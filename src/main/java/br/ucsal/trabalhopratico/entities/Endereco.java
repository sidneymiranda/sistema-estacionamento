package br.ucsal.trabalhopratico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long enderecoId;
	
	@Column(length = 50)
	private String rua;
	
	private Integer numero;
	
	@Column(length = 50)
	private String bairro;
	
	@Column(length = 100)
	private String cidade;
	
	@Column(length = 2)
	private String estado;
	
	@ManyToOne
	private Cliente cliente;
}
