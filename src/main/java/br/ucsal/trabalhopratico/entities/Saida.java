package br.ucsal.trabalhopratico.entities;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Saida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long saidaId;

	@Column(name = "data_saida")
	private Calendar dataSaida;

	private BigDecimal custo;

	@OneToOne
	@Column(name = "fk_entradaId")
	private Long fkEntrada;
}
