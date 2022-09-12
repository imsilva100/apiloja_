package br.com.apiloja.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.apiloja.modelo.Cliente;
import br.com.apiloja.repository.ClienteRepository;

//@RequestMapping(value ="/clientes")
@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 10800)
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<Cliente> getClientes() {
		return clienteRepository.findAll();
	}

	@GetMapping("/clientes/{id}")
	public Cliente listarCodigo(@PathVariable Long id) {
		return clienteRepository.findById(id).get();
	}

	@PostMapping("/clientes/novo")
	public Cliente adicionar(@RequestBody Cliente cliente) {
		System.out.println(cliente);
		return clienteRepository.save(cliente);
	}

	@PutMapping("/clientes/altera")
	public Cliente altera(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@DeleteMapping("/clientes/deleta/{id}")
	public void deletacliente(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	 }
	 

}
