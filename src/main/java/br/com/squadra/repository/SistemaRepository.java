package br.com.squadra.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.squadra.domain.Sistema;

@Repository
public interface SistemaRepository extends JpaRepository<Sistema, Serializable> {

	@Query("SELECT a FROM Sistema a WHERE a.descricao = :descricao OR a.sigla = :sigla OR a.emailAtendimentoSistema = :emailAtendimentoSistema")
	List<Sistema> buscaComFiltro(@Param("descricao") String descricao, @Param("sigla") String sigla,
			@Param("emailAtendimentoSistema") String emailAtendimentoSistema);

}
