package br.com.squadra.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.squadra.enums.EnumStatus;

@Entity
public class ControleSistema {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Enumerated(EnumType.STRING)
    @Column(name = "enum_status")
    private EnumStatus enumStatus;
	
	@Size(max = 100)
    @Column(name = "usuario_responsavel", length = 100)
	private String usuarioResponsavel;
	
	@DateTimeFormat
    @Column(name = "data_ultima_alteracao")
	private LocalDate dataUltimaAlteracao;
	
	@NotNull
	@Size(max = 500)
    @Column(name = "justificativa_ultima_alteracao", length = 500)
	private String justificativaUltimaAlteracao;
	
	@Size(max = 500)
    @Column(name = "email_atendimento_sistema", length = 500)
	private String novaJustificativaAlteracao;
	
	public EnumStatus getEnumStatus() {
		return enumStatus;
	}
	public void setEnumStatus(EnumStatus enumStatus) {
		this.enumStatus = enumStatus;
	}
	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}
	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}
	public LocalDate getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}
	public void setDataUltimaAlteracao(LocalDate localDate) {
		this.dataUltimaAlteracao = localDate;
	}
	public String getJustificativaUltimaAlteracao() {
		return justificativaUltimaAlteracao;
	}
	public void setJustificativaUltimaAlteracao(String justificativaUltimaAlteracao) {
		this.justificativaUltimaAlteracao = justificativaUltimaAlteracao;
	}
	public String getNovaJustificativaAlteracao() {
		return novaJustificativaAlteracao;
	}
	public void setNovaJustificativaAlteracao(String novaJustificativaAlteracao) {
		this.novaJustificativaAlteracao = novaJustificativaAlteracao;
	}
}
