package br.ucsal.trabalhopratico.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

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

	@OneToMany(mappedBy = "clienteId", cascade = CascadeType.ALL)
	private List<Veiculo> veiculos;

	@OneToMany(mappedBy = "telefoneId", cascade = CascadeType.ALL)
	private List<Telefone> telefones;

	@OneToMany(mappedBy = "enderecoId", cascade = CascadeType.ALL)
	private List<Endereco> enderecos;

	@OneToMany(mappedBy = "entradaId", cascade = CascadeType.ALL)
	private List<Entrada> entradas;

}
