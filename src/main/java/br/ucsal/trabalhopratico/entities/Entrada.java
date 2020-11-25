package br.ucsal.trabalhopratico.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Entrada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long entradaId;

	@Column(name = "data_entrada")
	private Calendar dataEntrada;

	@ManyToOne
	private Cliente cliente;
}
