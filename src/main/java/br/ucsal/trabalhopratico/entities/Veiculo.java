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
public class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "veiculo_id")
	private Long veiculoId;

	@Column(length = 7)
	private String placa;

	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private Cliente clienteId;

	@ManyToOne()
	@JoinColumn(name = "fk_modelo")
	private Modelo modelo;

}
