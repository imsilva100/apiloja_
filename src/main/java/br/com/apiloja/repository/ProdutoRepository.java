package br.com.apiloja.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiloja.modelo.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	void deleteById(Long id);


	

}

