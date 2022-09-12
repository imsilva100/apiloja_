package br.com.apiloja.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiloja.modelo.ItensNota;
import br.com.apiloja.modelo.Produto;

@Repository
public interface ItensNotaRepository extends JpaRepository<ItensNota, Long> {

	void deleteById(Long id);

	List<ItensNota> findByNotaId(Long id);


}

