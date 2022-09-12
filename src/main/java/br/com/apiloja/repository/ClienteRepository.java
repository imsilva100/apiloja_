package br.com.apiloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apiloja.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	void deleteById(Long id);


}

