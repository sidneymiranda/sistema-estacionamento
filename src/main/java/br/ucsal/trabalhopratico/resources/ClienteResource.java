package br.ucsal.trabalhopratico.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ucsal.trabalhopratico.entities.Cliente;
import br.ucsal.trabalhopratico.repository.ClienteRepository;

@RestController
@RequestMapping("/api")
public class ClienteResource {
	
	@Autowired 
	private ClienteRepository clienteRepository;
	
	
	@GetMapping("/clientes")
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Optional<Cliente> find(@PathVariable(value = "id") Long id) {
		return clienteRepository.findById(id);
	}
	
	@GetMapping("/cliente")
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@GetMapping("/cliente")
	public void delete(@RequestBody Cliente cliente) {
		clienteRepository.delete(cliente);
	}
}
