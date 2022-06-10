package br.com.apiloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiloja.modelo.ItensNota;

@Repository
public interface ItensNotaRepository extends JpaRepository<ItensNota, Long> {

	void deleteById(Long id);


}

