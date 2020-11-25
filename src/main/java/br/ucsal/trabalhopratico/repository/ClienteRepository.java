package br.ucsal.trabalhopratico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ucsal.trabalhopratico.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
