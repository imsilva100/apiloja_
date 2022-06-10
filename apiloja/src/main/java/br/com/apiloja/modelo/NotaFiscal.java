package br.com.apiloja.modelo;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class NotaFiscal {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long numeroNota;
	
	private Date dataNota;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany(mappedBy="nota", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ItensNota> itensNota;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(Long numeroNota) {
		this.numeroNota = numeroNota;
	}

	public Date getDataNota() {
		return dataNota;
	}

	public void setDataNota(Date dataNota) {
		this.dataNota = dataNota;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItensNota> getItensNota() {
		return itensNota;
	}

	public void setItensNota(List<ItensNota> itensNota) {
		this.itensNota = itensNota;
	}
	
}
