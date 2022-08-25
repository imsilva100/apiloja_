package br.com.apiloja.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiloja.modelo.ItensNota;
import br.com.apiloja.repository.ItensNotaRepository;
import br.com.apiloja.repository.ProdutoRepository;


@RestController
@RequestMapping("/itensNota")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 10800)
public class ItensNotaFiscalController {
	@Autowired
	private ItensNotaRepository itensNotaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepostitory;
	

	@GetMapping("/{id}")
	public List<ItensNota> getItensNotaFiscal(@PathVariable Long id) {
		List<ItensNota> ItensNotaFiscal = itensNotaRepository.findByNotaId(id);
		return ItensNotaFiscal;
	}
	 

}
