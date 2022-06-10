package br.com.apiloja.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiloja.modelo.Produto;
import br.com.apiloja.repository.ProdutoRepository;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public List<Produto> getProdutos() {
		return produtoRepository.findAll();
	}

	@GetMapping("/produtos/{id}")
	public Produto listarCodigo(@PathVariable Long id) {
		return produtoRepository.findById(id).get();
	}
	
	

	@PostMapping("/produtos/novo")
	@ResponseStatus(HttpStatus.CREATED)
	public Produto adiciona(@RequestBody Produto codigo) {
		return produtoRepository.save(codigo);
	}
	
	@PutMapping("/produtos/altera")
	public Produto altera(@RequestBody Produto codigo) {
		return produtoRepository.save(codigo);
	}
	
	 @DeleteMapping("/produtos/deleta/{codigo}")
	 public void deletacliente(@PathVariable Long codigo) {
		 produtoRepository.deleteById(codigo);
	 }
	 

}
