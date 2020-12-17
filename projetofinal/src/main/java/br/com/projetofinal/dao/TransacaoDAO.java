package br.com.projetofinal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Integer> {
	
	@Query(value= "SELECT COUNT(*) VOLUME, case when status = 0 then \"SUCESSO\" when status = 1 then \"FALHA\" else \"FRAUDE\" end AS STATUS FROM projetofinal.mtb310_transaction " + 
			"WHERE ag_financeiro= :num " + 
			"GROUP BY status", nativeQuery=true)
	public List<String> findStatusByParceiro(@Param("num") int num);

}
