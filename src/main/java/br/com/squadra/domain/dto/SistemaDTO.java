package br.com.squadra.domain.dto;

import java.util.Date;

public class SistemaDTO {
	
	private String descricao;
	private String sigla;
	private String emailAtendimentoSistema;
	private String url;
    private String enumStatus;
	private String usuarioResponsavel;
	private Date dataUltimaAlteracao;
	private String justificativaUltimaAlteracao;
	private String novaJustificativaAlteracao;
	
		
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getEmailAtendimentoSistema() {
		return emailAtendimentoSistema;
	}
	public void setEmailAtendimentoSistema(String emailAtendimentoSistema) {
		this.emailAtendimentoSistema = emailAtendimentoSistema;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getEnumStatus() {
		return enumStatus;
	}
	public void setEnumStatus(String enumStatus) {
		this.enumStatus = enumStatus;
	}
	public String getUsuarioResponsavel() {
		return usuarioResponsavel;
	}
	public void setUsuarioResponsavel(String usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}
	public Date getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}
	public void setDataUltimaAlteracao(Date dataUltimaAlteracao) {
		this.dataUltimaAlteracao = dataUltimaAlteracao;
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
