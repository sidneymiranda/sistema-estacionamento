package br.ucsal.trabalhopratico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long veiculoId;

	@Column(length = 7)
	private String placa;

	@ManyToOne
	@JoinColumn()
	private Cliente fkClienteId;

	@ManyToOne
	private Modelo modelo;

}
