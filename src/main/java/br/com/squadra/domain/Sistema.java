package br.com.squadra.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Sistema {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(max = 100)
    @Column(name = "descricao", length = 100)
	private String descricao;
	
	@NotNull
	@Size(max = 10)
    @Column(name = "sigla", length = 10)
	private String sigla;
	
	@Size(max = 100)
    @Column(name = "email_atendimento_sistema", length = 100)
	private String emailAtendimentoSistema;
	
	@Size(max = 50)
    @Column(name = "url", length = 50)
	private String url;
	
	@OneToOne(optional = false)
    @NotNull
    @JoinColumn(unique = true)
	private ControleSistema controleSistema;
		
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
	public ControleSistema getControleSistema() {
		return controleSistema;
	}
	public void setControleSistema(ControleSistema controleSistema) {
		this.controleSistema = controleSistema;
	}
}
