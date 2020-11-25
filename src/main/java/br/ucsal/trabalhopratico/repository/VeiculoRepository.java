package br.ucsal.trabalhopratico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ucsal.trabalhopratico.entities.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
