package br.ucsal.trabalhopratico.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

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
	@JoinColumn(name = "fk_cliente")
	private Cliente cliente;
}
