package br.com.squadra.web;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.squadra.domain.ControleSistema;
import br.com.squadra.domain.Sistema;
import br.com.squadra.domain.dto.SistemaDTO;
import br.com.squadra.enums.EnumStatus;
import br.com.squadra.service.SistemaService;

@RestController
@RequestMapping("/manterSistema")
public class SistemaController {

	@Autowired
	SistemaService sistemaService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/sistemas", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sistema> cadastrarSistema(@RequestBody SistemaDTO sistemaDTO) {

		Sistema sistema = new Sistema();

		ControleSistema controleSistema = new ControleSistema();

		controleSistema.setDataUltimaAlteracao(LocalDate.now());
		controleSistema.setEnumStatus(EnumStatus.ATIVO);
		controleSistema.setJustificativaUltimaAlteracao("Criando Sistema");
		controleSistema.setUsuarioResponsavel("FelipeRibeiro");

		sistema.setDescricao(sistemaDTO.getDescricao());
		sistema.setSigla(sistemaDTO.getSigla());
		sistema.setUrl(sistemaDTO.getUrl());
		sistema.setEmailAtendimentoSistema(sistemaDTO.getEmailAtendimentoSistema());
		sistema.setControleSistema(controleSistema);

		Sistema sistemaCadastrado = sistemaService.cadastrar(sistema);
		return new ResponseEntity<>(sistemaCadastrado, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/sistemas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Sistema>> buscarTodosSistemas() {

		Collection<Sistema> sistemasBuscados = sistemaService.buscarTodos();

		return new ResponseEntity<>(sistemasBuscados, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/sistemasFiltro", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Sistema>> buscarComFiltro(
			@RequestParam(value = "descricao", required = false) String descricao,
			@RequestParam(value = "sigla", required = false) String sigla,
			@RequestParam(value = "emailAtendimentoSistema", required = false) String emailAtendimentoSistema) {

		Collection<Sistema> sistemasBuscados = sistemaService.buscarComFiltro(descricao, sigla,
				emailAtendimentoSistema);

		return new ResponseEntity<>(sistemasBuscados, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/sistemas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Sistema> buscarSistemaPorId(@PathVariable Integer id) {

		Sistema sistema = sistemaService.buscarPorId(id);

		return new ResponseEntity<>(sistema, HttpStatus.OK);
	}
}
