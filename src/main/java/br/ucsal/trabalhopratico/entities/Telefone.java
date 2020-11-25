package br.ucsal.trabalhopratico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long telefoneId;

	@Column(length = 11)
	private String numero;

	@ManyToOne
	private Cliente cliente;
}
