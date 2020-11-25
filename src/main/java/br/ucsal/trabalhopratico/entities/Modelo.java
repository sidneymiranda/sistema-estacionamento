package br.ucsal.trabalhopratico.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Modelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long modeloId;

	@Column(length = 45)
	private String modelo;

	@OneToMany
	private List<Veiculo> veiculos;
}
