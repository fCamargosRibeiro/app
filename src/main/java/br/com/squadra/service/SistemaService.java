package br.com.squadra.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.squadra.domain.Sistema;
import br.com.squadra.repository.ControleSistemaRepository;
import br.com.squadra.repository.SistemaRepository;

@Service
public class SistemaService {

	@Autowired
	SistemaRepository sistemaRepository;
	@Autowired
	ControleSistemaRepository controleSistemaRepository;

	public Sistema cadastrar(Sistema sistema) {
		controleSistemaRepository.save(sistema.getControleSistema());
		return sistemaRepository.save(sistema);
	}

	public Collection<Sistema> buscarTodos() {
		return sistemaRepository.findAll();
	}

	public Collection<Sistema> buscarComFiltro(String descricao, String sigla, String emailAtendimentoSistema) {
		return sistemaRepository.buscaComFiltro(descricao, sigla, emailAtendimentoSistema);
	}

	public void excluir(Sistema sistema) {
		sistemaRepository.delete(sistema);
	}

	public Sistema buscarPorId(Integer id) {
		return sistemaRepository.findOne(id);
	}

	public Sistema alterar(Sistema sistema) {
		return sistemaRepository.save(sistema);
	}
}
