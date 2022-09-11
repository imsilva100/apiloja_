package br.com.apiloja.controler;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiloja.modelo.Produto;
import br.com.apiloja.repository.ProdutoRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 10800)
@RequestMapping(value = "/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping
	public List<Produto> getProdutos() {
		return produtoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Produto listarCodigo(@PathVariable Long id) {
		return produtoRepository.findById(id).get();
	}
	
	@PostMapping("/novo")
	@ResponseStatus(HttpStatus.CREATED)
	public Produto adiciona(@RequestBody Produto codigo) {
		System.out.println(codigo);
		return produtoRepository.save(codigo);
	}
	
	@PutMapping("/altera")
	public Produto altera(@RequestBody Produto codigo) {
		return produtoRepository.save(codigo);
	}
	
	 @DeleteMapping("/deleta/{id}")
	 public void deletacliente(@PathVariable Long id) {
		 produtoRepository.deleteById(id);
	 }
	 

}
