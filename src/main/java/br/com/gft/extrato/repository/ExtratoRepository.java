package br.com.gft.extrato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gft.extrato.model.TotalControleLancamento;

@Repository
public interface ExtratoRepository extends JpaRepository<TotalControleLancamento, Long>{
	
	TotalControleLancamento findByquantidadeLancamentos(int quantidadeLancamentos);
	
}
