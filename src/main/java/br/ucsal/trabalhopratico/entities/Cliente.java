package br.ucsal.trabalhopratico.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clienteId;

	@Column(length = 150, nullable = false)
	private String nome;

	@Column(nullable = false)
	private Integer idade;

	@Column(nullable = false)
	private String cnh;

	@Column(name = "tipo_cliente", length = 15, nullable = false)
	private String tipoCLiente;

	@OneToMany
	private List<Veiculo> veiculos;

	@OneToMany
	private List<Telefone> telefones;

	@OneToMany
	private List<Endereco> enderecos;

	@OneToMany
	private List<Entrada> entradas;
}
