package br.com.squadra.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.squadra.domain.ControleSistema;

@Repository
public interface ControleSistemaRepository extends JpaRepository<ControleSistema, Serializable> {

}
